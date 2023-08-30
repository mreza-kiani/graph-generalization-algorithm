import re

change_log_classes_map = {}
find_classes_map = {}


def split_to_individuals(camelcase_string):
    return re.findall(r'[A-Za-z][a-z]', camelcase_string)


def extract_individual_map(list):
    return dict(map(lambda item: (item, split_to_individuals(item)), list))


def similarity_score_based_on_common_individuals(change_log_class, find_class):
    global find_classes_map, change_log_classes_map
    individuals = find_classes_map[find_class]
    individuals2 = change_log_classes_map[change_log_class]
    common_parts = len(set(filter(lambda item: item in individuals2, individuals)))
    return 2.0 * common_parts / (len(individuals) + len(individuals2))


def LCS(t1, t2):
    max = 0
    result = [[0 for j in range(len(t2) + 1)] for i in range(len(t1) + 1)]
    for i1, ch1 in enumerate(t1):
        for i2, ch2 in enumerate(t2):
            if ch1 == ch2:
                result[i1][i2] = result[i1-1][i2-1] + 1
                if result[i1][i2] > max:
                    max = result[i1][i2]
    return max


def similarity_score_based_on_LCS(change_log_class, find_class):
    lcs = LCS(change_log_class, find_class)
    return 2.0 * lcs / (len(change_log_class) + len(find_class))


# ALGORITHM = 'LCS'
ALGORITHM = 'Common Parts'
STEP = 3

def extract_find_classes():
    data = """
Assert	ExperimentalTests	AllRulesTests
Test	ParameterTokenSuiteWellFormed	StackTracesTest
AnnotationTest	ParameterTokenSuiteMalformedAndSwapped	Callbacks
TestRuleTest	ParameterizedTestWithAttemptedMethodCategory	AllTheoriesRunnerTests
ParentRunner	ParameterizedTestWithClassCategory	AllClassesTests
BlockJUnit4ClassRunner	ParameterTokenSuiteMalformed	AllJUnit3CompatibilityTests
ExpectedExceptionTest	MethodBeforesAndAfters	AllInternalTests
RunWith	FibonacciWithParameterizedFieldTest	CallbackArguments
TestRule	FibonacciTestWithArray	RunnersFactory
ParameterizedTestTest	FibonacciTest	AllExperimentalTests
"""
    parts = data.split()
    return parts[::STEP] + parts[1::STEP] + parts[2::STEP]


if __name__ == '__main__':
    change_log_classes = ['AnotherMemberClass', 'DisableOnDebug', 'Target', 'SlowTestSuiteWithoutFast', 'Arrays', 'ExcludeCategory', 'FastAndSmokeTestSuite', 'AssertionError', 'FromDataPoints', 'ClosedByInterruptException', 'StopwatchTest', 'HasGlobalTimeout', 'IllegalArgumentException', 'DeepInnerClass', 'Thread#interrupt()', 'ParentRunner', 'After', 'DataPoint', 'CategoryValidator', 'MethodRule', 'Result#getFailureCount', 'NullPointerException', 'RunListener', 'AfterParam', 'TestRule', 'ThreadSafe', 'Test', 'FrameworkField', 'TestTimedOutException', 'ClassRule', 'AnnotatedBuilder', 'Parameter', 'CommonRuleTest', 'SlowTestSuite', 'Callable<Object>', 'Iterable', 'Assert', 'ParameterSupplier', 'TheoriesAndTestsTogether', 'IOException', 'ValidateWith', 'MyMemberClass', 'Matcher', 'Assume', 'RuleChain', 'MySetupResetAndTearDownRule', 'Categories', 'MyTest', 'Fail', 'ExampleTestSuite', 'Object', 'OrderWith', 'LICENSE-junit', 'Throwable#initCause()', 'String', 'Override', 'BlockJUnit4ClassRunner', 'Callable', 'InterruptedException', 'Integer', 'CoreMatchers', 'InitializationError', 'Throwable#cause', 'File', 'Description', 'Thread', 'Cat1', 'TestName', 'ClassName=param', 'Matcher<?>', 'SuiteClasses', 'RandomAccessFile', 'RunNotifier', 'Rule', 'ClassName', 'Object[][]', 'InvalidTestClassError', 'Theories', 'Cat2', 'DataPoints', 'JUnitSystem', 'StopWatch', 'AssumptionViolatedException', 'Request', 'Throwable', 'Statement', 'Theory', 'TestClass', 'Category', 'AfterClass', 'Inherited', 'ThreadGroup', 'Suite', 'UseParametersRunnerFactory', 'IncludeCategory', 'InterruptedIOException', 'MatcherAssert', 'BlockJUnit4ClassRunner#createTest', 'Stopwatch', 'Class', 'TestFailedOnTimeoutException', 'Runner', 'ThreadGroupContext', 'ResultMatchers', 'List<T>', 'Exception', 'FixMethodOrder', 'DeepInheritedClass', 'ErrorCollector', 'Object[]', 'AnnotationBuilder', 'Result', 'BeforeClass', 'FilterFactory', 'Builder', 'IncludeCategories', 'RunWith', 'Before', 'AnnotationValidator', 'List<String>', 'Parameters', 'Parameterized', 'Timeout', 'ExpectedException', 'ArrayAssertionFailure', 'MultipleFailureException', 'SuperTest', 'FrameworkMethod', 'TemporaryFolder', 'JUnitCore', 'BeforeParam', 'FilterFactoryParams', 'FastOrSmokeTestSuite', 'DataPoint']
    change_log_classes_map = extract_individual_map(change_log_classes)
    find_classes = extract_find_classes()
    find_classes_map = extract_individual_map(find_classes)

    top_10_points = 0
    top_5_points = 0
    total_top_10_points = 0
    total_top_5_points = 0
    RATING_THRESHOLD = 0.7
    counter = 1

    print(f"-------------------------------{ALGORITHM}---------------------------------------")

    for find_class in find_classes:
        ratings = {}
        for change_log_class in change_log_classes:
            if ALGORITHM == 'LCS':
                ratings[change_log_class] = similarity_score_based_on_LCS(change_log_class, find_class)
            else:
                ratings[change_log_class] = similarity_score_based_on_common_individuals(change_log_class, find_class)

        ratings = dict(sorted(ratings.items(), key=lambda item: -item[1]))
        best = next(iter(ratings))

        if ratings[best] == 1.0:
            print(f"✓ {find_class}")
        elif ratings[best] >= RATING_THRESHOLD:
            print(f"≈ {find_class} -> {best}:{ratings[best]}")
        else:
            print(f"✖ {find_class}")

        if ratings[best] >= RATING_THRESHOLD:
            top_10_points += ratings[best]
            if 5 >= (counter % 10) >= 1:
                top_5_points += ratings[best]

        if counter % 10 == 0:
            print("---------------------------------------------------------------------------")
            print(f"Top 10 = Precision/Recall: {'%.3f'%(top_10_points/10.0)}/{'%.3f'%(top_10_points / len(change_log_classes))}")
            print(f"Top 5 = Precision/Recall: {'%.3f'%(top_5_points/5.0)}/{'%.3f'%(top_5_points / len(change_log_classes))}")
            print("---------------------------------------------------------------------------")
            total_top_10_points += top_10_points
            total_top_5_points += top_5_points
            top_10_points = 0
            top_5_points = 0

        counter += 1

    print("########################################################################")
    print(f"Total Top 10 = Precision/Recall: {'%.3f'%(total_top_10_points / (STEP*10.0))}/{'%.3f'%(total_top_10_points / len(change_log_classes))}")
    print(f"Total Top 5 = Precision/Recall: {'%.3f'%(total_top_5_points / (STEP*5.0))}/{'%.3f'%(total_top_5_points / len(change_log_classes))}")
    print("########################################################################")
