import re


def split_to_individuals(camelcase_string):
    return re.findall(r'[A-Za-z][a-z]', camelcase_string)


def extract_individual_map(list):
    return dict(map(lambda item: (item, split_to_individuals(item)), list))


def extract_find_classes():
    data = """
Categories	AbstractConcurrentFailuresTest	EmptyArgumentsProvider
TestClass	ComparisonCriteria	IsPotentialTestContainer
TestCase	TestComparator	LinesMatcher
Runner	MemberMustBeNonStaticOrAlsoClassRule	Iteration
Aaaaaa	ParameterizedNamesTest	JREee
Bbbbb	InfiniteLoopMultithreaded	IsPotentialJUnit4TestClass
PublicClass	AnnotationValidatorFactory	CollectionUtils
Token	SpecificDataPointsSupplier	EngineDiscoveryRequestResolution
Request	Theories	DiscoveryRequestCreator
Success	CategoryValidator	StringUtils
"""
    parts = data.split()
    return parts[::3] + parts[1::3] + parts[2::3]


if __name__ == '__main__':
    change_log_classes = ['JUnitSystem', 'SlowTestSuiteWithoutFast', 'Inherited', 'Exception', 'NANOSECONDS', 'FastOrSmokeTestSuite', 'TestFailedOnTimeoutException', 'IncludeCategory', 'InvalidTestClassError', 'Assume', 'Parameters', 'DeepInnerClass', 'Statement', 'ValidateWith', 'File', 'UseParametersRunnerFactory', 'DataPoints', 'Assert#assertThat', 'OrderWith', 'AnnotatedBuilder', 'SECONDS', 'LICENSE', 'TestRule', 'Parameter', 'Test', 'ParentRunner', 'Rule', 'ClassName=param', 'AnotherMemberClass', 'After', 'DataPoint(s)', 'MICROSECONDS', 'MultipleFailureException', 'Stopwatch', 'DataPoint', 'RunListener', 'MethodRule', 'AssumptionViolatedException', 'AfterParam', 'ClassRule', 'B', 'Categories', 'Throwable#cause', 'String', 'RunWith', 'IllegalArgumentException', 'FromDataPoints', 'C:\\cygwin\\usr\\local\\etc\\junit', 'DisableOnDebug', 'SuperTest', 'MatcherAssert', 'FilterFactory', 'TheoriesAndTestsTogether', 'Suite', 'Throwable', 'BeforeParam', 'Callable<Object>', 'InitializationError', 'Cat2', 'List<String>', 'ExpectedException', 'FrameworkField', 'Matcher<Object>', 'CategoryValidator', 'Callable', 'AssertionError', 'Category', 'ThreadGroup', 'MySetupResetAndTearDownRule', 'ThreadGroupContext', 'T', 'ClosedByInterruptException', 'SlowTestSuite', 'ParameterSupplier', 'TestTimedOutException', 'A', 'Arrays', 'Theories', 'Override', 'Builder', 'BlockJUnit4ClassRunner', 'FixMethodOrder', 'MyMemberClass', 'Result', 'TestClass', 'FilterFactoryParams', 'ResultMatchers', 'LICENSE-junit', 'AnnotationBuilder', 'CoreMatchers', 'MyTest', 'X', 'JUnitCore', 'Object[]', 'FrameworkMethod', 'Before', 'Throwable#initCause()', 'NullPointerException', 'Thread', 'ClassName', 'Result#getFailureCount', 'Target', 'Thread#interrupt()', 'StopwatchTest', 'MILLISECONDS', 'Timeout', 'ExcludeCategory', 'IncludeCategories', 'Fail', 'AfterClass', 'TestName', 'Parameterized', 'StopWatch', 'IOException', 'TemporaryFolder', 'ExampleTestSuite', 'Request', 'Runner', 'Assert', 'Iterable', 'RandomAccessFile', 'InterruptedIOException', 'ThreadSafe', 'BlockJUnit4ClassRunner#createTest', 'RunNotifier', 'CommonRuleTest', 'AnnotationValidator', 'Description', 'RuleChain', 'M2_HOME', 'FastAndSmokeTestSuite', 'Theory', 'BeforeClass', 'Object', 'HasGlobalTimeout', 'ErrorCollector', 'SuiteClasses', 'DeepInheritedClass', 'InterruptedException', 'List<T>', 'Integer', 'Object[][]', 'Class', 'Matcher', 'Matcher<?>', 'ArrayAssertionFailure', 'Cat1']
    change_log_classes_map = extract_individual_map(change_log_classes)
    find_classes = extract_find_classes()
    find_classes_map = extract_individual_map(find_classes)

    top_10_points = 0
    top_5_points = 0
    total_top_10_points = 0
    total_top_5_points = 0
    RATING_THRESHOLD = 0.7
    counter = 1
    for find_class in find_classes:
        individuals = find_classes_map[find_class]
        ratings = {}
        for change_log_class in change_log_classes:
            individuals2 = change_log_classes_map[change_log_class]
            common_parts = len(list(filter(lambda item: item in individuals2, individuals)))
            ratings[change_log_class] = 2.0 * common_parts / (len(individuals) + len(individuals2))

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
            print(f"Top 10 = {top_10_points/10.0}, Top 5 = {top_5_points/5.0}")
            print("---------------------------------------------------------------------------")
            total_top_10_points += top_10_points
            total_top_5_points += top_5_points
            top_10_points = 0
            top_5_points = 0

        counter += 1

    print("########################################################################")
    print(f"Total Top 10 = {total_top_10_points / 30.0}, Total Top 5 = {total_top_5_points / 15.0}")
    print("########################################################################")
