import xml.etree.ElementTree as ET

from graph_creator import print_graph_initialization, convert_to_node_name, save_graph_in_file


def remove_package(package):
    return convert_to_node_name(package.split('.')[-1])


def normalize_packages(graph):
    new_graph = {}
    for node, neighbors in graph.items():
        new_graph[remove_package(node)] = set(map(remove_package, neighbors))
    return new_graph


def main():
    graph = {}
    tree = ET.parse('uml.txt')
    root = tree.getroot()
    for child in root:
        if child.tag == 'nodes':
            print('-----' * 3 + ' NODES ' + '-----' * 3)
            for node in child:
                graph[node.text] = set()
                print(node.text, remove_package(node.text))
        elif child.tag == 'edges':
            print('-----' * 3 + ' EDGES ' + '-----' * 3)
            for edge in child:
                relationship = edge.attrib['relationship']
                source = edge.attrib['source']
                target = edge.attrib['target']
                if relationship in ['DEPENDENCY', 'TO_MANY', 'TO_ONE', 'INNER_CLASS', 'CREATE', 'REALIZATION',
                                    'GENERALIZATION']:
                    graph[source].add(target)
                    print('✓', edge.attrib)
                else:
                    print('✖', edge.attrib)
    graph = normalize_packages(graph)
    print_graph_initialization(graph)
    save_graph_in_file('v2.0-main', graph)


if __name__ == '__main__':
    main()
