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


def longest_common_substring(t1, t2):
    max = 0
    result = [[0 for j in range(len(t2) + 1)] for i in range(len(t1) + 1)]
    for i1, ch1 in enumerate(t1):
        for i2, ch2 in enumerate(t2):
            if ch1 == ch2:
                result[i1][i2] = result[i1 - 1][i2 - 1] + 1
                if result[i1][i2] > max:
                    max = result[i1][i2]
    return max


def LCS(t1, t2):
    max_value = 0
    result = [[0] * (len(t2) + 1) for _ in range(len(t1) + 1)]
    for i in range(len(t1) + 1):
        for j in range(len(t2) + 1):
            if i == 0 or j == 0:
                result[i][j] = 0
            elif t1[i - 1] == t2[j - 1]:
                result[i][j] = result[i - 1][j - 1] + 1
                if result[i][j] > max_value:
                    max_value = result[i][j]
            else:
                result[i][j] = max(result[i - 1][j], result[i][j - 1])

    return max_value


def similarity_score_based_on_longest_common_substring(change_log_class, find_class):
    return 2.0 * longest_common_substring(change_log_class, find_class) / (len(change_log_class) + len(find_class))


def similarity_score_based_on_LCS(change_log_class, find_class):
    return 2.0 * LCS(change_log_class, find_class) / (len(change_log_class) + len(find_class))


ALGORITHM = 'LCS'
# ALGORITHM = 'Longest Common Substring'
ALGORITHM = 'Common Parts'
STEP = 3


def extract_find_classes():
    data = """
FlywayAutoConfigurationTests	ConfigFileApplicationListenerTests	BindableRuntimeHintsRegistrarTests
TaskExecutionAutoConfigurationTests	OAuth2ClientPropertiesRegistrationAdapterTests	OAuth2ClientPropertiesMapperTests
Saml2RelyingPartyAutoConfigurationTests	ReactiveElasticsearchRestClientAutoConfigurationTests	ThreadPoolTaskExecutorBuilder
LogbackLoggingSystemTests	ImageBanner	SpringBootAotPlugin
KafkaAutoConfigurationTests	ReactiveElasticsearchRestClientAutoConfiguration	SimpleAsyncTaskExecutorBuilder
SessionAutoConfiguration	MetricsRestTemplateCustomizerTests	ThreadPoolTaskSchedulerBuilder
Log4J2LoggingSystemTests	AnsiColors	MeterRegistryPostProcessorTests
RedisAutoConfigurationTests	MetricsWebClientFilterFunctionTests	ConfigurationPropertiesBeanFactoryInitializationAotProcessorTests
SpringBootContextLoaderTests	PrivateKeyParser	ClientHttpRequestFactoriesTests
SslBuilderCustomizer	ImageBannerTests	AotTests
"""
    parts = data.split()
    return parts[::STEP] + parts[1::STEP] + parts[2::STEP]


if __name__ == '__main__':
    change_log_classes = ['AutoConfigureMetrics', 'ConnectionTypeDefinitionConfigurer', 'IllegalStateException', 'ApplicationListener', 'StitzL', 'RestClientTest', 'JsonComponents', 'NestedConfigurationProperty', 'ConnectionDetails', 'AuthTokenManager', 'GlobalObservationConvention', 'DataSourceBuilder', 'SdkLoggerProvider', 'TheHound', 'FilterRegistrationBean', 'Enable', 'JwkSetUriReactiveJwtDecoderBuilderCustomizer', 'LoggingSystemProperties', 'ReentrantLock', 'Neo4jConnectionDetails', 'ClientHttpRequestFactorySettings', 'Testcontainers', 'ImportTestcontainers', 'DependsOnDatabaseInitializationPostProcessor', 'MockServerRestTemplateCustomizer', 'ServletComponentScan', 'InputFile', 'RestControllerEndpoint', 'Input', 'DataFetcher', 'ApplicationContextInitializer', 'SpringBootApplication', 'AliasFor', 'SenderConfiguration', 'WebDriver', 'InfluxDB', 'ConditionalOnEnabledTracing', 'Mapper', 'JsonMixin', 'PostConstruct', 'SecurityManager', 'EricGao888', 'ElasticsearchClient', 'Resource', 'PropertySource', 'SimpleAsyncTaskExecutor', 'UninitializedPropertyAccessException', 'ScheduledBeanLazyInitializationExcludeFilter', 'ConcurrentKafkaListenerContainerFactory', 'WebSocketServerSpec', 'ObservedAspect', 'JwkSetUriJwtDecoderBuilderCustomizer', 'DataAccessStrategy', 'StandardMongoClientSettingsBuilderCustomizer', 'Abhijeetmishr', 'Container', 'Dialect', 'JdbcCustomConversions', 'RestTemplate', 'DefaultTestExecutionListenersPostProcessor', 'AutoConfigureTestDatabase', 'ConfigurationPropertiesReflectionHintsProcessor', 'RegisterReflectionForBinding', 'HealthContributor', 'DiskSpaceHealthIndicator', 'GraphQlExceptionHandler', 'Builder', 'RohanGoyal17', 'DynamicPropertySource', 'IDJack', 'SpanExporters', 'SimpleAsyncTaskSchedulerCustomizer', 'RabbitTemplate', 'ObservationPredicate', 'SimpleAsyncTaskExecutorCustomizer', 'JdbcClient', 'KafkaListenerContainerFactory', 'SimpleAsyncTaskExecutorBuilder', 'SslStoreProvider', 'SpringBootConfiguration', 'Log4jBridgeHandler', 'ConditionalOnClass', 'WebClient', 'SpringBootTest', 'GracefulShutdown', 'SeasonPanPan', 'DataJpaTest', 'ConditionalOnThreading', 'SpanExporter', 'ServiceConnection', 'Ferioney', 'ClientHttpRequestFactories', 'TheCK', 'WebDriverTestExecutionListener', 'ThreadPoolTaskSchedulerBuilder', 'CommonsMultipartResolver', 'TaskSchedulerBuilder', 'OtlpMeterRegistry', 'Scheduled', 'RabbitTemplateCustomizer', 'OpenTelemetry', 'JvmCompilationMetrics', 'DynamicPropertyRegistry', 'StreamReadConstraints', 'Maven', 'ValidationConfigurationCustomizer', 'DataSource', 'ObservationConvention', 'ConstructorBinding', 'EnableBatchProcessing', 'OAuth2ClientPropertiesMapper', 'Elasticsearch', 'ObservationHandler', 'SanitizableData', 'Kalpesh', 'OperationParameter', 'Pengfei', 'Anubhav', 'GenericContainer', 'Dieken', 'SpanProcessors', 'Ckram', 'ExceptionHandler', 'Observation', 'JettyClientHttpRequestFactory', 'OnSuorce', 'AutoConfiguration', 'Callable', 'JwtDecoder', 'ReactiveElasticsearchClient', 'EnableAsync', 'OtlpProperties', 'JdbcMappingContext', 'SimpleAsyncTaskScheduler', 'SdkTracerProviderBuilderCustomizer', 'EndpointCloudFoundryExtension', 'RelationalManagedTypes', 'OtlpHttpSpanExporter', 'SdkTracerProviderBuilder', 'ConditionalOnVirtualThreads', 'SpyBean', 'RabbitStreamTemplate', 'Deprecated', 'SpanHandler', 'JdkClientHttpConnector', 'SpanContextSupplier', 'Res', 'ConfigurationProperties', 'Jackson2ObjectMapperBuilderCustomizer', 'EnableWebMvc', 'ObservationRegistryCustomizer', 'SdkMeterProvider', 'SpanCustomizer', 'EntityScan', 'Reporter', 'GraphQlSource', 'SdkTracerProvider', 'NersesAM', 'BatchConversionServiceCustomizer', 'JunJaBoy', 'ThomazPassarelli', 'RestClient', 'SpanProcessor', 'TaskExecutorBuilder', 'QueryDslDataFetcher', 'AutoConfigureObservability', 'RobertRad', 'SpringBootDependencyInjectionTestExecutionListener', 'ContainerCustomizer', 'YuanHao97', 'TheoCaldas', 'TraceContext', 'WebDriverScope', 'ObservationConfig', 'Ch4ni', 'WebClientExchangeTagsProvider', 'BatchSpanProcessor', 'Configuration', 'LocalServerPort', 'PemSslStoreBundle', 'HttpClient', 'Tracer', 'SpringApplication', 'LogbackLoggingSystemProperties', 'CloudPlaform', 'ImageReference', 'Always', 'Loki4jAppender', 'JsonMixinModule', 'TimeUnit', 'KitBolourchi', 'JoranConfigurators', 'Observed', 'JdbcAggregateTemplate', 'ConditionalOnProperty', 'NamedParameterJdbcTemplate', 'BatchInterceptor', 'SimpleAsyncTaskSchedulerBuilder', 'ControllerAdvice', 'ObservationRegistry', 'StefanBratanov', 'MongoPropertiesClientSettingsBuilderCustomizer', 'WebMvcTagsProvider', 'DataR2dbcTest', 'ReactiveJwtDecoder', 'ThomasKasene', 'Import', 'ClientHttpRequestFactorySupplier', 'DeprecatedConfigurationProperty', 'ThreadPoolTaskExecutorBuilder', 'Environment', 'ExtendWith', 'DelegatingOAuth2TokenValidator', 'Async', 'DefaultValue', 'RestTemplateBuilder', 'TaskDecorator', 'MeterBinder', 'OAuth2ClientPropertiesRegistrationAdapter', 'RestControllerAdvice', 'JsonComponent', 'Bea', 'EvaristeGalois11', 'Timed', 'UseMainMethod', 'Bean', 'MeterProvider', 'ServletRegistrationBean', 'TestRestTemplate', 'WebFluxTagsProvider', 'BartR96', 'MahatmaFatalError', 'DefaultMeterObservationHandler', 'Autowired', 'JdkClientHttpRequestFactory', 'Created', 'QueryByExampleDataFetcher', 'ApplicationContextFailureProcessor', 'ConfigurationPropertiesBinding', 'Artur', 'AsyncTaskExecutor', 'RestTemplateExchangeTagsProvider', 'ContextHierarchy', 'JdbcConverter']

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
            elif ALGORITHM == 'Longest Common Substring':
                ratings[change_log_class] = similarity_score_based_on_longest_common_substring(change_log_class, find_class)
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
            # print(f"Top 10 = Precision/Recall: {'%.3f' % (top_10_points / 10.0)}/{'%.3f' % (top_10_points / len(change_log_classes))}")
            print(f"Top 5 = Precision/Recall: {'%.3f' % (top_5_points / 5.0)}/{'%.3f' % (top_5_points / len(change_log_classes))}")
            print("---------------------------------------------------------------------------")
            total_top_10_points += top_10_points
            total_top_5_points += top_5_points
            top_10_points = 0
            top_5_points = 0

        counter += 1

    print("########################################################################")
    # print(f"Total Top 10 = Precision/Recall: {'%.3f' % (total_top_10_points / (STEP * 10.0))}/{'%.3f' % (total_top_10_points / len(change_log_classes))}")
    print(f"Total Top 5 = Precision/Recall: {'%.3f' % (total_top_5_points / (STEP * 5.0))}/{'%.3f' % (total_top_5_points / len(change_log_classes))}")
    print("########################################################################")
