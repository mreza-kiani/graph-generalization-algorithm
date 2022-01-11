package ca.ucalgary.cs.comparison.dependency_graph

import ca.ucalgary.cs.comparison.BaseCompareGraphTest
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.graph.Node
import ca.ucalgary.cs.io.visualize

class JoboonjaTest : BaseCompareGraphTest() {
    override fun initializeGraphs() {
        val loginFailure = Node("LoginFailure")
        val projectSkill = Node("ProjectSkill")
        val skill = Node("Skill")
        val invalidUser = Node("InvalidUser")
        val objectFactory = Node("ObjectFactory")
        val tokenService = Node("TokenService")
        val serverException = Node("ServerException")
        val projects = Node("Projects")
        val databaseColumns = Node("DatabaseColumns")
        val userSearchServlet = Node("UserSearchServlet")
        val internalErrorException = Node("InternalErrorException")
        val bids = Node("Bids")
        val restExceptionHandler = Node("RestExceptionHandler")
        val databaseErrorsConfig = Node("DatabaseErrorsConfig")
        val endorseService = Node("EndorseService")
        val skillServlet = Node("SkillServlet")
        val signup = Node("Signup")
        val skillInitializer = Node("SkillInitializer")
        val remoteURLs = Node("RemoteURLs")
        val authFilter = Node("AuthFilter")
        val endorseRequest = Node("EndorseRequest")
        val usersListServlet = Node("UsersListServlet")
        val userServiceImpl = Node("UserServiceImpl")
        val bidMapper = Node("BidMapper")
        val projectSkillDto = Node("ProjectSkillDto")
        val allUsersResponse = Node("AllUsersResponse")
        val addSkillRequest = Node("AddSkillRequest")
        val baseServlet = Node("BaseServlet")
        val bidConfig = Node("BidConfig")
        val projectServlet = Node("ProjectServlet")
        val exceptionsConfig = Node("ExceptionsConfig")
        val apiError = Node("ApiError")
        val endorseServlet = Node("EndorseServlet")
        val userNotFound = Node("UserNotFound")
        val userSkill = Node("UserSkill")
        val projectListServlet = Node("ProjectListServlet")
        val signupRequest = Node("SignupRequest")
        val connectionPoolConfig = Node("ConnectionPoolConfig")
        val iUserSkillMapper = Node("IUserSkillMapper")
        val metaDataClient = Node("MetaDataClient")
        val project = Node("Project")
        val loginRequest = Node("LoginRequest")
        val mapper = Node("Mapper")
        val userConfig = Node("UserConfig")
        val iMapper = Node("IMapper")
        val notAuthorized = Node("NotAuthorized")
        val user = Node("User")
        val auctionConfig = Node("AuctionConfig")
        val projectMapper = Node("ProjectMapper")
        val login = Node("Login")
        val delayFilter = Node("DelayFilter")
        val skillServiceImpl = Node("SkillServiceImpl")
        val userServlet = Node("UserServlet")
        val connectionPool = Node("ConnectionPool")
        val commands = Node("Commands")
        val bid = Node("Bid")
        val projectRepository = Node("ProjectRepository")
        val loginResponse = Node("LoginResponse")
        val projectNotFound = Node("ProjectNotFound")
        val auction = Node("Auction")
        val duplicateSkill = Node("DuplicateSkill")
        val httpRequest = Node("HttpRequest")
        val projectConfig = Node("ProjectConfig")
        val bidDto = Node("BidDto")
        val corsFilter = Node("CorsFilter")
        val repository = Node("Repository")
        val userSkillServlet = Node("UserSkillServlet")
        val jspConfig = Node("JspConfig")
        val initializer = Node("Initializer")
        val iSkillMapper = Node("ISkillMapper")
        val preConditionFailedException = Node("PreConditionFailedException")
        val jSONDecoder = Node("JSONDecoder")
        val dateUtils = Node("DateUtils")
        val addBidRequest = Node("AddBidRequest")
        val functionWithException = Node("FunctionWithException")
        val iUserMapper = Node("IUserMapper")
        val skillMapper = Node("SkillMapper")
        val projectDto = Node("ProjectDto")
        val skillsConfig = Node("SkillsConfig")
        val badRequestException = Node("BadRequestException")
        val userSkillMapper = Node("UserSkillMapper")
        val appContextListener = Node("AppContextListener")
        val queryExecResponse = Node("QueryExecResponse")
        val accessDeniedException = Node("AccessDeniedException")
        val projectServiceConfig = Node("ProjectServiceConfig")
        val registerServlet = Node("RegisterServlet")
        val loginServlet = Node("LoginServlet")
        val iBidMapper = Node("IBidMapper")
        val authentication = Node("Authentication")
        val invalidSkill = Node("InvalidSkill")
        val skillService = Node("SkillService")
        val skillRepositorySqliteImpl = Node("SkillRepositorySqliteImpl")
        val projectInitScheduler = Node("ProjectInitScheduler")
        val forbiddenException = Node("ForbiddenException")
        val notFoundException = Node("NotFoundException")
        val bidRepositoryImpl = Node("BidRepositoryImpl")
        val duplicateEndorse = Node("DuplicateEndorse")
        val auctionScheduler = Node("AuctionScheduler")
        val userService = Node("UserService")
        val userRepository = Node("UserRepository")
        val iProjectMapper = Node("IProjectMapper")
        val bidRequestedResponse = Node("BidRequestedResponse")
        val jwtToken = Node("JwtToken")
        val bidServlet = Node("BidServlet")
        val alreadyExistsException = Node("AlreadyExistsException")
        val userDto = Node("UserDto")
        val invalidBidRequirements = Node("InvalidBidRequirements")
        val skillRepository = Node("SkillRepository")
        val dBCPDataSource = Node("DBCPDataSource")
        val tokenResponse = Node("TokenResponse")
        val singleUserResponse = Node("SingleUserResponse")
        val projectInitializer = Node("ProjectInitializer")
        val projectSearchServlet = Node("ProjectSearchServlet")
        val cORSFilter = Node("CORSFilter")
        val httpTokenizer = Node("HttpTokenizer")
        val userSkillDto = Node("UserSkillDto")
        val userSqliteRepositoryImpl = Node("UserSqliteRepositoryImpl")
        val alreadyBid = Node("AlreadyBid")
        val skills = Node("Skills")
        val projectServiceImpl = Node("ProjectServiceImpl")
        val users = Node("Users")
        val endorseSelf = Node("EndorseSelf")
        val bidRepository = Node("BidRepository")
        val main = Node("Main")
        val userMapper = Node("UserMapper")
        val projectService = Node("ProjectService")
        val errorMessage = Node("ErrorMessage")
        val userAlreadyExists = Node("UserAlreadyExists")
        val dataBaseError = Node("DataBaseError")
        val projectRepositoryImpl = Node("ProjectRepositoryImpl")
        val httpStatus = Node("HttpStatus")

        graph1 = Graph(
            nodes = listOf(
                bidMapper,
                apiError,
                alreadyBid,
                projectNotFound,
                userAlreadyExists,
                authentication,
                cORSFilter,
                signupRequest,
                initializer,
                projects,
                addBidRequest,
                auctionScheduler,
                bids,
                invalidBidRequirements,
                projectInitScheduler,
                skillService,
                endorseSelf,
                projectInitializer,
                skillInitializer,
                projectConfig,
                skillMapper,
                userMapper,
                skill,
                serverException,
                bid,
                exceptionsConfig,
                auctionConfig,
                iProjectMapper,
                auction,
                jSONDecoder,
                restExceptionHandler,
                loginFailure,
                databaseErrorsConfig,
                projectMapper,
                users,
                addSkillRequest,
                notAuthorized,
                skillsConfig,
                databaseColumns,
                invalidSkill,
                duplicateSkill,
                authFilter,
                skills,
                allUsersResponse,
                connectionPoolConfig,
                userConfig,
                singleUserResponse,
                login,
                userSkill,
                userNotFound,
                project,
                iMapper,
                user,
                iUserMapper,
                projectService,
                userSkillMapper,
                remoteURLs,
                userService,
                bidConfig,
                delayFilter,
                projectServiceConfig,
                duplicateEndorse,
                mapper,
                tokenResponse,
                httpTokenizer,
                iSkillMapper,
                invalidUser,
                httpRequest,
                jspConfig,
                iBidMapper,
                dataBaseError,
                endorseRequest,
                connectionPool,
                loginRequest,
                commands,
                iUserSkillMapper,
                main,
                endorseService,
                signup
            ),
            edges = mapOf(
                bidMapper to listOf(connectionPool, databaseErrorsConfig, projectMapper, userMapper, user, project),
                apiError to listOf(),
                alreadyBid to listOf(exceptionsConfig),
                projectNotFound to listOf(exceptionsConfig),
                userAlreadyExists to listOf(exceptionsConfig),
                authentication to listOf(userConfig),
                cORSFilter to listOf(),
                signupRequest to listOf(),
                initializer to listOf(userMapper, projectInitializer, skillInitializer, bidMapper),
                projects to listOf(projectMapper, projectService, project),
                addBidRequest to listOf(),
                auctionScheduler to listOf(),
                bids to listOf(addBidRequest, bidMapper),
                invalidBidRequirements to listOf(exceptionsConfig),
                projectInitScheduler to listOf(),
                skillService to listOf(skillMapper, userMapper, user, skill),
                endorseSelf to listOf(exceptionsConfig),
                projectInitializer to listOf(projectConfig, httpRequest, projectMapper, project, jSONDecoder),
                skillInitializer to listOf(skillMapper, skill, skillsConfig, httpRequest, jSONDecoder),
                projectConfig to listOf(),
                skillMapper to listOf(databaseColumns),
                userMapper to listOf(connectionPool, databaseColumns, userSkillMapper),
                skill to listOf(),
                serverException to listOf(),
                bid to listOf(),
                exceptionsConfig to listOf(),
                auctionConfig to listOf(user),
                iProjectMapper to listOf(project, userSkill),
                auction to listOf(bidMapper, bid, projectMapper, userMapper, user, project, userSkill),
                jSONDecoder to listOf(projectConfig, skillsConfig),
                restExceptionHandler to listOf(serverException),
                loginFailure to listOf(exceptionsConfig),
                databaseErrorsConfig to listOf(),
                projectMapper to listOf(connectionPool, databaseColumns, skillMapper),
                users to listOf(userMapper, user, userService),
                addSkillRequest to listOf(),
                notAuthorized to listOf(exceptionsConfig),
                skillsConfig to listOf(),
                databaseColumns to listOf(),
                invalidSkill to listOf(exceptionsConfig),
                duplicateSkill to listOf(exceptionsConfig),
                authFilter to listOf(authentication),
                skills to listOf(
                    endorseService,
                    skill,
                    userSkillMapper,
                    userMapper,
                    endorseRequest,
                    addSkillRequest,
                    userSkill,
                    skillService
                ),
                allUsersResponse to listOf(user),
                connectionPoolConfig to listOf(),
                userConfig to listOf(),
                singleUserResponse to listOf(user, userSkill),
                login to listOf(loginRequest, userService),
                userSkill to listOf(),
                userNotFound to listOf(exceptionsConfig),
                project to listOf(userSkill),
                iMapper to listOf(),
                user to listOf(userSkillMapper, userSkill),
                iUserMapper to listOf(user),
                projectService to listOf(bidMapper, project, projectMapper),
                userSkillMapper to listOf(connectionPool, databaseColumns),
                remoteURLs to listOf(),
                userService to listOf(authentication, userMapper, user),
                bidConfig to listOf(),
                delayFilter to listOf(),
                projectServiceConfig to listOf(),
                duplicateEndorse to listOf(exceptionsConfig),
                mapper to listOf(connectionPool),
                tokenResponse to listOf(),
                httpTokenizer to listOf(),
                iSkillMapper to listOf(skill),
                invalidUser to listOf(exceptionsConfig),
                httpRequest to listOf(remoteURLs),
                jspConfig to listOf(),
                iBidMapper to listOf(bid),
                dataBaseError to listOf(exceptionsConfig),
                endorseRequest to listOf(),
                connectionPool to listOf(connectionPoolConfig),
                loginRequest to listOf(),
                commands to listOf(),
                iUserSkillMapper to listOf(userSkill),
                main to listOf(),
                endorseService to listOf(userSkillMapper),
                signup to listOf(userService, signupRequest),
            )
        )
        graph2 = Graph(
            nodes = listOf(
                userSearchServlet,
                userServlet,
                metaDataClient,
                projectService,
                bidServlet,
                skill,
                endorseServlet,
                project,
                bidRequestedResponse,
                skillRepositorySqliteImpl,
                projectRepositoryImpl,
                bidDto,
                projectSkill,
                userSkill,
                errorMessage,
                skillService,
                preConditionFailedException,
                skillServiceImpl,
                baseServlet,
                loginRequest,
                userServiceImpl,
                badRequestException,
                loginResponse,
                projectDto,
                appContextListener,
                corsFilter,
                user,
                httpStatus,
                forbiddenException,
                usersListServlet,
                authFilter,
                tokenService,
                projectServiceImpl,
                jwtToken,
                skillServlet,
                repository,
                projectSearchServlet,
                projectListServlet,
                bidRepository,
                projectServlet,
                functionWithException,
                endorseRequest,
                loginServlet,
                userService,
                queryExecResponse,
                bid,
                accessDeniedException,
                alreadyExistsException,
                userSkillDto,
                objectFactory,
                userRepository,
                userSqliteRepositoryImpl,
                notFoundException,
                projectRepository,
                userSkillServlet,
                registerServlet,
                dateUtils,
                dBCPDataSource,
                projectSkillDto,
                bidRepositoryImpl,
                internalErrorException,
                userDto,
                skillRepository
            ),
            edges = mapOf(
                userSearchServlet to listOf(userService, objectFactory, httpStatus, userDto),
                userServlet to listOf(
                    userService,
                    notFoundException,
                    userDto,
                    httpStatus,
                    internalErrorException,
                    objectFactory
                ),
                metaDataClient to listOf(projectDto, skill),
                projectService to listOf(project, projectDto, user),
                bidServlet to listOf(
                    accessDeniedException,
                    userService,
                    projectService,
                    notFoundException,
                    bidDto,
                    httpStatus,
                    internalErrorException,
                    badRequestException,
                    alreadyExistsException,
                    objectFactory
                ),
                skill to listOf(),
                endorseServlet to listOf(
                    userSkillDto,
                    userService,
                    notFoundException,
                    alreadyExistsException,
                    preConditionFailedException,
                    httpStatus,
                    internalErrorException,
                    badRequestException,
                    endorseRequest,
                    objectFactory
                ),
                project to listOf(bid, projectSkill, user),
                bidRequestedResponse to listOf(),
                skillRepositorySqliteImpl to listOf(repository),
                projectRepositoryImpl to listOf(notFoundException, repository, queryExecResponse, user, objectFactory),
                bidDto to listOf(projectDto, userDto),
                projectSkill to listOf(skill),
                userSkill to listOf(user),
                errorMessage to listOf(),
                skillService to listOf(skill),
                preConditionFailedException to listOf(),
                skillServiceImpl to listOf(skillRepository, skill, objectFactory),
                baseServlet to listOf(user, httpStatus),
                loginRequest to listOf(),
                userServiceImpl to listOf(
                    notFoundException,
                    userDto,
                    tokenService,
                    skill,
                    skillService,
                    userRepository,
                    objectFactory
                ),
                badRequestException to listOf(),
                loginResponse to listOf(),
                projectDto to listOf(projectSkillDto, userDto),
                appContextListener to listOf(objectFactory),
                corsFilter to listOf(),
                user to listOf(userSkill),
                httpStatus to listOf(),
                forbiddenException to listOf(),
                usersListServlet to listOf(objectFactory, userDto, userService),
                authFilter to listOf(tokenService, objectFactory, userService),
                tokenService to listOf(),
                projectServiceImpl to listOf(
                    userSkill,
                    projectRepository,
                    userService,
                    projectDto,
                    projectSkill,
                    user,
                    metaDataClient,
                    project,
                    bidRepository,
                    objectFactory
                ),
                jwtToken to listOf(dateUtils),
                skillServlet to listOf(httpStatus, skillService, objectFactory),
                repository to listOf(functionWithException, queryExecResponse, dBCPDataSource),
                projectSearchServlet to listOf(projectService, projectDto, httpStatus),
                projectListServlet to listOf(userService, projectService, projectDto, httpStatus, objectFactory),
                bidRepository to listOf(bid),
                projectServlet to listOf(
                    accessDeniedException,
                    projectService,
                    projectDto,
                    notFoundException,
                    httpStatus,
                    objectFactory
                ),
                functionWithException to listOf(),
                endorseRequest to listOf(projectSkillDto, userDto),
                loginServlet to listOf(
                    userService,
                    forbiddenException,
                    loginRequest,
                    httpStatus,
                    badRequestException,
                    objectFactory
                ),
                userService to listOf(user, userDto),
                queryExecResponse to listOf(),
                bid to listOf(project, user),
                accessDeniedException to listOf(),
                alreadyExistsException to listOf(),
                userSkillDto to listOf(),
                objectFactory to listOf(
                    projectRepository,
                    skillRepository,
                    userService,
                    projectService,
                    tokenService,
                    userRepository,
                    skillService,
                    metaDataClient,
                    bidRepository
                ),
                userRepository to listOf(user),
                userSqliteRepositoryImpl to listOf(repository, functionWithException, queryExecResponse),
                notFoundException to listOf(),
                projectRepository to listOf(project),
                userSkillServlet to listOf(
                    projectSkillDto,
                    userSkillDto,
                    userService,
                    notFoundException,
                    projectSkill,
                    httpStatus,
                    badRequestException,
                    alreadyExistsException,
                    objectFactory
                ),
                registerServlet to listOf(
                    userService,
                    userDto,
                    httpStatus,
                    badRequestException,
                    alreadyExistsException,
                    objectFactory
                ),
                dateUtils to listOf(),
                dBCPDataSource to listOf(),
                projectSkillDto to listOf(),
                bidRepositoryImpl to listOf(repository, queryExecResponse),
                internalErrorException to listOf(),
                userDto to listOf(userSkillDto),
                skillRepository to listOf(skill),
            )
        )
    }

    override fun checkCommonGraph(commonGraph: Graph) {
        commonGraph.visualize("joboonja")
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {}
    override fun checkGraph2Diff(graph2Diff: Graph) {}
}