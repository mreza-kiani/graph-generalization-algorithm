import glob


def read_file(address):
    file = open(address, "r")
    return file.readlines()


def remove_package_names(phrase):
    if phrase.startswith('java.'):
        return None
    # return phrase
    parts = phrase.split("(")
    result = parts[0].split('.')[-1] + '('
    arguments = parts[1][:-1].split('-')
    short_args = []
    for arg in arguments:
        short_args.append(arg.split('.')[-1])
    result += '-'.join(short_args) + ')'
    return result


def extract_graph(lines):
    vertices = set()
    edges = {}
    for line in lines:
        if line.startswith('M:'):
            parts = line.split(' ')
            tail = remove_package_names(parts[0][2:].strip().replace(',', '-'))
            head = remove_package_names(parts[1][3:].strip().replace(',', '-'))
            if tail not in edges:
                edges[tail] = []
                vertices.add(tail)
            if head is not None:
                edges[tail].append(head)
                vertices.add(head)
    edges = {k: v for k, v in edges.items() if len(v) != 0}

    return vertices, edges


def get_graph_definition(vertices, edges):
    result = "Graph(\n"
    result += "\tnodes = listOf({}),\n".format(", ".join(vertices))
    result += "\tedges = mapOf(\n"
    for class_name, children in edges.items():
        result += "\t\t{} to listOf({}),\n".format(class_name, ", ".join(children))
    result += "\t)\n)"
    return result


def save_graph_in_file(path, vertices, edges):
    file = open(path, 'w')
    file.write(get_graph_definition(vertices, edges))
    file.close()


if __name__ == '__main__':
    files = glob.glob("data/*.txt")
    for index, address in enumerate(files, start=1):
        file_name = address.split('/')[-1]
        lines = read_file(address)
        vertices, edges = extract_graph(lines)
        save_graph_in_file(file_name, vertices, edges)
