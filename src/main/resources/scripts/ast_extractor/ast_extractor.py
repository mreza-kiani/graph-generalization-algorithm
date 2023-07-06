import random
import string
import pyperclip

from tree_sitter import Language, Parser, Node

nodes = []
edges = {}
edges_mapping = {}
PRINTING_MODE = False
COPY_MODE = True


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


def extract_variable_def(node):
    variable_def = node.type
    if variable_def == "void_type":
        variable_def = "void"
    return variable_def


def process_the_tree(node: Node, parent_name=None):
    variable_name = get_random_name()
    edges_mapping[variable_name] = extract_variable_def(node)

    if parent_name is not None:
        edges[parent_name].append(variable_name)

    if len(node.children) == 0:
        if node.type in ['identifier', 'type_identifier', 'line_comment', 'block_comment'] or 'literal' in node.type:
            child_name = get_random_name()
            child_def = node.text.decode('ascii').replace("\"", "\\\"").replace("\n", "\\n")
            edges_mapping[child_name] = child_def
            edges[variable_name] = [child_name]
    elif node.type == 'string_literal':
        child_name = get_random_name()
        child_def = node.text.decode('ascii')
        edges_mapping[child_name] = child_def
        edges[variable_name] = [child_name]
        return
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


def convert_graph_to_kotlin_declaration(graph_number):
    result = get_variable_declarations()
    result += get_graph_declaration(graph_number)
    if COPY_MODE:
        pyperclip.copy(result)
    if PRINTING_MODE:
        print(result)
    return result


def initialize_variables():
    global nodes, edges, edges_mapping
    nodes = []
    edges = {}
    edges_mapping = {}


def extract_kotlin_declaration(address):
    java_class = read_java_class(address)
    initialize_variables()
    process_the_tree(java_class.root_node)
    return convert_graph_to_kotlin_declaration(graph_number=1)


if __name__ == '__main__':
    extract_kotlin_declaration('Test.java')
