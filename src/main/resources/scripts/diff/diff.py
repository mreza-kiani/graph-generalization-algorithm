import os
import javalang

base_dir = "/Users/mohammadreza/UofC/thesis/libraries"
project1_name = "joda-time-2.0"
project2_name = "joda-time-2.10.13"


def get_diff_info():
    result = {'added': [], 'removed': [], 'changed': []}
    file = open("diff_info.txt", "r")
    for line in file:
        parts = line.split()
        if line.startswith("Files "):
            file_path = parts[1].replace(project1_name, "")
            result['changed'].append(file_path)
        elif line.startswith("Only in"):
            if parts[2].startswith(project1_name):
                file_path = parts[2].replace(project1_name, "")[:-1] + "/" + parts[3]
                result['removed'].append(file_path)
            else:
                file_path = parts[2].replace(project2_name, "")[:-1] + "/" + parts[3]
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
            if key != 'removed':
                fill_version_info(result[key][file_path], file_path, project2_name, version=2)
            if key != 'added':
                fill_version_info(result[key][file_path], file_path, project1_name, version=1)
    return result


def sort_result_by(result, field_name):
    for key in result:
        result[key] = {k: v for k, v in sorted(
            result[key].items(),
            key=lambda item: abs(item[1][f'v1_{field_name}'] - item[1][f'v2_{field_name}']),
            reverse=True
        )}


if __name__ == '__main__':
    diff_info = get_diff_info()
    enriched_diff_info = enrich_diff_info(diff_info)
    sort_result_by(enriched_diff_info, field_name='size')
    sort_result_by(enriched_diff_info, field_name='methods')
    sort_result_by(enriched_diff_info, field_name='fields')
    sort_result_by(enriched_diff_info, field_name='lines')
    print(enriched_diff_info)
