import xml.etree.ElementTree as ET

from graph_creator import print_graph_initialization, convert_to_node_name, save_graph_in_file

PRINTING_MODE = False


def remove_package(package):
    return convert_to_node_name(package.split('.')[-1])


def normalize_packages(graph):
    new_graph = {}
    for node, neighbors in graph.items():
        new_graph[remove_package(node)] = set(map(remove_package, neighbors))
    return new_graph


def parse(xml_address, save_address=None):
    graph = {}
    tree = ET.parse(xml_address)
    root = tree.getroot()
    for child in root:
        if child.tag == 'nodes':
            if PRINTING_MODE:
                print('-----' * 3 + ' NODES ' + '-----' * 3)
            for node in child:
                graph[node.text] = set()
                if PRINTING_MODE:
                    print(node.text, remove_package(node.text))
        elif child.tag == 'edges':
            if PRINTING_MODE:
                print('-----' * 3 + ' EDGES ' + '-----' * 3)
            for edge in child:
                relationship = edge.attrib['relationship']
                source = edge.attrib['source']
                target = edge.attrib['target']
                if relationship in ['DEPENDENCY', 'TO_MANY', 'TO_ONE', 'INNER_CLASS', 'CREATE', 'REALIZATION',
                                    'GENERALIZATION']:
                    graph[source].add(target)
                    if PRINTING_MODE:
                        print('✓', edge.attrib)
                else:
                    if PRINTING_MODE:
                        print('✖', edge.attrib)
    graph = normalize_packages(graph)
    if PRINTING_MODE:
        print_graph_initialization(graph)
    if save_address is not None:
        save_graph_in_file(save_address, graph)


if __name__ == '__main__':
    parse(xml_address='uml.txt', save_address='v2.0-main')
