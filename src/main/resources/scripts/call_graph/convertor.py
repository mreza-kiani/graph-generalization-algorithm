def read_file(address):
    file = open(address, "r")
    return file.readlines()


def extract_graph(lines):
    vertices = set()
    edges = {}
    for line in lines:
        if line.startswith('M:'):
            parts = line.split(' ')
            tail = parts[0][2:].strip().replace(',', '-')
            head = parts[1][3:].strip().replace(',', '-')
            if tail not in edges:
                edges[tail] = []
            edges[tail].append(head)

            vertices.add(head)
            vertices.add(tail)
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
    input_path = 'data/junit-5.txt'
    output_path = 'junit-5.txt'

    lines = read_file(input_path)
    vertices, edges = extract_graph(lines)
    save_graph_in_file(output_path, vertices, edges)
