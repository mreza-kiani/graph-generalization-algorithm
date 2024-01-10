from Levenshtein import distance
import re


def read_inputs(name1, name2) -> (str, str):
    txt1 = open(name1).read()
    txt2 = open(name2).read()
    return txt1, txt2


def flatten(l):
    return [item for sublist in l for item in sublist]


def extract_keywords(text):
    for sign in ['(', ')', '{', '}', ';', ',', '\n', '[', ']']:
        text = text.replace(sign, " ")
    parts = list(map(lambda x: x.strip(), text.split(" ")))
    parts = flatten(list(map(lambda x: x.split("."), parts)))
    parts = list(filter(lambda x: x != "", parts))
    return parts


def is_variable(term):
    return is_May_variable(term) or is_generalization_variable(term)


def is_May_variable(term):
    if term.startswith('V'):
        parts = term.split('_')
        if len(parts) > 1:
            return parts[0][1:].isnumeric()
    return False


def is_generalization_variable(term):
    if term.startswith('T'):
        parts = term.split('_')
        if len(parts) >= 2:
            return parts[0][1:].isnumeric()
    return False


def raw_completeness(file1, file2):
    return 1 - float(distance(file1, file2)) / max(len(file1), len(file2))


def remove_may_variables(file):
    pattern = r'[VT]([0-9]+)\w+'

    def replacement(match):
        return f'{match.group(0)[0]}{match.group(1)}'

    updated_file = re.sub(pattern, replacement, file)

    return updated_file


def raw_completeness_without_variables(generalized, file1, file2):
    generalized = remove_may_variables(generalized)
    return (raw_completeness(generalized, file1) + raw_completeness(generalized, file2)) / 2


def raw_compression(file):
    words = extract_keywords(file)
    variables = list(filter(is_variable, words))
    return float(len(variables)) / len(words)


def variable_ratio(compressed, concrete):
    compressed_words = extract_keywords(compressed)
    variables = list(filter(is_variable, compressed_words))
    concrete_words = extract_keywords(concrete)
    return float(len(variables)) / len(concrete_words)


if __name__ == '__main__':
    txt1, txt2 = read_inputs()
    words1 = extract_keywords(txt1)
    words2 = extract_keywords(txt1)
