import glob

from xml_parser import parse

if __name__ == '__main__':
    files = glob.glob("../../Selenium/UML/*.uml")
    for index, address in enumerate(files, start=1):
        file_name = address.split('/')[-1][:-4]
        print(f"{index}/{len(files)}. Converting: {file_name}")
        parse(xml_address=address, save_address=f'../../Selenium/Graph/{file_name}')