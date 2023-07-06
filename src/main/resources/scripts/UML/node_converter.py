import sys


def is_not_blank(s):
    return bool(s and s.strip())


def trim(s):
    return s.strip()


def print_class_definitions(nodes):
    print("Detected {} nodes".format(len(nodes)))
    print("Trying to define them:")
    print("-------" * 10)

    for node in nodes:
        print("val {} = Node(\"{}\")".format(node, convert_to_class_name(node)))

    print("-------" * 10)


def convert_to_class_name(node):
    return node[0].upper() + node[1:]


def main():
    nodes = []
    for line in sys.stdin:
        line = clear_garbage_chars(line)

        if len(line) > 0:
            new_nodes = list(set(filter(is_not_blank, map(trim, line.split(',')))))
            nodes = list(set(new_nodes + nodes))

    print_class_definitions(nodes)


def clear_garbage_chars(line):
    line = line.replace("Graph(", "")
    line = line.replace(" to ", ",")
    line = line.replace("\t", "")
    line = line.replace("\n", "")
    line = line.replace("nodes =", "")
    line = line.replace("edges =", "")
    line = line.replace("listOf(", "")
    line = line.replace("mapOf(", "")
    line = line.replace("),", "")
    line = line.replace(")", "")
    line = line.replace(" ", ",")
    return line


if __name__ == "__main__":
    main()
