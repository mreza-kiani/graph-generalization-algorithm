package ca.ucalgary.cs.comparison.ast

import ca.ucalgary.cs.comparison.BaseCompareGraphTest
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.graph.Node
import ca.ucalgary.cs.io.visualize

class VendingMachineTest : BaseCompareGraphTest() {
    private fun defineG1() {
        val mvxrov2 = Node("program")
        val bmeavo9 = Node("package_declaration")
        val rapjxc6 = Node("package")
        val pnswpt6 = Node("scoped_identifier", isDuplicate = true)
        val xnmjco5 = Node("scoped_identifier", isDuplicate = true)
        val xopkkg3 = Node("scoped_identifier", isDuplicate = true)
        val yrsykj8 = Node("scoped_identifier", isDuplicate = true)
        val fomjba5 = Node("identifier", isDuplicate = true)
        val dkpsjd9 = Node("org", isDuplicate = true)
        val kfetuo9 = Node(".", isDuplicate = true)
        val dexkqs1 = Node("identifier", isDuplicate = true)
        val abgibg9 = Node("lsmr", isDuplicate = true)
        val iohtvk6 = Node(".", isDuplicate = true)
        val tmfmdj9 = Node("identifier", isDuplicate = true)
        val nuujzm6 = Node("vending", isDuplicate = true)
        val lyywdv8 = Node(".", isDuplicate = true)
        val ehvzki2 = Node("identifier", isDuplicate = true)
        val hdurgx1 = Node("software3", isDuplicate = true)
        val txzyhg2 = Node(".", isDuplicate = true)
        val idrlbo6 = Node("identifier", isDuplicate = true)
        val ynoaet2 = Node("product", isDuplicate = true)
        val agtvhs6 = Node(";", isDuplicate = true)
        val oshhje0 = Node("import_declaration", isDuplicate = true)
        val sccnoh9 = Node("import", isDuplicate = true)
        val mcjcls5 = Node("scoped_identifier", isDuplicate = true)
        val dhfqsx8 = Node("scoped_identifier", isDuplicate = true)
        val jlgkcg1 = Node("identifier", isDuplicate = true)
        val cngiiq2 = Node("java", isDuplicate = true)
        val dlajnt4 = Node(".", isDuplicate = true)
        val qrdpsc8 = Node("identifier", isDuplicate = true)
        val hepaqa2 = Node("util", isDuplicate = true)
        val ewmtlh9 = Node(".", isDuplicate = true)
        val azzght3 = Node("identifier", isDuplicate = true)
        val qcbtkr0 = Node("HashSet", isDuplicate = true)
        val visprt4 = Node(";", isDuplicate = true)
        val qbouvx7 = Node("import_declaration", isDuplicate = true)
        val pnblif0 = Node("import", isDuplicate = true)
        val ystdnn6 = Node("scoped_identifier", isDuplicate = true)
        val ilcecb6 = Node("scoped_identifier", isDuplicate = true)
        val tjmwwa7 = Node("identifier", isDuplicate = true)
        val yiqnhn4 = Node("java", isDuplicate = true)
        val ziqbnb3 = Node(".", isDuplicate = true)
        val pfaldf2 = Node("identifier", isDuplicate = true)
        val llocvg2 = Node("util", isDuplicate = true)
        val oupmng0 = Node(".", isDuplicate = true)
        val psetvp0 = Node("identifier", isDuplicate = true)
        val htkdho6 = Node("Set", isDuplicate = true)
        val zpumsl1 = Node(";", isDuplicate = true)
        val fpqzdo7 = Node("import_declaration", isDuplicate = true)
        val apkkkl4 = Node("import", isDuplicate = true)
        val jupxul3 = Node("scoped_identifier", isDuplicate = true)
        val rpfiux5 = Node("scoped_identifier", isDuplicate = true)
        val mliunv6 = Node("scoped_identifier", isDuplicate = true)
        val nsxmqq6 = Node("identifier", isDuplicate = true)
        val iccdzb9 = Node("org", isDuplicate = true)
        val qtuhxm1 = Node(".", isDuplicate = true)
        val cortsf6 = Node("identifier", isDuplicate = true)
        val jjtwna2 = Node("lsmr", isDuplicate = true)
        val sggmxc6 = Node(".", isDuplicate = true)
        val dmzfkk3 = Node("identifier", isDuplicate = true)
        val citema0 = Node("vending", isDuplicate = true)
        val hpelpc1 = Node(".", isDuplicate = true)
        val kzjheo3 = Node("identifier", isDuplicate = true)
        val kqmtdn4 = Node("PopCan", isDuplicate = true)
        val hyqonw6 = Node(";", isDuplicate = true)
        val vxrmna8 = Node("import_declaration", isDuplicate = true)
        val qacswo8 = Node("import", isDuplicate = true)
        val kvomdt5 = Node("scoped_identifier", isDuplicate = true)
        val bfswqi5 = Node("scoped_identifier", isDuplicate = true)
        val kxrgxj0 = Node("scoped_identifier", isDuplicate = true)
        val bpzphs5 = Node("scoped_identifier", isDuplicate = true)
        val twedyr6 = Node("identifier", isDuplicate = true)
        val szsmxm6 = Node("org", isDuplicate = true)
        val brohks1 = Node(".", isDuplicate = true)
        val nozszu2 = Node("identifier", isDuplicate = true)
        val eehcnn6 = Node("lsmr", isDuplicate = true)
        val wtzbnp2 = Node(".", isDuplicate = true)
        val zqkivy4 = Node("identifier", isDuplicate = true)
        val uzsoyt5 = Node("vending", isDuplicate = true)
        val ruoyxi6 = Node(".", isDuplicate = true)
        val rxameg6 = Node("identifier", isDuplicate = true)
        val lcozgi2 = Node("hardware", isDuplicate = true)
        val fktidy5 = Node(".", isDuplicate = true)
        val etkiqh7 = Node("identifier", isDuplicate = true)
        val uxarcq6 = Node("CapacityExceededException", isDuplicate = true)
        val rujkjp4 = Node(";", isDuplicate = true)
        val azyrst5 = Node("import_declaration", isDuplicate = true)
        val ywsiyq8 = Node("import", isDuplicate = true)
        val vwtvuv4 = Node("scoped_identifier", isDuplicate = true)
        val ackxza4 = Node("scoped_identifier", isDuplicate = true)
        val jjsxmr1 = Node("scoped_identifier", isDuplicate = true)
        val tdzvwe3 = Node("scoped_identifier", isDuplicate = true)
        val hkcgig8 = Node("identifier", isDuplicate = true)
        val dcbthv7 = Node("org", isDuplicate = true)
        val gkliqe3 = Node(".", isDuplicate = true)
        val ojxjoh0 = Node("identifier", isDuplicate = true)
        val jeshkq9 = Node("lsmr", isDuplicate = true)
        val omevpz4 = Node(".", isDuplicate = true)
        val oyvjxf8 = Node("identifier", isDuplicate = true)
        val uhemkg2 = Node("vending", isDuplicate = true)
        val lyztev3 = Node(".", isDuplicate = true)
        val amaefq1 = Node("identifier", isDuplicate = true)
        val cfrgvk4 = Node("hardware", isDuplicate = true)
        val twihqt7 = Node(".", isDuplicate = true)
        val jphaym3 = Node("identifier", isDuplicate = true)
        val jjzddm4 = Node("DisabledException", isDuplicate = true)
        val phrsyw0 = Node(";", isDuplicate = true)
        val zkrfeh9 = Node("import_declaration", isDuplicate = true)
        val llbzeu3 = Node("import", isDuplicate = true)
        val hjdpjv9 = Node("scoped_identifier", isDuplicate = true)
        val kwxhbg2 = Node("scoped_identifier", isDuplicate = true)
        val zwrwfg6 = Node("scoped_identifier", isDuplicate = true)
        val duxeoc4 = Node("scoped_identifier", isDuplicate = true)
        val mqukyd5 = Node("identifier", isDuplicate = true)
        val zxnypc8 = Node("org", isDuplicate = true)
        val xrbmds3 = Node(".", isDuplicate = true)
        val pwnlro3 = Node("identifier", isDuplicate = true)
        val uvadme0 = Node("lsmr", isDuplicate = true)
        val ekggju5 = Node(".", isDuplicate = true)
        val keazbo3 = Node("identifier", isDuplicate = true)
        val turtaf9 = Node("vending", isDuplicate = true)
        val xtuhvk6 = Node(".", isDuplicate = true)
        val tlbjrl9 = Node("identifier", isDuplicate = true)
        val rvyytk1 = Node("hardware", isDuplicate = true)
        val kosyzx9 = Node(".", isDuplicate = true)
        val crtpzy5 = Node("identifier", isDuplicate = true)
        val qfhnzp9 = Node("EmptyException", isDuplicate = true)
        val tcjpqq9 = Node(";", isDuplicate = true)
        val obtntm2 = Node("import_declaration", isDuplicate = true)
        val gqxnhy8 = Node("import", isDuplicate = true)
        val mxghgg8 = Node("scoped_identifier", isDuplicate = true)
        val rtytqp0 = Node("scoped_identifier", isDuplicate = true)
        val wykeqz0 = Node("scoped_identifier", isDuplicate = true)
        val kywnde1 = Node("scoped_identifier", isDuplicate = true)
        val nbphgj3 = Node("identifier", isDuplicate = true)
        val vbldkm4 = Node("org", isDuplicate = true)
        val qnstel9 = Node(".", isDuplicate = true)
        val ecpeqi5 = Node("identifier", isDuplicate = true)
        val dmlkbs0 = Node("lsmr", isDuplicate = true)
        val jbvtxa9 = Node(".", isDuplicate = true)
        val sfqkee7 = Node("identifier", isDuplicate = true)
        val thprjs2 = Node("vending", isDuplicate = true)
        val nqorai2 = Node(".", isDuplicate = true)
        val qaqjkc0 = Node("identifier", isDuplicate = true)
        val jvfvfp6 = Node("hardware", isDuplicate = true)
        val pxkthk3 = Node(".", isDuplicate = true)
        val voguwm7 = Node("identifier", isDuplicate = true)
        val xykqxn6 = Node("PopCanRack", isDuplicate = true)
        val kwpgat2 = Node(";", isDuplicate = true)
        val jhdqgg7 = Node("import_declaration", isDuplicate = true)
        val njckge4 = Node("import", isDuplicate = true)
        val jcdzab1 = Node("scoped_identifier", isDuplicate = true)
        val uqgmod2 = Node("scoped_identifier", isDuplicate = true)
        val xocxfz9 = Node("scoped_identifier", isDuplicate = true)
        val vtdhfm1 = Node("scoped_identifier", isDuplicate = true)
        val cdrvng9 = Node("identifier", isDuplicate = true)
        val daqryr2 = Node("org", isDuplicate = true)
        val vcangt3 = Node(".", isDuplicate = true)
        val lkoprx5 = Node("identifier", isDuplicate = true)
        val viptxv3 = Node("lsmr", isDuplicate = true)
        val itqsct1 = Node(".", isDuplicate = true)
        val altzgi5 = Node("identifier", isDuplicate = true)
        val oeikye4 = Node("vending", isDuplicate = true)
        val woipir4 = Node(".", isDuplicate = true)
        val xhmsgj2 = Node("identifier", isDuplicate = true)
        val dydrzv2 = Node("hardware", isDuplicate = true)
        val qbnnoy5 = Node(".", isDuplicate = true)
        val qocjcz8 = Node("identifier", isDuplicate = true)
        val gdxeks9 = Node("PopCanRackListener", isDuplicate = true)
        val difrgx7 = Node(";", isDuplicate = true)
        val ahprna9 = Node("import_declaration", isDuplicate = true)
        val cigmqr6 = Node("import", isDuplicate = true)
        val hhswkl4 = Node("scoped_identifier", isDuplicate = true)
        val mswafv8 = Node("scoped_identifier", isDuplicate = true)
        val jbqlyg2 = Node("scoped_identifier", isDuplicate = true)
        val dsbaxe9 = Node("scoped_identifier", isDuplicate = true)
        val cvifxp4 = Node("identifier", isDuplicate = true)
        val iuqcty9 = Node("org", isDuplicate = true)
        val orbjqt9 = Node(".", isDuplicate = true)
        val jazkvn7 = Node("identifier", isDuplicate = true)
        val pwbxqk6 = Node("lsmr", isDuplicate = true)
        val pkuxhs8 = Node(".", isDuplicate = true)
        val kcvchk2 = Node("identifier", isDuplicate = true)
        val kwimlu8 = Node("vending", isDuplicate = true)
        val djgfcf8 = Node(".", isDuplicate = true)
        val gepxfv7 = Node("identifier", isDuplicate = true)
        val tiuhfo2 = Node("software3", isDuplicate = true)
        val naxaal9 = Node(".", isDuplicate = true)
        val tqafsz7 = Node("identifier", isDuplicate = true)
        val mjmjte0 = Node("Product", isDuplicate = true)
        val blsode7 = Node(";", isDuplicate = true)
        val jhhuej1 = Node("block_comment", isDuplicate = true)
        val qsgldz9 = Node("/**\n* Controls all interaction with products of a given kind.\n*\n* @author Robert J. Walker\n* /")
        val neyjow9 = Node("class_declaration", isDuplicate = true)
        val gbzgbe7 = Node("modifiers", isDuplicate = true)
        val klmpnk5 = Node("public", isDuplicate = true)
        val ecydiu6 = Node("class", isDuplicate = true)
        val hpnoul2 = Node("identifier", isDuplicate = true)
        val bfopcn1 = Node("ProductController", isDuplicate = true)
        val topjyb5 = Node("class_body", isDuplicate = true)
        val wplvhk3 = Node("{", isDuplicate = true)
        val wrpkmi7 = Node("field_declaration", isDuplicate = true)
        val utwort3 = Node("modifiers", isDuplicate = true)
        val lninll2 = Node("private", isDuplicate = true)
        val piuloq9 = Node("final", isDuplicate = true)
        val xcmfqz4 = Node("generic_type", isDuplicate = true)
        val kfwikh5 = Node("type_identifier", isDuplicate = true)
        val takhhr9 = Node("Set", isDuplicate = true)
        val jwjlki3 = Node("type_arguments", isDuplicate = true)
        val vfbpay0 = Node("<", isDuplicate = true)
        val qycxgc4 = Node("type_identifier", isDuplicate = true)
        val dzplmf5 = Node("ProductControllerListener", isDuplicate = true)
        val flrtcd0 = Node(">", isDuplicate = true)
        val codzjs0 = Node("variable_declarator", isDuplicate = true)
        val stxoxh7 = Node("identifier", isDuplicate = true)
        val ulxyga1 = Node("listeners", isDuplicate = true)
        val gkovfx6 = Node("=", isDuplicate = true)
        val oantqr7 = Node("object_creation_expression", isDuplicate = true)
        val xvylit8 = Node("new", isDuplicate = true)
        val yhnmgt1 = Node("generic_type", isDuplicate = true)
        val sfbfhh7 = Node("type_identifier", isDuplicate = true)
        val knychj8 = Node("HashSet", isDuplicate = true)
        val pnoabn3 = Node("type_arguments", isDuplicate = true)
        val oikcdz8 = Node("<", isDuplicate = true)
        val dengnw6 = Node(">", isDuplicate = true)
        val seijpd9 = Node("argument_list", isDuplicate = true)
        val rdleeq4 = Node("(", isDuplicate = true)
        val gwhxeg2 = Node(")", isDuplicate = true)
        val imvxsr8 = Node(";", isDuplicate = true)
        val vsaror3 = Node("field_declaration", isDuplicate = true)
        val dpwpvv9 = Node("modifiers", isDuplicate = true)
        val jakcpa6 = Node("private", isDuplicate = true)
        val avssdv8 = Node("integral_type", isDuplicate = true)
        val odfeob6 = Node("int", isDuplicate = true)
        val tiyvjl7 = Node("variable_declarator", isDuplicate = true)
        val fowboa5 = Node("identifier", isDuplicate = true)
        val ialzxu6 = Node("available", isDuplicate = true)
        val hpmqrg3 = Node("=", isDuplicate = true)
        val wllsep3 = Node("decimal_integer_literal", isDuplicate = true)
        val lwghem6 = Node("0", isDuplicate = true)
        val nurinh0 = Node(";", isDuplicate = true)
        val bwxzae2 = Node("field_declaration", isDuplicate = true)
        val jgzjfj3 = Node("modifiers", isDuplicate = true)
        val ynudsc0 = Node("private", isDuplicate = true)
        val usgyjr3 = Node("final", isDuplicate = true)
        val fakhxf7 = Node("type_identifier", isDuplicate = true)
        val rynjjo4 = Node("Product", isDuplicate = true)
        val cscdos8 = Node("variable_declarator", isDuplicate = true)
        val tdwrhl2 = Node("identifier", isDuplicate = true)
        val dkvfrm0 = Node("product", isDuplicate = true)
        val kcwgli9 = Node(";", isDuplicate = true)
        val jxipij8 = Node("field_declaration", isDuplicate = true)
        val qjwrfl7 = Node("modifiers", isDuplicate = true)
        val fvamgt9 = Node("private", isDuplicate = true)
        val dqwyna0 = Node("final", isDuplicate = true)
        val slvjol2 = Node("type_identifier", isDuplicate = true)
        val ustnyd0 = Node("PopCanRack", isDuplicate = true)
        val rqavuv6 = Node("variable_declarator", isDuplicate = true)
        val jqzjby8 = Node("identifier", isDuplicate = true)
        val gzmajz1 = Node("rack", isDuplicate = true)
        val swwfzf6 = Node(";", isDuplicate = true)
        val yiyans0 = Node("class_declaration", isDuplicate = true)
        val jktzox2 = Node("modifiers", isDuplicate = true)
        val cfuels6 = Node("private", isDuplicate = true)
        val qymhqk6 = Node("class", isDuplicate = true)
        val rrnctz0 = Node("identifier", isDuplicate = true)
        val bwalte9 = Node("InnerListener", isDuplicate = true)
        val edengx5 = Node("super_interfaces")
        val kwiloo2 = Node("implements")
        val cidxfr4 = Node("type_list")
        val aennmg1 = Node("type_identifier", isDuplicate = true)
        val teedjw2 = Node("PopCanRackListener", isDuplicate = true)
        val jaqbmy1 = Node("class_body", isDuplicate = true)
        val drtcsh9 = Node("{", isDuplicate = true)
        val oecgix0 = Node("method_declaration", isDuplicate = true)
        val oresfo6 = Node("modifiers", isDuplicate = true)
        val ygprbh9 = Node("marker_annotation", isDuplicate = true)
        val ekoisp9 = Node("@", isDuplicate = true)
        val ktskps5 = Node("identifier", isDuplicate = true)
        val awynwg9 = Node("Override", isDuplicate = true)
        val zpjiar7 = Node("public", isDuplicate = true)
        val cnswks1 = Node("void_type", isDuplicate = true)
        val pajkdu0 = Node("identifier", isDuplicate = true)
        val fythhv6 = Node("added")
        val bdwnui0 = Node("formal_parameters", isDuplicate = true)
        val wywyis1 = Node("(", isDuplicate = true)
        val djlbqk7 = Node("formal_parameter", isDuplicate = true)
        val qgujai9 = Node("type_identifier", isDuplicate = true)
        val vjalrf1 = Node("PopCanRack", isDuplicate = true)
        val mvsiwe4 = Node("identifier", isDuplicate = true)
        val xbxqjg0 = Node("productRack", isDuplicate = true)
        val ywhtcu4 = Node(",", isDuplicate = true)
        val bncdsh5 = Node("formal_parameter", isDuplicate = true)
        val jciqee5 = Node("type_identifier", isDuplicate = true)
        val hxhcko9 = Node("PopCan", isDuplicate = true)
        val pzqbzq3 = Node("identifier", isDuplicate = true)
        val mmjbmu7 = Node("product", isDuplicate = true)
        val tfcqmy4 = Node(")", isDuplicate = true)
        val fxcpvi9 = Node("block", isDuplicate = true)
        val dgjjcv8 = Node("{", isDuplicate = true)
        val setfqx8 = Node("expression_statement", isDuplicate = true)
        val qnzllw0 = Node("update_expression", isDuplicate = true)
        val kgoryg3 = Node("identifier", isDuplicate = true)
        val dfwlme5 = Node("available", isDuplicate = true)
        val jputtv5 = Node("++")
        val lfsrgn4 = Node(";", isDuplicate = true)
        val jivhvh0 = Node("expression_statement", isDuplicate = true)
        val hsgctx6 = Node("method_invocation", isDuplicate = true)
        val klcbzk5 = Node("identifier", isDuplicate = true)
        val rrzftk6 = Node("notifyProductsAdded", isDuplicate = true)
        val ywxsbp4 = Node("argument_list", isDuplicate = true)
        val dkxjol3 = Node("(", isDuplicate = true)
        val xkbbah1 = Node("decimal_integer_literal", isDuplicate = true)
        val faaneh8 = Node("1", isDuplicate = true)
        val wyyqep5 = Node(")", isDuplicate = true)
        val fjzxnq8 = Node(";", isDuplicate = true)
        val kvyqom3 = Node("}", isDuplicate = true)
        val kctrow4 = Node("method_declaration", isDuplicate = true)
        val bwphno1 = Node("modifiers", isDuplicate = true)
        val dxfhvt1 = Node("marker_annotation", isDuplicate = true)
        val qnyepu7 = Node("@", isDuplicate = true)
        val ceulss3 = Node("identifier", isDuplicate = true)
        val knnfpe0 = Node("Override", isDuplicate = true)
        val esjgmb6 = Node("public", isDuplicate = true)
        val woptjb1 = Node("void_type", isDuplicate = true)
        val bkxlnm4 = Node("identifier", isDuplicate = true)
        val uyxcdg4 = Node("removed")
        val alablx4 = Node("formal_parameters", isDuplicate = true)
        val vohcdf5 = Node("(", isDuplicate = true)
        val zdjeqk9 = Node("formal_parameter", isDuplicate = true)
        val eeyuyk3 = Node("type_identifier", isDuplicate = true)
        val ilqfsg4 = Node("PopCanRack", isDuplicate = true)
        val gibdss6 = Node("identifier", isDuplicate = true)
        val xqonpo5 = Node("productRack", isDuplicate = true)
        val prwmhu3 = Node(",", isDuplicate = true)
        val aikumx4 = Node("formal_parameter", isDuplicate = true)
        val lylroa0 = Node("type_identifier", isDuplicate = true)
        val qzpypr0 = Node("PopCan", isDuplicate = true)
        val dzzxbl2 = Node("identifier", isDuplicate = true)
        val foqxmp3 = Node("product", isDuplicate = true)
        val nswxsy5 = Node(")", isDuplicate = true)
        val kvyitr5 = Node("block", isDuplicate = true)
        val qbgzfn8 = Node("{", isDuplicate = true)
        val pyqxwe5 = Node("expression_statement", isDuplicate = true)
        val bleupb4 = Node("update_expression", isDuplicate = true)
        val pholnm0 = Node("identifier", isDuplicate = true)
        val dlnfsp3 = Node("available", isDuplicate = true)
        val ldsbrw8 = Node("--")
        val rmcyxr3 = Node(";", isDuplicate = true)
        val wucalk8 = Node("expression_statement", isDuplicate = true)
        val rglucj8 = Node("method_invocation", isDuplicate = true)
        val uaggye3 = Node("identifier", isDuplicate = true)
        val bxmtvj3 = Node("notifyProductsRemoved", isDuplicate = true)
        val cjtgcz8 = Node("argument_list", isDuplicate = true)
        val ddznjt9 = Node("(", isDuplicate = true)
        val fxyrjy9 = Node("decimal_integer_literal", isDuplicate = true)
        val pmuqae6 = Node("1", isDuplicate = true)
        val bdfejr2 = Node(")", isDuplicate = true)
        val lfufvg0 = Node(";", isDuplicate = true)
        val uiqdda2 = Node("}", isDuplicate = true)
        val xecvaj5 = Node("method_declaration", isDuplicate = true)
        val kvhpby8 = Node("modifiers", isDuplicate = true)
        val oonltr4 = Node("marker_annotation", isDuplicate = true)
        val jzvrtb9 = Node("@", isDuplicate = true)
        val ltnubt0 = Node("identifier", isDuplicate = true)
        val yzijeb0 = Node("Override", isDuplicate = true)
        val gmkbkg6 = Node("public", isDuplicate = true)
        val aakpbw2 = Node("void_type", isDuplicate = true)
        val dnvwyg2 = Node("identifier", isDuplicate = true)
        val ewdzoq0 = Node("loaded")
        val kjcmux8 = Node("formal_parameters", isDuplicate = true)
        val fbpihl3 = Node("(", isDuplicate = true)
        val szsmbs4 = Node("formal_parameter", isDuplicate = true)
        val orfwqv5 = Node("type_identifier", isDuplicate = true)
        val mqotbg2 = Node("PopCanRack", isDuplicate = true)
        val bvypwx9 = Node("identifier", isDuplicate = true)
        val kuzgxh5 = Node("rack", isDuplicate = true)
        val ojpzwx2 = Node(",", isDuplicate = true)
        val tzizvu7 = Node("spread_parameter", isDuplicate = true)
        val mqzvaj1 = Node("type_identifier", isDuplicate = true)
        val diloot6 = Node("PopCan", isDuplicate = true)
        val pozuhc2 = Node("...", isDuplicate = true)
        val ehzxpi6 = Node("variable_declarator", isDuplicate = true)
        val klqrpo3 = Node("identifier", isDuplicate = true)
        val weuevj1 = Node("products", isDuplicate = true)
        val iyvgdd8 = Node(")", isDuplicate = true)
        val kzvhkq5 = Node("block", isDuplicate = true)
        val odiipu6 = Node("{", isDuplicate = true)
        val dnhbti5 = Node("expression_statement", isDuplicate = true)
        val mbfrke4 = Node("assignment_expression", isDuplicate = true)
        val debgsw0 = Node("identifier", isDuplicate = true)
        val rnbmyz9 = Node("available", isDuplicate = true)
        val uocbrr0 = Node("+=")
        val zvkhdm5 = Node("field_access", isDuplicate = true)
        val kagcmt1 = Node("identifier", isDuplicate = true)
        val ekodxo7 = Node("products", isDuplicate = true)
        val wynujo0 = Node(".", isDuplicate = true)
        val uxccvi0 = Node("identifier", isDuplicate = true)
        val sskzpj2 = Node("length", isDuplicate = true)
        val sukksd3 = Node(";", isDuplicate = true)
        val dcpguk5 = Node("expression_statement", isDuplicate = true)
        val voloow1 = Node("method_invocation", isDuplicate = true)
        val jshupw0 = Node("identifier", isDuplicate = true)
        val bvesiq8 = Node("notifyProductsAdded", isDuplicate = true)
        val xbgpjo9 = Node("argument_list", isDuplicate = true)
        val rzumyo3 = Node("(", isDuplicate = true)
        val hoodwa8 = Node("field_access", isDuplicate = true)
        val pwbkhy9 = Node("identifier", isDuplicate = true)
        val rkgfjc7 = Node("products", isDuplicate = true)
        val ephkfj2 = Node(".", isDuplicate = true)
        val gwopwz2 = Node("identifier", isDuplicate = true)
        val ueughp8 = Node("length", isDuplicate = true)
        val koyjlt8 = Node(")", isDuplicate = true)
        val zqunlc6 = Node(";", isDuplicate = true)
        val ylpgfi8 = Node("}", isDuplicate = true)
        val hqfiir1 = Node("method_declaration", isDuplicate = true)
        val uhtrvk4 = Node("modifiers", isDuplicate = true)
        val ymavgo2 = Node("marker_annotation", isDuplicate = true)
        val qwjyqh6 = Node("@", isDuplicate = true)
        val nuceyr2 = Node("identifier", isDuplicate = true)
        val xdsvwi4 = Node("Override", isDuplicate = true)
        val hchxgu0 = Node("public", isDuplicate = true)
        val acmbgv6 = Node("void_type", isDuplicate = true)
        val swdgkn4 = Node("identifier", isDuplicate = true)
        val jxjbda3 = Node("unloaded")
        val nnmusp7 = Node("formal_parameters", isDuplicate = true)
        val ipgnnz7 = Node("(", isDuplicate = true)
        val clltth2 = Node("formal_parameter", isDuplicate = true)
        val jgftya8 = Node("type_identifier", isDuplicate = true)
        val tofuwz8 = Node("PopCanRack", isDuplicate = true)
        val lsdefs3 = Node("identifier", isDuplicate = true)
        val dybjok7 = Node("rack", isDuplicate = true)
        val cjhdme8 = Node(",", isDuplicate = true)
        val igcfoe6 = Node("spread_parameter", isDuplicate = true)
        val dvodtw6 = Node("type_identifier", isDuplicate = true)
        val tahnwu9 = Node("PopCan", isDuplicate = true)
        val brgqnl1 = Node("...", isDuplicate = true)
        val yddsxc6 = Node("variable_declarator", isDuplicate = true)
        val yeteeq0 = Node("identifier", isDuplicate = true)
        val aindqr7 = Node("products", isDuplicate = true)
        val ruobyn6 = Node(")", isDuplicate = true)
        val nrfvne2 = Node("block", isDuplicate = true)
        val vbtgnm5 = Node("{", isDuplicate = true)
        val rwvekh6 = Node("expression_statement", isDuplicate = true)
        val dlhqsb3 = Node("assignment_expression", isDuplicate = true)
        val sfpmhm8 = Node("identifier", isDuplicate = true)
        val yqznit0 = Node("available", isDuplicate = true)
        val xtqzpv9 = Node("-=")
        val zntuyv4 = Node("field_access", isDuplicate = true)
        val onqsxr3 = Node("identifier", isDuplicate = true)
        val rpxmak0 = Node("products", isDuplicate = true)
        val hrrhrb2 = Node(".", isDuplicate = true)
        val syrmyp5 = Node("identifier", isDuplicate = true)
        val uknsuk2 = Node("length", isDuplicate = true)
        val zimwve0 = Node(";", isDuplicate = true)
        val fjtjyc5 = Node("expression_statement", isDuplicate = true)
        val fnovyr5 = Node("method_invocation", isDuplicate = true)
        val bheoue4 = Node("identifier", isDuplicate = true)
        val lpnkuq2 = Node("notifyProductsRemoved", isDuplicate = true)
        val mewbij1 = Node("argument_list", isDuplicate = true)
        val qroiiu2 = Node("(", isDuplicate = true)
        val rytvwb3 = Node("field_access", isDuplicate = true)
        val xzrott5 = Node("identifier", isDuplicate = true)
        val teibfd4 = Node("products", isDuplicate = true)
        val drkknp7 = Node(".", isDuplicate = true)
        val kqiqcx8 = Node("identifier", isDuplicate = true)
        val dlhuaf1 = Node("length", isDuplicate = true)
        val exakcx4 = Node(")", isDuplicate = true)
        val npktxa1 = Node(";", isDuplicate = true)
        val wtavgr3 = Node("}", isDuplicate = true)
        val zvxnen3 = Node("}", isDuplicate = true)
        val vyvvlz9 = Node("block_comment", isDuplicate = true)
        val fwecep2 = Node("/**\n* Basic constructor.\n* \n* @param rack\n* The rack in which the pop cans will be stored.\n* @param cost\n* The cost of the pop cans stored in the indicated rack.\n* @param name\n* The name of the pop cans stored in the indicated rack.\n* /")
        val zpavte6 = Node("constructor_declaration")
        val lphjsa8 = Node("modifiers", isDuplicate = true)
        val bxfakn2 = Node("public", isDuplicate = true)
        val xxaftr0 = Node("identifier", isDuplicate = true)
        val ytxkhe7 = Node("ProductController", isDuplicate = true)
        val vkzmlx7 = Node("formal_parameters", isDuplicate = true)
        val iwuleh4 = Node("(", isDuplicate = true)
        val waoauw7 = Node("formal_parameter", isDuplicate = true)
        val psrvhr4 = Node("type_identifier", isDuplicate = true)
        val uulzxc2 = Node("PopCanRack", isDuplicate = true)
        val rvihfz6 = Node("identifier", isDuplicate = true)
        val arhsii2 = Node("rack", isDuplicate = true)
        val ozrbil5 = Node(",", isDuplicate = true)
        val syjgnw5 = Node("formal_parameter", isDuplicate = true)
        val txjjts8 = Node("integral_type", isDuplicate = true)
        val agjtsf8 = Node("int", isDuplicate = true)
        val fbfhzg2 = Node("identifier", isDuplicate = true)
        val gczpvu8 = Node("cost", isDuplicate = true)
        val usjbei2 = Node(",", isDuplicate = true)
        val ijsfty4 = Node("formal_parameter", isDuplicate = true)
        val pqfwwb5 = Node("type_identifier", isDuplicate = true)
        val ighmwo4 = Node("String")
        val mthzfb5 = Node("identifier", isDuplicate = true)
        val ucpkiq4 = Node("name", isDuplicate = true)
        val nyrtgf6 = Node(")", isDuplicate = true)
        val dcsjqz9 = Node("constructor_body")
        val ksiuah5 = Node("{", isDuplicate = true)
        val dwovym2 = Node("if_statement", isDuplicate = true)
        val uelqqh7 = Node("if", isDuplicate = true)
        val gfnyvz0 = Node("parenthesized_expression", isDuplicate = true)
        val igptdo1 = Node("(", isDuplicate = true)
        val smkxti6 = Node("binary_expression", isDuplicate = true)
        val tajuqn1 = Node("identifier", isDuplicate = true)
        val neetvn8 = Node("rack", isDuplicate = true)
        val ahuzxf8 = Node("==", isDuplicate = true)
        val pcxbmp9 = Node("null_literal", isDuplicate = true)
        val thwqzu8 = Node("null", isDuplicate = true)
        val nqukix7 = Node(")", isDuplicate = true)
        val rpvmmn7 = Node("throw_statement", isDuplicate = true)
        val lxdagb1 = Node("throw", isDuplicate = true)
        val ybmjbd0 = Node("object_creation_expression", isDuplicate = true)
        val ikavkb7 = Node("new", isDuplicate = true)
        val aipisn1 = Node("type_identifier", isDuplicate = true)
        val hunkka7 = Node("IllegalArgumentException", isDuplicate = true)
        val dgyrkz5 = Node("argument_list", isDuplicate = true)
        val pdbhft9 = Node("(", isDuplicate = true)
        val znzrsk0 = Node("string_literal", isDuplicate = true)
        val riykdq2 = Node("\"rack cannot be null.\"")
        val hdwqat3 = Node(")", isDuplicate = true)
        val bdwdns1 = Node(";", isDuplicate = true)
        val wrbgdi0 = Node("if_statement", isDuplicate = true)
        val ealraf4 = Node("if", isDuplicate = true)
        val nfbqdi2 = Node("parenthesized_expression", isDuplicate = true)
        val yevfkm6 = Node("(", isDuplicate = true)
        val ftclnk9 = Node("binary_expression", isDuplicate = true)
        val nbftzp7 = Node("identifier", isDuplicate = true)
        val pdjyyv0 = Node("cost", isDuplicate = true)
        val imzogl6 = Node("<=")
        val vhnjdp2 = Node("decimal_integer_literal", isDuplicate = true)
        val euqnnx7 = Node("0", isDuplicate = true)
        val uiogkw1 = Node(")", isDuplicate = true)
        val kkjnej7 = Node("throw_statement", isDuplicate = true)
        val bbuhry3 = Node("throw", isDuplicate = true)
        val lzgeny6 = Node("object_creation_expression", isDuplicate = true)
        val ohoorc3 = Node("new", isDuplicate = true)
        val xgveyt8 = Node("type_identifier", isDuplicate = true)
        val ejqkmd8 = Node("IllegalArgumentException", isDuplicate = true)
        val lectru1 = Node("argument_list", isDuplicate = true)
        val vxnvlu5 = Node("(", isDuplicate = true)
        val oymlmo0 = Node("string_literal", isDuplicate = true)
        val vwlypv1 = Node("\"cost must be positive.\"")
        val bvqeaj7 = Node(")", isDuplicate = true)
        val ibdkpi2 = Node(";", isDuplicate = true)
        val dpbyrt1 = Node("if_statement", isDuplicate = true)
        val vkjlji5 = Node("if", isDuplicate = true)
        val ntthmd8 = Node("parenthesized_expression", isDuplicate = true)
        val ijkjsv9 = Node("(", isDuplicate = true)
        val mrfgry9 = Node("binary_expression", isDuplicate = true)
        val ipysbb7 = Node("binary_expression", isDuplicate = true)
        val eteqpn8 = Node("identifier", isDuplicate = true)
        val ngwcnp9 = Node("name", isDuplicate = true)
        val mofidl7 = Node("==", isDuplicate = true)
        val pjdrwe6 = Node("null_literal", isDuplicate = true)
        val slvafc6 = Node("null", isDuplicate = true)
        val jvkqps1 = Node("||")
        val ogqxlq1 = Node("binary_expression", isDuplicate = true)
        val pkkbht2 = Node("method_invocation", isDuplicate = true)
        val upazcz3 = Node("identifier", isDuplicate = true)
        val cwqlpc9 = Node("name", isDuplicate = true)
        val whuxru1 = Node(".", isDuplicate = true)
        val debwov8 = Node("identifier", isDuplicate = true)
        val zisznb7 = Node("length", isDuplicate = true)
        val kaqxgg6 = Node("argument_list", isDuplicate = true)
        val fnovka4 = Node("(", isDuplicate = true)
        val ssgvlj5 = Node(")", isDuplicate = true)
        val aviunp4 = Node("==", isDuplicate = true)
        val npstal4 = Node("decimal_integer_literal", isDuplicate = true)
        val vckrqf5 = Node("0", isDuplicate = true)
        val fghbrs3 = Node(")", isDuplicate = true)
        val pjczui9 = Node("throw_statement", isDuplicate = true)
        val naeczq4 = Node("throw", isDuplicate = true)
        val knfeyb4 = Node("object_creation_expression", isDuplicate = true)
        val vpapvq6 = Node("new", isDuplicate = true)
        val fkrysj5 = Node("type_identifier", isDuplicate = true)
        val bjbngd9 = Node("IllegalArgumentException", isDuplicate = true)
        val ryldml1 = Node("argument_list", isDuplicate = true)
        val wddsnh0 = Node("(", isDuplicate = true)
        val mogufv7 = Node("string_literal", isDuplicate = true)
        val eokwhn4 = Node("\"name must be a non-empty string.\"")
        val romret4 = Node(")", isDuplicate = true)
        val kfrskk6 = Node(";", isDuplicate = true)
        val gocxvu2 = Node("expression_statement", isDuplicate = true)
        val vodjcy9 = Node("assignment_expression", isDuplicate = true)
        val dqdovf0 = Node("field_access", isDuplicate = true)
        val vfcejw8 = Node("this", isDuplicate = true)
        val fsfdmv1 = Node(".", isDuplicate = true)
        val dhislg4 = Node("identifier", isDuplicate = true)
        val yzflil0 = Node("rack", isDuplicate = true)
        val wtmqwr3 = Node("=", isDuplicate = true)
        val ytcpxn6 = Node("identifier", isDuplicate = true)
        val doezvl1 = Node("rack", isDuplicate = true)
        val oyfygg2 = Node(";", isDuplicate = true)
        val vfifzv7 = Node("expression_statement", isDuplicate = true)
        val ysdpsh4 = Node("assignment_expression", isDuplicate = true)
        val zbvpqs2 = Node("identifier", isDuplicate = true)
        val xovvob4 = Node("product", isDuplicate = true)
        val ifptpd5 = Node("=", isDuplicate = true)
        val wcnxpo8 = Node("object_creation_expression", isDuplicate = true)
        val rldojj5 = Node("new", isDuplicate = true)
        val gtixgd8 = Node("type_identifier", isDuplicate = true)
        val lyvtje7 = Node("Product", isDuplicate = true)
        val rmofpu2 = Node("argument_list", isDuplicate = true)
        val vglrql0 = Node("(", isDuplicate = true)
        val khkwcn5 = Node("identifier", isDuplicate = true)
        val txbgts6 = Node("name", isDuplicate = true)
        val bctdyh6 = Node(",", isDuplicate = true)
        val zbovmx0 = Node("identifier", isDuplicate = true)
        val jfywrb3 = Node("cost", isDuplicate = true)
        val uzcqyk9 = Node(")", isDuplicate = true)
        val pmstid7 = Node(";", isDuplicate = true)
        val vzsugm5 = Node("expression_statement", isDuplicate = true)
        val yfwuls5 = Node("method_invocation", isDuplicate = true)
        val dikvxl5 = Node("field_access", isDuplicate = true)
        val jsdmuh9 = Node("this", isDuplicate = true)
        val olqmdj8 = Node(".", isDuplicate = true)
        val uwkhjk2 = Node("identifier", isDuplicate = true)
        val ebgthk9 = Node("rack", isDuplicate = true)
        val bibhbn8 = Node(".", isDuplicate = true)
        val ohqmqq1 = Node("identifier", isDuplicate = true)
        val jeuooe4 = Node("register", isDuplicate = true)
        val zgodgg0 = Node("argument_list", isDuplicate = true)
        val zymhrb9 = Node("(", isDuplicate = true)
        val ntrdna1 = Node("object_creation_expression", isDuplicate = true)
        val ehhgac7 = Node("new", isDuplicate = true)
        val trduoz6 = Node("type_identifier", isDuplicate = true)
        val hknsob2 = Node("InnerListener", isDuplicate = true)
        val ieomqr2 = Node("argument_list", isDuplicate = true)
        val wlqqip0 = Node("(", isDuplicate = true)
        val dxysyd4 = Node(")", isDuplicate = true)
        val sjhlth3 = Node(")", isDuplicate = true)
        val gurfzt3 = Node(";", isDuplicate = true)
        val eamvtl6 = Node("}", isDuplicate = true)
        val rhsoha3 = Node("block_comment", isDuplicate = true)
        val rlxlkb8 = Node("/**\n* Registers the given listener with this controller so that the listener will\n* be notified of events emanating from here.\n*\n* @param listener\n* The listener to be registered. No effect if it is already\n* registered. Cannot be null.\n*/")
        val wmephk2 = Node("method_declaration", isDuplicate = true)
        val ttsntj1 = Node("modifiers", isDuplicate = true)
        val hwwtrj9 = Node("public", isDuplicate = true)
        val blyblp0 = Node("void_type", isDuplicate = true)
        val ocqwow4 = Node("identifier", isDuplicate = true)
        val wahzns4 = Node("register", isDuplicate = true)
        val srcgxj7 = Node("formal_parameters", isDuplicate = true)
        val ivnklk9 = Node("(", isDuplicate = true)
        val vrmwdt1 = Node("formal_parameter", isDuplicate = true)
        val olzoqr0 = Node("type_identifier", isDuplicate = true)
        val jhkbce9 = Node("ProductControllerListener", isDuplicate = true)
        val wffmyg1 = Node("identifier", isDuplicate = true)
        val pimxle8 = Node("listener", isDuplicate = true)
        val sfdzfw1 = Node(")", isDuplicate = true)
        val bqzdbx3 = Node("block", isDuplicate = true)
        val uhcoxr8 = Node("{", isDuplicate = true)
        val ddhxzm3 = Node("expression_statement", isDuplicate = true)
        val ljrqcc0 = Node("method_invocation", isDuplicate = true)
        val jtnrdd0 = Node("identifier", isDuplicate = true)
        val yypgsy8 = Node("listeners", isDuplicate = true)
        val rheqgd0 = Node(".", isDuplicate = true)
        val uhclxd9 = Node("identifier", isDuplicate = true)
        val dxewfr2 = Node("add")
        val hmooxr3 = Node("argument_list", isDuplicate = true)
        val nmbyqg8 = Node("(", isDuplicate = true)
        val otcbot0 = Node("identifier", isDuplicate = true)
        val zpsema4 = Node("listener", isDuplicate = true)
        val ucllfb5 = Node(")", isDuplicate = true)
        val tlhlol4 = Node(";", isDuplicate = true)
        val dhusxz2 = Node("}", isDuplicate = true)
        val hfenjy6 = Node("block_comment", isDuplicate = true)
        val voeqil3 = Node("/**\n* De-registers the given listener from this controller so that the listener\n* will no longer be notified of events emanating from here.\n*\n* @param listener\n* The listener to be de-registered. No effect if it is not already\n* registered or is null.\n*/")
        val elylip7 = Node("method_declaration", isDuplicate = true)
        val ojpswt1 = Node("modifiers", isDuplicate = true)
        val mquopd4 = Node("public", isDuplicate = true)
        val ykziek4 = Node("void_type", isDuplicate = true)
        val uzcggl0 = Node("identifier", isDuplicate = true)
        val nwvrmf4 = Node("deregister")
        val eedqvl7 = Node("formal_parameters", isDuplicate = true)
        val wcuglh3 = Node("(", isDuplicate = true)
        val lzzraj5 = Node("formal_parameter", isDuplicate = true)
        val benhml5 = Node("type_identifier", isDuplicate = true)
        val fqavpy2 = Node("ProductControllerListener", isDuplicate = true)
        val nyaqmc3 = Node("identifier", isDuplicate = true)
        val vzuzma2 = Node("listener", isDuplicate = true)
        val ptiqch8 = Node(")", isDuplicate = true)
        val ujrkjv3 = Node("block", isDuplicate = true)
        val tluxdd5 = Node("{", isDuplicate = true)
        val hefzku6 = Node("expression_statement", isDuplicate = true)
        val trpdoy9 = Node("method_invocation", isDuplicate = true)
        val iuftis9 = Node("identifier", isDuplicate = true)
        val iholno9 = Node("listeners", isDuplicate = true)
        val srmckd9 = Node(".", isDuplicate = true)
        val ipgynh6 = Node("identifier", isDuplicate = true)
        val rzzwlm0 = Node("remove")
        val rpqvpi3 = Node("argument_list", isDuplicate = true)
        val imqgvl0 = Node("(", isDuplicate = true)
        val xhzcwb8 = Node("identifier", isDuplicate = true)
        val xgpein0 = Node("listener", isDuplicate = true)
        val noadxg0 = Node(")", isDuplicate = true)
        val qxqzwn9 = Node(";", isDuplicate = true)
        val jdboqy9 = Node("}", isDuplicate = true)
        val tcsvfs9 = Node("block_comment", isDuplicate = true)
        val bpukhb3 = Node("/**\n* Determines whether the controller has free space for additional products.\n* \n* @return true if there is free space for at least one additional product, else\n*             false.\n*/")
        val urzbyo9 = Node("method_declaration", isDuplicate = true)
        val jnpidy3 = Node("modifiers", isDuplicate = true)
        val fqlwka8 = Node("public", isDuplicate = true)
        val eszwsf0 = Node("boolean_type")
        val wvwexw8 = Node("identifier", isDuplicate = true)
        val gyjfei3 = Node("hasFreeSpace")
        val fascqe7 = Node("formal_parameters", isDuplicate = true)
        val lcfuxf5 = Node("(", isDuplicate = true)
        val hjpkle7 = Node(")", isDuplicate = true)
        val fnehmr8 = Node("block", isDuplicate = true)
        val jpskwa9 = Node("{", isDuplicate = true)
        val riuggd0 = Node("return_statement", isDuplicate = true)
        val eiiutw2 = Node("return", isDuplicate = true)
        val ddbkzl7 = Node("method_invocation", isDuplicate = true)
        val ulmbyq4 = Node("identifier", isDuplicate = true)
        val zekbgm8 = Node("rack", isDuplicate = true)
        val uomzvu2 = Node(".", isDuplicate = true)
        val aupuvh6 = Node("identifier", isDuplicate = true)
        val pueddt4 = Node("hasSpace")
        val noxicq9 = Node("argument_list", isDuplicate = true)
        val zofdrm4 = Node("(", isDuplicate = true)
        val icmndx9 = Node(")", isDuplicate = true)
        val komstl0 = Node(";", isDuplicate = true)
        val spuomm8 = Node("}", isDuplicate = true)
        val qrazxt6 = Node("block_comment", isDuplicate = true)
        val edleon6 = Node("/**\n* Accesses the product kind for this controller.\n* \n* @return The product kind.\n*/")
        val jichzl8 = Node("method_declaration", isDuplicate = true)
        val ayxsnw0 = Node("modifiers", isDuplicate = true)
        val jgenjy8 = Node("public", isDuplicate = true)
        val qutvrx0 = Node("type_identifier", isDuplicate = true)
        val apzeuc8 = Node("Product", isDuplicate = true)
        val kjndap1 = Node("identifier", isDuplicate = true)
        val ifxvej9 = Node("getProductKind")
        val aaidcc4 = Node("formal_parameters", isDuplicate = true)
        val hldlzr1 = Node("(", isDuplicate = true)
        val jrajgj3 = Node(")", isDuplicate = true)
        val xvmhct7 = Node("block", isDuplicate = true)
        val sfgcta5 = Node("{", isDuplicate = true)
        val oypaee0 = Node("return_statement", isDuplicate = true)
        val hufccv0 = Node("return", isDuplicate = true)
        val bmjmho2 = Node("identifier", isDuplicate = true)
        val ozxzes0 = Node("product", isDuplicate = true)
        val gsefhq0 = Node(";", isDuplicate = true)
        val orakgx6 = Node("}", isDuplicate = true)
        val dthswb0 = Node("block_comment", isDuplicate = true)
        val bjcdhm4 = Node("/**\n* Accesses the count of available products.\n* \n* @return The count of available products.\n*/")
        val rzgzdj9 = Node("method_declaration", isDuplicate = true)
        val uowlsr6 = Node("modifiers", isDuplicate = true)
        val srzyza6 = Node("public", isDuplicate = true)
        val zgpapk0 = Node("integral_type", isDuplicate = true)
        val hgbksd1 = Node("int", isDuplicate = true)
        val cuvtsr5 = Node("identifier", isDuplicate = true)
        val vpshpd0 = Node("getQuantityAvailable")
        val swydgi7 = Node("formal_parameters", isDuplicate = true)
        val wxlgje5 = Node("(", isDuplicate = true)
        val iotelk8 = Node(")", isDuplicate = true)
        val yotjai8 = Node("block", isDuplicate = true)
        val rqlrod9 = Node("{", isDuplicate = true)
        val fjrdle6 = Node("return_statement", isDuplicate = true)
        val hcjcjy7 = Node("return", isDuplicate = true)
        val aaziev3 = Node("identifier", isDuplicate = true)
        val hoekvt7 = Node("available", isDuplicate = true)
        val ywxlws1 = Node(";", isDuplicate = true)
        val czajun2 = Node("}", isDuplicate = true)
        val uqrpnu9 = Node("block_comment", isDuplicate = true)
        val fjbljo2 = Node("/**\n* Dispenses one product from this controller.\n* \n* @throws DisabledException\n* If the device needed for dispensing is disabled.\n* @throws EmptyException\n* If no products are available.\n* @throws CapacityExceededException\n* If the delivery is impaired by insufficient capacity.\n*/")
        val xyvpar8 = Node("method_declaration", isDuplicate = true)
        val jorvqz7 = Node("modifiers", isDuplicate = true)
        val jlqeij6 = Node("public", isDuplicate = true)
        val hdoidz2 = Node("void_type", isDuplicate = true)
        val ehvena6 = Node("identifier", isDuplicate = true)
        val blgcbx9 = Node("dispense", isDuplicate = true)
        val zfgmbi1 = Node("formal_parameters", isDuplicate = true)
        val mrcgks1 = Node("(", isDuplicate = true)
        val rpdgaf6 = Node(")", isDuplicate = true)
        val gougfo0 = Node("throws", isDuplicate = true)
        val suzjzs9 = Node("throws", isDuplicate = true)
        val urwzfu7 = Node("type_identifier", isDuplicate = true)
        val vowooc9 = Node("DisabledException", isDuplicate = true)
        val ctbrby2 = Node(",", isDuplicate = true)
        val jsvgwf5 = Node("type_identifier", isDuplicate = true)
        val nvmeyf7 = Node("EmptyException", isDuplicate = true)
        val eeigxq7 = Node(",", isDuplicate = true)
        val pffhae1 = Node("type_identifier", isDuplicate = true)
        val zqseta0 = Node("CapacityExceededException", isDuplicate = true)
        val obgepy2 = Node("block", isDuplicate = true)
        val okfdmz4 = Node("{", isDuplicate = true)
        val gwwkci0 = Node("expression_statement", isDuplicate = true)
        val ikvtmk1 = Node("method_invocation", isDuplicate = true)
        val xsiylt2 = Node("identifier", isDuplicate = true)
        val pvoxnd4 = Node("rack", isDuplicate = true)
        val qgknya1 = Node(".", isDuplicate = true)
        val uwetch1 = Node("identifier", isDuplicate = true)
        val kjiemo7 = Node("dispense", isDuplicate = true)
        val nozbls1 = Node("argument_list", isDuplicate = true)
        val hedmiv3 = Node("(", isDuplicate = true)
        val gzvmla9 = Node(")", isDuplicate = true)
        val bmtzek1 = Node(";", isDuplicate = true)
        val igqizj6 = Node("}", isDuplicate = true)
        val njhbhu4 = Node("method_declaration", isDuplicate = true)
        val thjsmq7 = Node("modifiers", isDuplicate = true)
        val kpjqun1 = Node("private", isDuplicate = true)
        val vjtenb4 = Node("void_type", isDuplicate = true)
        val cgjtcx4 = Node("identifier", isDuplicate = true)
        val iixmrw7 = Node("notifyProductsRemoved", isDuplicate = true)
        val hlrqxe5 = Node("formal_parameters", isDuplicate = true)
        val ggfwcf8 = Node("(", isDuplicate = true)
        val itifhr2 = Node("formal_parameter", isDuplicate = true)
        val mqiubu8 = Node("integral_type", isDuplicate = true)
        val upyjqu2 = Node("int", isDuplicate = true)
        val loceok0 = Node("identifier", isDuplicate = true)
        val widsgh6 = Node("count", isDuplicate = true)
        val tuhzhx3 = Node(")", isDuplicate = true)
        val szhyka9 = Node("block", isDuplicate = true)
        val fomsqx4 = Node("{", isDuplicate = true)
        val gkplqx3 = Node("enhanced_for_statement", isDuplicate = true)
        val cubkbw1 = Node("for", isDuplicate = true)
        val kzxobq8 = Node("(", isDuplicate = true)
        val bscnrk4 = Node("type_identifier", isDuplicate = true)
        val pjtxrz9 = Node("ProductControllerListener", isDuplicate = true)
        val prwvvf1 = Node("identifier", isDuplicate = true)
        val uyhmle1 = Node("l", isDuplicate = true)
        val wbkcyc6 = Node(":", isDuplicate = true)
        val nuaplt5 = Node("identifier", isDuplicate = true)
        val dncfdt8 = Node("listeners", isDuplicate = true)
        val kpxubg0 = Node(")", isDuplicate = true)
        val rlwqya7 = Node("expression_statement", isDuplicate = true)
        val jiqwlv2 = Node("method_invocation", isDuplicate = true)
        val djtkcm1 = Node("identifier", isDuplicate = true)
        val gwghiq8 = Node("l", isDuplicate = true)
        val prbvyn1 = Node(".", isDuplicate = true)
        val rgoodb6 = Node("identifier", isDuplicate = true)
        val qiuyav7 = Node("productsRemoved")
        val xcekkp4 = Node("argument_list", isDuplicate = true)
        val bnzitn1 = Node("(", isDuplicate = true)
        val tizhrt8 = Node("this", isDuplicate = true)
        val fxcovd1 = Node(",", isDuplicate = true)
        val sgnngg2 = Node("identifier", isDuplicate = true)
        val hmiwzg5 = Node("count", isDuplicate = true)
        val owbuvb6 = Node(")", isDuplicate = true)
        val jvisrb8 = Node(";", isDuplicate = true)
        val ghjkxm0 = Node("}", isDuplicate = true)
        val xgffvx5 = Node("method_declaration", isDuplicate = true)
        val phrkci7 = Node("modifiers", isDuplicate = true)
        val bgudcg9 = Node("private", isDuplicate = true)
        val bddhja2 = Node("void_type", isDuplicate = true)
        val nephat7 = Node("identifier", isDuplicate = true)
        val etlkkr8 = Node("notifyProductsAdded", isDuplicate = true)
        val ogbonq9 = Node("formal_parameters", isDuplicate = true)
        val ecxmqh6 = Node("(", isDuplicate = true)
        val bnhohc3 = Node("formal_parameter", isDuplicate = true)
        val xcesgj0 = Node("integral_type", isDuplicate = true)
        val klknfo1 = Node("int", isDuplicate = true)
        val iuclhg2 = Node("identifier", isDuplicate = true)
        val eqcmfl1 = Node("count", isDuplicate = true)
        val vnrvyo9 = Node(")", isDuplicate = true)
        val ghdrge1 = Node("block", isDuplicate = true)
        val agpufd1 = Node("{", isDuplicate = true)
        val ktgcqb8 = Node("enhanced_for_statement", isDuplicate = true)
        val oahpim7 = Node("for", isDuplicate = true)
        val lwppvg5 = Node("(", isDuplicate = true)
        val aufzbe4 = Node("type_identifier", isDuplicate = true)
        val ehguzp8 = Node("ProductControllerListener", isDuplicate = true)
        val ecamxw4 = Node("identifier", isDuplicate = true)
        val pgjgcc7 = Node("l", isDuplicate = true)
        val jntkbx1 = Node(":", isDuplicate = true)
        val hegzae8 = Node("identifier", isDuplicate = true)
        val gniuhz9 = Node("listeners", isDuplicate = true)
        val uacqgp2 = Node(")", isDuplicate = true)
        val uxmwtw4 = Node("expression_statement", isDuplicate = true)
        val vphgvb3 = Node("method_invocation", isDuplicate = true)
        val bsifpf2 = Node("identifier", isDuplicate = true)
        val jcadaa8 = Node("l", isDuplicate = true)
        val fecmdl6 = Node(".", isDuplicate = true)
        val amjszb8 = Node("identifier", isDuplicate = true)
        val jaksmg2 = Node("productsAdded")
        val uyjmov2 = Node("argument_list", isDuplicate = true)
        val fboxhw4 = Node("(", isDuplicate = true)
        val vnqeut1 = Node("this", isDuplicate = true)
        val xkwlqe6 = Node(",", isDuplicate = true)
        val pwahck1 = Node("identifier", isDuplicate = true)
        val podzhq4 = Node("count", isDuplicate = true)
        val zjatze1 = Node(")", isDuplicate = true)
        val ycswxa3 = Node(";", isDuplicate = true)
        val ecljgy3 = Node("}", isDuplicate = true)
        val xgouua6 = Node("}", isDuplicate = true)

        graph1 = Graph.from(
            nodes = listOf(mvxrov2, bmeavo9, rapjxc6, pnswpt6, xnmjco5, xopkkg3, yrsykj8, fomjba5, dkpsjd9, kfetuo9, dexkqs1, abgibg9, iohtvk6, tmfmdj9, nuujzm6, lyywdv8, ehvzki2, hdurgx1, txzyhg2, idrlbo6, ynoaet2, agtvhs6, oshhje0, sccnoh9, mcjcls5, dhfqsx8, jlgkcg1, cngiiq2, dlajnt4, qrdpsc8, hepaqa2, ewmtlh9, azzght3, qcbtkr0, visprt4, qbouvx7, pnblif0, ystdnn6, ilcecb6, tjmwwa7, yiqnhn4, ziqbnb3, pfaldf2, llocvg2, oupmng0, psetvp0, htkdho6, zpumsl1, fpqzdo7, apkkkl4, jupxul3, rpfiux5, mliunv6, nsxmqq6, iccdzb9, qtuhxm1, cortsf6, jjtwna2, sggmxc6, dmzfkk3, citema0, hpelpc1, kzjheo3, kqmtdn4, hyqonw6, vxrmna8, qacswo8, kvomdt5, bfswqi5, kxrgxj0, bpzphs5, twedyr6, szsmxm6, brohks1, nozszu2, eehcnn6, wtzbnp2, zqkivy4, uzsoyt5, ruoyxi6, rxameg6, lcozgi2, fktidy5, etkiqh7, uxarcq6, rujkjp4, azyrst5, ywsiyq8, vwtvuv4, ackxza4, jjsxmr1, tdzvwe3, hkcgig8, dcbthv7, gkliqe3, ojxjoh0, jeshkq9, omevpz4, oyvjxf8, uhemkg2, lyztev3, amaefq1, cfrgvk4, twihqt7, jphaym3, jjzddm4, phrsyw0, zkrfeh9, llbzeu3, hjdpjv9, kwxhbg2, zwrwfg6, duxeoc4, mqukyd5, zxnypc8, xrbmds3, pwnlro3, uvadme0, ekggju5, keazbo3, turtaf9, xtuhvk6, tlbjrl9, rvyytk1, kosyzx9, crtpzy5, qfhnzp9, tcjpqq9, obtntm2, gqxnhy8, mxghgg8, rtytqp0, wykeqz0, kywnde1, nbphgj3, vbldkm4, qnstel9, ecpeqi5, dmlkbs0, jbvtxa9, sfqkee7, thprjs2, nqorai2, qaqjkc0, jvfvfp6, pxkthk3, voguwm7, xykqxn6, kwpgat2, jhdqgg7, njckge4, jcdzab1, uqgmod2, xocxfz9, vtdhfm1, cdrvng9, daqryr2, vcangt3, lkoprx5, viptxv3, itqsct1, altzgi5, oeikye4, woipir4, xhmsgj2, dydrzv2, qbnnoy5, qocjcz8, gdxeks9, difrgx7, ahprna9, cigmqr6, hhswkl4, mswafv8, jbqlyg2, dsbaxe9, cvifxp4, iuqcty9, orbjqt9, jazkvn7, pwbxqk6, pkuxhs8, kcvchk2, kwimlu8, djgfcf8, gepxfv7, tiuhfo2, naxaal9, tqafsz7, mjmjte0, blsode7, jhhuej1, qsgldz9, neyjow9, gbzgbe7, klmpnk5, ecydiu6, hpnoul2, bfopcn1, topjyb5, wplvhk3, wrpkmi7, utwort3, lninll2, piuloq9, xcmfqz4, kfwikh5, takhhr9, jwjlki3, vfbpay0, qycxgc4, dzplmf5, flrtcd0, codzjs0, stxoxh7, ulxyga1, gkovfx6, oantqr7, xvylit8, yhnmgt1, sfbfhh7, knychj8, pnoabn3, oikcdz8, dengnw6, seijpd9, rdleeq4, gwhxeg2, imvxsr8, vsaror3, dpwpvv9, jakcpa6, avssdv8, odfeob6, tiyvjl7, fowboa5, ialzxu6, hpmqrg3, wllsep3, lwghem6, nurinh0, bwxzae2, jgzjfj3, ynudsc0, usgyjr3, fakhxf7, rynjjo4, cscdos8, tdwrhl2, dkvfrm0, kcwgli9, jxipij8, qjwrfl7, fvamgt9, dqwyna0, slvjol2, ustnyd0, rqavuv6, jqzjby8, gzmajz1, swwfzf6, yiyans0, jktzox2, cfuels6, qymhqk6, rrnctz0, bwalte9, edengx5, kwiloo2, cidxfr4, aennmg1, teedjw2, jaqbmy1, drtcsh9, oecgix0, oresfo6, ygprbh9, ekoisp9, ktskps5, awynwg9, zpjiar7, cnswks1, pajkdu0, fythhv6, bdwnui0, wywyis1, djlbqk7, qgujai9, vjalrf1, mvsiwe4, xbxqjg0, ywhtcu4, bncdsh5, jciqee5, hxhcko9, pzqbzq3, mmjbmu7, tfcqmy4, fxcpvi9, dgjjcv8, setfqx8, qnzllw0, kgoryg3, dfwlme5, jputtv5, lfsrgn4, jivhvh0, hsgctx6, klcbzk5, rrzftk6, ywxsbp4, dkxjol3, xkbbah1, faaneh8, wyyqep5, fjzxnq8, kvyqom3, kctrow4, bwphno1, dxfhvt1, qnyepu7, ceulss3, knnfpe0, esjgmb6, woptjb1, bkxlnm4, uyxcdg4, alablx4, vohcdf5, zdjeqk9, eeyuyk3, ilqfsg4, gibdss6, xqonpo5, prwmhu3, aikumx4, lylroa0, qzpypr0, dzzxbl2, foqxmp3, nswxsy5, kvyitr5, qbgzfn8, pyqxwe5, bleupb4, pholnm0, dlnfsp3, ldsbrw8, rmcyxr3, wucalk8, rglucj8, uaggye3, bxmtvj3, cjtgcz8, ddznjt9, fxyrjy9, pmuqae6, bdfejr2, lfufvg0, uiqdda2, xecvaj5, kvhpby8, oonltr4, jzvrtb9, ltnubt0, yzijeb0, gmkbkg6, aakpbw2, dnvwyg2, ewdzoq0, kjcmux8, fbpihl3, szsmbs4, orfwqv5, mqotbg2, bvypwx9, kuzgxh5, ojpzwx2, tzizvu7, mqzvaj1, diloot6, pozuhc2, ehzxpi6, klqrpo3, weuevj1, iyvgdd8, kzvhkq5, odiipu6, dnhbti5, mbfrke4, debgsw0, rnbmyz9, uocbrr0, zvkhdm5, kagcmt1, ekodxo7, wynujo0, uxccvi0, sskzpj2, sukksd3, dcpguk5, voloow1, jshupw0, bvesiq8, xbgpjo9, rzumyo3, hoodwa8, pwbkhy9, rkgfjc7, ephkfj2, gwopwz2, ueughp8, koyjlt8, zqunlc6, ylpgfi8, hqfiir1, uhtrvk4, ymavgo2, qwjyqh6, nuceyr2, xdsvwi4, hchxgu0, acmbgv6, swdgkn4, jxjbda3, nnmusp7, ipgnnz7, clltth2, jgftya8, tofuwz8, lsdefs3, dybjok7, cjhdme8, igcfoe6, dvodtw6, tahnwu9, brgqnl1, yddsxc6, yeteeq0, aindqr7, ruobyn6, nrfvne2, vbtgnm5, rwvekh6, dlhqsb3, sfpmhm8, yqznit0, xtqzpv9, zntuyv4, onqsxr3, rpxmak0, hrrhrb2, syrmyp5, uknsuk2, zimwve0, fjtjyc5, fnovyr5, bheoue4, lpnkuq2, mewbij1, qroiiu2, rytvwb3, xzrott5, teibfd4, drkknp7, kqiqcx8, dlhuaf1, exakcx4, npktxa1, wtavgr3, zvxnen3, vyvvlz9, fwecep2, zpavte6, lphjsa8, bxfakn2, xxaftr0, ytxkhe7, vkzmlx7, iwuleh4, waoauw7, psrvhr4, uulzxc2, rvihfz6, arhsii2, ozrbil5, syjgnw5, txjjts8, agjtsf8, fbfhzg2, gczpvu8, usjbei2, ijsfty4, pqfwwb5, ighmwo4, mthzfb5, ucpkiq4, nyrtgf6, dcsjqz9, ksiuah5, dwovym2, uelqqh7, gfnyvz0, igptdo1, smkxti6, tajuqn1, neetvn8, ahuzxf8, pcxbmp9, thwqzu8, nqukix7, rpvmmn7, lxdagb1, ybmjbd0, ikavkb7, aipisn1, hunkka7, dgyrkz5, pdbhft9, znzrsk0, riykdq2, hdwqat3, bdwdns1, wrbgdi0, ealraf4, nfbqdi2, yevfkm6, ftclnk9, nbftzp7, pdjyyv0, imzogl6, vhnjdp2, euqnnx7, uiogkw1, kkjnej7, bbuhry3, lzgeny6, ohoorc3, xgveyt8, ejqkmd8, lectru1, vxnvlu5, oymlmo0, vwlypv1, bvqeaj7, ibdkpi2, dpbyrt1, vkjlji5, ntthmd8, ijkjsv9, mrfgry9, ipysbb7, eteqpn8, ngwcnp9, mofidl7, pjdrwe6, slvafc6, jvkqps1, ogqxlq1, pkkbht2, upazcz3, cwqlpc9, whuxru1, debwov8, zisznb7, kaqxgg6, fnovka4, ssgvlj5, aviunp4, npstal4, vckrqf5, fghbrs3, pjczui9, naeczq4, knfeyb4, vpapvq6, fkrysj5, bjbngd9, ryldml1, wddsnh0, mogufv7, eokwhn4, romret4, kfrskk6, gocxvu2, vodjcy9, dqdovf0, vfcejw8, fsfdmv1, dhislg4, yzflil0, wtmqwr3, ytcpxn6, doezvl1, oyfygg2, vfifzv7, ysdpsh4, zbvpqs2, xovvob4, ifptpd5, wcnxpo8, rldojj5, gtixgd8, lyvtje7, rmofpu2, vglrql0, khkwcn5, txbgts6, bctdyh6, zbovmx0, jfywrb3, uzcqyk9, pmstid7, vzsugm5, yfwuls5, dikvxl5, jsdmuh9, olqmdj8, uwkhjk2, ebgthk9, bibhbn8, ohqmqq1, jeuooe4, zgodgg0, zymhrb9, ntrdna1, ehhgac7, trduoz6, hknsob2, ieomqr2, wlqqip0, dxysyd4, sjhlth3, gurfzt3, eamvtl6, rhsoha3, rlxlkb8, wmephk2, ttsntj1, hwwtrj9, blyblp0, ocqwow4, wahzns4, srcgxj7, ivnklk9, vrmwdt1, olzoqr0, jhkbce9, wffmyg1, pimxle8, sfdzfw1, bqzdbx3, uhcoxr8, ddhxzm3, ljrqcc0, jtnrdd0, yypgsy8, rheqgd0, uhclxd9, dxewfr2, hmooxr3, nmbyqg8, otcbot0, zpsema4, ucllfb5, tlhlol4, dhusxz2, hfenjy6, voeqil3, elylip7, ojpswt1, mquopd4, ykziek4, uzcggl0, nwvrmf4, eedqvl7, wcuglh3, lzzraj5, benhml5, fqavpy2, nyaqmc3, vzuzma2, ptiqch8, ujrkjv3, tluxdd5, hefzku6, trpdoy9, iuftis9, iholno9, srmckd9, ipgynh6, rzzwlm0, rpqvpi3, imqgvl0, xhzcwb8, xgpein0, noadxg0, qxqzwn9, jdboqy9, tcsvfs9, bpukhb3, urzbyo9, jnpidy3, fqlwka8, eszwsf0, wvwexw8, gyjfei3, fascqe7, lcfuxf5, hjpkle7, fnehmr8, jpskwa9, riuggd0, eiiutw2, ddbkzl7, ulmbyq4, zekbgm8, uomzvu2, aupuvh6, pueddt4, noxicq9, zofdrm4, icmndx9, komstl0, spuomm8, qrazxt6, edleon6, jichzl8, ayxsnw0, jgenjy8, qutvrx0, apzeuc8, kjndap1, ifxvej9, aaidcc4, hldlzr1, jrajgj3, xvmhct7, sfgcta5, oypaee0, hufccv0, bmjmho2, ozxzes0, gsefhq0, orakgx6, dthswb0, bjcdhm4, rzgzdj9, uowlsr6, srzyza6, zgpapk0, hgbksd1, cuvtsr5, vpshpd0, swydgi7, wxlgje5, iotelk8, yotjai8, rqlrod9, fjrdle6, hcjcjy7, aaziev3, hoekvt7, ywxlws1, czajun2, uqrpnu9, fjbljo2, xyvpar8, jorvqz7, jlqeij6, hdoidz2, ehvena6, blgcbx9, zfgmbi1, mrcgks1, rpdgaf6, gougfo0, suzjzs9, urwzfu7, vowooc9, ctbrby2, jsvgwf5, nvmeyf7, eeigxq7, pffhae1, zqseta0, obgepy2, okfdmz4, gwwkci0, ikvtmk1, xsiylt2, pvoxnd4, qgknya1, uwetch1, kjiemo7, nozbls1, hedmiv3, gzvmla9, bmtzek1, igqizj6, njhbhu4, thjsmq7, kpjqun1, vjtenb4, cgjtcx4, iixmrw7, hlrqxe5, ggfwcf8, itifhr2, mqiubu8, upyjqu2, loceok0, widsgh6, tuhzhx3, szhyka9, fomsqx4, gkplqx3, cubkbw1, kzxobq8, bscnrk4, pjtxrz9, prwvvf1, uyhmle1, wbkcyc6, nuaplt5, dncfdt8, kpxubg0, rlwqya7, jiqwlv2, djtkcm1, gwghiq8, prbvyn1, rgoodb6, qiuyav7, xcekkp4, bnzitn1, tizhrt8, fxcovd1, sgnngg2, hmiwzg5, owbuvb6, jvisrb8, ghjkxm0, xgffvx5, phrkci7, bgudcg9, bddhja2, nephat7, etlkkr8, ogbonq9, ecxmqh6, bnhohc3, xcesgj0, klknfo1, iuclhg2, eqcmfl1, vnrvyo9, ghdrge1, agpufd1, ktgcqb8, oahpim7, lwppvg5, aufzbe4, ehguzp8, ecamxw4, pgjgcc7, jntkbx1, hegzae8, gniuhz9, uacqgp2, uxmwtw4, vphgvb3, bsifpf2, jcadaa8, fecmdl6, amjszb8, jaksmg2, uyjmov2, fboxhw4, vnqeut1, xkwlqe6, pwahck1, podzhq4, zjatze1, ycswxa3, ecljgy3, xgouua6),
            edges = mapOf(
                mvxrov2 to listOf(bmeavo9, oshhje0, qbouvx7, fpqzdo7, vxrmna8, azyrst5, zkrfeh9, obtntm2, jhdqgg7, ahprna9, jhhuej1, neyjow9),
                bmeavo9 to listOf(rapjxc6, pnswpt6, agtvhs6),
                pnswpt6 to listOf(xnmjco5, txzyhg2, idrlbo6),
                xnmjco5 to listOf(xopkkg3, lyywdv8, ehvzki2),
                xopkkg3 to listOf(yrsykj8, iohtvk6, tmfmdj9),
                yrsykj8 to listOf(fomjba5, kfetuo9, dexkqs1),
                fomjba5 to listOf(dkpsjd9),
                dexkqs1 to listOf(abgibg9),
                tmfmdj9 to listOf(nuujzm6),
                ehvzki2 to listOf(hdurgx1),
                idrlbo6 to listOf(ynoaet2),
                oshhje0 to listOf(sccnoh9, mcjcls5, visprt4),
                mcjcls5 to listOf(dhfqsx8, ewmtlh9, azzght3),
                dhfqsx8 to listOf(jlgkcg1, dlajnt4, qrdpsc8),
                jlgkcg1 to listOf(cngiiq2),
                qrdpsc8 to listOf(hepaqa2),
                azzght3 to listOf(qcbtkr0),
                qbouvx7 to listOf(pnblif0, ystdnn6, zpumsl1),
                ystdnn6 to listOf(ilcecb6, oupmng0, psetvp0),
                ilcecb6 to listOf(tjmwwa7, ziqbnb3, pfaldf2),
                tjmwwa7 to listOf(yiqnhn4),
                pfaldf2 to listOf(llocvg2),
                psetvp0 to listOf(htkdho6),
                fpqzdo7 to listOf(apkkkl4, jupxul3, hyqonw6),
                jupxul3 to listOf(rpfiux5, hpelpc1, kzjheo3),
                rpfiux5 to listOf(mliunv6, sggmxc6, dmzfkk3),
                mliunv6 to listOf(nsxmqq6, qtuhxm1, cortsf6),
                nsxmqq6 to listOf(iccdzb9),
                cortsf6 to listOf(jjtwna2),
                dmzfkk3 to listOf(citema0),
                kzjheo3 to listOf(kqmtdn4),
                vxrmna8 to listOf(qacswo8, kvomdt5, rujkjp4),
                kvomdt5 to listOf(bfswqi5, fktidy5, etkiqh7),
                bfswqi5 to listOf(kxrgxj0, ruoyxi6, rxameg6),
                kxrgxj0 to listOf(bpzphs5, wtzbnp2, zqkivy4),
                bpzphs5 to listOf(twedyr6, brohks1, nozszu2),
                twedyr6 to listOf(szsmxm6),
                nozszu2 to listOf(eehcnn6),
                zqkivy4 to listOf(uzsoyt5),
                rxameg6 to listOf(lcozgi2),
                etkiqh7 to listOf(uxarcq6),
                azyrst5 to listOf(ywsiyq8, vwtvuv4, phrsyw0),
                vwtvuv4 to listOf(ackxza4, twihqt7, jphaym3),
                ackxza4 to listOf(jjsxmr1, lyztev3, amaefq1),
                jjsxmr1 to listOf(tdzvwe3, omevpz4, oyvjxf8),
                tdzvwe3 to listOf(hkcgig8, gkliqe3, ojxjoh0),
                hkcgig8 to listOf(dcbthv7),
                ojxjoh0 to listOf(jeshkq9),
                oyvjxf8 to listOf(uhemkg2),
                amaefq1 to listOf(cfrgvk4),
                jphaym3 to listOf(jjzddm4),
                zkrfeh9 to listOf(llbzeu3, hjdpjv9, tcjpqq9),
                hjdpjv9 to listOf(kwxhbg2, kosyzx9, crtpzy5),
                kwxhbg2 to listOf(zwrwfg6, xtuhvk6, tlbjrl9),
                zwrwfg6 to listOf(duxeoc4, ekggju5, keazbo3),
                duxeoc4 to listOf(mqukyd5, xrbmds3, pwnlro3),
                mqukyd5 to listOf(zxnypc8),
                pwnlro3 to listOf(uvadme0),
                keazbo3 to listOf(turtaf9),
                tlbjrl9 to listOf(rvyytk1),
                crtpzy5 to listOf(qfhnzp9),
                obtntm2 to listOf(gqxnhy8, mxghgg8, kwpgat2),
                mxghgg8 to listOf(rtytqp0, pxkthk3, voguwm7),
                rtytqp0 to listOf(wykeqz0, nqorai2, qaqjkc0),
                wykeqz0 to listOf(kywnde1, jbvtxa9, sfqkee7),
                kywnde1 to listOf(nbphgj3, qnstel9, ecpeqi5),
                nbphgj3 to listOf(vbldkm4),
                ecpeqi5 to listOf(dmlkbs0),
                sfqkee7 to listOf(thprjs2),
                qaqjkc0 to listOf(jvfvfp6),
                voguwm7 to listOf(xykqxn6),
                jhdqgg7 to listOf(njckge4, jcdzab1, difrgx7),
                jcdzab1 to listOf(uqgmod2, qbnnoy5, qocjcz8),
                uqgmod2 to listOf(xocxfz9, woipir4, xhmsgj2),
                xocxfz9 to listOf(vtdhfm1, itqsct1, altzgi5),
                vtdhfm1 to listOf(cdrvng9, vcangt3, lkoprx5),
                cdrvng9 to listOf(daqryr2),
                lkoprx5 to listOf(viptxv3),
                altzgi5 to listOf(oeikye4),
                xhmsgj2 to listOf(dydrzv2),
                qocjcz8 to listOf(gdxeks9),
                ahprna9 to listOf(cigmqr6, hhswkl4, blsode7),
                hhswkl4 to listOf(mswafv8, naxaal9, tqafsz7),
                mswafv8 to listOf(jbqlyg2, djgfcf8, gepxfv7),
                jbqlyg2 to listOf(dsbaxe9, pkuxhs8, kcvchk2),
                dsbaxe9 to listOf(cvifxp4, orbjqt9, jazkvn7),
                cvifxp4 to listOf(iuqcty9),
                jazkvn7 to listOf(pwbxqk6),
                kcvchk2 to listOf(kwimlu8),
                gepxfv7 to listOf(tiuhfo2),
                tqafsz7 to listOf(mjmjte0),
                jhhuej1 to listOf(qsgldz9),
                neyjow9 to listOf(gbzgbe7, ecydiu6, hpnoul2, topjyb5),
                gbzgbe7 to listOf(klmpnk5),
                hpnoul2 to listOf(bfopcn1),
                topjyb5 to listOf(wplvhk3, wrpkmi7, vsaror3, bwxzae2, jxipij8, yiyans0, vyvvlz9, zpavte6, rhsoha3, wmephk2, hfenjy6, elylip7, tcsvfs9, urzbyo9, qrazxt6, jichzl8, dthswb0, rzgzdj9, uqrpnu9, xyvpar8, njhbhu4, xgffvx5, xgouua6),
                wrpkmi7 to listOf(utwort3, xcmfqz4, codzjs0, imvxsr8),
                utwort3 to listOf(lninll2, piuloq9),
                xcmfqz4 to listOf(kfwikh5, jwjlki3),
                kfwikh5 to listOf(takhhr9),
                jwjlki3 to listOf(vfbpay0, qycxgc4, flrtcd0),
                qycxgc4 to listOf(dzplmf5),
                codzjs0 to listOf(stxoxh7, gkovfx6, oantqr7),
                stxoxh7 to listOf(ulxyga1),
                oantqr7 to listOf(xvylit8, yhnmgt1, seijpd9),
                yhnmgt1 to listOf(sfbfhh7, pnoabn3),
                sfbfhh7 to listOf(knychj8),
                pnoabn3 to listOf(oikcdz8, dengnw6),
                seijpd9 to listOf(rdleeq4, gwhxeg2),
                vsaror3 to listOf(dpwpvv9, avssdv8, tiyvjl7, nurinh0),
                dpwpvv9 to listOf(jakcpa6),
                avssdv8 to listOf(odfeob6),
                tiyvjl7 to listOf(fowboa5, hpmqrg3, wllsep3),
                fowboa5 to listOf(ialzxu6),
                wllsep3 to listOf(lwghem6),
                bwxzae2 to listOf(jgzjfj3, fakhxf7, cscdos8, kcwgli9),
                jgzjfj3 to listOf(ynudsc0, usgyjr3),
                fakhxf7 to listOf(rynjjo4),
                cscdos8 to listOf(tdwrhl2),
                tdwrhl2 to listOf(dkvfrm0),
                jxipij8 to listOf(qjwrfl7, slvjol2, rqavuv6, swwfzf6),
                qjwrfl7 to listOf(fvamgt9, dqwyna0),
                slvjol2 to listOf(ustnyd0),
                rqavuv6 to listOf(jqzjby8),
                jqzjby8 to listOf(gzmajz1),
                yiyans0 to listOf(jktzox2, qymhqk6, rrnctz0, edengx5, jaqbmy1),
                jktzox2 to listOf(cfuels6),
                rrnctz0 to listOf(bwalte9),
                edengx5 to listOf(kwiloo2, cidxfr4),
                cidxfr4 to listOf(aennmg1),
                aennmg1 to listOf(teedjw2),
                jaqbmy1 to listOf(drtcsh9, oecgix0, kctrow4, xecvaj5, hqfiir1, zvxnen3),
                oecgix0 to listOf(oresfo6, cnswks1, pajkdu0, bdwnui0, fxcpvi9),
                oresfo6 to listOf(ygprbh9, zpjiar7),
                ygprbh9 to listOf(ekoisp9, ktskps5),
                ktskps5 to listOf(awynwg9),
                pajkdu0 to listOf(fythhv6),
                bdwnui0 to listOf(wywyis1, djlbqk7, ywhtcu4, bncdsh5, tfcqmy4),
                djlbqk7 to listOf(qgujai9, mvsiwe4),
                qgujai9 to listOf(vjalrf1),
                mvsiwe4 to listOf(xbxqjg0),
                bncdsh5 to listOf(jciqee5, pzqbzq3),
                jciqee5 to listOf(hxhcko9),
                pzqbzq3 to listOf(mmjbmu7),
                fxcpvi9 to listOf(dgjjcv8, setfqx8, jivhvh0, kvyqom3),
                setfqx8 to listOf(qnzllw0, lfsrgn4),
                qnzllw0 to listOf(kgoryg3, jputtv5),
                kgoryg3 to listOf(dfwlme5),
                jivhvh0 to listOf(hsgctx6, fjzxnq8),
                hsgctx6 to listOf(klcbzk5, ywxsbp4),
                klcbzk5 to listOf(rrzftk6),
                ywxsbp4 to listOf(dkxjol3, xkbbah1, wyyqep5),
                xkbbah1 to listOf(faaneh8),
                kctrow4 to listOf(bwphno1, woptjb1, bkxlnm4, alablx4, kvyitr5),
                bwphno1 to listOf(dxfhvt1, esjgmb6),
                dxfhvt1 to listOf(qnyepu7, ceulss3),
                ceulss3 to listOf(knnfpe0),
                bkxlnm4 to listOf(uyxcdg4),
                alablx4 to listOf(vohcdf5, zdjeqk9, prwmhu3, aikumx4, nswxsy5),
                zdjeqk9 to listOf(eeyuyk3, gibdss6),
                eeyuyk3 to listOf(ilqfsg4),
                gibdss6 to listOf(xqonpo5),
                aikumx4 to listOf(lylroa0, dzzxbl2),
                lylroa0 to listOf(qzpypr0),
                dzzxbl2 to listOf(foqxmp3),
                kvyitr5 to listOf(qbgzfn8, pyqxwe5, wucalk8, uiqdda2),
                pyqxwe5 to listOf(bleupb4, rmcyxr3),
                bleupb4 to listOf(pholnm0, ldsbrw8),
                pholnm0 to listOf(dlnfsp3),
                wucalk8 to listOf(rglucj8, lfufvg0),
                rglucj8 to listOf(uaggye3, cjtgcz8),
                uaggye3 to listOf(bxmtvj3),
                cjtgcz8 to listOf(ddznjt9, fxyrjy9, bdfejr2),
                fxyrjy9 to listOf(pmuqae6),
                xecvaj5 to listOf(kvhpby8, aakpbw2, dnvwyg2, kjcmux8, kzvhkq5),
                kvhpby8 to listOf(oonltr4, gmkbkg6),
                oonltr4 to listOf(jzvrtb9, ltnubt0),
                ltnubt0 to listOf(yzijeb0),
                dnvwyg2 to listOf(ewdzoq0),
                kjcmux8 to listOf(fbpihl3, szsmbs4, ojpzwx2, tzizvu7, iyvgdd8),
                szsmbs4 to listOf(orfwqv5, bvypwx9),
                orfwqv5 to listOf(mqotbg2),
                bvypwx9 to listOf(kuzgxh5),
                tzizvu7 to listOf(mqzvaj1, pozuhc2, ehzxpi6),
                mqzvaj1 to listOf(diloot6),
                ehzxpi6 to listOf(klqrpo3),
                klqrpo3 to listOf(weuevj1),
                kzvhkq5 to listOf(odiipu6, dnhbti5, dcpguk5, ylpgfi8),
                dnhbti5 to listOf(mbfrke4, sukksd3),
                mbfrke4 to listOf(debgsw0, uocbrr0, zvkhdm5),
                debgsw0 to listOf(rnbmyz9),
                zvkhdm5 to listOf(kagcmt1, wynujo0, uxccvi0),
                kagcmt1 to listOf(ekodxo7),
                uxccvi0 to listOf(sskzpj2),
                dcpguk5 to listOf(voloow1, zqunlc6),
                voloow1 to listOf(jshupw0, xbgpjo9),
                jshupw0 to listOf(bvesiq8),
                xbgpjo9 to listOf(rzumyo3, hoodwa8, koyjlt8),
                hoodwa8 to listOf(pwbkhy9, ephkfj2, gwopwz2),
                pwbkhy9 to listOf(rkgfjc7),
                gwopwz2 to listOf(ueughp8),
                hqfiir1 to listOf(uhtrvk4, acmbgv6, swdgkn4, nnmusp7, nrfvne2),
                uhtrvk4 to listOf(ymavgo2, hchxgu0),
                ymavgo2 to listOf(qwjyqh6, nuceyr2),
                nuceyr2 to listOf(xdsvwi4),
                swdgkn4 to listOf(jxjbda3),
                nnmusp7 to listOf(ipgnnz7, clltth2, cjhdme8, igcfoe6, ruobyn6),
                clltth2 to listOf(jgftya8, lsdefs3),
                jgftya8 to listOf(tofuwz8),
                lsdefs3 to listOf(dybjok7),
                igcfoe6 to listOf(dvodtw6, brgqnl1, yddsxc6),
                dvodtw6 to listOf(tahnwu9),
                yddsxc6 to listOf(yeteeq0),
                yeteeq0 to listOf(aindqr7),
                nrfvne2 to listOf(vbtgnm5, rwvekh6, fjtjyc5, wtavgr3),
                rwvekh6 to listOf(dlhqsb3, zimwve0),
                dlhqsb3 to listOf(sfpmhm8, xtqzpv9, zntuyv4),
                sfpmhm8 to listOf(yqznit0),
                zntuyv4 to listOf(onqsxr3, hrrhrb2, syrmyp5),
                onqsxr3 to listOf(rpxmak0),
                syrmyp5 to listOf(uknsuk2),
                fjtjyc5 to listOf(fnovyr5, npktxa1),
                fnovyr5 to listOf(bheoue4, mewbij1),
                bheoue4 to listOf(lpnkuq2),
                mewbij1 to listOf(qroiiu2, rytvwb3, exakcx4),
                rytvwb3 to listOf(xzrott5, drkknp7, kqiqcx8),
                xzrott5 to listOf(teibfd4),
                kqiqcx8 to listOf(dlhuaf1),
                vyvvlz9 to listOf(fwecep2),
                zpavte6 to listOf(lphjsa8, xxaftr0, vkzmlx7, dcsjqz9),
                lphjsa8 to listOf(bxfakn2),
                xxaftr0 to listOf(ytxkhe7),
                vkzmlx7 to listOf(iwuleh4, waoauw7, ozrbil5, syjgnw5, usjbei2, ijsfty4, nyrtgf6),
                waoauw7 to listOf(psrvhr4, rvihfz6),
                psrvhr4 to listOf(uulzxc2),
                rvihfz6 to listOf(arhsii2),
                syjgnw5 to listOf(txjjts8, fbfhzg2),
                txjjts8 to listOf(agjtsf8),
                fbfhzg2 to listOf(gczpvu8),
                ijsfty4 to listOf(pqfwwb5, mthzfb5),
                pqfwwb5 to listOf(ighmwo4),
                mthzfb5 to listOf(ucpkiq4),
                dcsjqz9 to listOf(ksiuah5, dwovym2, wrbgdi0, dpbyrt1, gocxvu2, vfifzv7, vzsugm5, eamvtl6),
                dwovym2 to listOf(uelqqh7, gfnyvz0, rpvmmn7),
                gfnyvz0 to listOf(igptdo1, smkxti6, nqukix7),
                smkxti6 to listOf(tajuqn1, ahuzxf8, pcxbmp9),
                tajuqn1 to listOf(neetvn8),
                pcxbmp9 to listOf(thwqzu8),
                rpvmmn7 to listOf(lxdagb1, ybmjbd0, bdwdns1),
                ybmjbd0 to listOf(ikavkb7, aipisn1, dgyrkz5),
                aipisn1 to listOf(hunkka7),
                dgyrkz5 to listOf(pdbhft9, znzrsk0, hdwqat3),
                znzrsk0 to listOf(riykdq2),
                wrbgdi0 to listOf(ealraf4, nfbqdi2, kkjnej7),
                nfbqdi2 to listOf(yevfkm6, ftclnk9, uiogkw1),
                ftclnk9 to listOf(nbftzp7, imzogl6, vhnjdp2),
                nbftzp7 to listOf(pdjyyv0),
                vhnjdp2 to listOf(euqnnx7),
                kkjnej7 to listOf(bbuhry3, lzgeny6, ibdkpi2),
                lzgeny6 to listOf(ohoorc3, xgveyt8, lectru1),
                xgveyt8 to listOf(ejqkmd8),
                lectru1 to listOf(vxnvlu5, oymlmo0, bvqeaj7),
                oymlmo0 to listOf(vwlypv1),
                dpbyrt1 to listOf(vkjlji5, ntthmd8, pjczui9),
                ntthmd8 to listOf(ijkjsv9, mrfgry9, fghbrs3),
                mrfgry9 to listOf(ipysbb7, jvkqps1, ogqxlq1),
                ipysbb7 to listOf(eteqpn8, mofidl7, pjdrwe6),
                eteqpn8 to listOf(ngwcnp9),
                pjdrwe6 to listOf(slvafc6),
                ogqxlq1 to listOf(pkkbht2, aviunp4, npstal4),
                pkkbht2 to listOf(upazcz3, whuxru1, debwov8, kaqxgg6),
                upazcz3 to listOf(cwqlpc9),
                debwov8 to listOf(zisznb7),
                kaqxgg6 to listOf(fnovka4, ssgvlj5),
                npstal4 to listOf(vckrqf5),
                pjczui9 to listOf(naeczq4, knfeyb4, kfrskk6),
                knfeyb4 to listOf(vpapvq6, fkrysj5, ryldml1),
                fkrysj5 to listOf(bjbngd9),
                ryldml1 to listOf(wddsnh0, mogufv7, romret4),
                mogufv7 to listOf(eokwhn4),
                gocxvu2 to listOf(vodjcy9, oyfygg2),
                vodjcy9 to listOf(dqdovf0, wtmqwr3, ytcpxn6),
                dqdovf0 to listOf(vfcejw8, fsfdmv1, dhislg4),
                dhislg4 to listOf(yzflil0),
                ytcpxn6 to listOf(doezvl1),
                vfifzv7 to listOf(ysdpsh4, pmstid7),
                ysdpsh4 to listOf(zbvpqs2, ifptpd5, wcnxpo8),
                zbvpqs2 to listOf(xovvob4),
                wcnxpo8 to listOf(rldojj5, gtixgd8, rmofpu2),
                gtixgd8 to listOf(lyvtje7),
                rmofpu2 to listOf(vglrql0, khkwcn5, bctdyh6, zbovmx0, uzcqyk9),
                khkwcn5 to listOf(txbgts6),
                zbovmx0 to listOf(jfywrb3),
                vzsugm5 to listOf(yfwuls5, gurfzt3),
                yfwuls5 to listOf(dikvxl5, bibhbn8, ohqmqq1, zgodgg0),
                dikvxl5 to listOf(jsdmuh9, olqmdj8, uwkhjk2),
                uwkhjk2 to listOf(ebgthk9),
                ohqmqq1 to listOf(jeuooe4),
                zgodgg0 to listOf(zymhrb9, ntrdna1, sjhlth3),
                ntrdna1 to listOf(ehhgac7, trduoz6, ieomqr2),
                trduoz6 to listOf(hknsob2),
                ieomqr2 to listOf(wlqqip0, dxysyd4),
                rhsoha3 to listOf(rlxlkb8),
                wmephk2 to listOf(ttsntj1, blyblp0, ocqwow4, srcgxj7, bqzdbx3),
                ttsntj1 to listOf(hwwtrj9),
                ocqwow4 to listOf(wahzns4),
                srcgxj7 to listOf(ivnklk9, vrmwdt1, sfdzfw1),
                vrmwdt1 to listOf(olzoqr0, wffmyg1),
                olzoqr0 to listOf(jhkbce9),
                wffmyg1 to listOf(pimxle8),
                bqzdbx3 to listOf(uhcoxr8, ddhxzm3, dhusxz2),
                ddhxzm3 to listOf(ljrqcc0, tlhlol4),
                ljrqcc0 to listOf(jtnrdd0, rheqgd0, uhclxd9, hmooxr3),
                jtnrdd0 to listOf(yypgsy8),
                uhclxd9 to listOf(dxewfr2),
                hmooxr3 to listOf(nmbyqg8, otcbot0, ucllfb5),
                otcbot0 to listOf(zpsema4),
                hfenjy6 to listOf(voeqil3),
                elylip7 to listOf(ojpswt1, ykziek4, uzcggl0, eedqvl7, ujrkjv3),
                ojpswt1 to listOf(mquopd4),
                uzcggl0 to listOf(nwvrmf4),
                eedqvl7 to listOf(wcuglh3, lzzraj5, ptiqch8),
                lzzraj5 to listOf(benhml5, nyaqmc3),
                benhml5 to listOf(fqavpy2),
                nyaqmc3 to listOf(vzuzma2),
                ujrkjv3 to listOf(tluxdd5, hefzku6, jdboqy9),
                hefzku6 to listOf(trpdoy9, qxqzwn9),
                trpdoy9 to listOf(iuftis9, srmckd9, ipgynh6, rpqvpi3),
                iuftis9 to listOf(iholno9),
                ipgynh6 to listOf(rzzwlm0),
                rpqvpi3 to listOf(imqgvl0, xhzcwb8, noadxg0),
                xhzcwb8 to listOf(xgpein0),
                tcsvfs9 to listOf(bpukhb3),
                urzbyo9 to listOf(jnpidy3, eszwsf0, wvwexw8, fascqe7, fnehmr8),
                jnpidy3 to listOf(fqlwka8),
                wvwexw8 to listOf(gyjfei3),
                fascqe7 to listOf(lcfuxf5, hjpkle7),
                fnehmr8 to listOf(jpskwa9, riuggd0, spuomm8),
                riuggd0 to listOf(eiiutw2, ddbkzl7, komstl0),
                ddbkzl7 to listOf(ulmbyq4, uomzvu2, aupuvh6, noxicq9),
                ulmbyq4 to listOf(zekbgm8),
                aupuvh6 to listOf(pueddt4),
                noxicq9 to listOf(zofdrm4, icmndx9),
                qrazxt6 to listOf(edleon6),
                jichzl8 to listOf(ayxsnw0, qutvrx0, kjndap1, aaidcc4, xvmhct7),
                ayxsnw0 to listOf(jgenjy8),
                qutvrx0 to listOf(apzeuc8),
                kjndap1 to listOf(ifxvej9),
                aaidcc4 to listOf(hldlzr1, jrajgj3),
                xvmhct7 to listOf(sfgcta5, oypaee0, orakgx6),
                oypaee0 to listOf(hufccv0, bmjmho2, gsefhq0),
                bmjmho2 to listOf(ozxzes0),
                dthswb0 to listOf(bjcdhm4),
                rzgzdj9 to listOf(uowlsr6, zgpapk0, cuvtsr5, swydgi7, yotjai8),
                uowlsr6 to listOf(srzyza6),
                zgpapk0 to listOf(hgbksd1),
                cuvtsr5 to listOf(vpshpd0),
                swydgi7 to listOf(wxlgje5, iotelk8),
                yotjai8 to listOf(rqlrod9, fjrdle6, czajun2),
                fjrdle6 to listOf(hcjcjy7, aaziev3, ywxlws1),
                aaziev3 to listOf(hoekvt7),
                uqrpnu9 to listOf(fjbljo2),
                xyvpar8 to listOf(jorvqz7, hdoidz2, ehvena6, zfgmbi1, gougfo0, obgepy2),
                jorvqz7 to listOf(jlqeij6),
                ehvena6 to listOf(blgcbx9),
                zfgmbi1 to listOf(mrcgks1, rpdgaf6),
                gougfo0 to listOf(suzjzs9, urwzfu7, ctbrby2, jsvgwf5, eeigxq7, pffhae1),
                urwzfu7 to listOf(vowooc9),
                jsvgwf5 to listOf(nvmeyf7),
                pffhae1 to listOf(zqseta0),
                obgepy2 to listOf(okfdmz4, gwwkci0, igqizj6),
                gwwkci0 to listOf(ikvtmk1, bmtzek1),
                ikvtmk1 to listOf(xsiylt2, qgknya1, uwetch1, nozbls1),
                xsiylt2 to listOf(pvoxnd4),
                uwetch1 to listOf(kjiemo7),
                nozbls1 to listOf(hedmiv3, gzvmla9),
                njhbhu4 to listOf(thjsmq7, vjtenb4, cgjtcx4, hlrqxe5, szhyka9),
                thjsmq7 to listOf(kpjqun1),
                cgjtcx4 to listOf(iixmrw7),
                hlrqxe5 to listOf(ggfwcf8, itifhr2, tuhzhx3),
                itifhr2 to listOf(mqiubu8, loceok0),
                mqiubu8 to listOf(upyjqu2),
                loceok0 to listOf(widsgh6),
                szhyka9 to listOf(fomsqx4, gkplqx3, ghjkxm0),
                gkplqx3 to listOf(cubkbw1, kzxobq8, bscnrk4, prwvvf1, wbkcyc6, nuaplt5, kpxubg0, rlwqya7),
                bscnrk4 to listOf(pjtxrz9),
                prwvvf1 to listOf(uyhmle1),
                nuaplt5 to listOf(dncfdt8),
                rlwqya7 to listOf(jiqwlv2, jvisrb8),
                jiqwlv2 to listOf(djtkcm1, prbvyn1, rgoodb6, xcekkp4),
                djtkcm1 to listOf(gwghiq8),
                rgoodb6 to listOf(qiuyav7),
                xcekkp4 to listOf(bnzitn1, tizhrt8, fxcovd1, sgnngg2, owbuvb6),
                sgnngg2 to listOf(hmiwzg5),
                xgffvx5 to listOf(phrkci7, bddhja2, nephat7, ogbonq9, ghdrge1),
                phrkci7 to listOf(bgudcg9),
                nephat7 to listOf(etlkkr8),
                ogbonq9 to listOf(ecxmqh6, bnhohc3, vnrvyo9),
                bnhohc3 to listOf(xcesgj0, iuclhg2),
                xcesgj0 to listOf(klknfo1),
                iuclhg2 to listOf(eqcmfl1),
                ghdrge1 to listOf(agpufd1, ktgcqb8, ecljgy3),
                ktgcqb8 to listOf(oahpim7, lwppvg5, aufzbe4, ecamxw4, jntkbx1, hegzae8, uacqgp2, uxmwtw4),
                aufzbe4 to listOf(ehguzp8),
                ecamxw4 to listOf(pgjgcc7),
                hegzae8 to listOf(gniuhz9),
                uxmwtw4 to listOf(vphgvb3, ycswxa3),
                vphgvb3 to listOf(bsifpf2, fecmdl6, amjszb8, uyjmov2),
                bsifpf2 to listOf(jcadaa8),
                amjszb8 to listOf(jaksmg2),
                uyjmov2 to listOf(fboxhw4, vnqeut1, xkwlqe6, pwahck1, zjatze1),
                pwahck1 to listOf(podzhq4),
            )
        )
    }

    private fun defineG2() {
        val vepmjs5 = Node("program")
        val rjssrv9 = Node("package_declaration")
        val idervd9 = Node("package")
        val aiezvn4 = Node("scoped_identifier", isDuplicate = true)
        val ttzrww9 = Node("scoped_identifier", isDuplicate = true)
        val ffhwpl5 = Node("scoped_identifier", isDuplicate = true)
        val kkwjid3 = Node("scoped_identifier", isDuplicate = true)
        val dqdofl2 = Node("identifier", isDuplicate = true)
        val ocbous3 = Node("org", isDuplicate = true)
        val orcrdv2 = Node(".", isDuplicate = true)
        val mwfbqr7 = Node("identifier", isDuplicate = true)
        val iqfqtb8 = Node("lsmr", isDuplicate = true)
        val aqvfkz8 = Node(".", isDuplicate = true)
        val mvmuoq0 = Node("identifier", isDuplicate = true)
        val lxspsq6 = Node("vending", isDuplicate = true)
        val lhhbkt6 = Node(".", isDuplicate = true)
        val xddyaz4 = Node("identifier", isDuplicate = true)
        val ncxpfv4 = Node("software3", isDuplicate = true)
        val icjmky4 = Node(".", isDuplicate = true)
        val ozlzcf0 = Node("identifier", isDuplicate = true)
        val drfulc1 = Node("communication")
        val qxhifm2 = Node(";", isDuplicate = true)
        val ufhveh6 = Node("import_declaration", isDuplicate = true)
        val ouyfmv7 = Node("import", isDuplicate = true)
        val auvnod5 = Node("scoped_identifier", isDuplicate = true)
        val eoypmx3 = Node("scoped_identifier", isDuplicate = true)
        val swxdts3 = Node("identifier", isDuplicate = true)
        val tiknvm7 = Node("java", isDuplicate = true)
        val czuvqy6 = Node(".", isDuplicate = true)
        val jxcjom6 = Node("identifier", isDuplicate = true)
        val cmgdnc4 = Node("util", isDuplicate = true)
        val gtienx4 = Node(".", isDuplicate = true)
        val lgqfov2 = Node("identifier", isDuplicate = true)
        val implmg0 = Node("HashMap", isDuplicate = true)
        val jkuwlw4 = Node(";", isDuplicate = true)
        val pkcuxr8 = Node("import_declaration", isDuplicate = true)
        val gfmgfc4 = Node("import", isDuplicate = true)
        val gszbvf4 = Node("scoped_identifier", isDuplicate = true)
        val mmfhwd8 = Node("scoped_identifier", isDuplicate = true)
        val sbblsq5 = Node("identifier", isDuplicate = true)
        val yusycr0 = Node("java", isDuplicate = true)
        val obtxiu9 = Node(".", isDuplicate = true)
        val wnaywb5 = Node("identifier", isDuplicate = true)
        val ykfyhd5 = Node("util", isDuplicate = true)
        val xtzwlr7 = Node(".", isDuplicate = true)
        val mwmmrq5 = Node("identifier", isDuplicate = true)
        val swruuf4 = Node("HashSet", isDuplicate = true)
        val bxhuwh0 = Node(";", isDuplicate = true)
        val slkahp9 = Node("import_declaration", isDuplicate = true)
        val jiloft4 = Node("import", isDuplicate = true)
        val jczrpa8 = Node("scoped_identifier", isDuplicate = true)
        val vllthi3 = Node("scoped_identifier", isDuplicate = true)
        val phnnsf5 = Node("identifier", isDuplicate = true)
        val zsybzn9 = Node("java", isDuplicate = true)
        val muekfm3 = Node(".", isDuplicate = true)
        val hmfayf4 = Node("identifier", isDuplicate = true)
        val ikqhbw8 = Node("util", isDuplicate = true)
        val pntbcw7 = Node(".", isDuplicate = true)
        val ylgihj6 = Node("identifier", isDuplicate = true)
        val xbsmyj7 = Node("Map", isDuplicate = true)
        val pcpzfc0 = Node(";", isDuplicate = true)
        val paxesj1 = Node("import_declaration", isDuplicate = true)
        val wxbari6 = Node("import", isDuplicate = true)
        val ftisge1 = Node("scoped_identifier", isDuplicate = true)
        val wmahee2 = Node("scoped_identifier", isDuplicate = true)
        val jhwcaw4 = Node("identifier", isDuplicate = true)
        val wcbmza6 = Node("java", isDuplicate = true)
        val wcoggu3 = Node(".", isDuplicate = true)
        val bznwyd7 = Node("identifier", isDuplicate = true)
        val pcwawx9 = Node("util", isDuplicate = true)
        val ebhhne6 = Node(".", isDuplicate = true)
        val cljaoj7 = Node("identifier", isDuplicate = true)
        val hqgaeu3 = Node("Set", isDuplicate = true)
        val kkaibp2 = Node(";", isDuplicate = true)
        val qhlplr9 = Node("import_declaration", isDuplicate = true)
        val orvrss9 = Node("import", isDuplicate = true)
        val kbbqfj2 = Node("scoped_identifier", isDuplicate = true)
        val mdydmk2 = Node("scoped_identifier", isDuplicate = true)
        val eeocnj1 = Node("scoped_identifier", isDuplicate = true)
        val rpqkzu4 = Node("scoped_identifier", isDuplicate = true)
        val qhzopk1 = Node("identifier", isDuplicate = true)
        val jilnfn4 = Node("org", isDuplicate = true)
        val rvhnga0 = Node(".", isDuplicate = true)
        val fwwffm1 = Node("identifier", isDuplicate = true)
        val wcmqzq8 = Node("lsmr", isDuplicate = true)
        val medskb5 = Node(".", isDuplicate = true)
        val zyxcqi9 = Node("identifier", isDuplicate = true)
        val yovgyq7 = Node("vending", isDuplicate = true)
        val zojige0 = Node(".", isDuplicate = true)
        val othqiy3 = Node("identifier", isDuplicate = true)
        val rwvbgc5 = Node("hardware", isDuplicate = true)
        val kbqidj5 = Node(".", isDuplicate = true)
        val adgesc7 = Node("identifier", isDuplicate = true)
        val vfjiwa1 = Node("Display", isDuplicate = true)
        val lmnjry2 = Node(";", isDuplicate = true)
        val ltrtmf9 = Node("import_declaration", isDuplicate = true)
        val luzqcm2 = Node("import", isDuplicate = true)
        val hvusfy6 = Node("scoped_identifier", isDuplicate = true)
        val dtymcv0 = Node("scoped_identifier", isDuplicate = true)
        val gurowi3 = Node("scoped_identifier", isDuplicate = true)
        val ktfcrn4 = Node("scoped_identifier", isDuplicate = true)
        val eumfak9 = Node("identifier", isDuplicate = true)
        val gyimat0 = Node("org", isDuplicate = true)
        val qkhmut5 = Node(".", isDuplicate = true)
        val nmlpgg4 = Node("identifier", isDuplicate = true)
        val elydhv1 = Node("lsmr", isDuplicate = true)
        val xmjuwg5 = Node(".", isDuplicate = true)
        val tsipwi9 = Node("identifier", isDuplicate = true)
        val cnakyj3 = Node("vending", isDuplicate = true)
        val fgvqet2 = Node(".", isDuplicate = true)
        val sjazcq4 = Node("identifier", isDuplicate = true)
        val gzangt3 = Node("hardware", isDuplicate = true)
        val gefjqu0 = Node(".", isDuplicate = true)
        val jdkigc5 = Node("identifier", isDuplicate = true)
        val zzvxjb6 = Node("SelectionButton", isDuplicate = true)
        val hrhsec6 = Node(";", isDuplicate = true)
        val xnrnur4 = Node("import_declaration", isDuplicate = true)
        val tyylmm2 = Node("import", isDuplicate = true)
        val nohojs3 = Node("scoped_identifier", isDuplicate = true)
        val ecbmil0 = Node("scoped_identifier", isDuplicate = true)
        val jndgmf7 = Node("scoped_identifier", isDuplicate = true)
        val jdmxnt7 = Node("scoped_identifier", isDuplicate = true)
        val dsztgg5 = Node("identifier", isDuplicate = true)
        val pnwsza5 = Node("org", isDuplicate = true)
        val xjzpwx4 = Node(".", isDuplicate = true)
        val fxsxsp1 = Node("identifier", isDuplicate = true)
        val xzmgst1 = Node("lsmr", isDuplicate = true)
        val nipzfr9 = Node(".", isDuplicate = true)
        val oioiws3 = Node("identifier", isDuplicate = true)
        val vwgmnk0 = Node("vending", isDuplicate = true)
        val sncujc2 = Node(".", isDuplicate = true)
        val hvsyws3 = Node("identifier", isDuplicate = true)
        val ezyxpf4 = Node("hardware", isDuplicate = true)
        val begran7 = Node(".", isDuplicate = true)
        val drqjfv8 = Node("identifier", isDuplicate = true)
        val tfyhbn9 = Node("SelectionButtonListener", isDuplicate = true)
        val obwero7 = Node(";", isDuplicate = true)
        val usmbty6 = Node("import_declaration", isDuplicate = true)
        val thqgyx4 = Node("import", isDuplicate = true)
        val dtqaeg2 = Node("scoped_identifier", isDuplicate = true)
        val kxfedu5 = Node("scoped_identifier", isDuplicate = true)
        val pxpmja8 = Node("scoped_identifier", isDuplicate = true)
        val xhlcmm8 = Node("scoped_identifier", isDuplicate = true)
        val jumbna1 = Node("identifier", isDuplicate = true)
        val booiwl1 = Node("org", isDuplicate = true)
        val slkyxz6 = Node(".", isDuplicate = true)
        val hbpbkn0 = Node("identifier", isDuplicate = true)
        val dstiuz4 = Node("lsmr", isDuplicate = true)
        val qxmsjk3 = Node(".", isDuplicate = true)
        val wtitik8 = Node("identifier", isDuplicate = true)
        val onkgxx3 = Node("vending", isDuplicate = true)
        val glexcp2 = Node(".", isDuplicate = true)
        val bsnhyz7 = Node("identifier", isDuplicate = true)
        val vkcwlg0 = Node("hardware", isDuplicate = true)
        val aysdcb6 = Node(".", isDuplicate = true)
        val vuexvp0 = Node("identifier", isDuplicate = true)
        val ljhcva1 = Node("VendingMachine", isDuplicate = true)
        val vcqsch7 = Node(";", isDuplicate = true)
        val gmomkn0 = Node("import_declaration", isDuplicate = true)
        val oudtvk2 = Node("import", isDuplicate = true)
        val beejfz9 = Node("scoped_identifier", isDuplicate = true)
        val gpszlz4 = Node("scoped_identifier", isDuplicate = true)
        val hqgjyg2 = Node("scoped_identifier", isDuplicate = true)
        val kvyvfn0 = Node("scoped_identifier", isDuplicate = true)
        val dbiqmi0 = Node("identifier", isDuplicate = true)
        val lhwchm3 = Node("org", isDuplicate = true)
        val uitrhr4 = Node(".", isDuplicate = true)
        val hfxscp4 = Node("identifier", isDuplicate = true)
        val ijcmvw8 = Node("lsmr", isDuplicate = true)
        val opginq0 = Node(".", isDuplicate = true)
        val zaaxhm2 = Node("identifier", isDuplicate = true)
        val xlvvrs6 = Node("vending", isDuplicate = true)
        val woccoq5 = Node(".", isDuplicate = true)
        val hqfkoj4 = Node("identifier", isDuplicate = true)
        val wzsorz4 = Node("software3", isDuplicate = true)
        val ducwui5 = Node(".", isDuplicate = true)
        val eyfczt8 = Node("identifier", isDuplicate = true)
        val csnzzs0 = Node("Product", isDuplicate = true)
        val ylhjjb7 = Node(";", isDuplicate = true)
        val whsles7 = Node("block_comment", isDuplicate = true)
        val jiyvof4 = Node("/**\n* Contains all communication functionality, which currently means, it deals\n* with users' selections and the display.\n*\n* @author Robert J. Walker\n*/")
        val lmkjsu2 = Node("class_declaration", isDuplicate = true)
        val izquvz7 = Node("modifiers", isDuplicate = true)
        val ihzufq1 = Node("public", isDuplicate = true)
        val ycweeu3 = Node("class", isDuplicate = true)
        val rroogg8 = Node("identifier", isDuplicate = true)
        val qhwcxc4 = Node("Communications", isDuplicate = true)
        val eogerq8 = Node("class_body", isDuplicate = true)
        val dxsasf4 = Node("{", isDuplicate = true)
        val pbvunb1 = Node("field_declaration", isDuplicate = true)
        val omouyr8 = Node("modifiers", isDuplicate = true)
        val dcaddg6 = Node("private", isDuplicate = true)
        val drljjq0 = Node("final", isDuplicate = true)
        val kumevo2 = Node("type_identifier", isDuplicate = true)
        val kiyevc1 = Node("Display", isDuplicate = true)
        val crzcbd0 = Node("variable_declarator", isDuplicate = true)
        val objqly9 = Node("identifier", isDuplicate = true)
        val lanrcq7 = Node("display", isDuplicate = true)
        val odjqbl7 = Node(";", isDuplicate = true)
        val zavyro6 = Node("field_declaration", isDuplicate = true)
        val yoghgp4 = Node("modifiers", isDuplicate = true)
        val xtargj2 = Node("private", isDuplicate = true)
        val knvoqq1 = Node("final", isDuplicate = true)
        val bythfo1 = Node("generic_type", isDuplicate = true)
        val gunvsn1 = Node("type_identifier", isDuplicate = true)
        val rutigq5 = Node("Set", isDuplicate = true)
        val zanxqi7 = Node("type_arguments", isDuplicate = true)
        val hlbiqt0 = Node("<", isDuplicate = true)
        val nvkyvs5 = Node("type_identifier", isDuplicate = true)
        val bgwdlo3 = Node("CommunicationListener", isDuplicate = true)
        val ylcdjv6 = Node(">", isDuplicate = true)
        val rpwbmv6 = Node("variable_declarator", isDuplicate = true)
        val xabhrc7 = Node("identifier", isDuplicate = true)
        val lexaby2 = Node("listeners", isDuplicate = true)
        val hyluww5 = Node("=", isDuplicate = true)
        val yxyszw9 = Node("object_creation_expression", isDuplicate = true)
        val rqzdlp3 = Node("new", isDuplicate = true)
        val rknucs9 = Node("generic_type", isDuplicate = true)
        val yeebtu4 = Node("type_identifier", isDuplicate = true)
        val gfkofp2 = Node("HashSet", isDuplicate = true)
        val xtgeor9 = Node("type_arguments", isDuplicate = true)
        val rygwhz2 = Node("<", isDuplicate = true)
        val rnscuu9 = Node(">", isDuplicate = true)
        val joqqwu3 = Node("argument_list", isDuplicate = true)
        val yyqaqt6 = Node("(", isDuplicate = true)
        val ygdbyf1 = Node(")", isDuplicate = true)
        val ftwyzc5 = Node(";", isDuplicate = true)
        val tzxdxy4 = Node("field_declaration", isDuplicate = true)
        val xvifmj3 = Node("modifiers", isDuplicate = true)
        val frjogl9 = Node("private", isDuplicate = true)
        val pgfoqj1 = Node("generic_type", isDuplicate = true)
        val drifwd4 = Node("type_identifier", isDuplicate = true)
        val scyhwe3 = Node("Map", isDuplicate = true)
        val lwdxjz0 = Node("type_arguments", isDuplicate = true)
        val zvxskc4 = Node("<", isDuplicate = true)
        val xqltub7 = Node("type_identifier", isDuplicate = true)
        val fhmbwh3 = Node("SelectionButton", isDuplicate = true)
        val ocmoqm1 = Node(",", isDuplicate = true)
        val htchpe7 = Node("type_identifier", isDuplicate = true)
        val emxxxt5 = Node("Product", isDuplicate = true)
        val dtfwjt5 = Node(">", isDuplicate = true)
        val zxdsdt2 = Node("variable_declarator", isDuplicate = true)
        val nmwedm2 = Node("identifier", isDuplicate = true)
        val layesz5 = Node("buttonToProductBindings", isDuplicate = true)
        val igcaro4 = Node("=", isDuplicate = true)
        val sumyia9 = Node("object_creation_expression", isDuplicate = true)
        val eiqxag2 = Node("new", isDuplicate = true)
        val gtgfyl5 = Node("generic_type", isDuplicate = true)
        val dcxbhk9 = Node("type_identifier", isDuplicate = true)
        val gpcjeq2 = Node("HashMap", isDuplicate = true)
        val vjvlxz8 = Node("type_arguments", isDuplicate = true)
        val dbzwnt2 = Node("<", isDuplicate = true)
        val zovugx5 = Node(">", isDuplicate = true)
        val zkpshj2 = Node("argument_list", isDuplicate = true)
        val oezrxv1 = Node("(", isDuplicate = true)
        val tgcrau7 = Node(")", isDuplicate = true)
        val kvgvgw8 = Node(";", isDuplicate = true)
        val czyofm8 = Node("class_declaration", isDuplicate = true)
        val cvvdpu1 = Node("modifiers", isDuplicate = true)
        val losbis0 = Node("private", isDuplicate = true)
        val szkdjx7 = Node("class", isDuplicate = true)
        val qzqkjl0 = Node("identifier", isDuplicate = true)
        val orbnnp3 = Node("InnerListener", isDuplicate = true)
        val gyapzk4 = Node("super_interfaces")
        val enymtr4 = Node("implements")
        val yopblc2 = Node("type_list")
        val csuwwv6 = Node("type_identifier", isDuplicate = true)
        val afmrwi6 = Node("SelectionButtonListener", isDuplicate = true)
        val jkaioc1 = Node("class_body", isDuplicate = true)
        val zhtzmp7 = Node("{", isDuplicate = true)
        val wuifie5 = Node("method_declaration", isDuplicate = true)
        val kizuia1 = Node("modifiers", isDuplicate = true)
        val qqzevh5 = Node("marker_annotation")
        val vnlivn0 = Node("@")
        val dkmvwe9 = Node("identifier", isDuplicate = true)
        val ruupou4 = Node("Override")
        val vjvdbk9 = Node("public", isDuplicate = true)
        val dtpieh5 = Node("void_type", isDuplicate = true)
        val nomeda0 = Node("identifier", isDuplicate = true)
        val ipzhcn4 = Node("pressed")
        val lcafpu9 = Node("formal_parameters", isDuplicate = true)
        val emtqyp3 = Node("(", isDuplicate = true)
        val vzmwhh0 = Node("formal_parameter", isDuplicate = true)
        val sgkpzp9 = Node("type_identifier", isDuplicate = true)
        val dlrypg6 = Node("SelectionButton", isDuplicate = true)
        val iiwtwa5 = Node("identifier", isDuplicate = true)
        val menaqu3 = Node("button", isDuplicate = true)
        val qmqpgq3 = Node(")", isDuplicate = true)
        val xxzsyj0 = Node("block", isDuplicate = true)
        val klnxsk4 = Node("{", isDuplicate = true)
        val ukkzbi0 = Node("expression_statement", isDuplicate = true)
        val zxdbvr2 = Node("method_invocation", isDuplicate = true)
        val nvggev6 = Node("identifier", isDuplicate = true)
        val wczhlb7 = Node("notifySelected", isDuplicate = true)
        val fqzrwa4 = Node("argument_list", isDuplicate = true)
        val foqsrd3 = Node("(", isDuplicate = true)
        val xtknia8 = Node("method_invocation", isDuplicate = true)
        val cwrxvr8 = Node("identifier", isDuplicate = true)
        val ukzqqn5 = Node("buttonToProductBindings", isDuplicate = true)
        val txtaau6 = Node(".", isDuplicate = true)
        val wlijtw7 = Node("identifier", isDuplicate = true)
        val cbewgw4 = Node("get")
        val evikuq5 = Node("argument_list", isDuplicate = true)
        val xrrxbc8 = Node("(", isDuplicate = true)
        val mnzxfg8 = Node("identifier", isDuplicate = true)
        val naoehu0 = Node("button", isDuplicate = true)
        val ldjaqn2 = Node(")", isDuplicate = true)
        val dkpybm5 = Node(")", isDuplicate = true)
        val zjdvrh1 = Node(";", isDuplicate = true)
        val xbkqyh6 = Node("}", isDuplicate = true)
        val hhlcgj9 = Node("}", isDuplicate = true)
        val qkqwpl4 = Node("block_comment", isDuplicate = true)
        val ghweuw0 = Node("/**\n* Basic constructor.\n* \n* @param vendingMachine\n* The device facade to be used to implement low-level functionality.\n /")
        val tcgmxr6 = Node("constructor_declaration")
        val eiitll5 = Node("modifiers", isDuplicate = true)
        val aliaxc6 = Node("public", isDuplicate = true)
        val xnljib0 = Node("identifier", isDuplicate = true)
        val tdadef8 = Node("Communications", isDuplicate = true)
        val neoqwa1 = Node("formal_parameters", isDuplicate = true)
        val ztfegf1 = Node("(", isDuplicate = true)
        val lcfoqw6 = Node("formal_parameter", isDuplicate = true)
        val ucmnig5 = Node("type_identifier", isDuplicate = true)
        val csdxmb3 = Node("VendingMachine", isDuplicate = true)
        val niaoea1 = Node("identifier", isDuplicate = true)
        val nulady6 = Node("vendingMachine", isDuplicate = true)
        val vudbhb3 = Node(")", isDuplicate = true)
        val obpsow8 = Node("constructor_body")
        val qjynrl1 = Node("{", isDuplicate = true)
        val mgszxp6 = Node("local_variable_declaration", isDuplicate = true)
        val vdxcoo4 = Node("type_identifier", isDuplicate = true)
        val hwrjtm5 = Node("InnerListener", isDuplicate = true)
        val bcjduj1 = Node("variable_declarator", isDuplicate = true)
        val hegsgl5 = Node("identifier", isDuplicate = true)
        val alosmy1 = Node("innerListener", isDuplicate = true)
        val vohdhk3 = Node("=", isDuplicate = true)
        val bryshd1 = Node("object_creation_expression", isDuplicate = true)
        val hryjgu7 = Node("new", isDuplicate = true)
        val ctohlm6 = Node("type_identifier", isDuplicate = true)
        val adjmqw5 = Node("InnerListener", isDuplicate = true)
        val tlveyg8 = Node("argument_list", isDuplicate = true)
        val zuiwdh6 = Node("(", isDuplicate = true)
        val lvsazt8 = Node(")", isDuplicate = true)
        val zvorpx9 = Node(";", isDuplicate = true)
        val aolbua8 = Node("local_variable_declaration", isDuplicate = true)
        val uxkvnz9 = Node("integral_type", isDuplicate = true)
        val ycgdvw3 = Node("int", isDuplicate = true)
        val kfwilc3 = Node("variable_declarator", isDuplicate = true)
        val bjsdsf1 = Node("identifier", isDuplicate = true)
        val oldgmm4 = Node("count", isDuplicate = true)
        val rxnzdd8 = Node("=", isDuplicate = true)
        val aljvdy4 = Node("method_invocation", isDuplicate = true)
        val qzdbam3 = Node("identifier", isDuplicate = true)
        val rfyukm7 = Node("vendingMachine", isDuplicate = true)
        val xdntok4 = Node(".", isDuplicate = true)
        val fyqklw1 = Node("identifier", isDuplicate = true)
        val ctawiz1 = Node("getNumberOfSelectionButtons")
        val qyvvvc0 = Node("argument_list", isDuplicate = true)
        val onpmhs4 = Node("(", isDuplicate = true)
        val unnvdb7 = Node(")", isDuplicate = true)
        val osnkxu6 = Node(";", isDuplicate = true)
        val bqhjxy2 = Node("for_statement")
        val jdofsc4 = Node("for", isDuplicate = true)
        val hnqiyo0 = Node("(", isDuplicate = true)
        val pquozu3 = Node("local_variable_declaration", isDuplicate = true)
        val mcjite5 = Node("integral_type", isDuplicate = true)
        val cdxpwn5 = Node("int", isDuplicate = true)
        val aljezw6 = Node("variable_declarator", isDuplicate = true)
        val batatv2 = Node("identifier", isDuplicate = true)
        val sassek2 = Node("i", isDuplicate = true)
        val vnrrqp6 = Node("=", isDuplicate = true)
        val tzdvcu4 = Node("decimal_integer_literal")
        val dfmcta3 = Node("0")
        val xwfqte9 = Node(";", isDuplicate = true)
        val xznwpk8 = Node("binary_expression")
        val pgkynr2 = Node("identifier", isDuplicate = true)
        val glzuxw1 = Node("i", isDuplicate = true)
        val otajwx4 = Node("<", isDuplicate = true)
        val zgsobs4 = Node("identifier", isDuplicate = true)
        val hzyfaw7 = Node("count", isDuplicate = true)
        val ulrckn2 = Node(";", isDuplicate = true)
        val nlzaee5 = Node("update_expression")
        val jhwgmv3 = Node("identifier", isDuplicate = true)
        val sxkyyf7 = Node("i", isDuplicate = true)
        val thocqd9 = Node("++")
        val ktpqdl4 = Node(")", isDuplicate = true)
        val qbjsvx2 = Node("expression_statement", isDuplicate = true)
        val vufnkj2 = Node("method_invocation", isDuplicate = true)
        val tlwtur8 = Node("method_invocation", isDuplicate = true)
        val bmljpr3 = Node("identifier", isDuplicate = true)
        val bvjmuk4 = Node("vendingMachine", isDuplicate = true)
        val ktloth4 = Node(".", isDuplicate = true)
        val jmhjyw2 = Node("identifier", isDuplicate = true)
        val atxodg0 = Node("getSelectionButton")
        val prqagd9 = Node("argument_list", isDuplicate = true)
        val araefw4 = Node("(", isDuplicate = true)
        val ldxbqd0 = Node("identifier", isDuplicate = true)
        val ceymks0 = Node("i", isDuplicate = true)
        val xtzyrs0 = Node(")", isDuplicate = true)
        val sbiiow0 = Node(".", isDuplicate = true)
        val tmslwd0 = Node("identifier", isDuplicate = true)
        val ooruxf4 = Node("register", isDuplicate = true)
        val ipskap8 = Node("argument_list", isDuplicate = true)
        val cpfpcl4 = Node("(", isDuplicate = true)
        val ssrkfw4 = Node("identifier", isDuplicate = true)
        val swkkjd8 = Node("innerListener", isDuplicate = true)
        val rbhqnc9 = Node(")", isDuplicate = true)
        val kxjkgb7 = Node(";", isDuplicate = true)
        val smwcut5 = Node("expression_statement", isDuplicate = true)
        val szxxlm4 = Node("assignment_expression")
        val hhmrwu4 = Node("identifier", isDuplicate = true)
        val dedcqz8 = Node("display", isDuplicate = true)
        val mqdluv7 = Node("=", isDuplicate = true)
        val hptcyt5 = Node("method_invocation", isDuplicate = true)
        val vwlzqw1 = Node("identifier", isDuplicate = true)
        val smvvuj5 = Node("vendingMachine", isDuplicate = true)
        val hbvnwy1 = Node(".", isDuplicate = true)
        val xvczwy7 = Node("identifier", isDuplicate = true)
        val nvvwti8 = Node("getDisplay")
        val evwpql5 = Node("argument_list", isDuplicate = true)
        val aettzs3 = Node("(", isDuplicate = true)
        val eiqbbf2 = Node(")", isDuplicate = true)
        val hpvgql4 = Node(";", isDuplicate = true)
        val nrxsuo7 = Node("}", isDuplicate = true)
        val jxfcmq5 = Node("block_comment", isDuplicate = true)
        val bimobb0 = Node("/**\n* Permits bindings between {@link SelectionButton}s and {@link Product} s to be\n* specified.\n* \n* @param bindings\n* A map of the bindings from {@link SelectionButton}s to\n* {@link Product}s. More than one {@link SelectionButton} can map to\n* a given {@link Product}. */")
        val briyqw8 = Node("method_declaration", isDuplicate = true)
        val uzducf9 = Node("modifiers", isDuplicate = true)
        val sapwtz9 = Node("public", isDuplicate = true)
        val vodazk5 = Node("void_type", isDuplicate = true)
        val hqvtsa8 = Node("identifier", isDuplicate = true)
        val waeaxr1 = Node("configure")
        val zfxszi4 = Node("formal_parameters", isDuplicate = true)
        val rmaqha8 = Node("(", isDuplicate = true)
        val tjxmwk3 = Node("formal_parameter", isDuplicate = true)
        val jkmqje0 = Node("generic_type", isDuplicate = true)
        val lxvyee0 = Node("type_identifier", isDuplicate = true)
        val yrqktx6 = Node("Map", isDuplicate = true)
        val zlgrbl4 = Node("type_arguments", isDuplicate = true)
        val lsurol6 = Node("<", isDuplicate = true)
        val vratru2 = Node("type_identifier", isDuplicate = true)
        val mnrvjc0 = Node("SelectionButton", isDuplicate = true)
        val llcsyz5 = Node(",", isDuplicate = true)
        val lalqfz4 = Node("type_identifier", isDuplicate = true)
        val lcptel9 = Node("Product", isDuplicate = true)
        val vzbswe8 = Node(">", isDuplicate = true)
        val bqyrig8 = Node("identifier", isDuplicate = true)
        val qkrwxo9 = Node("bindings", isDuplicate = true)
        val hocgzj3 = Node(")", isDuplicate = true)
        val coksoa2 = Node("block", isDuplicate = true)
        val ddcmzd9 = Node("{", isDuplicate = true)
        val krgukm5 = Node("expression_statement", isDuplicate = true)
        val puynjn5 = Node("method_invocation", isDuplicate = true)
        val zduhpt4 = Node("field_access")
        val qcjeyy8 = Node("this", isDuplicate = true)
        val fffadh5 = Node(".", isDuplicate = true)
        val zcxiof3 = Node("identifier", isDuplicate = true)
        val rqkaby8 = Node("buttonToProductBindings", isDuplicate = true)
        val iqbmci8 = Node(".", isDuplicate = true)
        val wvqone6 = Node("identifier", isDuplicate = true)
        val tqxwpj2 = Node("putAll")
        val pozdwo8 = Node("argument_list", isDuplicate = true)
        val kcvjex6 = Node("(", isDuplicate = true)
        val dlvtfu7 = Node("identifier", isDuplicate = true)
        val xmdjse7 = Node("bindings", isDuplicate = true)
        val zihwel0 = Node(")", isDuplicate = true)
        val vplymb1 = Node(";", isDuplicate = true)
        val rrmces1 = Node("}", isDuplicate = true)
        val mquakq2 = Node("block_comment", isDuplicate = true)
        val oknmhc4 = Node("/**\n* Registers the given listener so that it will receive events from this\n* communication facade.\n* \n* @param listener\n* The listener to be registered. If it is already registered, this\n* call has no effect.\n /")
        val reymgm6 = Node("method_declaration", isDuplicate = true)
        val bysnsw9 = Node("modifiers", isDuplicate = true)
        val fhthco4 = Node("public", isDuplicate = true)
        val ofysrg4 = Node("void_type", isDuplicate = true)
        val bxsnyh5 = Node("identifier", isDuplicate = true)
        val heqhkl3 = Node("register", isDuplicate = true)
        val obqnzd0 = Node("formal_parameters", isDuplicate = true)
        val iskeez6 = Node("(", isDuplicate = true)
        val qhtdyq2 = Node("formal_parameter", isDuplicate = true)
        val mpxall2 = Node("type_identifier", isDuplicate = true)
        val zxefcy4 = Node("CommunicationListener", isDuplicate = true)
        val vxnnqk6 = Node("identifier", isDuplicate = true)
        val ukxpol6 = Node("listener", isDuplicate = true)
        val zvfjis2 = Node(")", isDuplicate = true)
        val tdtcrk9 = Node("block", isDuplicate = true)
        val bmrcwj6 = Node("{", isDuplicate = true)
        val xiotdl8 = Node("expression_statement", isDuplicate = true)
        val jesvmk9 = Node("method_invocation", isDuplicate = true)
        val wzojnr9 = Node("identifier", isDuplicate = true)
        val sjczcb3 = Node("listeners", isDuplicate = true)
        val vmflte3 = Node(".", isDuplicate = true)
        val dbwmow9 = Node("identifier", isDuplicate = true)
        val xdavmk0 = Node("add")
        val xuxxse4 = Node("argument_list", isDuplicate = true)
        val jkadht3 = Node("(", isDuplicate = true)
        val dxuwwv9 = Node("identifier", isDuplicate = true)
        val gimvgf2 = Node("listener", isDuplicate = true)
        val gwiddq8 = Node(")", isDuplicate = true)
        val wfcdbw1 = Node(";", isDuplicate = true)
        val kcexdh1 = Node("}", isDuplicate = true)
        val tgbsee4 = Node("block_comment", isDuplicate = true)
        val ohrpol9 = Node("/**\n* Communicates the indicated message.\n* \n* @param message\n* The message to communicate. */")
        val jwvyzu4 = Node("method_declaration", isDuplicate = true)
        val ogsdmf1 = Node("modifiers", isDuplicate = true)
        val mpcdgm3 = Node("public", isDuplicate = true)
        val buabnw1 = Node("void_type", isDuplicate = true)
        val ptxxkb0 = Node("identifier", isDuplicate = true)
        val zrfulj1 = Node("sendMessage")
        val huqnqs1 = Node("formal_parameters", isDuplicate = true)
        val hlqsje1 = Node("(", isDuplicate = true)
        val jpkndx7 = Node("formal_parameter", isDuplicate = true)
        val lrsjyg4 = Node("type_identifier", isDuplicate = true)
        val ccodoq1 = Node("String")
        val dbuzkt5 = Node("identifier", isDuplicate = true)
        val ckqzek2 = Node("message", isDuplicate = true)
        val zykqzu8 = Node(")", isDuplicate = true)
        val apzjrv6 = Node("block", isDuplicate = true)
        val qijmui1 = Node("{", isDuplicate = true)
        val hhhkeo1 = Node("expression_statement", isDuplicate = true)
        val iemjnn5 = Node("method_invocation", isDuplicate = true)
        val bkenps7 = Node("identifier", isDuplicate = true)
        val qkxklt7 = Node("display", isDuplicate = true)
        val kgqlmu7 = Node(".", isDuplicate = true)
        val cmvapf4 = Node("identifier", isDuplicate = true)
        val jwdihc1 = Node("display", isDuplicate = true)
        val wgorfn2 = Node("argument_list", isDuplicate = true)
        val bhscnx8 = Node("(", isDuplicate = true)
        val lwrjkq4 = Node("identifier", isDuplicate = true)
        val coxybq8 = Node("message", isDuplicate = true)
        val vmitlb5 = Node(")", isDuplicate = true)
        val yirluy4 = Node(";", isDuplicate = true)
        val mfciqg9 = Node("}", isDuplicate = true)
        val wczdrg3 = Node("method_declaration", isDuplicate = true)
        val qxuved6 = Node("modifiers", isDuplicate = true)
        val blsaiy5 = Node("private", isDuplicate = true)
        val ukcntd4 = Node("void_type", isDuplicate = true)
        val wravrl5 = Node("identifier", isDuplicate = true)
        val bzplfs6 = Node("notifySelected", isDuplicate = true)
        val ijkgld2 = Node("formal_parameters", isDuplicate = true)
        val ecxyli2 = Node("(", isDuplicate = true)
        val imnmmk7 = Node("formal_parameter", isDuplicate = true)
        val baxzvo4 = Node("type_identifier", isDuplicate = true)
        val guysct3 = Node("Product", isDuplicate = true)
        val mjwsxr4 = Node("identifier", isDuplicate = true)
        val lloncq4 = Node("pk", isDuplicate = true)
        val uwuwxg1 = Node(")", isDuplicate = true)
        val vturtr4 = Node("block", isDuplicate = true)
        val tdllhq4 = Node("{", isDuplicate = true)
        val jjilgs1 = Node("enhanced_for_statement")
        val ysnbvx7 = Node("for", isDuplicate = true)
        val bvjekv4 = Node("(", isDuplicate = true)
        val nykjww2 = Node("type_identifier", isDuplicate = true)
        val vdtmcz9 = Node("CommunicationListener", isDuplicate = true)
        val harlzr2 = Node("identifier", isDuplicate = true)
        val dywups9 = Node("listener", isDuplicate = true)
        val tnthho3 = Node(":")
        val iwfyvc7 = Node("identifier", isDuplicate = true)
        val qblwpp4 = Node("listeners", isDuplicate = true)
        val yzyael9 = Node(")", isDuplicate = true)
        val vjevxs6 = Node("expression_statement", isDuplicate = true)
        val yadibk0 = Node("method_invocation", isDuplicate = true)
        val vbnlvm9 = Node("identifier", isDuplicate = true)
        val rwhnme1 = Node("listener", isDuplicate = true)
        val auocex7 = Node(".", isDuplicate = true)
        val ufoavw0 = Node("identifier", isDuplicate = true)
        val ikpecz3 = Node("selected")
        val podjqe6 = Node("argument_list", isDuplicate = true)
        val pbaqab3 = Node("(", isDuplicate = true)
        val xghvqy5 = Node("this", isDuplicate = true)
        val hbkhex8 = Node(",", isDuplicate = true)
        val ztdwib9 = Node("identifier", isDuplicate = true)
        val soqzks4 = Node("pk", isDuplicate = true)
        val dwdzbv2 = Node(")", isDuplicate = true)
        val rolfnj6 = Node(";", isDuplicate = true)
        val qnnesy1 = Node("}", isDuplicate = true)
        val yhzkvd9 = Node("}", isDuplicate = true)

        graph2 = Graph.from(
            nodes = listOf(vepmjs5, rjssrv9, idervd9, aiezvn4, ttzrww9, ffhwpl5, kkwjid3, dqdofl2, ocbous3, orcrdv2, mwfbqr7, iqfqtb8, aqvfkz8, mvmuoq0, lxspsq6, lhhbkt6, xddyaz4, ncxpfv4, icjmky4, ozlzcf0, drfulc1, qxhifm2, ufhveh6, ouyfmv7, auvnod5, eoypmx3, swxdts3, tiknvm7, czuvqy6, jxcjom6, cmgdnc4, gtienx4, lgqfov2, implmg0, jkuwlw4, pkcuxr8, gfmgfc4, gszbvf4, mmfhwd8, sbblsq5, yusycr0, obtxiu9, wnaywb5, ykfyhd5, xtzwlr7, mwmmrq5, swruuf4, bxhuwh0, slkahp9, jiloft4, jczrpa8, vllthi3, phnnsf5, zsybzn9, muekfm3, hmfayf4, ikqhbw8, pntbcw7, ylgihj6, xbsmyj7, pcpzfc0, paxesj1, wxbari6, ftisge1, wmahee2, jhwcaw4, wcbmza6, wcoggu3, bznwyd7, pcwawx9, ebhhne6, cljaoj7, hqgaeu3, kkaibp2, qhlplr9, orvrss9, kbbqfj2, mdydmk2, eeocnj1, rpqkzu4, qhzopk1, jilnfn4, rvhnga0, fwwffm1, wcmqzq8, medskb5, zyxcqi9, yovgyq7, zojige0, othqiy3, rwvbgc5, kbqidj5, adgesc7, vfjiwa1, lmnjry2, ltrtmf9, luzqcm2, hvusfy6, dtymcv0, gurowi3, ktfcrn4, eumfak9, gyimat0, qkhmut5, nmlpgg4, elydhv1, xmjuwg5, tsipwi9, cnakyj3, fgvqet2, sjazcq4, gzangt3, gefjqu0, jdkigc5, zzvxjb6, hrhsec6, xnrnur4, tyylmm2, nohojs3, ecbmil0, jndgmf7, jdmxnt7, dsztgg5, pnwsza5, xjzpwx4, fxsxsp1, xzmgst1, nipzfr9, oioiws3, vwgmnk0, sncujc2, hvsyws3, ezyxpf4, begran7, drqjfv8, tfyhbn9, obwero7, usmbty6, thqgyx4, dtqaeg2, kxfedu5, pxpmja8, xhlcmm8, jumbna1, booiwl1, slkyxz6, hbpbkn0, dstiuz4, qxmsjk3, wtitik8, onkgxx3, glexcp2, bsnhyz7, vkcwlg0, aysdcb6, vuexvp0, ljhcva1, vcqsch7, gmomkn0, oudtvk2, beejfz9, gpszlz4, hqgjyg2, kvyvfn0, dbiqmi0, lhwchm3, uitrhr4, hfxscp4, ijcmvw8, opginq0, zaaxhm2, xlvvrs6, woccoq5, hqfkoj4, wzsorz4, ducwui5, eyfczt8, csnzzs0, ylhjjb7, whsles7, jiyvof4, lmkjsu2, izquvz7, ihzufq1, ycweeu3, rroogg8, qhwcxc4, eogerq8, dxsasf4, pbvunb1, omouyr8, dcaddg6, drljjq0, kumevo2, kiyevc1, crzcbd0, objqly9, lanrcq7, odjqbl7, zavyro6, yoghgp4, xtargj2, knvoqq1, bythfo1, gunvsn1, rutigq5, zanxqi7, hlbiqt0, nvkyvs5, bgwdlo3, ylcdjv6, rpwbmv6, xabhrc7, lexaby2, hyluww5, yxyszw9, rqzdlp3, rknucs9, yeebtu4, gfkofp2, xtgeor9, rygwhz2, rnscuu9, joqqwu3, yyqaqt6, ygdbyf1, ftwyzc5, tzxdxy4, xvifmj3, frjogl9, pgfoqj1, drifwd4, scyhwe3, lwdxjz0, zvxskc4, xqltub7, fhmbwh3, ocmoqm1, htchpe7, emxxxt5, dtfwjt5, zxdsdt2, nmwedm2, layesz5, igcaro4, sumyia9, eiqxag2, gtgfyl5, dcxbhk9, gpcjeq2, vjvlxz8, dbzwnt2, zovugx5, zkpshj2, oezrxv1, tgcrau7, kvgvgw8, czyofm8, cvvdpu1, losbis0, szkdjx7, qzqkjl0, orbnnp3, gyapzk4, enymtr4, yopblc2, csuwwv6, afmrwi6, jkaioc1, zhtzmp7, wuifie5, kizuia1, qqzevh5, vnlivn0, dkmvwe9, ruupou4, vjvdbk9, dtpieh5, nomeda0, ipzhcn4, lcafpu9, emtqyp3, vzmwhh0, sgkpzp9, dlrypg6, iiwtwa5, menaqu3, qmqpgq3, xxzsyj0, klnxsk4, ukkzbi0, zxdbvr2, nvggev6, wczhlb7, fqzrwa4, foqsrd3, xtknia8, cwrxvr8, ukzqqn5, txtaau6, wlijtw7, cbewgw4, evikuq5, xrrxbc8, mnzxfg8, naoehu0, ldjaqn2, dkpybm5, zjdvrh1, xbkqyh6, hhlcgj9, qkqwpl4, ghweuw0, tcgmxr6, eiitll5, aliaxc6, xnljib0, tdadef8, neoqwa1, ztfegf1, lcfoqw6, ucmnig5, csdxmb3, niaoea1, nulady6, vudbhb3, obpsow8, qjynrl1, mgszxp6, vdxcoo4, hwrjtm5, bcjduj1, hegsgl5, alosmy1, vohdhk3, bryshd1, hryjgu7, ctohlm6, adjmqw5, tlveyg8, zuiwdh6, lvsazt8, zvorpx9, aolbua8, uxkvnz9, ycgdvw3, kfwilc3, bjsdsf1, oldgmm4, rxnzdd8, aljvdy4, qzdbam3, rfyukm7, xdntok4, fyqklw1, ctawiz1, qyvvvc0, onpmhs4, unnvdb7, osnkxu6, bqhjxy2, jdofsc4, hnqiyo0, pquozu3, mcjite5, cdxpwn5, aljezw6, batatv2, sassek2, vnrrqp6, tzdvcu4, dfmcta3, xwfqte9, xznwpk8, pgkynr2, glzuxw1, otajwx4, zgsobs4, hzyfaw7, ulrckn2, nlzaee5, jhwgmv3, sxkyyf7, thocqd9, ktpqdl4, qbjsvx2, vufnkj2, tlwtur8, bmljpr3, bvjmuk4, ktloth4, jmhjyw2, atxodg0, prqagd9, araefw4, ldxbqd0, ceymks0, xtzyrs0, sbiiow0, tmslwd0, ooruxf4, ipskap8, cpfpcl4, ssrkfw4, swkkjd8, rbhqnc9, kxjkgb7, smwcut5, szxxlm4, hhmrwu4, dedcqz8, mqdluv7, hptcyt5, vwlzqw1, smvvuj5, hbvnwy1, xvczwy7, nvvwti8, evwpql5, aettzs3, eiqbbf2, hpvgql4, nrxsuo7, jxfcmq5, bimobb0, briyqw8, uzducf9, sapwtz9, vodazk5, hqvtsa8, waeaxr1, zfxszi4, rmaqha8, tjxmwk3, jkmqje0, lxvyee0, yrqktx6, zlgrbl4, lsurol6, vratru2, mnrvjc0, llcsyz5, lalqfz4, lcptel9, vzbswe8, bqyrig8, qkrwxo9, hocgzj3, coksoa2, ddcmzd9, krgukm5, puynjn5, zduhpt4, qcjeyy8, fffadh5, zcxiof3, rqkaby8, iqbmci8, wvqone6, tqxwpj2, pozdwo8, kcvjex6, dlvtfu7, xmdjse7, zihwel0, vplymb1, rrmces1, mquakq2, oknmhc4, reymgm6, bysnsw9, fhthco4, ofysrg4, bxsnyh5, heqhkl3, obqnzd0, iskeez6, qhtdyq2, mpxall2, zxefcy4, vxnnqk6, ukxpol6, zvfjis2, tdtcrk9, bmrcwj6, xiotdl8, jesvmk9, wzojnr9, sjczcb3, vmflte3, dbwmow9, xdavmk0, xuxxse4, jkadht3, dxuwwv9, gimvgf2, gwiddq8, wfcdbw1, kcexdh1, tgbsee4, ohrpol9, jwvyzu4, ogsdmf1, mpcdgm3, buabnw1, ptxxkb0, zrfulj1, huqnqs1, hlqsje1, jpkndx7, lrsjyg4, ccodoq1, dbuzkt5, ckqzek2, zykqzu8, apzjrv6, qijmui1, hhhkeo1, iemjnn5, bkenps7, qkxklt7, kgqlmu7, cmvapf4, jwdihc1, wgorfn2, bhscnx8, lwrjkq4, coxybq8, vmitlb5, yirluy4, mfciqg9, wczdrg3, qxuved6, blsaiy5, ukcntd4, wravrl5, bzplfs6, ijkgld2, ecxyli2, imnmmk7, baxzvo4, guysct3, mjwsxr4, lloncq4, uwuwxg1, vturtr4, tdllhq4, jjilgs1, ysnbvx7, bvjekv4, nykjww2, vdtmcz9, harlzr2, dywups9, tnthho3, iwfyvc7, qblwpp4, yzyael9, vjevxs6, yadibk0, vbnlvm9, rwhnme1, auocex7, ufoavw0, ikpecz3, podjqe6, pbaqab3, xghvqy5, hbkhex8, ztdwib9, soqzks4, dwdzbv2, rolfnj6, qnnesy1, yhzkvd9),
            edges = mapOf(
                vepmjs5 to listOf(rjssrv9, ufhveh6, pkcuxr8, slkahp9, paxesj1, qhlplr9, ltrtmf9, xnrnur4, usmbty6, gmomkn0, whsles7, lmkjsu2),
                rjssrv9 to listOf(idervd9, aiezvn4, qxhifm2),
                aiezvn4 to listOf(ttzrww9, icjmky4, ozlzcf0),
                ttzrww9 to listOf(ffhwpl5, lhhbkt6, xddyaz4),
                ffhwpl5 to listOf(kkwjid3, aqvfkz8, mvmuoq0),
                kkwjid3 to listOf(dqdofl2, orcrdv2, mwfbqr7),
                dqdofl2 to listOf(ocbous3),
                mwfbqr7 to listOf(iqfqtb8),
                mvmuoq0 to listOf(lxspsq6),
                xddyaz4 to listOf(ncxpfv4),
                ozlzcf0 to listOf(drfulc1),
                ufhveh6 to listOf(ouyfmv7, auvnod5, jkuwlw4),
                auvnod5 to listOf(eoypmx3, gtienx4, lgqfov2),
                eoypmx3 to listOf(swxdts3, czuvqy6, jxcjom6),
                swxdts3 to listOf(tiknvm7),
                jxcjom6 to listOf(cmgdnc4),
                lgqfov2 to listOf(implmg0),
                pkcuxr8 to listOf(gfmgfc4, gszbvf4, bxhuwh0),
                gszbvf4 to listOf(mmfhwd8, xtzwlr7, mwmmrq5),
                mmfhwd8 to listOf(sbblsq5, obtxiu9, wnaywb5),
                sbblsq5 to listOf(yusycr0),
                wnaywb5 to listOf(ykfyhd5),
                mwmmrq5 to listOf(swruuf4),
                slkahp9 to listOf(jiloft4, jczrpa8, pcpzfc0),
                jczrpa8 to listOf(vllthi3, pntbcw7, ylgihj6),
                vllthi3 to listOf(phnnsf5, muekfm3, hmfayf4),
                phnnsf5 to listOf(zsybzn9),
                hmfayf4 to listOf(ikqhbw8),
                ylgihj6 to listOf(xbsmyj7),
                paxesj1 to listOf(wxbari6, ftisge1, kkaibp2),
                ftisge1 to listOf(wmahee2, ebhhne6, cljaoj7),
                wmahee2 to listOf(jhwcaw4, wcoggu3, bznwyd7),
                jhwcaw4 to listOf(wcbmza6),
                bznwyd7 to listOf(pcwawx9),
                cljaoj7 to listOf(hqgaeu3),
                qhlplr9 to listOf(orvrss9, kbbqfj2, lmnjry2),
                kbbqfj2 to listOf(mdydmk2, kbqidj5, adgesc7),
                mdydmk2 to listOf(eeocnj1, zojige0, othqiy3),
                eeocnj1 to listOf(rpqkzu4, medskb5, zyxcqi9),
                rpqkzu4 to listOf(qhzopk1, rvhnga0, fwwffm1),
                qhzopk1 to listOf(jilnfn4),
                fwwffm1 to listOf(wcmqzq8),
                zyxcqi9 to listOf(yovgyq7),
                othqiy3 to listOf(rwvbgc5),
                adgesc7 to listOf(vfjiwa1),
                ltrtmf9 to listOf(luzqcm2, hvusfy6, hrhsec6),
                hvusfy6 to listOf(dtymcv0, gefjqu0, jdkigc5),
                dtymcv0 to listOf(gurowi3, fgvqet2, sjazcq4),
                gurowi3 to listOf(ktfcrn4, xmjuwg5, tsipwi9),
                ktfcrn4 to listOf(eumfak9, qkhmut5, nmlpgg4),
                eumfak9 to listOf(gyimat0),
                nmlpgg4 to listOf(elydhv1),
                tsipwi9 to listOf(cnakyj3),
                sjazcq4 to listOf(gzangt3),
                jdkigc5 to listOf(zzvxjb6),
                xnrnur4 to listOf(tyylmm2, nohojs3, obwero7),
                nohojs3 to listOf(ecbmil0, begran7, drqjfv8),
                ecbmil0 to listOf(jndgmf7, sncujc2, hvsyws3),
                jndgmf7 to listOf(jdmxnt7, nipzfr9, oioiws3),
                jdmxnt7 to listOf(dsztgg5, xjzpwx4, fxsxsp1),
                dsztgg5 to listOf(pnwsza5),
                fxsxsp1 to listOf(xzmgst1),
                oioiws3 to listOf(vwgmnk0),
                hvsyws3 to listOf(ezyxpf4),
                drqjfv8 to listOf(tfyhbn9),
                usmbty6 to listOf(thqgyx4, dtqaeg2, vcqsch7),
                dtqaeg2 to listOf(kxfedu5, aysdcb6, vuexvp0),
                kxfedu5 to listOf(pxpmja8, glexcp2, bsnhyz7),
                pxpmja8 to listOf(xhlcmm8, qxmsjk3, wtitik8),
                xhlcmm8 to listOf(jumbna1, slkyxz6, hbpbkn0),
                jumbna1 to listOf(booiwl1),
                hbpbkn0 to listOf(dstiuz4),
                wtitik8 to listOf(onkgxx3),
                bsnhyz7 to listOf(vkcwlg0),
                vuexvp0 to listOf(ljhcva1),
                gmomkn0 to listOf(oudtvk2, beejfz9, ylhjjb7),
                beejfz9 to listOf(gpszlz4, ducwui5, eyfczt8),
                gpszlz4 to listOf(hqgjyg2, woccoq5, hqfkoj4),
                hqgjyg2 to listOf(kvyvfn0, opginq0, zaaxhm2),
                kvyvfn0 to listOf(dbiqmi0, uitrhr4, hfxscp4),
                dbiqmi0 to listOf(lhwchm3),
                hfxscp4 to listOf(ijcmvw8),
                zaaxhm2 to listOf(xlvvrs6),
                hqfkoj4 to listOf(wzsorz4),
                eyfczt8 to listOf(csnzzs0),
                whsles7 to listOf(jiyvof4),
                lmkjsu2 to listOf(izquvz7, ycweeu3, rroogg8, eogerq8),
                izquvz7 to listOf(ihzufq1),
                rroogg8 to listOf(qhwcxc4),
                eogerq8 to listOf(dxsasf4, pbvunb1, zavyro6, tzxdxy4, czyofm8, qkqwpl4, tcgmxr6, jxfcmq5, briyqw8, mquakq2, reymgm6, tgbsee4, jwvyzu4, wczdrg3, yhzkvd9),
                pbvunb1 to listOf(omouyr8, kumevo2, crzcbd0, odjqbl7),
                omouyr8 to listOf(dcaddg6, drljjq0),
                kumevo2 to listOf(kiyevc1),
                crzcbd0 to listOf(objqly9),
                objqly9 to listOf(lanrcq7),
                zavyro6 to listOf(yoghgp4, bythfo1, rpwbmv6, ftwyzc5),
                yoghgp4 to listOf(xtargj2, knvoqq1),
                bythfo1 to listOf(gunvsn1, zanxqi7),
                gunvsn1 to listOf(rutigq5),
                zanxqi7 to listOf(hlbiqt0, nvkyvs5, ylcdjv6),
                nvkyvs5 to listOf(bgwdlo3),
                rpwbmv6 to listOf(xabhrc7, hyluww5, yxyszw9),
                xabhrc7 to listOf(lexaby2),
                yxyszw9 to listOf(rqzdlp3, rknucs9, joqqwu3),
                rknucs9 to listOf(yeebtu4, xtgeor9),
                yeebtu4 to listOf(gfkofp2),
                xtgeor9 to listOf(rygwhz2, rnscuu9),
                joqqwu3 to listOf(yyqaqt6, ygdbyf1),
                tzxdxy4 to listOf(xvifmj3, pgfoqj1, zxdsdt2, kvgvgw8),
                xvifmj3 to listOf(frjogl9),
                pgfoqj1 to listOf(drifwd4, lwdxjz0),
                drifwd4 to listOf(scyhwe3),
                lwdxjz0 to listOf(zvxskc4, xqltub7, ocmoqm1, htchpe7, dtfwjt5),
                xqltub7 to listOf(fhmbwh3),
                htchpe7 to listOf(emxxxt5),
                zxdsdt2 to listOf(nmwedm2, igcaro4, sumyia9),
                nmwedm2 to listOf(layesz5),
                sumyia9 to listOf(eiqxag2, gtgfyl5, zkpshj2),
                gtgfyl5 to listOf(dcxbhk9, vjvlxz8),
                dcxbhk9 to listOf(gpcjeq2),
                vjvlxz8 to listOf(dbzwnt2, zovugx5),
                zkpshj2 to listOf(oezrxv1, tgcrau7),
                czyofm8 to listOf(cvvdpu1, szkdjx7, qzqkjl0, gyapzk4, jkaioc1),
                cvvdpu1 to listOf(losbis0),
                qzqkjl0 to listOf(orbnnp3),
                gyapzk4 to listOf(enymtr4, yopblc2),
                yopblc2 to listOf(csuwwv6),
                csuwwv6 to listOf(afmrwi6),
                jkaioc1 to listOf(zhtzmp7, wuifie5, hhlcgj9),
                wuifie5 to listOf(kizuia1, dtpieh5, nomeda0, lcafpu9, xxzsyj0),
                kizuia1 to listOf(qqzevh5, vjvdbk9),
                qqzevh5 to listOf(vnlivn0, dkmvwe9),
                dkmvwe9 to listOf(ruupou4),
                nomeda0 to listOf(ipzhcn4),
                lcafpu9 to listOf(emtqyp3, vzmwhh0, qmqpgq3),
                vzmwhh0 to listOf(sgkpzp9, iiwtwa5),
                sgkpzp9 to listOf(dlrypg6),
                iiwtwa5 to listOf(menaqu3),
                xxzsyj0 to listOf(klnxsk4, ukkzbi0, xbkqyh6),
                ukkzbi0 to listOf(zxdbvr2, zjdvrh1),
                zxdbvr2 to listOf(nvggev6, fqzrwa4),
                nvggev6 to listOf(wczhlb7),
                fqzrwa4 to listOf(foqsrd3, xtknia8, dkpybm5),
                xtknia8 to listOf(cwrxvr8, txtaau6, wlijtw7, evikuq5),
                cwrxvr8 to listOf(ukzqqn5),
                wlijtw7 to listOf(cbewgw4),
                evikuq5 to listOf(xrrxbc8, mnzxfg8, ldjaqn2),
                mnzxfg8 to listOf(naoehu0),
                qkqwpl4 to listOf(ghweuw0),
                tcgmxr6 to listOf(eiitll5, xnljib0, neoqwa1, obpsow8),
                eiitll5 to listOf(aliaxc6),
                xnljib0 to listOf(tdadef8),
                neoqwa1 to listOf(ztfegf1, lcfoqw6, vudbhb3),
                lcfoqw6 to listOf(ucmnig5, niaoea1),
                ucmnig5 to listOf(csdxmb3),
                niaoea1 to listOf(nulady6),
                obpsow8 to listOf(qjynrl1, mgszxp6, aolbua8, bqhjxy2, smwcut5, nrxsuo7),
                mgszxp6 to listOf(vdxcoo4, bcjduj1, zvorpx9),
                vdxcoo4 to listOf(hwrjtm5),
                bcjduj1 to listOf(hegsgl5, vohdhk3, bryshd1),
                hegsgl5 to listOf(alosmy1),
                bryshd1 to listOf(hryjgu7, ctohlm6, tlveyg8),
                ctohlm6 to listOf(adjmqw5),
                tlveyg8 to listOf(zuiwdh6, lvsazt8),
                aolbua8 to listOf(uxkvnz9, kfwilc3, osnkxu6),
                uxkvnz9 to listOf(ycgdvw3),
                kfwilc3 to listOf(bjsdsf1, rxnzdd8, aljvdy4),
                bjsdsf1 to listOf(oldgmm4),
                aljvdy4 to listOf(qzdbam3, xdntok4, fyqklw1, qyvvvc0),
                qzdbam3 to listOf(rfyukm7),
                fyqklw1 to listOf(ctawiz1),
                qyvvvc0 to listOf(onpmhs4, unnvdb7),
                bqhjxy2 to listOf(jdofsc4, hnqiyo0, pquozu3, xznwpk8, ulrckn2, nlzaee5, ktpqdl4, qbjsvx2),
                pquozu3 to listOf(mcjite5, aljezw6, xwfqte9),
                mcjite5 to listOf(cdxpwn5),
                aljezw6 to listOf(batatv2, vnrrqp6, tzdvcu4),
                batatv2 to listOf(sassek2),
                tzdvcu4 to listOf(dfmcta3),
                xznwpk8 to listOf(pgkynr2, otajwx4, zgsobs4),
                pgkynr2 to listOf(glzuxw1),
                zgsobs4 to listOf(hzyfaw7),
                nlzaee5 to listOf(jhwgmv3, thocqd9),
                jhwgmv3 to listOf(sxkyyf7),
                qbjsvx2 to listOf(vufnkj2, kxjkgb7),
                vufnkj2 to listOf(tlwtur8, sbiiow0, tmslwd0, ipskap8),
                tlwtur8 to listOf(bmljpr3, ktloth4, jmhjyw2, prqagd9),
                bmljpr3 to listOf(bvjmuk4),
                jmhjyw2 to listOf(atxodg0),
                prqagd9 to listOf(araefw4, ldxbqd0, xtzyrs0),
                ldxbqd0 to listOf(ceymks0),
                tmslwd0 to listOf(ooruxf4),
                ipskap8 to listOf(cpfpcl4, ssrkfw4, rbhqnc9),
                ssrkfw4 to listOf(swkkjd8),
                smwcut5 to listOf(szxxlm4, hpvgql4),
                szxxlm4 to listOf(hhmrwu4, mqdluv7, hptcyt5),
                hhmrwu4 to listOf(dedcqz8),
                hptcyt5 to listOf(vwlzqw1, hbvnwy1, xvczwy7, evwpql5),
                vwlzqw1 to listOf(smvvuj5),
                xvczwy7 to listOf(nvvwti8),
                evwpql5 to listOf(aettzs3, eiqbbf2),
                jxfcmq5 to listOf(bimobb0),
                briyqw8 to listOf(uzducf9, vodazk5, hqvtsa8, zfxszi4, coksoa2),
                uzducf9 to listOf(sapwtz9),
                hqvtsa8 to listOf(waeaxr1),
                zfxszi4 to listOf(rmaqha8, tjxmwk3, hocgzj3),
                tjxmwk3 to listOf(jkmqje0, bqyrig8),
                jkmqje0 to listOf(lxvyee0, zlgrbl4),
                lxvyee0 to listOf(yrqktx6),
                zlgrbl4 to listOf(lsurol6, vratru2, llcsyz5, lalqfz4, vzbswe8),
                vratru2 to listOf(mnrvjc0),
                lalqfz4 to listOf(lcptel9),
                bqyrig8 to listOf(qkrwxo9),
                coksoa2 to listOf(ddcmzd9, krgukm5, rrmces1),
                krgukm5 to listOf(puynjn5, vplymb1),
                puynjn5 to listOf(zduhpt4, iqbmci8, wvqone6, pozdwo8),
                zduhpt4 to listOf(qcjeyy8, fffadh5, zcxiof3),
                zcxiof3 to listOf(rqkaby8),
                wvqone6 to listOf(tqxwpj2),
                pozdwo8 to listOf(kcvjex6, dlvtfu7, zihwel0),
                dlvtfu7 to listOf(xmdjse7),
                mquakq2 to listOf(oknmhc4),
                reymgm6 to listOf(bysnsw9, ofysrg4, bxsnyh5, obqnzd0, tdtcrk9),
                bysnsw9 to listOf(fhthco4),
                bxsnyh5 to listOf(heqhkl3),
                obqnzd0 to listOf(iskeez6, qhtdyq2, zvfjis2),
                qhtdyq2 to listOf(mpxall2, vxnnqk6),
                mpxall2 to listOf(zxefcy4),
                vxnnqk6 to listOf(ukxpol6),
                tdtcrk9 to listOf(bmrcwj6, xiotdl8, kcexdh1),
                xiotdl8 to listOf(jesvmk9, wfcdbw1),
                jesvmk9 to listOf(wzojnr9, vmflte3, dbwmow9, xuxxse4),
                wzojnr9 to listOf(sjczcb3),
                dbwmow9 to listOf(xdavmk0),
                xuxxse4 to listOf(jkadht3, dxuwwv9, gwiddq8),
                dxuwwv9 to listOf(gimvgf2),
                tgbsee4 to listOf(ohrpol9),
                jwvyzu4 to listOf(ogsdmf1, buabnw1, ptxxkb0, huqnqs1, apzjrv6),
                ogsdmf1 to listOf(mpcdgm3),
                ptxxkb0 to listOf(zrfulj1),
                huqnqs1 to listOf(hlqsje1, jpkndx7, zykqzu8),
                jpkndx7 to listOf(lrsjyg4, dbuzkt5),
                lrsjyg4 to listOf(ccodoq1),
                dbuzkt5 to listOf(ckqzek2),
                apzjrv6 to listOf(qijmui1, hhhkeo1, mfciqg9),
                hhhkeo1 to listOf(iemjnn5, yirluy4),
                iemjnn5 to listOf(bkenps7, kgqlmu7, cmvapf4, wgorfn2),
                bkenps7 to listOf(qkxklt7),
                cmvapf4 to listOf(jwdihc1),
                wgorfn2 to listOf(bhscnx8, lwrjkq4, vmitlb5),
                lwrjkq4 to listOf(coxybq8),
                wczdrg3 to listOf(qxuved6, ukcntd4, wravrl5, ijkgld2, vturtr4),
                qxuved6 to listOf(blsaiy5),
                wravrl5 to listOf(bzplfs6),
                ijkgld2 to listOf(ecxyli2, imnmmk7, uwuwxg1),
                imnmmk7 to listOf(baxzvo4, mjwsxr4),
                baxzvo4 to listOf(guysct3),
                mjwsxr4 to listOf(lloncq4),
                vturtr4 to listOf(tdllhq4, jjilgs1, qnnesy1),
                jjilgs1 to listOf(ysnbvx7, bvjekv4, nykjww2, harlzr2, tnthho3, iwfyvc7, yzyael9, vjevxs6),
                nykjww2 to listOf(vdtmcz9),
                harlzr2 to listOf(dywups9),
                iwfyvc7 to listOf(qblwpp4),
                vjevxs6 to listOf(yadibk0, rolfnj6),
                yadibk0 to listOf(vbnlvm9, auocex7, ufoavw0, podjqe6),
                vbnlvm9 to listOf(rwhnme1),
                ufoavw0 to listOf(ikpecz3),
                podjqe6 to listOf(pbaqab3, xghvqy5, hbkhex8, ztdwib9, dwdzbv2),
                ztdwib9 to listOf(soqzks4),
            )
        )
    }

    override fun initializeGraphs() {
        defineG1()
        defineG2()

        graph1.visualize("VendingMachine/G1")
        graph2.visualize("VendingMachine/G2")
    }

    override fun checkCommonGraph(commonGraph: Graph) {
        graph1.visualize("VendingMachine/G1_Generalized", commonGraph)
        graph2.visualize("VendingMachine/G2_Generalized", commonGraph)
        commonGraph.visualize("VendingMachine/Generalization")
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {
        graph1Diff.visualize("VendingMachine/G1_Differences")
    }

    override fun checkGraph2Diff(graph2Diff: Graph) {
        graph2Diff.visualize("VendingMachine/G2_Differences")
    }
}