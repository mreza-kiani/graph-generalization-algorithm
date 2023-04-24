import glob

from ast_extractor import extract_kotlin_declaration


def create_kotlin_filename(address):
    directory = "/".join(list(address.split('/')[0:-1]))
    file_name = address.split('/')[-1].split('.')[0]
    return f"{directory}/{file_name}.txt"


def save_kotlin_declaration_to_file(result, java_address):
    f = open(create_kotlin_filename(java_address), "w")
    f.write(result)
    f.close()


if __name__ == '__main__':
    files = glob.glob("Mays/*/*/*/*.java")
    for index, address in enumerate(files, start=1):
        print(f"{index}/{len(files)}. Converting: {address}")
        result = extract_kotlin_declaration(address)
        save_kotlin_declaration_to_file(result, address)
