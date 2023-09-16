import glob
import os


def read_file(address):
    file = open(address, "r")
    file_content = file.read()
    return file_content


def save_file(contents, address):
    f = open(address, "w")
    f.write(contents)
    f.close()


if __name__ == '__main__':
    COPY_MODE = False
    PRINTING_MODE = False
    # files = glob.glob("../../CodeSearchNet/*/*/*.java")
    files = glob.glob("/home/mamareza/UofC/Thesis/CodeSearchNet/notebooks/java/CodeSearchNetMine/*/*/Data/*.java")
    for index, address in enumerate(files, start=1):
        print(f"{index}/{len(files)}. Adding fake class for {address}!")
        content = read_file(address)
        if not content.startswith('class B {'):
            new_content = f"class B {{\n {content} \n}}"
            save_file(new_content, address)
            print("✓")
