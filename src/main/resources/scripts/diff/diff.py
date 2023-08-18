import os
import javalang
import time
import subprocess

base_dir = "/home/mamareza/UofC/Thesis/Projects/junit"
project1_name = "junit4-r4.12"
project2_name = "junit5"
project1_path = f"{base_dir}/{project1_name}"
project2_path = f"{base_dir}/{project2_name}"

diff_info_file = "data/diff_info.txt"


def get_diff_info():
    result = {'added': [], 'removed': [], 'changed': []}
    file = open(diff_info_file, "r")
    for line in file:
        parts = line.split()
        if line.startswith("Files "):
            file_path = parts[1].replace(project1_path, "")
            result['changed'].append(file_path)
        elif line.startswith("Only in"):
            if parts[2].startswith(project1_path):
                file_path = parts[2].replace(project1_path, "")[:-1] + "/" + parts[3]
                result['removed'].append(file_path)
            else:
                file_path = parts[2].replace(project2_path, "")[:-1] + "/" + parts[3]
                result['added'].append(file_path)
        else:
            raise Exception(f"Oops! with this line: '{line}'")
    return result


def fill_version_info(result_part, file_path, project_name, version):
    file_full_path = f"{base_dir}/{project_name}{file_path}"
    file = open(file_full_path, "r")
    file_content = file.read()
    ast = javalang.parse.parse(file_content)
    result_part[f'v{version}_size'] = os.path.getsize(file_full_path)
    result_part[f'v{version}_lines'] = file_content.count("\n")
    result_part[f'v{version}_methods'] = len(ast.types[0].methods)
    result_part[f'v{version}_fields'] = len(ast.types[0].fields)


def enrich_diff_info(diff_info):
    result = {'added': {}, 'removed': {}, 'changed': {}}
    for key in result:
        for file_path in diff_info[key]:
            result[key][file_path] = {
                'v1_size': 0, 'v1_lines': 0, 'v1_fields': 0, 'v1_methods': 0,
                'v2_size': 0, 'v2_lines': 0, 'v2_fields': 0, 'v2_methods': 0
            }
            try:
                if key != 'removed':
                    fill_version_info(result[key][file_path], file_path, project2_name, version=2)
                if key != 'added':
                    fill_version_info(result[key][file_path], file_path, project1_name, version=1)
            except Exception:
                print(f"Problem in parsing {file_path}")
    return result


def sort_result_by(result, field_name):
    for key in result:
        result[key] = {k: v for k, v in sorted(
            result[key].items(),
            key=lambda item: abs(item[1][f'v1_{field_name}'] - item[1][f'v2_{field_name}']),
            reverse=True
        )}


def create_diff_info_file():
    file = open(diff_info_file, "w")
    proc1 = subprocess.run(f"diff -rq {project1_path} {project2_path}".split(), capture_output=True, text=True)
    new_process = subprocess.Popen(['grep', '\.java'], stdin=subprocess.PIPE, stdout=file, text=True)
    new_output, _ = new_process.communicate(input=proc1.stdout.strip())


if __name__ == '__main__':
    start = time.time()
    create_diff_info_file()
    diff_info = get_diff_info()
    enriched_diff_info = enrich_diff_info(diff_info)
    sort_result_by(enriched_diff_info, field_name='size')
    # sort_result_by(enriched_diff_info, field_name='methods')
    # sort_result_by(enriched_diff_info, field_name='fields')
    # sort_result_by(enriched_diff_info, field_name='lines')
    end = time.time()
    print(enriched_diff_info)
    print("Elapsed time: ", end - start)
