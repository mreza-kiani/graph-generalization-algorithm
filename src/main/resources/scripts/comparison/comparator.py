import string

from Levenshtein import *
import sys

from functions import read_inputs, raw_completeness, raw_compression, variable_ratio

f = open("random_codesearchnet_july21_00_unpretified.csv", "a")


def compare(dir_name, input1_path, input2_path):
    may, generalization = read_inputs(name1=f"{dir_name}/FinalAUAST.java", name2=f"{dir_name}/Generalization_July21.java")
    input1, input2 = read_inputs(name1=f"{input1_path}", name2=f"{input2_path}")

    print('---------------------------------------Distance------------------------------------------------')
    print("\t                  input1 vs input2:", distance(input1, input2))
    print("\tAUAST vs Generalization for input1:", distance(may, input1), 'vs', distance(generalization, input1))
    print("\tAUAST vs Generalization for input2:", distance(may, input2), 'vs', distance(generalization, input2))
    print("\t                           Average:", (distance(may, input1) + distance(may, input2)) / 2, 'vs',
          (distance(generalization, input1) + distance(generalization, input2)) / 2)
    print("\t AUAST and Generalization distance:", distance(may, generalization))

    print()
    print('--------------------------------------Completeness----------------------------------------------')
    print("\tAUAST vs Generalization for input1:", raw_completeness(may, input1), 'vs',raw_completeness(generalization, input1))
    print("\tAUAST vs Generalization for input2:", raw_completeness(may, input2), 'vs', raw_completeness(generalization, input2))
    print("\t                           Average:", (raw_completeness(may, input1) + raw_completeness(may, input2)) / 2,
          'vs', (raw_completeness(generalization, input1) + raw_completeness(generalization, input2)) / 2)

    print()
    print('--------------------------------------Abstraction-----------------------------------------------')
    print('\tAUAST vs Generalization:', raw_compression(may), 'vs', raw_compression(generalization))

    print()
    print('-------------------------------------Variable Ratio----------------------------------------------')
    print('\tInput1 - AUAST vs Generalization:', variable_ratio(may, input1), 'vs', variable_ratio(generalization, input1))
    print('\tInput2 - AUAST vs Generalization:', variable_ratio(may, input2), 'vs', variable_ratio(generalization, input2))

    category = dir_name.split('/')[3]
    template = dir_name.split('/')[4]
    input1_number = ''.join(filter(str.isdigit, input1_path.split('/')[-1]))
    input2_number = ''.join(filter(str.isdigit, input2_path.split('/')[-1]))
    category_base_name = category.split('.')[-1]
    is_similar = False
    if raw_compression(may) == 0.0 and raw_compression(generalization) == 0.0:
        is_similar = True

    f.write(f"{category}, {template}, {category_base_name} {input1_number} vs {input2_number}, {is_similar}, "
            f"{(raw_completeness(may, input1) + raw_completeness(may, input2)) / 2}, {(raw_completeness(generalization, input1) + raw_completeness(generalization, input2)) / 2},"
            f"{raw_compression(may)}, {raw_compression(generalization)},"
            f"{(variable_ratio(may, input1) + variable_ratio(may, input2)) / 2}, {(variable_ratio(generalization, input1) + variable_ratio(generalization, input2)) / 2}\n")


if __name__ == '__main__':
    dir_name = sys.argv[1]
    input1_path = sys.argv[2]
    input2_path = sys.argv[3]
    print(dir_name, input1_path, input2_path)
    compare(dir_name, input1_path, input2_path)
    f.close()
