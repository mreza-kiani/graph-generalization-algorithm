package ca.ucalgary.cs.comparison.dependency_graph

import ca.ucalgary.cs.comparison.BaseCompareGraphTest
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.graph.Node
import ca.ucalgary.cs.io.visualize

class JoboonjaSpringTest : BaseCompareGraphTest() {
    override fun initializeGraphs() {
        val userDto = Node("UserDto")
        val noSuchEndPointDto = Node("NoSuchEndPointDto")
        val projectSeed = Node("ProjectSeed")
        val oneToMany = Node("OneToMany")
        val autoIncrement = Node("AutoIncrement")
        val persistenceProxy = Node("PersistenceProxy")
        val auctionRepositoryInMemoryImpl = Node("AuctionRepositoryInMemoryImpl")
        val entityControllerParameterResolver = Node("EntityControllerParameterResolver")
        val restControllerAdvice = Node("RestControllerAdvice")
        val entityManager = Node("EntityManager")
        val resourcePool = Node("ResourcePool")
        val scheduleManager = Node("ScheduleManager")
        val restControllerAdviceManager = Node("RestControllerAdviceManager")
        val forbiddenException = Node("ForbiddenException")
        val user = Node("User")
        val projectRepositoryImpl = Node("ProjectRepositoryImpl")
        val cache = Node("Cache")
        val projectTitle = Node("ProjectTitle")
        val projectSkill = Node("ProjectSkill")
        val memoryDataBase = Node("MemoryDataBase")
        val skillRepositoryInMemoryImpl = Node("SkillRepositoryInMemoryImpl")
        val requestAttribute = Node("RequestAttribute")
        val defaultUserSeed = Node("DefaultUserSeed")
        val httpResponse = Node("HttpResponse")
        val auctionRepositoryImpl = Node("AuctionRepositoryImpl")
        val endorseRequest = Node("EndorseRequest")
        val project = Node("Project")
        val noSuchEndPoint = Node("NoSuchEndPoint")
        val auctionRepository = Node("AuctionRepository")
        val persistenceUtils = Node("PersistenceUtils")
        val requestBody = Node("RequestBody")
        val reflectionUtil = Node("ReflectionUtil")
        val corsFilter = Node("CorsFilter")
        val userSkill = Node("UserSkill")
        val entityRepository = Node("EntityRepository")
        val dataMapper = Node("DataMapper")
        val userController = Node("UserController")
        val entityObjectIdResolver = Node("EntityObjectIdResolver")
        val cascadeType = Node("CascadeType")
        val schedulable = Node("Schedulable")
        val authenticationService = Node("AuthenticationService")
        val schemaManager = Node("SchemaManager")
        val endorsement = Node("Endorsement")
        val entity = Node("Entity")
        val auctionService = Node("AuctionService")
        val endorseRepositoryInMemoryImpl = Node("EndorseRepositoryInMemoryImpl")
        val endorsementController = Node("EndorsementController")
        val userSkillDto = Node("UserSkillDto")
        val budgetOverflow = Node("BudgetOverflow")
        val endPoint = Node("EndPoint")
        val badRequestException = Node("BadRequestException")
        val authenticationFilter = Node("AuthenticationFilter")
        val main = Node("Main")
        val authService = Node("AuthService")
        val persistenceSet = Node("PersistenceSet")
        val illegalBidExceptionDto = Node("IllegalBidExceptionDto")
        val applicationProperties = Node("ApplicationProperties")
        val dispatcher = Node("Dispatcher")
        val modelProxy = Node("ModelProxy")
        val collectionTable = Node("CollectionTable")
        val endorse = Node("Endorse")
        val applicationDataBaseConnectionProvider = Node("ApplicationDataBaseConnectionProvider")
        val projectDto = Node("ProjectDto")
        val restController = Node("RestController")
        val skillRepositoryImpl = Node("SkillRepositoryImpl")
        val notFoundAdvice = Node("NotFoundAdvice")
        val solutionsApplication = Node("SolutionsApplication")
        val httpGetClient = Node("HttpGetClient")
        val endorseService = Node("EndorseService")
        val endorsableSkill = Node("EndorsableSkill")
        val requestParam = Node("RequestParam")
        val deserializer = Node("Deserializer")
        val demoServlet = Node("DemoServlet")
        val beanMapper = Node("BeanMapper")
        val serializer = Node("Serializer")
        val duplicateItemException = Node("DuplicateItemException")
        val insufficientSkill = Node("InsufficientSkill")
        val page = Node("Page")
        val requestMethod = Node("RequestMethod")
        val oneToManyPersistenceSet = Node("OneToManyPersistenceSet")
        val illegalFormat = Node("IllegalFormat")
        val auction = Node("Auction")
        val bidControllerAdvice = Node("BidControllerAdvice")
        val entityNotFoundDto = Node("EntityNotFoundDto")
        val endorseRepository = Node("EndorseRepository")
        val serializeException = Node("SerializeException")
        val modelProxyFactory = Node("ModelProxyFactory")
        val bidAmount = Node("BidAmount")
        val valueTypePersistenceSet = Node("ValueTypePersistenceSet")
        val commonControllerAdvice = Node("CommonControllerAdvice")
        val skillController = Node("SkillController")
        val userRepository = Node("UserRepository")
        val endorseRepositoryImpl = Node("EndorseRepositoryImpl")
        val id = Node("Id")
        val projectAuctioneer = Node("ProjectAuctioneer")
        val hikariCPDataSource = Node("HikariCPDataSource")
        val skillRepository = Node("SkillRepository")
        val integerControllerParameterResolver = Node("IntegerControllerParameterResolver")
        val modelProxyFieldAccessors = Node("ModelProxyFieldAccessors")
        val token = Node("Token")
        val bid = Node("Bid")
        val pageable = Node("Pageable")
        val httpClient = Node("HttpClient")
        val skill = Node("Skill")
        val projectRepositoryInMemoryImpl = Node("ProjectRepositoryInMemoryImpl")
        val duplicateItemMessage = Node("DuplicateItemMessage")
        val manyToOne = Node("ManyToOne")
        val pathVariableResolverManager = Node("PathVariableResolverManager")
        val preparedQuery = Node("PreparedQuery")
        val restControllerAdviceHandlerData = Node("RestControllerAdviceHandlerData")
        val jDBCRepository = Node("JDBCRepository")
        val application = Node("Application")
        val pathVariable = Node("PathVariable")
        val getterInterceptor = Node("GetterInterceptor")
        val userRepositoryInMemoryImpl = Node("UserRepositoryInMemoryImpl")
        val knowledge = Node("Knowledge")
        val controllerParameterResolver = Node("ControllerParameterResolver")
        val restControllerAdviceHandler = Node("RestControllerAdviceHandler")
        val projectRepository = Node("ProjectRepository")
        val joinColumn = Node("JoinColumn")
        val illegalBidException = Node("IllegalBidException")
        val projectService = Node("ProjectService")
        val projectController = Node("ProjectController")
        val requestMapping = Node("RequestMapping")
        val notFoundException = Node("NotFoundException")
        val userService = Node("UserService")
        val entityNotFound = Node("EntityNotFound")
        val javaTypesControllerParameterResolver = Node("JavaTypesControllerParameterResolver")
        val initializer = Node("Initializer")
        val authController = Node("AuthController")
        val missingParameter = Node("MissingParameter")
        val badRequestAdvice = Node("BadRequestAdvice")
        val stringControllerParameterResolver = Node("StringControllerParameterResolver")
        val cORSFilter = Node("CORSFilter")
        val authFilter = Node("AuthFilter")
        val jWTUtils = Node("JWTUtils")
        val applicationRunner = Node("ApplicationRunner")
        val forbidden = Node("Forbidden")
        val unauthorizedDto = Node("UnauthorizedDto")
        val forbiddenFoundAdvice = Node("ForbiddenFoundAdvice")
        val skillService = Node("SkillService")
        val userRepositoryImpl = Node("UserRepositoryImpl")
        val knowledgeSeed = Node("KnowledgeSeed")
        val objectConverter = Node("ObjectConverter")


        graph1 = Graph.from(
            nodes = listOf(authService, endorseRepositoryInMemoryImpl, deserializer, jDBCRepository, auctionRepositoryImpl, endorseRepository, resourcePool, forbiddenException, skillService, projectController, badRequestAdvice, cORSFilter, authFilter, application, auctionService, skillRepositoryImpl, userController, user, httpClient, endorseService, serializer, skill, endorseRepositoryImpl, schemaManager, forbiddenFoundAdvice, jWTUtils, token, projectRepositoryInMemoryImpl, endorsableSkill, notFoundAdvice, endorse, projectService, preparedQuery, bidAmount, auctionRepositoryInMemoryImpl, notFoundException, projectRepositoryImpl, projectTitle, memoryDataBase, endorseRequest, project, serializeException, auctionRepository, skillRepositoryInMemoryImpl, httpResponse, userRepository, userRepositoryInMemoryImpl, skillRepository, auction, badRequestException, bid, skillController, authController, userService, projectRepository, userRepositoryImpl),
            edges = mapOf(
                authService to listOf(notFoundException, user, userService, jWTUtils),
                endorseRepositoryInMemoryImpl to listOf(memoryDataBase, endorse),
                deserializer to listOf(),
                jDBCRepository to listOf(preparedQuery, resourcePool),
                auctionRepositoryImpl to listOf(project),
                endorseRepository to listOf(endorse),
                resourcePool to listOf(),
                forbiddenException to listOf(),
                skillService to listOf(skillRepository, skill),
                projectController to listOf(projectService, auctionService, bid, bidAmount, project, user),
                badRequestAdvice to listOf(badRequestException),
                cORSFilter to listOf(),
                authFilter to listOf(user, userService, jWTUtils),
                application to listOf(schemaManager),
                auctionService to listOf(projectRepository, skill, auctionRepository, userService, project, userRepository),
                skillRepositoryImpl to listOf(),
                userController to listOf(endorsableSkill, skill, endorse, endorseService, userService, endorseRequest, user),
                user to listOf(skill),
                httpClient to listOf(serializeException, project, skill, deserializer),
                endorseService to listOf(user, userService, endorseRepository),
                serializer to listOf(),
                skill to listOf(),
                endorseRepositoryImpl to listOf(),
                schemaManager to listOf(skillService, project, projectService, httpClient, skill, resourcePool, endorseRepositoryImpl, auctionRepositoryImpl, skillRepositoryImpl, userRepositoryImpl, projectRepositoryImpl),
                forbiddenFoundAdvice to listOf(forbiddenException),
                jWTUtils to listOf(),
                token to listOf(),
                projectRepositoryInMemoryImpl to listOf(user, memoryDataBase, project),
                endorsableSkill to listOf(skill),
                notFoundAdvice to listOf(notFoundException),
                endorse to listOf(),
                projectService to listOf(projectRepository, user, skill, project),
                preparedQuery to listOf(),
                bidAmount to listOf(),
                auctionRepositoryInMemoryImpl to listOf(memoryDataBase, bid, project),
                notFoundException to listOf(),
                projectRepositoryImpl to listOf(user),
                projectTitle to listOf(),
                memoryDataBase to listOf(skill, endorse, project, user, auction),
                endorseRequest to listOf(),
                project to listOf(skill),
                serializeException to listOf(),
                auctionRepository to listOf(project, bid, auction),
                skillRepositoryInMemoryImpl to listOf(memoryDataBase, skill),
                httpResponse to listOf(),
                userRepository to listOf(user),
                userRepositoryInMemoryImpl to listOf(user, memoryDataBase, skill),
                skillRepository to listOf(skill),
                auction to listOf(bid),
                badRequestException to listOf(),
                bid to listOf(),
                skillController to listOf(skillService, skill),
                authController to listOf(user, token, authService, userService),
                userService to listOf(user, skillService, userRepository),
                projectRepository to listOf(user, project),
                userRepositoryImpl to listOf(),
            )
        )

        graph2 = Graph.from(
            nodes = listOf(page, bidControllerAdvice, dispatcher, endorsementController, objectConverter, budgetOverflow, userSkillDto, skillController, restControllerAdvice, duplicateItemMessage, user, userRepository, id, entityNotFoundDto, joinColumn, unauthorizedDto, pathVariable, controllerParameterResolver, illegalFormat, project, pathVariableResolverManager, manyToOne, userDto, entity, schedulable, hikariCPDataSource, restController, demoServlet, httpGetClient, solutionsApplication, requestBody, persistenceSet, applicationRunner, restControllerAdviceManager, insufficientSkill, initializer, valueTypePersistenceSet, main, applicationDataBaseConnectionProvider, entityObjectIdResolver, defaultUserSeed, projectAuctioneer, scheduleManager, modelProxyFactory, projectSkill, forbidden, authenticationFilter, authenticationService, requestAttribute, modelProxyFieldAccessors, missingParameter, illegalBidException, persistenceProxy, userSkill, entityRepository, projectRepository, userController, projectService, modelProxy, userService, restControllerAdviceHandlerData, persistenceUtils, commonControllerAdvice, getterInterceptor, requestParam, requestMethod, oneToMany, entityNotFound, pageable, integerControllerParameterResolver, noSuchEndPointDto, bid, endPoint, collectionTable, projectController, cascadeType, entityManager, dataMapper, restControllerAdviceHandler, applicationProperties, javaTypesControllerParameterResolver, beanMapper, cache, reflectionUtil, illegalBidExceptionDto, corsFilter, stringControllerParameterResolver, autoIncrement, projectSeed, noSuchEndPoint, duplicateItemException, projectDto, requestMapping, oneToManyPersistenceSet, knowledge, knowledgeSeed, endorsement, auction, entityControllerParameterResolver),
            edges = mapOf(
                page to listOf(pageable),
                bidControllerAdvice to listOf(insufficientSkill, budgetOverflow),
                dispatcher to listOf(requestMethod, restControllerAdviceManager, applicationProperties, requestMapping, restController, endPoint),
                endorsementController to listOf(entityManager, userSkill, requestMethod, user),
                objectConverter to listOf(),
                budgetOverflow to listOf(),
                userSkillDto to listOf(userSkill, user),
                skillController to listOf(entityManager, userSkill, knowledge, requestMethod, user, userService),
                restControllerAdvice to listOf(),
                duplicateItemMessage to listOf(),
                user to listOf(userSkill, cascadeType),
                userRepository to listOf(cache, entityManager, pageable, user),
                id to listOf(),
                entityNotFoundDto to listOf(entityNotFound),
                joinColumn to listOf(),
                unauthorizedDto to listOf(),
                pathVariable to listOf(),
                controllerParameterResolver to listOf(),
                illegalFormat to listOf(),
                project to listOf(userSkill, knowledge, user, bid, projectSkill),
                pathVariableResolverManager to listOf(applicationProperties, controllerParameterResolver),
                manyToOne to listOf(),
                userDto to listOf(user),
                entity to listOf(),
                schedulable to listOf(),
                hikariCPDataSource to listOf(),
                restController to listOf(),
                demoServlet to listOf(),
                httpGetClient to listOf(),
                solutionsApplication to listOf(scheduleManager, entityManager, applicationProperties, applicationRunner),
                requestBody to listOf(),
                persistenceSet to listOf(),
                applicationRunner to listOf(),
                restControllerAdviceManager to listOf(restControllerAdviceHandlerData, restControllerAdviceHandler, restControllerAdvice),
                insufficientSkill to listOf(),
                initializer to listOf(solutionsApplication),
                valueTypePersistenceSet to listOf(reflectionUtil, entityManager, collectionTable),
                main to listOf(solutionsApplication),
                applicationDataBaseConnectionProvider to listOf(),
                entityObjectIdResolver to listOf(entity, entityManager),
                defaultUserSeed to listOf(entityManager, knowledge, userService),
                projectAuctioneer to listOf(project, projectRepository),
                scheduleManager to listOf(applicationProperties, schedulable),
                modelProxyFactory to listOf(getterInterceptor, modelProxy, modelProxyFieldAccessors),
                projectSkill to listOf(knowledge),
                forbidden to listOf(),
                authenticationFilter to listOf(authenticationService, user),
                authenticationService to listOf(userRepository, user),
                requestAttribute to listOf(),
                modelProxyFieldAccessors to listOf(reflectionUtil),
                missingParameter to listOf(),
                illegalBidException to listOf(),
                persistenceProxy to listOf(),
                userSkill to listOf(endorsement, knowledge, user),
                entityRepository to listOf(entity),
                projectRepository to listOf(project, entityManager, pageable, user),
                userController to listOf(requestMethod, user, userService, authenticationService, userRepository),
                projectService to listOf(project, entityManager),
                modelProxy to listOf(),
                userService to listOf(entityManager, userSkill, knowledge, user),
                restControllerAdviceHandlerData to listOf(restControllerAdviceHandler),
                persistenceUtils to listOf(reflectionUtil, modelProxy, persistenceSet),
                commonControllerAdvice to listOf(duplicateItemException, illegalFormat, forbidden, entityNotFound, missingParameter, noSuchEndPoint),
                getterInterceptor to listOf(entityManager, oneToMany, persistenceSet, objectConverter, entity, modelProxyFieldAccessors, manyToOne, reflectionUtil, cache, joinColumn, collectionTable),
                requestParam to listOf(),
                requestMethod to listOf(),
                oneToMany to listOf(cascadeType),
                entityNotFound to listOf(),
                pageable to listOf(),
                integerControllerParameterResolver to listOf(),
                noSuchEndPointDto to listOf(noSuchEndPoint),
                bid to listOf(project, user),
                endPoint to listOf(requestMethod, controllerParameterResolver, requestAttribute, requestBody, requestMapping, restController, pathVariableResolverManager, requestParam, pathVariable),
                collectionTable to listOf(),
                projectController to listOf(entityManager, requestMethod, user, projectRepository, project),
                cascadeType to listOf(),
                entityManager to listOf(id, applicationDataBaseConnectionProvider, oneToMany, autoIncrement, applicationProperties, modelProxyFieldAccessors, entity, manyToOne, modelProxy, dataMapper, cascadeType, reflectionUtil, cache, joinColumn, collectionTable),
                dataMapper to listOf(),
                restControllerAdviceHandler to listOf(),
                applicationProperties to listOf(),
                javaTypesControllerParameterResolver to listOf(),
                beanMapper to listOf(reflectionUtil, modelProxyFactory, modelProxyFieldAccessors, manyToOne),
                cache to listOf(),
                reflectionUtil to listOf(id),
                illegalBidExceptionDto to listOf(),
                corsFilter to listOf(),
                stringControllerParameterResolver to listOf(),
                autoIncrement to listOf(),
                projectSeed to listOf(project, entityManager, httpGetClient),
                noSuchEndPoint to listOf(requestMethod),
                duplicateItemException to listOf(),
                projectDto to listOf(project),
                requestMapping to listOf(requestMethod),
                oneToManyPersistenceSet to listOf(entityManager, oneToMany, modelProxyFieldAccessors, cascadeType, reflectionUtil, joinColumn),
                knowledge to listOf(entityObjectIdResolver),
                knowledgeSeed to listOf(entityManager, knowledge, httpGetClient),
                endorsement to listOf(user),
                auction to listOf(project),
                entityControllerParameterResolver to listOf(reflectionUtil, entity, entityManager, objectConverter),
            )
        )
    }

    override fun checkCommonGraph(commonGraph: Graph) {
        commonGraph.visualize("joboonja_spring")
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {}
    override fun checkGraph2Diff(graph2Diff: Graph) {}
}