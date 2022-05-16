import os
import javalang
from javalang.tree import FieldDeclaration, MethodDeclaration

base_dir = "/home/mamareza/UofC/Thesis/Projects/JodaTime"
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


def enrich_diff_info(diff_info):
    result = {'added': {}, 'removed': {}, 'changed': {}}
    for file_path in diff_info['added']:
        file_full_path = f"{project2_name}{file_path}"
        file = open(f"{base_dir}/{file_full_path}", "r")
        file_content = file.read()
        ast = javalang.parse.parse(file_content)
        result['added'][file_full_path] = {
            'size': os.path.getsize(f"{base_dir}/{file_full_path}"),
            'fields': len(ast.types[0].fields),
            'methods': len(ast.types[0].methods)
        }



if __name__ == '__main__':
    diff_info = get_diff_info()
    enriched_diff_info = enrich_diff_info(diff_info)
    print(diff_info)
