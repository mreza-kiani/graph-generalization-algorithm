import javalang


def read_java_class(address):
    file = open(address, "r")
    file_content = file.read()
    ast = javalang.parse.parse(file_content)
    return ast


if __name__ == '__main__':
    java_class = read_java_class('Test.java')
    print(java_class)