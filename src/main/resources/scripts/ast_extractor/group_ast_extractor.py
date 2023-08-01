import glob
import os

from ast_extractor import extract_kotlin_declaration, COPY_MODE, PRINTING_MODE


def create_kotlin_filename(address):
    directory = "/".join(list(address.split('/')[0:-1]))
    file_name = address.split('/')[-1].split('.')[0]
    return f"{directory}/{file_name}.txt"


def save_kotlin_declaration_to_file(result, java_address):
    f = open(create_kotlin_filename(java_address), "w")
    f.write(result)
    f.close()


if __name__ == '__main__':
    COPY_MODE = False
    PRINTING_MODE = False
    # files = glob.glob("../../CodeSearchNet/*/*/*.java")
    files = glob.glob("/home/mamareza/UofC/Thesis/CodeSearchNet/notebooks/java/RandomCodeSearchNet2/*/Data/*.java")
    for index, address in enumerate(files, start=1):
        if os.path.isfile(address.replace('.java', '.txt')):
            print(f"{index}/{len(files)}. Already Converted!")
            continue
        try:
            print(f"{index}/{len(files)}. Converting: {address}")
            result = extract_kotlin_declaration(address)
            save_kotlin_declaration_to_file(result, address)
        except UnicodeDecodeError:
            print(f"---------------------------------------Error------------------------------------------")
