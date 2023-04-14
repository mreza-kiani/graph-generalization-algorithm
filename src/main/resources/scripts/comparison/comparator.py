from Levenshtein import *

from comparison.functions import read_inputs, raw_completeness, raw_compression, variable_ratio

dir_name = 'Assert8vs9'
may, generalization = read_inputs(name1=f"{dir_name}/may.java", name2=f"{dir_name}/generalization.java")
input1, input2 = read_inputs(name1=f"{dir_name}/input1.java", name2=f"{dir_name}/input2.java")

print('---------------------------------------Distance------------------------------------------------')
print("\t                input1 vs input2:", distance(input1, input2))
print("\tMay vs Generalization for input1:", distance(may, input1), 'vs', distance(generalization, input1))
print("\tMay vs Generalization for input2:", distance(may, input2), 'vs', distance(generalization, input2))
print("\t                         Average:", (distance(may, input1)+distance(may, input2))/2, 'vs',
      (distance(generalization, input1) + distance(generalization, input2)) / 2)
print("\t May and Generalization distance:", distance(may, generalization))

print()
print('--------------------------------------Completeness----------------------------------------------')
print("\tMay vs Generalization for input1:", raw_completeness(may, input1), 'vs', raw_completeness(generalization, input1))
print("\tMay vs Generalization for input2:", raw_completeness(may, input2), 'vs', raw_completeness(generalization, input2))
print("\t                         Average:", (raw_completeness(may, input1) + raw_completeness(may, input2)) / 2,
      'vs', (raw_completeness(generalization, input1) + raw_completeness(generalization, input2)) / 2)

print()
print('--------------------------------------Compression-----------------------------------------------')
print('\t           Compression of May:', raw_compression(may))
print('\tCompression of Generalization:', raw_compression(generalization))

print()
print('-------------------------------------Variable Ratio----------------------------------------------')
print('\tInput1 - May vs Generalization:', variable_ratio(may, input1), 'vs', variable_ratio(generalization, input1))
print('\tInput2 - May vs Generalization:', variable_ratio(may, input2), 'vs', variable_ratio(generalization, input2))
