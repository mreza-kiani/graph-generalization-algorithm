import sys

from node_converter import trim, is_not_blank, print_class_definitions


def convert_to_node_name(class_name):
    return class_name[0].lower() + class_name[1:]


def print_graph_initialization(classes):
    print("Graph Definition:")
    print("-------" * 10)

    print(get_graph_definition(classes))

    print("-------" * 10)


def get_graph_definition(classes):
    result = "Graph(\n"
    result += "\tnodes = listOf({}),\n".format(", ".join(classes.keys()))
    result += "\tedges = mapOf(\n"
    for class_name, parents in classes.items():
        result += "\t\t{} to listOf({}),\n".format(class_name, ", ".join(parents))
    result += "\t)\n)"
    return result


def save_graph_in_file(name, classes):
    file = open(f'{name}.txt', 'w')
    file.write(get_graph_definition(classes))
    file.close()


def main():
    classes = {}
    for line in sys.stdin:
        line = clear_garbage_chars(line)

        if len(line) > 0:
            parts = list(filter(is_not_blank, map(trim, line.split(':'))))
            class_name = convert_to_node_name(parts[0])
            parent_classes = []
            if len(parts) > 1:
                parent_classes = list(map(convert_to_node_name, filter(is_not_blank, map(trim, parts[1].split(',')))))

            classes[class_name] = parent_classes

    print_graph_initialization(classes)
    print_class_definitions(classes.keys())


def clear_garbage_chars(line):
    if "package" in line:
        line = ""
    line = line.replace("open", "")
    line = line.replace("class", "")
    line = line.replace("interface", "")
    line = line.replace("()", "")
    line = line.strip()
    return line


if __name__ == "__main__":
    main()
