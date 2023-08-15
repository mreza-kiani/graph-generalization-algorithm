import requests
import re


# def extract_tokens(text):
#     redundant_words = ['`', '\'', '\"', '.', '(', ')']
#     xxx = response.text.split('\n')
#     for word in redundant_words:
#         text = text.replace(word, ' ')
#     return set(text.split())


# def extract_java_classes(tokens):
#     tokens = list(filter(lambda x: x[0].isupper() , tokens))
#     return tokens

def extract_java_classes(text):
    java_classes = set()

    # `ClassName`
    patterns = re.findall("`[^`]*`", text)
    for pattern in patterns:
        pattern = pattern.replace('`', '')
        if ' ' not in pattern and len(pattern) > 0 and pattern[0].isupper():
            if '.' in pattern:
                parts = pattern.split('.')
                if parts[0][0].isupper():
                    java_classes.add(parts[0])
                elif parts[-1][0].isupper():
                    java_classes.add(parts[-1])
            else:
                java_classes.add(pattern)

    # class ClassName
    patterns = re.findall("class [A-Z].*", text)
    for pattern in patterns:
        java_classes.add(pattern.split()[1])

    # @ClassName
    patterns = re.findall("@[A-Z][a-zA-Z0-9]*", text)
    for pattern in patterns:
        java_classes.add(pattern[1:])

    # org.java.ClassName
    patterns = re.findall("(([a-z]\w*\.)+[A-Z]\w*)", text)
    for pattern in patterns:
        java_classes.add(pattern[0].split('.')[-1])

    return java_classes


def extract_java_classes_from_url(url):
    response = requests.get(url)
    return extract_java_classes(response.text)


if __name__ == '__main__':
    keywords = set()
    url = input("Enter URL:")
    # url = 'https://raw.githubusercontent.com/junit-team/junit4/16228f3ccea3c6f1170488e0e268f3601d130f75/doc/ReleaseNotes4.4.md'
    keywords.update(extract_java_classes_from_url(url))
    print(keywords)
