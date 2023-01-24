import random
import string
import pyperclip

from tree_sitter import Language, Parser, Node

nodes = []
edges = {}
edges_mapping = {}


def configure_tree_sitter():
    Language.build_library(
        # Store the library in the `build` directory
        'build/my-languages.so',

        # Include one or more languages
        ['tree-sitter-java']
    )
    JAVA_LANGUAGE = Language('build/my-languages.so', 'java')
    parser = Parser()
    parser.set_language(JAVA_LANGUAGE)
    return parser


def read_java_class(address):
    file = open(address, "r")
    file_content = file.read()
    # ast = javalang.parse.parse(file_content)
    parser = configure_tree_sitter()
    ast = parser.parse(file_content.encode('utf8'))
    return ast


def get_random_name():
    return ''.join(random.choices(string.ascii_lowercase, k=6)) + random.choice(string.digits)


def process_the_tree(node: Node, parent_name=None):
    variable_name = get_random_name()
    variable_def = node.type
    edges_mapping[variable_name] = variable_def

    if parent_name is not None:
        edges[parent_name].append(variable_name)

    if len(node.children) == 0:
        if node.type in ['identifier', 'type_identifier', 'line_comment', 'block_comment'] or 'literal' in node.type:
            child_name = get_random_name()
            child_def = node.text.decode('ascii').replace("\"", "\\\"")
            edges_mapping[child_name] = child_def
            edges[variable_name] = [child_name]
    else:
        edges[variable_name] = []

    for child in node.children:
        process_the_tree(child, variable_name)


def get_variable_declarations():
    result = ''
    all_defs = list(edges_mapping.values())
    for variable_name, variable_def in edges_mapping.items():
        if all_defs.count(variable_def) == 1:
            result += f'val {variable_name} = Node("{variable_def}")\n'
        else:
            result += f'val {variable_name} = Node("{variable_def}", isDuplicate = true)\n'

    result += '\n'
    return result


def get_graph_declaration(graph_number):
    result = f"graph{graph_number} = Graph.from(\n"
    result += f"\tnodes = listOf({', '.join(edges_mapping.keys())}),\n"
    result += f"\tedges = mapOf(\n"
    for node_name, neighbors in edges.items():
        result += f"\t\t{node_name} to listOf({', '.join(neighbors)}),\n"
    result += "\t)\n"
    result += ")\n"
    return result


def copy_kotlin_declaration(graph_number):
    result = get_variable_declarations()
    result += get_graph_declaration(graph_number)
    pyperclip.copy(result)


if __name__ == '__main__':
    java_class = read_java_class('Test.java')
    process_the_tree(java_class.root_node)
    copy_kotlin_declaration(graph_number=1)
