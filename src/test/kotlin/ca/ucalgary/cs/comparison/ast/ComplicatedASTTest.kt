package ca.ucalgary.cs.comparison.ast

import ca.ucalgary.cs.comparison.BaseCompareGraphTest
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.graph.Node
import ca.ucalgary.cs.io.visualize

class ComplicatedASTTest : BaseCompareGraphTest() {
    override fun initializeGraphs() {
        val lputw4 = Node("program")
        val bclrv9 = Node("package_declaration")
        val whfco7 = Node("package")
        val pdaqk2 = Node("scoped_identifier", isDuplicate = true)
        val rkbxc8 = Node("scoped_identifier", isDuplicate = true)
        val otxwa2 = Node("identifier", isDuplicate = true)
        val lbcqo6 = Node("com", isDuplicate = true)
        val bcxdj4 = Node(".", isDuplicate = true)
        val fhpth4 = Node("identifier", isDuplicate = true)
        val ehgur6 = Node("jimmyselectronics", isDuplicate = true)
        val khyxy2 = Node(".", isDuplicate = true)
        val zyyom2 = Node("identifier", isDuplicate = true)
        val wwhbb7 = Node("necchi")
        val xvcqk4 = Node(";", isDuplicate = true)
        val tbqqv9 = Node("import_declaration", isDuplicate = true)
        val jrkmg8 = Node("import", isDuplicate = true)
        val xrybt9 = Node("scoped_identifier", isDuplicate = true)
        val hhnrg0 = Node("scoped_identifier", isDuplicate = true)
        val jozfs5 = Node("identifier", isDuplicate = true)
        val dzruo8 = Node("java")
        val gidhx1 = Node(".", isDuplicate = true)
        val xmwig3 = Node("identifier", isDuplicate = true)
        val tojkl0 = Node("util")
        val pxmya6 = Node(".", isDuplicate = true)
        val jamgh3 = Node("identifier", isDuplicate = true)
        val izpbf5 = Node("Random", isDuplicate = true)
        val bvjti1 = Node(";", isDuplicate = true)
        val cvfci6 = Node("import_declaration", isDuplicate = true)
        val gbspa7 = Node("import", isDuplicate = true)
        val apuzu2 = Node("scoped_identifier", isDuplicate = true)
        val uuhyc5 = Node("scoped_identifier", isDuplicate = true)
        val sxjsg5 = Node("identifier", isDuplicate = true)
        val ppacs9 = Node("com", isDuplicate = true)
        val matki2 = Node(".", isDuplicate = true)
        val pfxcu9 = Node("identifier", isDuplicate = true)
        val rzkeo6 = Node("jimmyselectronics", isDuplicate = true)
        val sxiej0 = Node(".", isDuplicate = true)
        val geaab3 = Node("identifier", isDuplicate = true)
        val pklgx0 = Node("AbstractDevice", isDuplicate = true)
        val zbrij0 = Node(";", isDuplicate = true)
        val oxqea0 = Node("import_declaration", isDuplicate = true)
        val sjtoj3 = Node("import", isDuplicate = true)
        val lmxhm9 = Node("scoped_identifier", isDuplicate = true)
        val faesd4 = Node("scoped_identifier", isDuplicate = true)
        val clmww6 = Node("identifier", isDuplicate = true)
        val jrczn8 = Node("ca", isDuplicate = true)
        val uwcxp5 = Node(".", isDuplicate = true)
        val twrgj1 = Node("identifier", isDuplicate = true)
        val qafjn2 = Node("powerutility")
        val xqgfl5 = Node(".", isDuplicate = true)
        val yydnu4 = Node("identifier", isDuplicate = true)
        val ksmqr2 = Node("NoPowerException", isDuplicate = true)
        val siova2 = Node(";", isDuplicate = true)
        val rutua1 = Node("import_declaration", isDuplicate = true)
        val szwfv1 = Node("import", isDuplicate = true)
        val zuvda9 = Node("scoped_identifier", isDuplicate = true)
        val ekumo9 = Node("scoped_identifier", isDuplicate = true)
        val hzcec5 = Node("scoped_identifier", isDuplicate = true)
        val cltxa9 = Node("scoped_identifier", isDuplicate = true)
        val kelhh8 = Node("identifier", isDuplicate = true)
        val pwydh4 = Node("ca", isDuplicate = true)
        val egovr5 = Node(".", isDuplicate = true)
        val gpkia1 = Node("identifier", isDuplicate = true)
        val ymwbq3 = Node("ucalgary")
        val gkjzd7 = Node(".", isDuplicate = true)
        val iafmm8 = Node("identifier", isDuplicate = true)
        val rmmzq2 = Node("seng300")
        val mznnb7 = Node(".", isDuplicate = true)
        val oqrwy9 = Node("identifier", isDuplicate = true)
        val jbysb5 = Node("simulation")
        val vregj3 = Node(".", isDuplicate = true)
        val baaqw1 = Node("identifier", isDuplicate = true)
        val oxtes8 = Node("NullPointerSimulationException", isDuplicate = true)
        val qggbp7 = Node(";", isDuplicate = true)
        val xhdcu7 = Node("block_comment", isDuplicate = true)
        val gcsjj1 = Node("class_declaration")
        val lnfkg6 = Node("modifiers", isDuplicate = true)
        val jikoc0 = Node("public", isDuplicate = true)
        val luhrj7 = Node("class")
        val niwhi8 = Node("identifier", isDuplicate = true)
        val crpbt9 = Node("BarcodeScanner", isDuplicate = true)
        val bzimi8 = Node("superclass")
        val udtuz0 = Node("extends")
        val rftfb4 = Node("generic_type")
        val ribdl1 = Node("type_identifier", isDuplicate = true)
        val bamzh9 = Node("AbstractDevice", isDuplicate = true)
        val ezhdc3 = Node("type_arguments")
        val ijdyb6 = Node("<")
        val gbaog8 = Node("type_identifier", isDuplicate = true)
        val uqgfj4 = Node("BarcodeScannerListener", isDuplicate = true)
        val kcjxa7 = Node(">")
        val cwcax8 = Node("class_body")
        val ijcdo4 = Node("{", isDuplicate = true)
        val uznfb7 = Node("block_comment", isDuplicate = true)
        val moots6 = Node("constructor_declaration")
        val drkbn1 = Node("modifiers", isDuplicate = true)
        val wztwe6 = Node("public", isDuplicate = true)
        val lzoba9 = Node("identifier", isDuplicate = true)
        val jcbsr9 = Node("BarcodeScanner", isDuplicate = true)
        val puhyn2 = Node("formal_parameters", isDuplicate = true)
        val nhtpi8 = Node("(", isDuplicate = true)
        val fdaew2 = Node(")", isDuplicate = true)
        val xbbqo0 = Node("constructor_body")
        val jhfnf5 = Node("{", isDuplicate = true)
        val mpqex2 = Node("}", isDuplicate = true)
        val cokgu5 = Node("field_declaration", isDuplicate = true)
        val wuxgr2 = Node("modifiers", isDuplicate = true)
        val uwuwu8 = Node("private", isDuplicate = true)
        val qjwbo2 = Node("type_identifier", isDuplicate = true)
        val hhosc7 = Node("Random", isDuplicate = true)
        val twwlk9 = Node("variable_declarator", isDuplicate = true)
        val ldwxv2 = Node("identifier", isDuplicate = true)
        val iusfu8 = Node("random", isDuplicate = true)
        val eubky1 = Node("=", isDuplicate = true)
        val jbjok2 = Node("object_creation_expression", isDuplicate = true)
        val qpgsg2 = Node("new", isDuplicate = true)
        val mpdtf5 = Node("type_identifier", isDuplicate = true)
        val tqlzt9 = Node("Random", isDuplicate = true)
        val depvg9 = Node("argument_list", isDuplicate = true)
        val zuqcd9 = Node("(", isDuplicate = true)
        val mapjw6 = Node(")", isDuplicate = true)
        val nyrbh6 = Node(";", isDuplicate = true)
        val tidag3 = Node("field_declaration", isDuplicate = true)
        val nayvu1 = Node("modifiers", isDuplicate = true)
        val dbugh4 = Node("private", isDuplicate = true)
        val scbrn6 = Node("static")
        val vgtrd3 = Node("final")
        val itvdt5 = Node("integral_type")
        val dfcqm9 = Node("int")
        val ncpvp7 = Node("variable_declarator", isDuplicate = true)
        val dppxl8 = Node("identifier", isDuplicate = true)
        val ymugu6 = Node("PROBABILITY_OF_FAILED_SCAN", isDuplicate = true)
        val gaumk1 = Node("=", isDuplicate = true)
        val cbewo2 = Node("decimal_integer_literal", isDuplicate = true)
        val wjmgh9 = Node("10")
        val xuotj9 = Node(";", isDuplicate = true)
        val lfyej0 = Node("block_comment", isDuplicate = true)
        val fipfo2 = Node("block_comment", isDuplicate = true)
        val nrocb6 = Node("method_declaration", isDuplicate = true)
        val mnhzl1 = Node("modifiers", isDuplicate = true)
        val bymjr9 = Node("public", isDuplicate = true)
        val acegg8 = Node("synchronized")
        val ylupm3 = Node("boolean_type")
        val etihq4 = Node("identifier", isDuplicate = true)
        val aodhn7 = Node("scan")
        val gaetc8 = Node("formal_parameters", isDuplicate = true)
        val snuwy9 = Node("(", isDuplicate = true)
        val xjqzs3 = Node("formal_parameter", isDuplicate = true)
        val vbkpd1 = Node("type_identifier", isDuplicate = true)
        val vlvjz1 = Node("BarcodedItem")
        val aqpwp7 = Node("identifier", isDuplicate = true)
        val brccr2 = Node("item", isDuplicate = true)
        val wwxnv1 = Node(")", isDuplicate = true)
        val ecxpl8 = Node("block", isDuplicate = true)
        val cdjxq3 = Node("{", isDuplicate = true)
        val nkdqm0 = Node("if_statement", isDuplicate = true)
        val uznwi8 = Node("if", isDuplicate = true)
        val xekln5 = Node("parenthesized_expression", isDuplicate = true)
        val zjrkq2 = Node("(", isDuplicate = true)
        val anfxn3 = Node("unary_expression")
        val flvtg5 = Node("!")
        val mizpe6 = Node("method_invocation", isDuplicate = true)
        val piyrp8 = Node("identifier", isDuplicate = true)
        val djtfp7 = Node("isPoweredUp")
        val lwtyt3 = Node("argument_list", isDuplicate = true)
        val olztf5 = Node("(", isDuplicate = true)
        val mllbj6 = Node(")", isDuplicate = true)
        val fwaso7 = Node(")", isDuplicate = true)
        val syvcx0 = Node("throw_statement", isDuplicate = true)
        val imzlw6 = Node("throw", isDuplicate = true)
        val xgvtn9 = Node("object_creation_expression", isDuplicate = true)
        val ndagy6 = Node("new", isDuplicate = true)
        val bnozj5 = Node("type_identifier", isDuplicate = true)
        val sbfla0 = Node("NoPowerException", isDuplicate = true)
        val vhdil0 = Node("argument_list", isDuplicate = true)
        val bfuxc4 = Node("(", isDuplicate = true)
        val mpgvc6 = Node(")", isDuplicate = true)
        val soaxm7 = Node(";", isDuplicate = true)
        val fjlqs2 = Node("if_statement", isDuplicate = true)
        val lobza7 = Node("if", isDuplicate = true)
        val oqlku4 = Node("parenthesized_expression", isDuplicate = true)
        val jihur1 = Node("(", isDuplicate = true)
        val efehg8 = Node("binary_expression", isDuplicate = true)
        val rtidt3 = Node("identifier", isDuplicate = true)
        val xwxxs0 = Node("item", isDuplicate = true)
        val zttio7 = Node("==")
        val dbjld7 = Node("null_literal")
        val qkrtd5 = Node("null")
        val qqott0 = Node(")", isDuplicate = true)
        val mkfwv7 = Node("throw_statement", isDuplicate = true)
        val ptids9 = Node("throw", isDuplicate = true)
        val atalb4 = Node("object_creation_expression", isDuplicate = true)
        val gaped9 = Node("new", isDuplicate = true)
        val tlnfr7 = Node("type_identifier", isDuplicate = true)
        val qutsq7 = Node("NullPointerSimulationException", isDuplicate = true)
        val phoex1 = Node("argument_list", isDuplicate = true)
        val eldcf3 = Node("(", isDuplicate = true)
        val ulqoa4 = Node("string_literal")
        val teput5 = Node("\"item\"")
        val yhggh9 = Node(")", isDuplicate = true)
        val arxjy9 = Node(";", isDuplicate = true)
        val wbqhs5 = Node("if_statement", isDuplicate = true)
        val wfdpl2 = Node("if", isDuplicate = true)
        val wgggt7 = Node("parenthesized_expression", isDuplicate = true)
        val hrvja3 = Node("(", isDuplicate = true)
        val cbify7 = Node("method_invocation", isDuplicate = true)
        val wxehd5 = Node("identifier", isDuplicate = true)
        val fywxt4 = Node("isDisabled")
        val miosb7 = Node("argument_list", isDuplicate = true)
        val lmpbn0 = Node("(", isDuplicate = true)
        val psaeo6 = Node(")", isDuplicate = true)
        val yqlvd3 = Node(")", isDuplicate = true)
        val ylzzp9 = Node("return_statement", isDuplicate = true)
        val eavkt3 = Node("return", isDuplicate = true)
        val hnrlq7 = Node("false", isDuplicate = true)
        val vdjvi7 = Node(";", isDuplicate = true)
        val kwyxg3 = Node("if_statement", isDuplicate = true)
        val ldhst0 = Node("if", isDuplicate = true)
        val wuaup2 = Node("parenthesized_expression", isDuplicate = true)
        val udtsx8 = Node("(", isDuplicate = true)
        val vkjja9 = Node("binary_expression", isDuplicate = true)
        val jnrtl2 = Node("method_invocation", isDuplicate = true)
        val vonps5 = Node("identifier", isDuplicate = true)
        val pswei1 = Node("random", isDuplicate = true)
        val epcoy0 = Node(".", isDuplicate = true)
        val smphh7 = Node("identifier", isDuplicate = true)
        val wqurk0 = Node("nextInt")
        val ovyfw1 = Node("argument_list", isDuplicate = true)
        val ggdzv5 = Node("(", isDuplicate = true)
        val pywwc6 = Node("decimal_integer_literal", isDuplicate = true)
        val knlvi7 = Node("100")
        val ipfvn4 = Node(")", isDuplicate = true)
        val naweo8 = Node("<=")
        val fmpbs5 = Node("identifier", isDuplicate = true)
        val rwqjq6 = Node("PROBABILITY_OF_FAILED_SCAN", isDuplicate = true)
        val ldtid9 = Node(")", isDuplicate = true)
        val hzunt2 = Node("expression_statement", isDuplicate = true)
        val bpcpd4 = Node("method_invocation", isDuplicate = true)
        val tnrrj8 = Node("identifier", isDuplicate = true)
        val rwduq8 = Node("notifyBarcodeScanned", isDuplicate = true)
        val jvbqu4 = Node("argument_list", isDuplicate = true)
        val krcrp7 = Node("(", isDuplicate = true)
        val rmvsa3 = Node("method_invocation", isDuplicate = true)
        val evsut8 = Node("identifier", isDuplicate = true)
        val tfjpn0 = Node("item", isDuplicate = true)
        val xfxkd9 = Node(".", isDuplicate = true)
        val icsim5 = Node("identifier", isDuplicate = true)
        val pnwps9 = Node("getBarcode")
        val knddv8 = Node("argument_list", isDuplicate = true)
        val fxzrl8 = Node("(", isDuplicate = true)
        val xpujh3 = Node(")", isDuplicate = true)
        val imkyx2 = Node(")", isDuplicate = true)
        val mcmlw4 = Node(";", isDuplicate = true)
        val njcmk0 = Node("else")
        val sqmnw9 = Node("return_statement", isDuplicate = true)
        val ypals8 = Node("return", isDuplicate = true)
        val ixtxp6 = Node("false", isDuplicate = true)
        val gdyol7 = Node(";", isDuplicate = true)
        val aafue1 = Node("return_statement", isDuplicate = true)
        val lssgi6 = Node("return", isDuplicate = true)
        val yaxqd2 = Node("true")
        val hzkpe6 = Node(";", isDuplicate = true)
        val yizkg3 = Node("}", isDuplicate = true)
        val nrevx0 = Node("method_declaration", isDuplicate = true)
        val ifksw9 = Node("modifiers", isDuplicate = true)
        val ldrpy1 = Node("private", isDuplicate = true)
        val fjass4 = Node("void_type")
        val btcxm1 = Node("identifier", isDuplicate = true)
        val owznq2 = Node("notifyBarcodeScanned", isDuplicate = true)
        val cfoom6 = Node("formal_parameters", isDuplicate = true)
        val kwdpn4 = Node("(", isDuplicate = true)
        val xpjos2 = Node("formal_parameter", isDuplicate = true)
        val sncze5 = Node("type_identifier", isDuplicate = true)
        val kozpr8 = Node("Barcode")
        val bsnah4 = Node("identifier", isDuplicate = true)
        val vbhdh3 = Node("barcode", isDuplicate = true)
        val btrhw2 = Node(")", isDuplicate = true)
        val iwffe0 = Node("block", isDuplicate = true)
        val snlwc6 = Node("{", isDuplicate = true)
        val jfumu8 = Node("enhanced_for_statement")
        val xvdui8 = Node("for")
        val lsqkd0 = Node("(", isDuplicate = true)
        val sgcre8 = Node("type_identifier", isDuplicate = true)
        val mvljo7 = Node("BarcodeScannerListener", isDuplicate = true)
        val texmj7 = Node("identifier", isDuplicate = true)
        val xeqve1 = Node("l", isDuplicate = true)
        val rrsyo1 = Node(":")
        val amfgk9 = Node("method_invocation", isDuplicate = true)
        val sypzc3 = Node("identifier", isDuplicate = true)
        val ywtfk0 = Node("listeners")
        val oaxqd9 = Node("argument_list", isDuplicate = true)
        val dirvi4 = Node("(", isDuplicate = true)
        val rggbg7 = Node(")", isDuplicate = true)
        val bcedn8 = Node(")", isDuplicate = true)
        val dsggg9 = Node("expression_statement", isDuplicate = true)
        val kvswg5 = Node("method_invocation", isDuplicate = true)
        val jngmd9 = Node("identifier", isDuplicate = true)
        val fejrf3 = Node("l", isDuplicate = true)
        val pmzza1 = Node(".", isDuplicate = true)
        val ocshy5 = Node("identifier", isDuplicate = true)
        val bouaw4 = Node("barcodeScanned")
        val baayo8 = Node("argument_list", isDuplicate = true)
        val efuez8 = Node("(", isDuplicate = true)
        val gvzgh7 = Node("this")
        val urwvn6 = Node(",")
        val kqknk7 = Node("identifier", isDuplicate = true)
        val rlinb0 = Node("barcode", isDuplicate = true)
        val xewhe7 = Node(")", isDuplicate = true)
        val mhzfk7 = Node(";", isDuplicate = true)
        val nhisg0 = Node("}", isDuplicate = true)
        val eqrij0 = Node("}", isDuplicate = true)

        graph1 = Graph.from(
            nodes = listOf(lputw4, bclrv9, whfco7, pdaqk2, rkbxc8, otxwa2, lbcqo6, bcxdj4, fhpth4, ehgur6, khyxy2, zyyom2, wwhbb7, xvcqk4, tbqqv9, jrkmg8, xrybt9, hhnrg0, jozfs5, dzruo8, gidhx1, xmwig3, tojkl0, pxmya6, jamgh3, izpbf5, bvjti1, cvfci6, gbspa7, apuzu2, uuhyc5, sxjsg5, ppacs9, matki2, pfxcu9, rzkeo6, sxiej0, geaab3, pklgx0, zbrij0, oxqea0, sjtoj3, lmxhm9, faesd4, clmww6, jrczn8, uwcxp5, twrgj1, qafjn2, xqgfl5, yydnu4, ksmqr2, siova2, rutua1, szwfv1, zuvda9, ekumo9, hzcec5, cltxa9, kelhh8, pwydh4, egovr5, gpkia1, ymwbq3, gkjzd7, iafmm8, rmmzq2, mznnb7, oqrwy9, jbysb5, vregj3, baaqw1, oxtes8, qggbp7, xhdcu7, gcsjj1, lnfkg6, jikoc0, luhrj7, niwhi8, crpbt9, bzimi8, udtuz0, rftfb4, ribdl1, bamzh9, ezhdc3, ijdyb6, gbaog8, uqgfj4, kcjxa7, cwcax8, ijcdo4, uznfb7, moots6, drkbn1, wztwe6, lzoba9, jcbsr9, puhyn2, nhtpi8, fdaew2, xbbqo0, jhfnf5, mpqex2, cokgu5, wuxgr2, uwuwu8, qjwbo2, hhosc7, twwlk9, ldwxv2, iusfu8, eubky1, jbjok2, qpgsg2, mpdtf5, tqlzt9, depvg9, zuqcd9, mapjw6, nyrbh6, tidag3, nayvu1, dbugh4, scbrn6, vgtrd3, itvdt5, dfcqm9, ncpvp7, dppxl8, ymugu6, gaumk1, cbewo2, wjmgh9, xuotj9, lfyej0, fipfo2, nrocb6, mnhzl1, bymjr9, acegg8, ylupm3, etihq4, aodhn7, gaetc8, snuwy9, xjqzs3, vbkpd1, vlvjz1, aqpwp7, brccr2, wwxnv1, ecxpl8, cdjxq3, nkdqm0, uznwi8, xekln5, zjrkq2, anfxn3, flvtg5, mizpe6, piyrp8, djtfp7, lwtyt3, olztf5, mllbj6, fwaso7, syvcx0, imzlw6, xgvtn9, ndagy6, bnozj5, sbfla0, vhdil0, bfuxc4, mpgvc6, soaxm7, fjlqs2, lobza7, oqlku4, jihur1, efehg8, rtidt3, xwxxs0, zttio7, dbjld7, qkrtd5, qqott0, mkfwv7, ptids9, atalb4, gaped9, tlnfr7, qutsq7, phoex1, eldcf3, ulqoa4, teput5, yhggh9, arxjy9, wbqhs5, wfdpl2, wgggt7, hrvja3, cbify7, wxehd5, fywxt4, miosb7, lmpbn0, psaeo6, yqlvd3, ylzzp9, eavkt3, hnrlq7, vdjvi7, kwyxg3, ldhst0, wuaup2, udtsx8, vkjja9, jnrtl2, vonps5, pswei1, epcoy0, smphh7, wqurk0, ovyfw1, ggdzv5, pywwc6, knlvi7, ipfvn4, naweo8, fmpbs5, rwqjq6, ldtid9, hzunt2, bpcpd4, tnrrj8, rwduq8, jvbqu4, krcrp7, rmvsa3, evsut8, tfjpn0, xfxkd9, icsim5, pnwps9, knddv8, fxzrl8, xpujh3, imkyx2, mcmlw4, njcmk0, sqmnw9, ypals8, ixtxp6, gdyol7, aafue1, lssgi6, yaxqd2, hzkpe6, yizkg3, nrevx0, ifksw9, ldrpy1, fjass4, btcxm1, owznq2, cfoom6, kwdpn4, xpjos2, sncze5, kozpr8, bsnah4, vbhdh3, btrhw2, iwffe0, snlwc6, jfumu8, xvdui8, lsqkd0, sgcre8, mvljo7, texmj7, xeqve1, rrsyo1, amfgk9, sypzc3, ywtfk0, oaxqd9, dirvi4, rggbg7, bcedn8, dsggg9, kvswg5, jngmd9, fejrf3, pmzza1, ocshy5, bouaw4, baayo8, efuez8, gvzgh7, urwvn6, kqknk7, rlinb0, xewhe7, mhzfk7, nhisg0, eqrij0),
            edges = mapOf(
                lputw4 to listOf(bclrv9, tbqqv9, cvfci6, oxqea0, rutua1, xhdcu7, gcsjj1),
                bclrv9 to listOf(whfco7, pdaqk2, xvcqk4),
                pdaqk2 to listOf(rkbxc8, khyxy2, zyyom2),
                rkbxc8 to listOf(otxwa2, bcxdj4, fhpth4),
                otxwa2 to listOf(lbcqo6),
                fhpth4 to listOf(ehgur6),
                zyyom2 to listOf(wwhbb7),
                tbqqv9 to listOf(jrkmg8, xrybt9, bvjti1),
                xrybt9 to listOf(hhnrg0, pxmya6, jamgh3),
                hhnrg0 to listOf(jozfs5, gidhx1, xmwig3),
                jozfs5 to listOf(dzruo8),
                xmwig3 to listOf(tojkl0),
                jamgh3 to listOf(izpbf5),
                cvfci6 to listOf(gbspa7, apuzu2, zbrij0),
                apuzu2 to listOf(uuhyc5, sxiej0, geaab3),
                uuhyc5 to listOf(sxjsg5, matki2, pfxcu9),
                sxjsg5 to listOf(ppacs9),
                pfxcu9 to listOf(rzkeo6),
                geaab3 to listOf(pklgx0),
                oxqea0 to listOf(sjtoj3, lmxhm9, siova2),
                lmxhm9 to listOf(faesd4, xqgfl5, yydnu4),
                faesd4 to listOf(clmww6, uwcxp5, twrgj1),
                clmww6 to listOf(jrczn8),
                twrgj1 to listOf(qafjn2),
                yydnu4 to listOf(ksmqr2),
                rutua1 to listOf(szwfv1, zuvda9, qggbp7),
                zuvda9 to listOf(ekumo9, vregj3, baaqw1),
                ekumo9 to listOf(hzcec5, mznnb7, oqrwy9),
                hzcec5 to listOf(cltxa9, gkjzd7, iafmm8),
                cltxa9 to listOf(kelhh8, egovr5, gpkia1),
                kelhh8 to listOf(pwydh4),
                gpkia1 to listOf(ymwbq3),
                iafmm8 to listOf(rmmzq2),
                oqrwy9 to listOf(jbysb5),
                baaqw1 to listOf(oxtes8),
                gcsjj1 to listOf(lnfkg6, luhrj7, niwhi8, bzimi8, cwcax8),
                lnfkg6 to listOf(jikoc0),
                niwhi8 to listOf(crpbt9),
                bzimi8 to listOf(udtuz0, rftfb4),
                rftfb4 to listOf(ribdl1, ezhdc3),
                ribdl1 to listOf(bamzh9),
                ezhdc3 to listOf(ijdyb6, gbaog8, kcjxa7),
                gbaog8 to listOf(uqgfj4),
                cwcax8 to listOf(ijcdo4, uznfb7, moots6, cokgu5, tidag3, lfyej0, fipfo2, nrocb6, nrevx0, eqrij0),
                moots6 to listOf(drkbn1, lzoba9, puhyn2, xbbqo0),
                drkbn1 to listOf(wztwe6),
                lzoba9 to listOf(jcbsr9),
                puhyn2 to listOf(nhtpi8, fdaew2),
                xbbqo0 to listOf(jhfnf5, mpqex2),
                cokgu5 to listOf(wuxgr2, qjwbo2, twwlk9, nyrbh6),
                wuxgr2 to listOf(uwuwu8),
                qjwbo2 to listOf(hhosc7),
                twwlk9 to listOf(ldwxv2, eubky1, jbjok2),
                ldwxv2 to listOf(iusfu8),
                jbjok2 to listOf(qpgsg2, mpdtf5, depvg9),
                mpdtf5 to listOf(tqlzt9),
                depvg9 to listOf(zuqcd9, mapjw6),
                tidag3 to listOf(nayvu1, itvdt5, ncpvp7, xuotj9),
                nayvu1 to listOf(dbugh4, scbrn6, vgtrd3),
                itvdt5 to listOf(dfcqm9),
                ncpvp7 to listOf(dppxl8, gaumk1, cbewo2),
                dppxl8 to listOf(ymugu6),
                cbewo2 to listOf(wjmgh9),
                nrocb6 to listOf(mnhzl1, ylupm3, etihq4, gaetc8, ecxpl8),
                mnhzl1 to listOf(bymjr9, acegg8),
                etihq4 to listOf(aodhn7),
                gaetc8 to listOf(snuwy9, xjqzs3, wwxnv1),
                xjqzs3 to listOf(vbkpd1, aqpwp7),
                vbkpd1 to listOf(vlvjz1),
                aqpwp7 to listOf(brccr2),
                ecxpl8 to listOf(cdjxq3, nkdqm0, fjlqs2, wbqhs5, kwyxg3, aafue1, yizkg3),
                nkdqm0 to listOf(uznwi8, xekln5, syvcx0),
                xekln5 to listOf(zjrkq2, anfxn3, fwaso7),
                anfxn3 to listOf(flvtg5, mizpe6),
                mizpe6 to listOf(piyrp8, lwtyt3),
                piyrp8 to listOf(djtfp7),
                lwtyt3 to listOf(olztf5, mllbj6),
                syvcx0 to listOf(imzlw6, xgvtn9, soaxm7),
                xgvtn9 to listOf(ndagy6, bnozj5, vhdil0),
                bnozj5 to listOf(sbfla0),
                vhdil0 to listOf(bfuxc4, mpgvc6),
                fjlqs2 to listOf(lobza7, oqlku4, mkfwv7),
                oqlku4 to listOf(jihur1, efehg8, qqott0),
                efehg8 to listOf(rtidt3, zttio7, dbjld7),
                rtidt3 to listOf(xwxxs0),
                dbjld7 to listOf(qkrtd5),
                mkfwv7 to listOf(ptids9, atalb4, arxjy9),
                atalb4 to listOf(gaped9, tlnfr7, phoex1),
                tlnfr7 to listOf(qutsq7),
                phoex1 to listOf(eldcf3, ulqoa4, yhggh9),
                ulqoa4 to listOf(teput5),
                wbqhs5 to listOf(wfdpl2, wgggt7, ylzzp9),
                wgggt7 to listOf(hrvja3, cbify7, yqlvd3),
                cbify7 to listOf(wxehd5, miosb7),
                wxehd5 to listOf(fywxt4),
                miosb7 to listOf(lmpbn0, psaeo6),
                ylzzp9 to listOf(eavkt3, hnrlq7, vdjvi7),
                kwyxg3 to listOf(ldhst0, wuaup2, hzunt2, njcmk0, sqmnw9),
                wuaup2 to listOf(udtsx8, vkjja9, ldtid9),
                vkjja9 to listOf(jnrtl2, naweo8, fmpbs5),
                jnrtl2 to listOf(vonps5, epcoy0, smphh7, ovyfw1),
                vonps5 to listOf(pswei1),
                smphh7 to listOf(wqurk0),
                ovyfw1 to listOf(ggdzv5, pywwc6, ipfvn4),
                pywwc6 to listOf(knlvi7),
                fmpbs5 to listOf(rwqjq6),
                hzunt2 to listOf(bpcpd4, mcmlw4),
                bpcpd4 to listOf(tnrrj8, jvbqu4),
                tnrrj8 to listOf(rwduq8),
                jvbqu4 to listOf(krcrp7, rmvsa3, imkyx2),
                rmvsa3 to listOf(evsut8, xfxkd9, icsim5, knddv8),
                evsut8 to listOf(tfjpn0),
                icsim5 to listOf(pnwps9),
                knddv8 to listOf(fxzrl8, xpujh3),
                sqmnw9 to listOf(ypals8, ixtxp6, gdyol7),
                aafue1 to listOf(lssgi6, yaxqd2, hzkpe6),
                nrevx0 to listOf(ifksw9, fjass4, btcxm1, cfoom6, iwffe0),
                ifksw9 to listOf(ldrpy1),
                btcxm1 to listOf(owznq2),
                cfoom6 to listOf(kwdpn4, xpjos2, btrhw2),
                xpjos2 to listOf(sncze5, bsnah4),
                sncze5 to listOf(kozpr8),
                bsnah4 to listOf(vbhdh3),
                iwffe0 to listOf(snlwc6, jfumu8, nhisg0),
                jfumu8 to listOf(xvdui8, lsqkd0, sgcre8, texmj7, rrsyo1, amfgk9, bcedn8, dsggg9),
                sgcre8 to listOf(mvljo7),
                texmj7 to listOf(xeqve1),
                amfgk9 to listOf(sypzc3, oaxqd9),
                sypzc3 to listOf(ywtfk0),
                oaxqd9 to listOf(dirvi4, rggbg7),
                dsggg9 to listOf(kvswg5, mhzfk7),
                kvswg5 to listOf(jngmd9, pmzza1, ocshy5, baayo8),
                jngmd9 to listOf(fejrf3),
                ocshy5 to listOf(bouaw4),
                baayo8 to listOf(efuez8, gvzgh7, urwvn6, kqknk7, xewhe7),
                kqknk7 to listOf(rlinb0),
            )
        )

        val jjglx4 = Node("program")
        val ryalw1 = Node("package_declaration")
        val jivyv6 = Node("package")
        val ojhgu1 = Node("scoped_identifier", isDuplicate = true)
        val krgmo3 = Node("scoped_identifier", isDuplicate = true)
        val hffyk6 = Node("identifier", isDuplicate = true)
        val msjnc0 = Node("com", isDuplicate = true)
        val xejsk9 = Node(".", isDuplicate = true)
        val rpsju9 = Node("identifier", isDuplicate = true)
        val bompj5 = Node("jimmyselectronics", isDuplicate = true)
        val yzpzc4 = Node(".", isDuplicate = true)
        val wbfxi4 = Node("identifier", isDuplicate = true)
        val kxdcq3 = Node("virgilio")
        val djwwa9 = Node(";", isDuplicate = true)
        val usrcg5 = Node("import_declaration", isDuplicate = true)
        val ggzqm1 = Node("import", isDuplicate = true)
        val rcxlq3 = Node("scoped_identifier", isDuplicate = true)
        val fwyet7 = Node("scoped_identifier", isDuplicate = true)
        val qdyuc1 = Node("identifier", isDuplicate = true)
        val nxzba3 = Node("java", isDuplicate = true)
        val ztayf9 = Node(".", isDuplicate = true)
        val eqssj6 = Node("identifier", isDuplicate = true)
        val wlflc2 = Node("util", isDuplicate = true)
        val mpqpy1 = Node(".", isDuplicate = true)
        val zgsrv1 = Node("identifier", isDuplicate = true)
        val vdtwi2 = Node("ArrayList", isDuplicate = true)
        val wubks5 = Node(";", isDuplicate = true)
        val rlxxs5 = Node("import_declaration", isDuplicate = true)
        val bsvyp2 = Node("import", isDuplicate = true)
        val viruz8 = Node("scoped_identifier", isDuplicate = true)
        val eaiti2 = Node("scoped_identifier", isDuplicate = true)
        val bhqjh8 = Node("identifier", isDuplicate = true)
        val bomfn1 = Node("java", isDuplicate = true)
        val vnmrm2 = Node(".", isDuplicate = true)
        val tgugh5 = Node("identifier", isDuplicate = true)
        val vqulf1 = Node("util", isDuplicate = true)
        val xrhmc8 = Node(".", isDuplicate = true)
        val frwwh1 = Node("identifier", isDuplicate = true)
        val clvcp6 = Node("Random", isDuplicate = true)
        val quyyj9 = Node(";", isDuplicate = true)
        val tgniy8 = Node("import_declaration", isDuplicate = true)
        val yjpfa7 = Node("import", isDuplicate = true)
        val tsgbl6 = Node("scoped_identifier", isDuplicate = true)
        val gtkjf8 = Node("scoped_identifier", isDuplicate = true)
        val qpphq3 = Node("identifier", isDuplicate = true)
        val wicay9 = Node("com", isDuplicate = true)
        val dxngk2 = Node(".", isDuplicate = true)
        val iqyap6 = Node("identifier", isDuplicate = true)
        val jqjib0 = Node("jimmyselectronics", isDuplicate = true)
        val xklvn0 = Node(".", isDuplicate = true)
        val woxmc3 = Node("identifier", isDuplicate = true)
        val xtezf6 = Node("AbstractDevice", isDuplicate = true)
        val zerba9 = Node(";", isDuplicate = true)
        val mwcud4 = Node("import_declaration", isDuplicate = true)
        val dfuhj3 = Node("import", isDuplicate = true)
        val pailf1 = Node("scoped_identifier", isDuplicate = true)
        val uqbnd4 = Node("scoped_identifier", isDuplicate = true)
        val wffpf8 = Node("identifier", isDuplicate = true)
        val jzoph8 = Node("com", isDuplicate = true)
        val lebkd6 = Node(".", isDuplicate = true)
        val fibmm8 = Node("identifier", isDuplicate = true)
        val mryqx7 = Node("jimmyselectronics", isDuplicate = true)
        val qbrnp4 = Node(".", isDuplicate = true)
        val cusyl1 = Node("identifier", isDuplicate = true)
        val aknqw5 = Node("Item", isDuplicate = true)
        val khniw6 = Node(";", isDuplicate = true)
        val czceb4 = Node("import_declaration", isDuplicate = true)
        val frcag1 = Node("import", isDuplicate = true)
        val obvmz6 = Node("scoped_identifier", isDuplicate = true)
        val igylk8 = Node("scoped_identifier", isDuplicate = true)
        val eqpam9 = Node("identifier", isDuplicate = true)
        val hukrt6 = Node("com", isDuplicate = true)
        val kelgi2 = Node(".", isDuplicate = true)
        val xegqb3 = Node("identifier", isDuplicate = true)
        val jynwb7 = Node("jimmyselectronics", isDuplicate = true)
        val jfeyk7 = Node(".", isDuplicate = true)
        val eioec8 = Node("identifier", isDuplicate = true)
        val jfaps0 = Node("OverloadException", isDuplicate = true)
        val eqzms6 = Node(";", isDuplicate = true)
        val xukvd9 = Node("import_declaration", isDuplicate = true)
        val yaymr6 = Node("import", isDuplicate = true)
        val nyuty7 = Node("scoped_identifier", isDuplicate = true)
        val rveyk6 = Node("scoped_identifier", isDuplicate = true)
        val eibbv3 = Node("identifier", isDuplicate = true)
        val ucekb0 = Node("ca", isDuplicate = true)
        val eyeva2 = Node(".", isDuplicate = true)
        val klcpo9 = Node("identifier", isDuplicate = true)
        val xrhlf0 = Node("powerutility")
        val lqdxa7 = Node(".", isDuplicate = true)
        val xgbxq5 = Node("identifier", isDuplicate = true)
        val vjfim2 = Node("NoPowerException", isDuplicate = true)
        val zubdn4 = Node(";", isDuplicate = true)
        val lnuoq8 = Node("import_declaration", isDuplicate = true)
        val ixkyr2 = Node("import", isDuplicate = true)
        val kmiam9 = Node("scoped_identifier", isDuplicate = true)
        val wjwim5 = Node("scoped_identifier", isDuplicate = true)
        val zcoit1 = Node("scoped_identifier", isDuplicate = true)
        val iqywu4 = Node("scoped_identifier", isDuplicate = true)
        val knqxr3 = Node("identifier", isDuplicate = true)
        val zpxof3 = Node("ca", isDuplicate = true)
        val gskft0 = Node(".", isDuplicate = true)
        val eubbz1 = Node("identifier", isDuplicate = true)
        val ydfra2 = Node("ucalgary", isDuplicate = true)
        val xkjgt0 = Node(".", isDuplicate = true)
        val ukjya3 = Node("identifier", isDuplicate = true)
        val gdnpw1 = Node("seng300", isDuplicate = true)
        val dmkzx8 = Node(".", isDuplicate = true)
        val tebia4 = Node("identifier", isDuplicate = true)
        val xdhbg3 = Node("simulation", isDuplicate = true)
        val siucn6 = Node(".", isDuplicate = true)
        val nhtor8 = Node("identifier", isDuplicate = true)
        val pknzu4 = Node("InvalidArgumentSimulationException", isDuplicate = true)
        val xufol7 = Node(";", isDuplicate = true)
        val wfhpi5 = Node("import_declaration", isDuplicate = true)
        val avrpy7 = Node("import", isDuplicate = true)
        val yshud2 = Node("scoped_identifier", isDuplicate = true)
        val euonj7 = Node("scoped_identifier", isDuplicate = true)
        val rwsmq5 = Node("scoped_identifier", isDuplicate = true)
        val tlvih7 = Node("scoped_identifier", isDuplicate = true)
        val tzeav7 = Node("identifier", isDuplicate = true)
        val spbeq5 = Node("ca", isDuplicate = true)
        val dhnnr6 = Node(".", isDuplicate = true)
        val spmmf0 = Node("identifier", isDuplicate = true)
        val zylna9 = Node("ucalgary", isDuplicate = true)
        val ynycw6 = Node(".", isDuplicate = true)
        val zuhkk7 = Node("identifier", isDuplicate = true)
        val slvjm6 = Node("seng300", isDuplicate = true)
        val cqyzw1 = Node(".", isDuplicate = true)
        val dbqqq6 = Node("identifier", isDuplicate = true)
        val rfmxp7 = Node("simulation", isDuplicate = true)
        val kdswb3 = Node(".", isDuplicate = true)
        val waypv2 = Node("identifier", isDuplicate = true)
        val sznbn2 = Node("NullPointerSimulationException", isDuplicate = true)
        val elxai4 = Node(";", isDuplicate = true)
        val bbtwz7 = Node("import_declaration", isDuplicate = true)
        val niwro4 = Node("import", isDuplicate = true)
        val pneqr8 = Node("scoped_identifier", isDuplicate = true)
        val ogcuj3 = Node("scoped_identifier", isDuplicate = true)
        val kchou6 = Node("scoped_identifier", isDuplicate = true)
        val vnmaj6 = Node("scoped_identifier", isDuplicate = true)
        val yjlsz1 = Node("identifier", isDuplicate = true)
        val pchec8 = Node("ca", isDuplicate = true)
        val cmkrb3 = Node(".", isDuplicate = true)
        val ibpzm2 = Node("identifier", isDuplicate = true)
        val qbgol9 = Node("ucalgary", isDuplicate = true)
        val yrmmt6 = Node(".", isDuplicate = true)
        val abpfi0 = Node("identifier", isDuplicate = true)
        val rsdgf9 = Node("seng300", isDuplicate = true)
        val ushhp7 = Node(".", isDuplicate = true)
        val szhoe3 = Node("identifier", isDuplicate = true)
        val mhfds1 = Node("simulation", isDuplicate = true)
        val abfhz1 = Node(".", isDuplicate = true)
        val cwpei3 = Node("identifier", isDuplicate = true)
        val kjkmz1 = Node("SimulationException")
        val foayb7 = Node(";", isDuplicate = true)
        val sizkj4 = Node("block_comment", isDuplicate = true)
        val eqqeh2 = Node("class_declaration")
        val claio0 = Node("modifiers", isDuplicate = true)
        val efvew6 = Node("public", isDuplicate = true)
        val ecuay4 = Node("class")
        val bymms0 = Node("identifier", isDuplicate = true)
        val jryve8 = Node("ElectronicScale", isDuplicate = true)
        val ygerl2 = Node("superclass")
        val uxurz8 = Node("extends")
        val lysxr4 = Node("generic_type", isDuplicate = true)
        val mznvv4 = Node("type_identifier", isDuplicate = true)
        val gsqps6 = Node("AbstractDevice", isDuplicate = true)
        val ccnbp7 = Node("type_arguments", isDuplicate = true)
        val pwcml2 = Node("<", isDuplicate = true)
        val zpkcc6 = Node("type_identifier", isDuplicate = true)
        val roius4 = Node("ElectronicScaleListener", isDuplicate = true)
        val sepnk2 = Node(">", isDuplicate = true)
        val utxod3 = Node("class_body")
        val fbqtg5 = Node("{", isDuplicate = true)
        val udulb5 = Node("field_declaration", isDuplicate = true)
        val bvpfh2 = Node("modifiers", isDuplicate = true)
        val wrasv4 = Node("private", isDuplicate = true)
        val lsbio8 = Node("generic_type", isDuplicate = true)
        val oaaws3 = Node("type_identifier", isDuplicate = true)
        val tflcx7 = Node("ArrayList", isDuplicate = true)
        val urzrb8 = Node("type_arguments", isDuplicate = true)
        val jpgmq0 = Node("<", isDuplicate = true)
        val zxseu8 = Node("type_identifier", isDuplicate = true)
        val gdgfi7 = Node("Item", isDuplicate = true)
        val xiqds1 = Node(">", isDuplicate = true)
        val gagrf8 = Node("variable_declarator", isDuplicate = true)
        val mpknh5 = Node("identifier", isDuplicate = true)
        val dfoib5 = Node("items", isDuplicate = true)
        val mbign8 = Node("=", isDuplicate = true)
        val iwxmu5 = Node("object_creation_expression", isDuplicate = true)
        val opizh3 = Node("new", isDuplicate = true)
        val zqzzx0 = Node("generic_type", isDuplicate = true)
        val lktcm1 = Node("type_identifier", isDuplicate = true)
        val iivqy4 = Node("ArrayList", isDuplicate = true)
        val dcxmu4 = Node("type_arguments", isDuplicate = true)
        val nvnsa3 = Node("<", isDuplicate = true)
        val abxgn9 = Node(">", isDuplicate = true)
        val neuwd8 = Node("argument_list", isDuplicate = true)
        val wawdg7 = Node("(", isDuplicate = true)
        val meogr8 = Node(")", isDuplicate = true)
        val ynzqa0 = Node(";", isDuplicate = true)
        val mdujt6 = Node("field_declaration", isDuplicate = true)
        val rvgrq7 = Node("modifiers", isDuplicate = true)
        val gkmvc8 = Node("private", isDuplicate = true)
        val puwzn5 = Node("floating_point_type", isDuplicate = true)
        val wdtyf5 = Node("double", isDuplicate = true)
        val xuoln3 = Node("variable_declarator", isDuplicate = true)
        val mfpss3 = Node("identifier", isDuplicate = true)
        val jyvbm8 = Node("weightLimitInGrams", isDuplicate = true)
        val blclz8 = Node(";", isDuplicate = true)
        val srtrm2 = Node("field_declaration", isDuplicate = true)
        val ripet3 = Node("modifiers", isDuplicate = true)
        val jzotx0 = Node("private", isDuplicate = true)
        val bomts1 = Node("floating_point_type", isDuplicate = true)
        val rzvbl7 = Node("double", isDuplicate = true)
        val losft5 = Node("variable_declarator", isDuplicate = true)
        val zjndq8 = Node("identifier", isDuplicate = true)
        val itqpv8 = Node("currentWeightInGrams", isDuplicate = true)
        val yrvie1 = Node("=", isDuplicate = true)
        val ohtcn5 = Node("decimal_integer_literal", isDuplicate = true)
        val irpyq8 = Node("0", isDuplicate = true)
        val hvrlx7 = Node(";", isDuplicate = true)
        val qfshy0 = Node("field_declaration", isDuplicate = true)
        val xlgqs1 = Node("modifiers", isDuplicate = true)
        val jfwfn8 = Node("private", isDuplicate = true)
        val sslxm9 = Node("floating_point_type", isDuplicate = true)
        val mavvi1 = Node("double", isDuplicate = true)
        val mmumc5 = Node("variable_declarator", isDuplicate = true)
        val niqgs9 = Node("identifier", isDuplicate = true)
        val rnety7 = Node("weightAtLastEvent", isDuplicate = true)
        val mztlr2 = Node("=", isDuplicate = true)
        val uzkgx9 = Node("decimal_integer_literal", isDuplicate = true)
        val hgany3 = Node("0", isDuplicate = true)
        val xgdbd7 = Node(";", isDuplicate = true)
        val fkxsa8 = Node("field_declaration", isDuplicate = true)
        val xicoa6 = Node("modifiers", isDuplicate = true)
        val vuhyd8 = Node("private", isDuplicate = true)
        val fvrol2 = Node("floating_point_type", isDuplicate = true)
        val slmao4 = Node("double", isDuplicate = true)
        val vammx3 = Node("variable_declarator", isDuplicate = true)
        val fulvc8 = Node("identifier", isDuplicate = true)
        val zaxhp0 = Node("sensitivity", isDuplicate = true)
        val hhenq3 = Node(";", isDuplicate = true)
        val xntvk3 = Node("block_comment", isDuplicate = true)
        val wfggg1 = Node("constructor_declaration")
        val nhvls4 = Node("modifiers", isDuplicate = true)
        val jjafl0 = Node("public", isDuplicate = true)
        val tfgvd5 = Node("identifier", isDuplicate = true)
        val zndcx8 = Node("ElectronicScale", isDuplicate = true)
        val hnsoz0 = Node("formal_parameters", isDuplicate = true)
        val zjpze6 = Node("(", isDuplicate = true)
        val dafri2 = Node("formal_parameter", isDuplicate = true)
        val cpfft3 = Node("floating_point_type", isDuplicate = true)
        val calbd1 = Node("double", isDuplicate = true)
        val kvpxf4 = Node("identifier", isDuplicate = true)
        val srisj4 = Node("weightLimitInGrams", isDuplicate = true)
        val zqmdb8 = Node(",", isDuplicate = true)
        val edxqa8 = Node("formal_parameter", isDuplicate = true)
        val ydhdn2 = Node("floating_point_type", isDuplicate = true)
        val oiqrw2 = Node("double", isDuplicate = true)
        val uvian5 = Node("identifier", isDuplicate = true)
        val caekx4 = Node("sensitivity", isDuplicate = true)
        val vwlvw5 = Node(")", isDuplicate = true)
        val oqmie5 = Node("constructor_body")
        val nxmjc0 = Node("{", isDuplicate = true)
        val iebrm2 = Node("if_statement", isDuplicate = true)
        val dvidt2 = Node("if", isDuplicate = true)
        val qbsiv3 = Node("parenthesized_expression", isDuplicate = true)
        val jxuja8 = Node("(", isDuplicate = true)
        val kwruf7 = Node("binary_expression", isDuplicate = true)
        val yqszr4 = Node("identifier", isDuplicate = true)
        val qjamq3 = Node("weightLimitInGrams", isDuplicate = true)
        val kbyet0 = Node("<=", isDuplicate = true)
        val fesua7 = Node("decimal_floating_point_literal", isDuplicate = true)
        val tctge8 = Node("0.0", isDuplicate = true)
        val rrgny6 = Node(")", isDuplicate = true)
        val pciwj1 = Node("throw_statement", isDuplicate = true)
        val upydl1 = Node("throw", isDuplicate = true)
        val zikfk9 = Node("object_creation_expression", isDuplicate = true)
        val hvypg2 = Node("new", isDuplicate = true)
        val syxnf8 = Node("type_identifier", isDuplicate = true)
        val mdwmc1 = Node("InvalidArgumentSimulationException", isDuplicate = true)
        val hefgn5 = Node("argument_list", isDuplicate = true)
        val sxies3 = Node("(", isDuplicate = true)
        val cmnza3 = Node("string_literal", isDuplicate = true)
        val okyfn9 = Node("\"The maximum weight cannot be zero or less.\"")
        val nniqg1 = Node(")", isDuplicate = true)
        val avzdy0 = Node(";", isDuplicate = true)
        val drjtl4 = Node("if_statement", isDuplicate = true)
        val mmzie5 = Node("if", isDuplicate = true)
        val fxecr5 = Node("parenthesized_expression", isDuplicate = true)
        val fivrt4 = Node("(", isDuplicate = true)
        val nspeu6 = Node("binary_expression", isDuplicate = true)
        val wmurc2 = Node("identifier", isDuplicate = true)
        val zhfia3 = Node("sensitivity", isDuplicate = true)
        val kfbnp5 = Node("<=", isDuplicate = true)
        val fmvnc5 = Node("decimal_floating_point_literal", isDuplicate = true)
        val ravmj7 = Node("0.0", isDuplicate = true)
        val lcyeg1 = Node(")", isDuplicate = true)
        val bdyuq0 = Node("throw_statement", isDuplicate = true)
        val mcxwr1 = Node("throw", isDuplicate = true)
        val iuyrl0 = Node("object_creation_expression", isDuplicate = true)
        val tqsgx5 = Node("new", isDuplicate = true)
        val oqjge2 = Node("type_identifier", isDuplicate = true)
        val vdtop0 = Node("InvalidArgumentSimulationException", isDuplicate = true)
        val iekyg2 = Node("argument_list", isDuplicate = true)
        val hqhnr1 = Node("(", isDuplicate = true)
        val guehh7 = Node("string_literal", isDuplicate = true)
        val ztcxq6 = Node("\"The sensitivity cannot be zero or less.\"")
        val uqrjw1 = Node(")", isDuplicate = true)
        val pdzgs3 = Node(";", isDuplicate = true)
        val aybdb7 = Node("expression_statement", isDuplicate = true)
        val oyaqp9 = Node("assignment_expression", isDuplicate = true)
        val moakt1 = Node("field_access", isDuplicate = true)
        val lfbuh8 = Node("this", isDuplicate = true)
        val taxpj6 = Node(".", isDuplicate = true)
        val klwsi4 = Node("identifier", isDuplicate = true)
        val skaio6 = Node("weightLimitInGrams", isDuplicate = true)
        val tcmfw1 = Node("=", isDuplicate = true)
        val uslej9 = Node("identifier", isDuplicate = true)
        val ekkyj3 = Node("weightLimitInGrams", isDuplicate = true)
        val zwzzh2 = Node(";", isDuplicate = true)
        val wvdff9 = Node("expression_statement", isDuplicate = true)
        val pysmg7 = Node("assignment_expression", isDuplicate = true)
        val bvonc3 = Node("field_access", isDuplicate = true)
        val ocfon4 = Node("this", isDuplicate = true)
        val doztw6 = Node(".", isDuplicate = true)
        val hqvnu5 = Node("identifier", isDuplicate = true)
        val kptrr2 = Node("sensitivity", isDuplicate = true)
        val secai5 = Node("=", isDuplicate = true)
        val zdvhf3 = Node("identifier", isDuplicate = true)
        val cnusb2 = Node("sensitivity", isDuplicate = true)
        val zdzkx7 = Node(";", isDuplicate = true)
        val xauto9 = Node("}", isDuplicate = true)
        val dlyyd6 = Node("block_comment", isDuplicate = true)
        val xetal7 = Node("method_declaration", isDuplicate = true)
        val mwyaz0 = Node("modifiers", isDuplicate = true)
        val imhnv9 = Node("public", isDuplicate = true)
        val ghosz3 = Node("floating_point_type", isDuplicate = true)
        val togss2 = Node("double", isDuplicate = true)
        val ibhgr6 = Node("identifier", isDuplicate = true)
        val xkjay7 = Node("getWeightLimit")
        val uikba7 = Node("formal_parameters", isDuplicate = true)
        val obwlc5 = Node("(", isDuplicate = true)
        val lkjjr1 = Node(")", isDuplicate = true)
        val zkjaq4 = Node("block", isDuplicate = true)
        val ihnnu9 = Node("{", isDuplicate = true)
        val zeauj2 = Node("return_statement", isDuplicate = true)
        val kgxjo8 = Node("return", isDuplicate = true)
        val wcvfw8 = Node("identifier", isDuplicate = true)
        val ecbzw3 = Node("weightLimitInGrams", isDuplicate = true)
        val bpwqa9 = Node(";", isDuplicate = true)
        val xwmqh1 = Node("}", isDuplicate = true)
        val txryq5 = Node("block_comment", isDuplicate = true)
        val skyuh1 = Node("method_declaration", isDuplicate = true)
        val wkyvq6 = Node("modifiers", isDuplicate = true)
        val ybjmp5 = Node("public", isDuplicate = true)
        val fgiyu8 = Node("synchronized", isDuplicate = true)
        val lgtgh3 = Node("floating_point_type", isDuplicate = true)
        val ewpwh4 = Node("double", isDuplicate = true)
        val sjmva9 = Node("identifier", isDuplicate = true)
        val ocojf7 = Node("getCurrentWeight")
        val ftyuw5 = Node("formal_parameters", isDuplicate = true)
        val rqffp9 = Node("(", isDuplicate = true)
        val diwve6 = Node(")", isDuplicate = true)
        val xxkqn6 = Node("throws", isDuplicate = true)
        val pqzim2 = Node("throws", isDuplicate = true)
        val bqohr7 = Node("type_identifier", isDuplicate = true)
        val stljs7 = Node("OverloadException", isDuplicate = true)
        val fpljl9 = Node("block", isDuplicate = true)
        val pulvs3 = Node("{", isDuplicate = true)
        val rqbtk0 = Node("if_statement", isDuplicate = true)
        val qnxhl0 = Node("if", isDuplicate = true)
        val mflvi8 = Node("parenthesized_expression", isDuplicate = true)
        val ybxnf3 = Node("(", isDuplicate = true)
        val peshe1 = Node("unary_expression", isDuplicate = true)
        val eytok6 = Node("!", isDuplicate = true)
        val ahqvd2 = Node("method_invocation", isDuplicate = true)
        val azekm3 = Node("identifier", isDuplicate = true)
        val zicks6 = Node("isPoweredUp", isDuplicate = true)
        val eqlda1 = Node("argument_list", isDuplicate = true)
        val iwkyb1 = Node("(", isDuplicate = true)
        val agxne0 = Node(")", isDuplicate = true)
        val ilygk2 = Node(")", isDuplicate = true)
        val uqmvn3 = Node("throw_statement", isDuplicate = true)
        val qabyn8 = Node("throw", isDuplicate = true)
        val nywch2 = Node("object_creation_expression", isDuplicate = true)
        val rocwp6 = Node("new", isDuplicate = true)
        val cfncx2 = Node("type_identifier", isDuplicate = true)
        val iatvb5 = Node("NoPowerException", isDuplicate = true)
        val uxxas8 = Node("argument_list", isDuplicate = true)
        val tarek8 = Node("(", isDuplicate = true)
        val iabhn4 = Node(")", isDuplicate = true)
        val kfpsl6 = Node(";", isDuplicate = true)
        val yyevf8 = Node("if_statement", isDuplicate = true)
        val neknx8 = Node("if", isDuplicate = true)
        val naxdz1 = Node("parenthesized_expression", isDuplicate = true)
        val aytxq2 = Node("(", isDuplicate = true)
        val qzspp4 = Node("binary_expression", isDuplicate = true)
        val nxhmx4 = Node("identifier", isDuplicate = true)
        val ieetu7 = Node("currentWeightInGrams", isDuplicate = true)
        val cqckt3 = Node("<=", isDuplicate = true)
        val kxjyy0 = Node("identifier", isDuplicate = true)
        val ekfoy3 = Node("weightLimitInGrams", isDuplicate = true)
        val nesor2 = Node(")", isDuplicate = true)
        val xkjja6 = Node("return_statement", isDuplicate = true)
        val sqdkl7 = Node("return", isDuplicate = true)
        val tzhwv6 = Node("binary_expression", isDuplicate = true)
        val grdgl2 = Node("identifier", isDuplicate = true)
        val civdh5 = Node("currentWeightInGrams", isDuplicate = true)
        val cmgcc5 = Node("+")
        val zrrqd0 = Node("binary_expression", isDuplicate = true)
        val mvnmm2 = Node("method_invocation", isDuplicate = true)
        val rhhut8 = Node("object_creation_expression", isDuplicate = true)
        val hokpn8 = Node("new", isDuplicate = true)
        val cmwbq4 = Node("type_identifier", isDuplicate = true)
        val oclpn2 = Node("Random", isDuplicate = true)
        val znjdo6 = Node("argument_list", isDuplicate = true)
        val ovbow5 = Node("(", isDuplicate = true)
        val tpvuu9 = Node(")", isDuplicate = true)
        val dqwac0 = Node(".", isDuplicate = true)
        val rsmwa2 = Node("identifier", isDuplicate = true)
        val pfhvt7 = Node("nextDouble")
        val obzcr5 = Node("argument_list", isDuplicate = true)
        val fpmjo4 = Node("(", isDuplicate = true)
        val ntcbd4 = Node(")", isDuplicate = true)
        val xipjv2 = Node("/")
        val ohrfh4 = Node("decimal_floating_point_literal", isDuplicate = true)
        val qzatw2 = Node("10.0")
        val tnwsn3 = Node(";", isDuplicate = true)
        val fyzxz5 = Node("throw_statement", isDuplicate = true)
        val gragx8 = Node("throw", isDuplicate = true)
        val vmrjp8 = Node("object_creation_expression", isDuplicate = true)
        val oqgxv5 = Node("new", isDuplicate = true)
        val erlmt6 = Node("type_identifier", isDuplicate = true)
        val piwaq0 = Node("OverloadException", isDuplicate = true)
        val lcdjv5 = Node("argument_list", isDuplicate = true)
        val brbhp1 = Node("(", isDuplicate = true)
        val dxpak0 = Node(")", isDuplicate = true)
        val ncclg4 = Node(";", isDuplicate = true)
        val wkxet0 = Node("}", isDuplicate = true)
        val vfdvv4 = Node("block_comment", isDuplicate = true)
        val teemn9 = Node("method_declaration", isDuplicate = true)
        val jqbbx6 = Node("modifiers", isDuplicate = true)
        val tchzc5 = Node("public", isDuplicate = true)
        val pqyda8 = Node("floating_point_type", isDuplicate = true)
        val dkhlk9 = Node("double", isDuplicate = true)
        val idmmn8 = Node("identifier", isDuplicate = true)
        val zzjcz6 = Node("getSensitivity")
        val bresu8 = Node("formal_parameters", isDuplicate = true)
        val pyovc5 = Node("(", isDuplicate = true)
        val hfzwb9 = Node(")", isDuplicate = true)
        val ktgpe2 = Node("block", isDuplicate = true)
        val kdecg1 = Node("{", isDuplicate = true)
        val jepah4 = Node("return_statement", isDuplicate = true)
        val copyp0 = Node("return", isDuplicate = true)
        val essqd2 = Node("identifier", isDuplicate = true)
        val oqllf6 = Node("sensitivity", isDuplicate = true)
        val bcgpx8 = Node(";", isDuplicate = true)
        val ngned0 = Node("}", isDuplicate = true)
        val thmxr8 = Node("block_comment", isDuplicate = true)
        val vtggg1 = Node("method_declaration", isDuplicate = true)
        val xzeps5 = Node("modifiers", isDuplicate = true)
        val yyyme7 = Node("public", isDuplicate = true)
        val bhkol7 = Node("synchronized", isDuplicate = true)
        val bxqnr0 = Node("void_type", isDuplicate = true)
        val wxvat1 = Node("identifier", isDuplicate = true)
        val jredj2 = Node("add", isDuplicate = true)
        val dnqbi3 = Node("formal_parameters", isDuplicate = true)
        val tbasb0 = Node("(", isDuplicate = true)
        val dqltg8 = Node("formal_parameter", isDuplicate = true)
        val xymhb1 = Node("type_identifier", isDuplicate = true)
        val mhgio2 = Node("Item", isDuplicate = true)
        val utqzl5 = Node("identifier", isDuplicate = true)
        val eqqci4 = Node("item", isDuplicate = true)
        val rwjpi0 = Node(")", isDuplicate = true)
        val bmxuj6 = Node("block", isDuplicate = true)
        val gxlnr8 = Node("{", isDuplicate = true)
        val sqadz6 = Node("if_statement", isDuplicate = true)
        val jlhqe5 = Node("if", isDuplicate = true)
        val thpev5 = Node("parenthesized_expression", isDuplicate = true)
        val juetr9 = Node("(", isDuplicate = true)
        val vsnrm2 = Node("unary_expression", isDuplicate = true)
        val nuomb9 = Node("!", isDuplicate = true)
        val xnkyb7 = Node("method_invocation", isDuplicate = true)
        val wrdcf8 = Node("identifier", isDuplicate = true)
        val rrtub2 = Node("isPoweredUp", isDuplicate = true)
        val citbp8 = Node("argument_list", isDuplicate = true)
        val vomei1 = Node("(", isDuplicate = true)
        val udoyk0 = Node(")", isDuplicate = true)
        val bfhdm9 = Node(")", isDuplicate = true)
        val acgho5 = Node("throw_statement", isDuplicate = true)
        val ylttf0 = Node("throw", isDuplicate = true)
        val npumb4 = Node("object_creation_expression", isDuplicate = true)
        val kavkz7 = Node("new", isDuplicate = true)
        val zvefe2 = Node("type_identifier", isDuplicate = true)
        val pcwrh2 = Node("NoPowerException", isDuplicate = true)
        val ncias7 = Node("argument_list", isDuplicate = true)
        val pcdtb6 = Node("(", isDuplicate = true)
        val ogbfw6 = Node(")", isDuplicate = true)
        val ztbgw5 = Node(";", isDuplicate = true)
        val logxr8 = Node("if_statement", isDuplicate = true)
        val qxrqb7 = Node("if", isDuplicate = true)
        val ryhcy0 = Node("parenthesized_expression", isDuplicate = true)
        val vyiey0 = Node("(", isDuplicate = true)
        val gbijv6 = Node("binary_expression", isDuplicate = true)
        val mnvka1 = Node("identifier", isDuplicate = true)
        val dnmcn9 = Node("item", isDuplicate = true)
        val hmnlj2 = Node("==")
        val vjxno3 = Node("null_literal")
        val fpgee3 = Node("null")
        val pzpdh3 = Node(")", isDuplicate = true)
        val ywfye4 = Node("throw_statement", isDuplicate = true)
        val oyino0 = Node("throw", isDuplicate = true)
        val rnlpv6 = Node("object_creation_expression", isDuplicate = true)
        val jgkoi8 = Node("new", isDuplicate = true)
        val onqmt2 = Node("type_identifier", isDuplicate = true)
        val wbgvp9 = Node("NullPointerSimulationException", isDuplicate = true)
        val wihpu1 = Node("argument_list", isDuplicate = true)
        val hkekx4 = Node("(", isDuplicate = true)
        val kwxan4 = Node("string_literal", isDuplicate = true)
        val xexlm1 = Node("\"item\"")
        val rzyhw8 = Node(")", isDuplicate = true)
        val aowpq2 = Node(";", isDuplicate = true)
        val tncod3 = Node("if_statement", isDuplicate = true)
        val vohlv3 = Node("if", isDuplicate = true)
        val bledy3 = Node("parenthesized_expression", isDuplicate = true)
        val nhkih3 = Node("(", isDuplicate = true)
        val oxvpn9 = Node("method_invocation", isDuplicate = true)
        val dpodq6 = Node("identifier", isDuplicate = true)
        val jbfep5 = Node("items", isDuplicate = true)
        val xnvxm1 = Node(".", isDuplicate = true)
        val slbnz3 = Node("identifier", isDuplicate = true)
        val ovsbs4 = Node("contains")
        val iagyz7 = Node("argument_list", isDuplicate = true)
        val qzdxn0 = Node("(", isDuplicate = true)
        val rrogc8 = Node("identifier", isDuplicate = true)
        val tktaq1 = Node("item", isDuplicate = true)
        val tmqdt3 = Node(")", isDuplicate = true)
        val mwaje7 = Node(")", isDuplicate = true)
        val uukpx2 = Node("throw_statement", isDuplicate = true)
        val wzwmm3 = Node("throw", isDuplicate = true)
        val lhjft1 = Node("object_creation_expression", isDuplicate = true)
        val apkqy2 = Node("new", isDuplicate = true)
        val fjwxq7 = Node("type_identifier", isDuplicate = true)
        val afwsj8 = Node("InvalidArgumentSimulationException", isDuplicate = true)
        val xmabx9 = Node("argument_list", isDuplicate = true)
        val wyzkj3 = Node("(", isDuplicate = true)
        val mojcb3 = Node("string_literal", isDuplicate = true)
        val facfx3 = Node("\"The same item cannot be added more than once to the scale.\"")
        val qdokp6 = Node(")", isDuplicate = true)
        val xzuxm1 = Node(";", isDuplicate = true)
        val qqcqv1 = Node("expression_statement", isDuplicate = true)
        val gkgak2 = Node("assignment_expression", isDuplicate = true)
        val opmsg4 = Node("identifier", isDuplicate = true)
        val xzdbg4 = Node("currentWeightInGrams", isDuplicate = true)
        val iawhz3 = Node("+=", isDuplicate = true)
        val wuwtu7 = Node("method_invocation", isDuplicate = true)
        val thgjb8 = Node("identifier", isDuplicate = true)
        val knkuu0 = Node("item", isDuplicate = true)
        val mcbft2 = Node(".", isDuplicate = true)
        val mhrzf8 = Node("identifier", isDuplicate = true)
        val ianvg1 = Node("getWeight", isDuplicate = true)
        val vtchj1 = Node("argument_list", isDuplicate = true)
        val vxlei3 = Node("(", isDuplicate = true)
        val iplnq7 = Node(")", isDuplicate = true)
        val uvbve6 = Node(";", isDuplicate = true)
        val wjoxc8 = Node("expression_statement", isDuplicate = true)
        val gbguk5 = Node("method_invocation", isDuplicate = true)
        val ilbkp7 = Node("identifier", isDuplicate = true)
        val tdrzl2 = Node("items", isDuplicate = true)
        val xwawo5 = Node(".", isDuplicate = true)
        val yjdgb0 = Node("identifier", isDuplicate = true)
        val mrrvt4 = Node("add", isDuplicate = true)
        val nhkwb6 = Node("argument_list", isDuplicate = true)
        val viaeb4 = Node("(", isDuplicate = true)
        val paxxw4 = Node("identifier", isDuplicate = true)
        val xeewj1 = Node("item", isDuplicate = true)
        val sayry9 = Node(")", isDuplicate = true)
        val nisci9 = Node(";", isDuplicate = true)
        val kjynr4 = Node("if_statement", isDuplicate = true)
        val orycw6 = Node("if", isDuplicate = true)
        val mcrlx8 = Node("parenthesized_expression", isDuplicate = true)
        val feswj9 = Node("(", isDuplicate = true)
        val hxiil3 = Node("binary_expression", isDuplicate = true)
        val mtdpv3 = Node("identifier", isDuplicate = true)
        val wtomq1 = Node("currentWeightInGrams", isDuplicate = true)
        val demth6 = Node(">", isDuplicate = true)
        val jhups7 = Node("identifier", isDuplicate = true)
        val iigzs3 = Node("weightLimitInGrams", isDuplicate = true)
        val jiund1 = Node(")", isDuplicate = true)
        val kwmps7 = Node("expression_statement", isDuplicate = true)
        val ufene7 = Node("method_invocation", isDuplicate = true)
        val bgnmn9 = Node("identifier", isDuplicate = true)
        val nhymg5 = Node("notifyOverload", isDuplicate = true)
        val nrort8 = Node("argument_list", isDuplicate = true)
        val lpzsh9 = Node("(", isDuplicate = true)
        val wlyvv0 = Node(")", isDuplicate = true)
        val juflt1 = Node(";", isDuplicate = true)
        val zdsui8 = Node("if_statement", isDuplicate = true)
        val kxulz1 = Node("if", isDuplicate = true)
        val fftye6 = Node("parenthesized_expression", isDuplicate = true)
        val rjrje7 = Node("(", isDuplicate = true)
        val lnomh3 = Node("binary_expression", isDuplicate = true)
        val whakw7 = Node("method_invocation", isDuplicate = true)
        val buuwf1 = Node("identifier", isDuplicate = true)
        val qnagl2 = Node("Math", isDuplicate = true)
        val ommos9 = Node(".", isDuplicate = true)
        val rimyj1 = Node("identifier", isDuplicate = true)
        val qylel4 = Node("abs", isDuplicate = true)
        val apmyb4 = Node("argument_list", isDuplicate = true)
        val csmcz8 = Node("(", isDuplicate = true)
        val dyljl9 = Node("binary_expression", isDuplicate = true)
        val bugyg8 = Node("identifier", isDuplicate = true)
        val nwazo3 = Node("currentWeightInGrams", isDuplicate = true)
        val remuf1 = Node("-", isDuplicate = true)
        val mwmtj4 = Node("identifier", isDuplicate = true)
        val hfvmz6 = Node("weightAtLastEvent", isDuplicate = true)
        val txrzp0 = Node(")", isDuplicate = true)
        val uhbaa7 = Node(">", isDuplicate = true)
        val oluzi4 = Node("identifier", isDuplicate = true)
        val dexgy7 = Node("sensitivity", isDuplicate = true)
        val vbuws7 = Node(")", isDuplicate = true)
        val yffqd7 = Node("expression_statement", isDuplicate = true)
        val refmw1 = Node("method_invocation", isDuplicate = true)
        val nlbll1 = Node("identifier", isDuplicate = true)
        val bnott1 = Node("notifyWeightChanged", isDuplicate = true)
        val xpgoy8 = Node("argument_list", isDuplicate = true)
        val rpdtw0 = Node("(", isDuplicate = true)
        val lmiik0 = Node(")", isDuplicate = true)
        val oihmk3 = Node(";", isDuplicate = true)
        val yracm3 = Node("}", isDuplicate = true)
        val helpj3 = Node("block_comment", isDuplicate = true)
        val mbgfu6 = Node("method_declaration", isDuplicate = true)
        val oqxjv1 = Node("modifiers", isDuplicate = true)
        val ynayy6 = Node("public", isDuplicate = true)
        val gzpmp8 = Node("synchronized", isDuplicate = true)
        val iittj6 = Node("void_type", isDuplicate = true)
        val ojain7 = Node("identifier", isDuplicate = true)
        val oagmz8 = Node("remove", isDuplicate = true)
        val xlern3 = Node("formal_parameters", isDuplicate = true)
        val ompcx2 = Node("(", isDuplicate = true)
        val dvfqv5 = Node("formal_parameter", isDuplicate = true)
        val dcwck0 = Node("type_identifier", isDuplicate = true)
        val jyhof6 = Node("Item", isDuplicate = true)
        val zayuy5 = Node("identifier", isDuplicate = true)
        val lobbh1 = Node("item", isDuplicate = true)
        val helwn8 = Node(")", isDuplicate = true)
        val wqony5 = Node("block", isDuplicate = true)
        val oqnsx5 = Node("{", isDuplicate = true)
        val yqifa4 = Node("if_statement", isDuplicate = true)
        val jqfad1 = Node("if", isDuplicate = true)
        val vwjcn6 = Node("parenthesized_expression", isDuplicate = true)
        val setqj0 = Node("(", isDuplicate = true)
        val dyvxd3 = Node("unary_expression", isDuplicate = true)
        val bzpjh5 = Node("!", isDuplicate = true)
        val mbjok9 = Node("method_invocation", isDuplicate = true)
        val shdwy5 = Node("identifier", isDuplicate = true)
        val ipzuv3 = Node("isPoweredUp", isDuplicate = true)
        val evxll7 = Node("argument_list", isDuplicate = true)
        val eigqk6 = Node("(", isDuplicate = true)
        val hksuv4 = Node(")", isDuplicate = true)
        val bpiyc4 = Node(")", isDuplicate = true)
        val vbodn0 = Node("throw_statement", isDuplicate = true)
        val rilnn0 = Node("throw", isDuplicate = true)
        val vdvcg8 = Node("object_creation_expression", isDuplicate = true)
        val scuad5 = Node("new", isDuplicate = true)
        val nftgj9 = Node("type_identifier", isDuplicate = true)
        val ozuwv8 = Node("NoPowerException", isDuplicate = true)
        val rdgsm2 = Node("argument_list", isDuplicate = true)
        val wgdog2 = Node("(", isDuplicate = true)
        val uofvs0 = Node(")", isDuplicate = true)
        val inalw8 = Node(";", isDuplicate = true)
        val qkltu4 = Node("if_statement", isDuplicate = true)
        val rkccl2 = Node("if", isDuplicate = true)
        val nnmfp1 = Node("parenthesized_expression", isDuplicate = true)
        val stoki5 = Node("(", isDuplicate = true)
        val xzitq2 = Node("unary_expression", isDuplicate = true)
        val hravu4 = Node("!", isDuplicate = true)
        val beprc3 = Node("method_invocation", isDuplicate = true)
        val bramq3 = Node("identifier", isDuplicate = true)
        val cfrvk3 = Node("items", isDuplicate = true)
        val hwmek0 = Node(".", isDuplicate = true)
        val pakkt4 = Node("identifier", isDuplicate = true)
        val nynfo6 = Node("remove", isDuplicate = true)
        val tspby0 = Node("argument_list", isDuplicate = true)
        val rncog6 = Node("(", isDuplicate = true)
        val mrsmz3 = Node("identifier", isDuplicate = true)
        val mrgrt4 = Node("item", isDuplicate = true)
        val cxyml8 = Node(")", isDuplicate = true)
        val eqcab9 = Node(")", isDuplicate = true)
        val hgftt9 = Node("throw_statement", isDuplicate = true)
        val oqifg6 = Node("throw", isDuplicate = true)
        val nclde1 = Node("object_creation_expression", isDuplicate = true)
        val kujgi4 = Node("new", isDuplicate = true)
        val gwxme1 = Node("type_identifier", isDuplicate = true)
        val dyzcd2 = Node("InvalidArgumentSimulationException", isDuplicate = true)
        val khyzm4 = Node("argument_list", isDuplicate = true)
        val fmtey3 = Node("(", isDuplicate = true)
        val kxpww1 = Node("string_literal", isDuplicate = true)
        val ximub7 = Node("\"The item was not found amongst those on the scale.\"")
        val zlsrw3 = Node(")", isDuplicate = true)
        val srjnt9 = Node(";", isDuplicate = true)
        val ihxtc9 = Node("line_comment")
        val fjpcu8 = Node("local_variable_declaration")
        val cgggc1 = Node("floating_point_type", isDuplicate = true)
        val flueh4 = Node("double", isDuplicate = true)
        val citib0 = Node("variable_declarator", isDuplicate = true)
        val xbzmp2 = Node("identifier", isDuplicate = true)
        val qacwj3 = Node("newWeightInGrams", isDuplicate = true)
        val uqucv3 = Node("=", isDuplicate = true)
        val kdhma9 = Node("decimal_floating_point_literal", isDuplicate = true)
        val ptqff0 = Node("0.0", isDuplicate = true)
        val jvkgm6 = Node(";", isDuplicate = true)
        val fevnc9 = Node("enhanced_for_statement", isDuplicate = true)
        val hlsjq1 = Node("for", isDuplicate = true)
        val rdnqg1 = Node("(", isDuplicate = true)
        val ccfom0 = Node("type_identifier", isDuplicate = true)
        val wbkmj6 = Node("Item", isDuplicate = true)
        val ppjnq5 = Node("identifier", isDuplicate = true)
        val llcpd6 = Node("itemOnScale", isDuplicate = true)
        val eoqsv2 = Node(":", isDuplicate = true)
        val zxhua3 = Node("identifier", isDuplicate = true)
        val chdvr3 = Node("items", isDuplicate = true)
        val obqbl8 = Node(")", isDuplicate = true)
        val oxkdj5 = Node("expression_statement", isDuplicate = true)
        val qgkiv7 = Node("assignment_expression", isDuplicate = true)
        val ltprv2 = Node("identifier", isDuplicate = true)
        val hgbzu3 = Node("newWeightInGrams", isDuplicate = true)
        val xaeiv7 = Node("+=", isDuplicate = true)
        val uhpzp5 = Node("method_invocation", isDuplicate = true)
        val zitcy8 = Node("identifier", isDuplicate = true)
        val tfnfn8 = Node("itemOnScale", isDuplicate = true)
        val efsft9 = Node(".", isDuplicate = true)
        val pabbq9 = Node("identifier", isDuplicate = true)
        val zakxy7 = Node("getWeight", isDuplicate = true)
        val lrxht4 = Node("argument_list", isDuplicate = true)
        val vmmgs7 = Node("(", isDuplicate = true)
        val eshia8 = Node(")", isDuplicate = true)
        val ccfqj9 = Node(";", isDuplicate = true)
        val alnvw2 = Node("expression_statement", isDuplicate = true)
        val irdbj2 = Node("assignment_expression", isDuplicate = true)
        val xotpj4 = Node("identifier", isDuplicate = true)
        val tmemu7 = Node("currentWeightInGrams", isDuplicate = true)
        val giwpi2 = Node("=", isDuplicate = true)
        val lcsbc3 = Node("identifier", isDuplicate = true)
        val vxgsf1 = Node("newWeightInGrams", isDuplicate = true)
        val yowem0 = Node(";", isDuplicate = true)
        val zbqrh2 = Node("if_statement", isDuplicate = true)
        val vndkm5 = Node("if", isDuplicate = true)
        val giuiw1 = Node("parenthesized_expression", isDuplicate = true)
        val xcwkg5 = Node("(", isDuplicate = true)
        val erevu9 = Node("binary_expression", isDuplicate = true)
        val ebeuz5 = Node("binary_expression", isDuplicate = true)
        val ocyvc9 = Node("identifier", isDuplicate = true)
        val olmcw6 = Node("weightAtLastEvent", isDuplicate = true)
        val pbrbx7 = Node(">", isDuplicate = true)
        val woifv1 = Node("identifier", isDuplicate = true)
        val vnfvr5 = Node("weightLimitInGrams", isDuplicate = true)
        val gnbfx9 = Node("&&", isDuplicate = true)
        val ubdmf5 = Node("binary_expression", isDuplicate = true)
        val oiabl2 = Node("identifier", isDuplicate = true)
        val zljsg2 = Node("newWeightInGrams", isDuplicate = true)
        val onwfl7 = Node("<=", isDuplicate = true)
        val ibmvk8 = Node("identifier", isDuplicate = true)
        val bypti2 = Node("weightLimitInGrams", isDuplicate = true)
        val umnol5 = Node(")", isDuplicate = true)
        val scdxc8 = Node("expression_statement", isDuplicate = true)
        val izsoy0 = Node("method_invocation", isDuplicate = true)
        val ieccn7 = Node("identifier", isDuplicate = true)
        val ginix3 = Node("notifyOutOfOverload", isDuplicate = true)
        val axyfx3 = Node("argument_list", isDuplicate = true)
        val iuozl1 = Node("(", isDuplicate = true)
        val leldz9 = Node(")", isDuplicate = true)
        val ixoro1 = Node(";", isDuplicate = true)
        val phpns3 = Node("if_statement", isDuplicate = true)
        val zsjwx4 = Node("if", isDuplicate = true)
        val djpyu7 = Node("parenthesized_expression", isDuplicate = true)
        val zjblg7 = Node("(", isDuplicate = true)
        val fytvv3 = Node("binary_expression", isDuplicate = true)
        val skpky8 = Node("binary_expression", isDuplicate = true)
        val xgkid0 = Node("identifier", isDuplicate = true)
        val ohzdj9 = Node("currentWeightInGrams", isDuplicate = true)
        val kxoza4 = Node("<=", isDuplicate = true)
        val kxmgy3 = Node("identifier", isDuplicate = true)
        val qvipw2 = Node("weightLimitInGrams", isDuplicate = true)
        val cgbkj8 = Node("&&", isDuplicate = true)
        val dahqa6 = Node("binary_expression", isDuplicate = true)
        val sofaj1 = Node("method_invocation", isDuplicate = true)
        val dvuuu2 = Node("identifier", isDuplicate = true)
        val ogufj2 = Node("Math", isDuplicate = true)
        val shxme2 = Node(".", isDuplicate = true)
        val cjjkg1 = Node("identifier", isDuplicate = true)
        val donli0 = Node("abs", isDuplicate = true)
        val zpwym6 = Node("argument_list", isDuplicate = true)
        val mejbf0 = Node("(", isDuplicate = true)
        val fcoap9 = Node("binary_expression", isDuplicate = true)
        val pwiva1 = Node("identifier", isDuplicate = true)
        val nbxvn4 = Node("weightAtLastEvent", isDuplicate = true)
        val mozzx5 = Node("-", isDuplicate = true)
        val jtcfh0 = Node("identifier", isDuplicate = true)
        val ijyiw1 = Node("currentWeightInGrams", isDuplicate = true)
        val cbswa6 = Node(")", isDuplicate = true)
        val jhhky1 = Node(">", isDuplicate = true)
        val iutvr1 = Node("identifier", isDuplicate = true)
        val tnzbo0 = Node("sensitivity", isDuplicate = true)
        val awsxd2 = Node(")", isDuplicate = true)
        val ddsjk8 = Node("expression_statement", isDuplicate = true)
        val gmrsa2 = Node("method_invocation", isDuplicate = true)
        val okqdf5 = Node("identifier", isDuplicate = true)
        val frvrl0 = Node("notifyWeightChanged", isDuplicate = true)
        val ylguo2 = Node("argument_list", isDuplicate = true)
        val slrmu7 = Node("(", isDuplicate = true)
        val onuzg2 = Node(")", isDuplicate = true)
        val mfsux0 = Node(";", isDuplicate = true)
        val btmpt8 = Node("}", isDuplicate = true)
        val cxpih5 = Node("method_declaration", isDuplicate = true)
        val pmcuq3 = Node("modifiers", isDuplicate = true)
        val ztlgy8 = Node("private", isDuplicate = true)
        val azrrh9 = Node("void_type", isDuplicate = true)
        val cpmno9 = Node("identifier", isDuplicate = true)
        val bgwuc3 = Node("notifyOverload", isDuplicate = true)
        val modza2 = Node("formal_parameters", isDuplicate = true)
        val kudjn7 = Node("(", isDuplicate = true)
        val mssvm9 = Node(")", isDuplicate = true)
        val sdsse6 = Node("block", isDuplicate = true)
        val fakqq4 = Node("{", isDuplicate = true)
        val naocg5 = Node("enhanced_for_statement", isDuplicate = true)
        val nmwpt9 = Node("for", isDuplicate = true)
        val itmck0 = Node("(", isDuplicate = true)
        val khdlb5 = Node("type_identifier", isDuplicate = true)
        val isuaf0 = Node("ElectronicScaleListener", isDuplicate = true)
        val ajada6 = Node("identifier", isDuplicate = true)
        val efweg9 = Node("l", isDuplicate = true)
        val znbsu9 = Node(":", isDuplicate = true)
        val reduy8 = Node("method_invocation", isDuplicate = true)
        val guwwr4 = Node("identifier", isDuplicate = true)
        val zkdgw9 = Node("listeners", isDuplicate = true)
        val ovwsj0 = Node("argument_list", isDuplicate = true)
        val cndki4 = Node("(", isDuplicate = true)
        val vxpfx4 = Node(")", isDuplicate = true)
        val jtjak3 = Node(")", isDuplicate = true)
        val ewroi5 = Node("expression_statement", isDuplicate = true)
        val wfyve1 = Node("method_invocation", isDuplicate = true)
        val phbzd5 = Node("identifier", isDuplicate = true)
        val hesfy3 = Node("l", isDuplicate = true)
        val tbops9 = Node(".", isDuplicate = true)
        val lfsmm5 = Node("identifier", isDuplicate = true)
        val yciwm1 = Node("overload")
        val nmbfk9 = Node("argument_list", isDuplicate = true)
        val dffqr9 = Node("(", isDuplicate = true)
        val oufbs6 = Node("this", isDuplicate = true)
        val soogi2 = Node(")", isDuplicate = true)
        val gnpje1 = Node(";", isDuplicate = true)
        val wtcwf9 = Node("}", isDuplicate = true)
        val vsdba1 = Node("method_declaration", isDuplicate = true)
        val prbrj6 = Node("modifiers", isDuplicate = true)
        val jwamw6 = Node("private", isDuplicate = true)
        val rkxqo5 = Node("void_type", isDuplicate = true)
        val soyvt6 = Node("identifier", isDuplicate = true)
        val kpvfw7 = Node("notifyOutOfOverload", isDuplicate = true)
        val svpfj3 = Node("formal_parameters", isDuplicate = true)
        val ayuxa5 = Node("(", isDuplicate = true)
        val bnebl8 = Node(")", isDuplicate = true)
        val csuhe6 = Node("block", isDuplicate = true)
        val kfvaj9 = Node("{", isDuplicate = true)
        val xdcvh1 = Node("expression_statement", isDuplicate = true)
        val vneqr1 = Node("assignment_expression", isDuplicate = true)
        val vhszf9 = Node("identifier", isDuplicate = true)
        val wcnhv9 = Node("weightAtLastEvent", isDuplicate = true)
        val zcddh7 = Node("=", isDuplicate = true)
        val ncwni3 = Node("identifier", isDuplicate = true)
        val swegz9 = Node("currentWeightInGrams", isDuplicate = true)
        val dfwwa1 = Node(";", isDuplicate = true)
        val bnkrd7 = Node("enhanced_for_statement", isDuplicate = true)
        val jgbza0 = Node("for", isDuplicate = true)
        val voops2 = Node("(", isDuplicate = true)
        val bxest0 = Node("type_identifier", isDuplicate = true)
        val awscc6 = Node("ElectronicScaleListener", isDuplicate = true)
        val fucxw7 = Node("identifier", isDuplicate = true)
        val ptncg8 = Node("l", isDuplicate = true)
        val cepak2 = Node(":", isDuplicate = true)
        val ljacg4 = Node("method_invocation", isDuplicate = true)
        val ypiid6 = Node("identifier", isDuplicate = true)
        val ttoks0 = Node("listeners", isDuplicate = true)
        val xhtzn3 = Node("argument_list", isDuplicate = true)
        val faodr4 = Node("(", isDuplicate = true)
        val qphps5 = Node(")", isDuplicate = true)
        val zftlv9 = Node(")", isDuplicate = true)
        val bvkba7 = Node("expression_statement", isDuplicate = true)
        val ufvom6 = Node("method_invocation", isDuplicate = true)
        val zdeeh3 = Node("identifier", isDuplicate = true)
        val dvher8 = Node("l", isDuplicate = true)
        val tdpxi8 = Node(".", isDuplicate = true)
        val gsyzg1 = Node("identifier", isDuplicate = true)
        val vvccf7 = Node("outOfOverload")
        val qztfg5 = Node("argument_list", isDuplicate = true)
        val dfjqk0 = Node("(", isDuplicate = true)
        val qnsbf1 = Node("this", isDuplicate = true)
        val uhgqs1 = Node(")", isDuplicate = true)
        val gmlyx9 = Node(";", isDuplicate = true)
        val digje0 = Node("}", isDuplicate = true)
        val dxybj6 = Node("method_declaration", isDuplicate = true)
        val tjyue7 = Node("modifiers", isDuplicate = true)
        val axoir5 = Node("private", isDuplicate = true)
        val hcsis3 = Node("void_type", isDuplicate = true)
        val wqory5 = Node("identifier", isDuplicate = true)
        val zckbn5 = Node("notifyWeightChanged", isDuplicate = true)
        val xenva2 = Node("formal_parameters", isDuplicate = true)
        val voeco8 = Node("(", isDuplicate = true)
        val ogljq2 = Node(")", isDuplicate = true)
        val vzlrz4 = Node("block", isDuplicate = true)
        val mbznb1 = Node("{", isDuplicate = true)
        val dhzwm6 = Node("expression_statement", isDuplicate = true)
        val pbuuk7 = Node("assignment_expression", isDuplicate = true)
        val yojjx9 = Node("identifier", isDuplicate = true)
        val zhlff6 = Node("weightAtLastEvent", isDuplicate = true)
        val uyojh9 = Node("=", isDuplicate = true)
        val hkrzg4 = Node("identifier", isDuplicate = true)
        val vszmy9 = Node("currentWeightInGrams", isDuplicate = true)
        val bdmcw3 = Node(";", isDuplicate = true)
        val rohst1 = Node("enhanced_for_statement", isDuplicate = true)
        val abldg7 = Node("for", isDuplicate = true)
        val esvtd8 = Node("(", isDuplicate = true)
        val mceby1 = Node("type_identifier", isDuplicate = true)
        val rnbfa8 = Node("ElectronicScaleListener", isDuplicate = true)
        val tmqhs1 = Node("identifier", isDuplicate = true)
        val zefzq0 = Node("l", isDuplicate = true)
        val zxehi4 = Node(":", isDuplicate = true)
        val sdhbw0 = Node("method_invocation", isDuplicate = true)
        val zzoae2 = Node("identifier", isDuplicate = true)
        val cjakn4 = Node("listeners", isDuplicate = true)
        val hudwc1 = Node("argument_list", isDuplicate = true)
        val zjtkq6 = Node("(", isDuplicate = true)
        val tsqdi4 = Node(")", isDuplicate = true)
        val cvldk9 = Node(")", isDuplicate = true)
        val deaeb9 = Node("expression_statement", isDuplicate = true)
        val mflhv2 = Node("method_invocation", isDuplicate = true)
        val maajy2 = Node("identifier", isDuplicate = true)
        val akjpp2 = Node("l", isDuplicate = true)
        val imdza8 = Node(".", isDuplicate = true)
        val tvktk0 = Node("identifier", isDuplicate = true)
        val rprfi1 = Node("weightChanged")
        val dtucw8 = Node("argument_list", isDuplicate = true)
        val kyefw8 = Node("(", isDuplicate = true)
        val tixot9 = Node("this", isDuplicate = true)
        val qlgoj9 = Node(",", isDuplicate = true)
        val qfahf6 = Node("identifier", isDuplicate = true)
        val vbydx3 = Node("currentWeightInGrams", isDuplicate = true)
        val jqpbx2 = Node(")", isDuplicate = true)
        val olebk6 = Node(";", isDuplicate = true)
        val gsepl5 = Node("}", isDuplicate = true)
        val rrocu2 = Node("}", isDuplicate = true)

        graph2 = Graph.from(
            nodes = listOf(jjglx4, ryalw1, jivyv6, ojhgu1, krgmo3, hffyk6, msjnc0, xejsk9, rpsju9, bompj5, yzpzc4, wbfxi4, kxdcq3, djwwa9, usrcg5, ggzqm1, rcxlq3, fwyet7, qdyuc1, nxzba3, ztayf9, eqssj6, wlflc2, mpqpy1, zgsrv1, vdtwi2, wubks5, rlxxs5, bsvyp2, viruz8, eaiti2, bhqjh8, bomfn1, vnmrm2, tgugh5, vqulf1, xrhmc8, frwwh1, clvcp6, quyyj9, tgniy8, yjpfa7, tsgbl6, gtkjf8, qpphq3, wicay9, dxngk2, iqyap6, jqjib0, xklvn0, woxmc3, xtezf6, zerba9, mwcud4, dfuhj3, pailf1, uqbnd4, wffpf8, jzoph8, lebkd6, fibmm8, mryqx7, qbrnp4, cusyl1, aknqw5, khniw6, czceb4, frcag1, obvmz6, igylk8, eqpam9, hukrt6, kelgi2, xegqb3, jynwb7, jfeyk7, eioec8, jfaps0, eqzms6, xukvd9, yaymr6, nyuty7, rveyk6, eibbv3, ucekb0, eyeva2, klcpo9, xrhlf0, lqdxa7, xgbxq5, vjfim2, zubdn4, lnuoq8, ixkyr2, kmiam9, wjwim5, zcoit1, iqywu4, knqxr3, zpxof3, gskft0, eubbz1, ydfra2, xkjgt0, ukjya3, gdnpw1, dmkzx8, tebia4, xdhbg3, siucn6, nhtor8, pknzu4, xufol7, wfhpi5, avrpy7, yshud2, euonj7, rwsmq5, tlvih7, tzeav7, spbeq5, dhnnr6, spmmf0, zylna9, ynycw6, zuhkk7, slvjm6, cqyzw1, dbqqq6, rfmxp7, kdswb3, waypv2, sznbn2, elxai4, bbtwz7, niwro4, pneqr8, ogcuj3, kchou6, vnmaj6, yjlsz1, pchec8, cmkrb3, ibpzm2, qbgol9, yrmmt6, abpfi0, rsdgf9, ushhp7, szhoe3, mhfds1, abfhz1, cwpei3, kjkmz1, foayb7, sizkj4, eqqeh2, claio0, efvew6, ecuay4, bymms0, jryve8, ygerl2, uxurz8, lysxr4, mznvv4, gsqps6, ccnbp7, pwcml2, zpkcc6, roius4, sepnk2, utxod3, fbqtg5, udulb5, bvpfh2, wrasv4, lsbio8, oaaws3, tflcx7, urzrb8, jpgmq0, zxseu8, gdgfi7, xiqds1, gagrf8, mpknh5, dfoib5, mbign8, iwxmu5, opizh3, zqzzx0, lktcm1, iivqy4, dcxmu4, nvnsa3, abxgn9, neuwd8, wawdg7, meogr8, ynzqa0, mdujt6, rvgrq7, gkmvc8, puwzn5, wdtyf5, xuoln3, mfpss3, jyvbm8, blclz8, srtrm2, ripet3, jzotx0, bomts1, rzvbl7, losft5, zjndq8, itqpv8, yrvie1, ohtcn5, irpyq8, hvrlx7, qfshy0, xlgqs1, jfwfn8, sslxm9, mavvi1, mmumc5, niqgs9, rnety7, mztlr2, uzkgx9, hgany3, xgdbd7, fkxsa8, xicoa6, vuhyd8, fvrol2, slmao4, vammx3, fulvc8, zaxhp0, hhenq3, xntvk3, wfggg1, nhvls4, jjafl0, tfgvd5, zndcx8, hnsoz0, zjpze6, dafri2, cpfft3, calbd1, kvpxf4, srisj4, zqmdb8, edxqa8, ydhdn2, oiqrw2, uvian5, caekx4, vwlvw5, oqmie5, nxmjc0, iebrm2, dvidt2, qbsiv3, jxuja8, kwruf7, yqszr4, qjamq3, kbyet0, fesua7, tctge8, rrgny6, pciwj1, upydl1, zikfk9, hvypg2, syxnf8, mdwmc1, hefgn5, sxies3, cmnza3, okyfn9, nniqg1, avzdy0, drjtl4, mmzie5, fxecr5, fivrt4, nspeu6, wmurc2, zhfia3, kfbnp5, fmvnc5, ravmj7, lcyeg1, bdyuq0, mcxwr1, iuyrl0, tqsgx5, oqjge2, vdtop0, iekyg2, hqhnr1, guehh7, ztcxq6, uqrjw1, pdzgs3, aybdb7, oyaqp9, moakt1, lfbuh8, taxpj6, klwsi4, skaio6, tcmfw1, uslej9, ekkyj3, zwzzh2, wvdff9, pysmg7, bvonc3, ocfon4, doztw6, hqvnu5, kptrr2, secai5, zdvhf3, cnusb2, zdzkx7, xauto9, dlyyd6, xetal7, mwyaz0, imhnv9, ghosz3, togss2, ibhgr6, xkjay7, uikba7, obwlc5, lkjjr1, zkjaq4, ihnnu9, zeauj2, kgxjo8, wcvfw8, ecbzw3, bpwqa9, xwmqh1, txryq5, skyuh1, wkyvq6, ybjmp5, fgiyu8, lgtgh3, ewpwh4, sjmva9, ocojf7, ftyuw5, rqffp9, diwve6, xxkqn6, pqzim2, bqohr7, stljs7, fpljl9, pulvs3, rqbtk0, qnxhl0, mflvi8, ybxnf3, peshe1, eytok6, ahqvd2, azekm3, zicks6, eqlda1, iwkyb1, agxne0, ilygk2, uqmvn3, qabyn8, nywch2, rocwp6, cfncx2, iatvb5, uxxas8, tarek8, iabhn4, kfpsl6, yyevf8, neknx8, naxdz1, aytxq2, qzspp4, nxhmx4, ieetu7, cqckt3, kxjyy0, ekfoy3, nesor2, xkjja6, sqdkl7, tzhwv6, grdgl2, civdh5, cmgcc5, zrrqd0, mvnmm2, rhhut8, hokpn8, cmwbq4, oclpn2, znjdo6, ovbow5, tpvuu9, dqwac0, rsmwa2, pfhvt7, obzcr5, fpmjo4, ntcbd4, xipjv2, ohrfh4, qzatw2, tnwsn3, fyzxz5, gragx8, vmrjp8, oqgxv5, erlmt6, piwaq0, lcdjv5, brbhp1, dxpak0, ncclg4, wkxet0, vfdvv4, teemn9, jqbbx6, tchzc5, pqyda8, dkhlk9, idmmn8, zzjcz6, bresu8, pyovc5, hfzwb9, ktgpe2, kdecg1, jepah4, copyp0, essqd2, oqllf6, bcgpx8, ngned0, thmxr8, vtggg1, xzeps5, yyyme7, bhkol7, bxqnr0, wxvat1, jredj2, dnqbi3, tbasb0, dqltg8, xymhb1, mhgio2, utqzl5, eqqci4, rwjpi0, bmxuj6, gxlnr8, sqadz6, jlhqe5, thpev5, juetr9, vsnrm2, nuomb9, xnkyb7, wrdcf8, rrtub2, citbp8, vomei1, udoyk0, bfhdm9, acgho5, ylttf0, npumb4, kavkz7, zvefe2, pcwrh2, ncias7, pcdtb6, ogbfw6, ztbgw5, logxr8, qxrqb7, ryhcy0, vyiey0, gbijv6, mnvka1, dnmcn9, hmnlj2, vjxno3, fpgee3, pzpdh3, ywfye4, oyino0, rnlpv6, jgkoi8, onqmt2, wbgvp9, wihpu1, hkekx4, kwxan4, xexlm1, rzyhw8, aowpq2, tncod3, vohlv3, bledy3, nhkih3, oxvpn9, dpodq6, jbfep5, xnvxm1, slbnz3, ovsbs4, iagyz7, qzdxn0, rrogc8, tktaq1, tmqdt3, mwaje7, uukpx2, wzwmm3, lhjft1, apkqy2, fjwxq7, afwsj8, xmabx9, wyzkj3, mojcb3, facfx3, qdokp6, xzuxm1, qqcqv1, gkgak2, opmsg4, xzdbg4, iawhz3, wuwtu7, thgjb8, knkuu0, mcbft2, mhrzf8, ianvg1, vtchj1, vxlei3, iplnq7, uvbve6, wjoxc8, gbguk5, ilbkp7, tdrzl2, xwawo5, yjdgb0, mrrvt4, nhkwb6, viaeb4, paxxw4, xeewj1, sayry9, nisci9, kjynr4, orycw6, mcrlx8, feswj9, hxiil3, mtdpv3, wtomq1, demth6, jhups7, iigzs3, jiund1, kwmps7, ufene7, bgnmn9, nhymg5, nrort8, lpzsh9, wlyvv0, juflt1, zdsui8, kxulz1, fftye6, rjrje7, lnomh3, whakw7, buuwf1, qnagl2, ommos9, rimyj1, qylel4, apmyb4, csmcz8, dyljl9, bugyg8, nwazo3, remuf1, mwmtj4, hfvmz6, txrzp0, uhbaa7, oluzi4, dexgy7, vbuws7, yffqd7, refmw1, nlbll1, bnott1, xpgoy8, rpdtw0, lmiik0, oihmk3, yracm3, helpj3, mbgfu6, oqxjv1, ynayy6, gzpmp8, iittj6, ojain7, oagmz8, xlern3, ompcx2, dvfqv5, dcwck0, jyhof6, zayuy5, lobbh1, helwn8, wqony5, oqnsx5, yqifa4, jqfad1, vwjcn6, setqj0, dyvxd3, bzpjh5, mbjok9, shdwy5, ipzuv3, evxll7, eigqk6, hksuv4, bpiyc4, vbodn0, rilnn0, vdvcg8, scuad5, nftgj9, ozuwv8, rdgsm2, wgdog2, uofvs0, inalw8, qkltu4, rkccl2, nnmfp1, stoki5, xzitq2, hravu4, beprc3, bramq3, cfrvk3, hwmek0, pakkt4, nynfo6, tspby0, rncog6, mrsmz3, mrgrt4, cxyml8, eqcab9, hgftt9, oqifg6, nclde1, kujgi4, gwxme1, dyzcd2, khyzm4, fmtey3, kxpww1, ximub7, zlsrw3, srjnt9, ihxtc9, fjpcu8, cgggc1, flueh4, citib0, xbzmp2, qacwj3, uqucv3, kdhma9, ptqff0, jvkgm6, fevnc9, hlsjq1, rdnqg1, ccfom0, wbkmj6, ppjnq5, llcpd6, eoqsv2, zxhua3, chdvr3, obqbl8, oxkdj5, qgkiv7, ltprv2, hgbzu3, xaeiv7, uhpzp5, zitcy8, tfnfn8, efsft9, pabbq9, zakxy7, lrxht4, vmmgs7, eshia8, ccfqj9, alnvw2, irdbj2, xotpj4, tmemu7, giwpi2, lcsbc3, vxgsf1, yowem0, zbqrh2, vndkm5, giuiw1, xcwkg5, erevu9, ebeuz5, ocyvc9, olmcw6, pbrbx7, woifv1, vnfvr5, gnbfx9, ubdmf5, oiabl2, zljsg2, onwfl7, ibmvk8, bypti2, umnol5, scdxc8, izsoy0, ieccn7, ginix3, axyfx3, iuozl1, leldz9, ixoro1, phpns3, zsjwx4, djpyu7, zjblg7, fytvv3, skpky8, xgkid0, ohzdj9, kxoza4, kxmgy3, qvipw2, cgbkj8, dahqa6, sofaj1, dvuuu2, ogufj2, shxme2, cjjkg1, donli0, zpwym6, mejbf0, fcoap9, pwiva1, nbxvn4, mozzx5, jtcfh0, ijyiw1, cbswa6, jhhky1, iutvr1, tnzbo0, awsxd2, ddsjk8, gmrsa2, okqdf5, frvrl0, ylguo2, slrmu7, onuzg2, mfsux0, btmpt8, cxpih5, pmcuq3, ztlgy8, azrrh9, cpmno9, bgwuc3, modza2, kudjn7, mssvm9, sdsse6, fakqq4, naocg5, nmwpt9, itmck0, khdlb5, isuaf0, ajada6, efweg9, znbsu9, reduy8, guwwr4, zkdgw9, ovwsj0, cndki4, vxpfx4, jtjak3, ewroi5, wfyve1, phbzd5, hesfy3, tbops9, lfsmm5, yciwm1, nmbfk9, dffqr9, oufbs6, soogi2, gnpje1, wtcwf9, vsdba1, prbrj6, jwamw6, rkxqo5, soyvt6, kpvfw7, svpfj3, ayuxa5, bnebl8, csuhe6, kfvaj9, xdcvh1, vneqr1, vhszf9, wcnhv9, zcddh7, ncwni3, swegz9, dfwwa1, bnkrd7, jgbza0, voops2, bxest0, awscc6, fucxw7, ptncg8, cepak2, ljacg4, ypiid6, ttoks0, xhtzn3, faodr4, qphps5, zftlv9, bvkba7, ufvom6, zdeeh3, dvher8, tdpxi8, gsyzg1, vvccf7, qztfg5, dfjqk0, qnsbf1, uhgqs1, gmlyx9, digje0, dxybj6, tjyue7, axoir5, hcsis3, wqory5, zckbn5, xenva2, voeco8, ogljq2, vzlrz4, mbznb1, dhzwm6, pbuuk7, yojjx9, zhlff6, uyojh9, hkrzg4, vszmy9, bdmcw3, rohst1, abldg7, esvtd8, mceby1, rnbfa8, tmqhs1, zefzq0, zxehi4, sdhbw0, zzoae2, cjakn4, hudwc1, zjtkq6, tsqdi4, cvldk9, deaeb9, mflhv2, maajy2, akjpp2, imdza8, tvktk0, rprfi1, dtucw8, kyefw8, tixot9, qlgoj9, qfahf6, vbydx3, jqpbx2, olebk6, gsepl5, rrocu2),
            edges = mapOf(
                jjglx4 to listOf(ryalw1, usrcg5, rlxxs5, tgniy8, mwcud4, czceb4, xukvd9, lnuoq8, wfhpi5, bbtwz7, sizkj4, eqqeh2),
                ryalw1 to listOf(jivyv6, ojhgu1, djwwa9),
                ojhgu1 to listOf(krgmo3, yzpzc4, wbfxi4),
                krgmo3 to listOf(hffyk6, xejsk9, rpsju9),
                hffyk6 to listOf(msjnc0),
                rpsju9 to listOf(bompj5),
                wbfxi4 to listOf(kxdcq3),
                usrcg5 to listOf(ggzqm1, rcxlq3, wubks5),
                rcxlq3 to listOf(fwyet7, mpqpy1, zgsrv1),
                fwyet7 to listOf(qdyuc1, ztayf9, eqssj6),
                qdyuc1 to listOf(nxzba3),
                eqssj6 to listOf(wlflc2),
                zgsrv1 to listOf(vdtwi2),
                rlxxs5 to listOf(bsvyp2, viruz8, quyyj9),
                viruz8 to listOf(eaiti2, xrhmc8, frwwh1),
                eaiti2 to listOf(bhqjh8, vnmrm2, tgugh5),
                bhqjh8 to listOf(bomfn1),
                tgugh5 to listOf(vqulf1),
                frwwh1 to listOf(clvcp6),
                tgniy8 to listOf(yjpfa7, tsgbl6, zerba9),
                tsgbl6 to listOf(gtkjf8, xklvn0, woxmc3),
                gtkjf8 to listOf(qpphq3, dxngk2, iqyap6),
                qpphq3 to listOf(wicay9),
                iqyap6 to listOf(jqjib0),
                woxmc3 to listOf(xtezf6),
                mwcud4 to listOf(dfuhj3, pailf1, khniw6),
                pailf1 to listOf(uqbnd4, qbrnp4, cusyl1),
                uqbnd4 to listOf(wffpf8, lebkd6, fibmm8),
                wffpf8 to listOf(jzoph8),
                fibmm8 to listOf(mryqx7),
                cusyl1 to listOf(aknqw5),
                czceb4 to listOf(frcag1, obvmz6, eqzms6),
                obvmz6 to listOf(igylk8, jfeyk7, eioec8),
                igylk8 to listOf(eqpam9, kelgi2, xegqb3),
                eqpam9 to listOf(hukrt6),
                xegqb3 to listOf(jynwb7),
                eioec8 to listOf(jfaps0),
                xukvd9 to listOf(yaymr6, nyuty7, zubdn4),
                nyuty7 to listOf(rveyk6, lqdxa7, xgbxq5),
                rveyk6 to listOf(eibbv3, eyeva2, klcpo9),
                eibbv3 to listOf(ucekb0),
                klcpo9 to listOf(xrhlf0),
                xgbxq5 to listOf(vjfim2),
                lnuoq8 to listOf(ixkyr2, kmiam9, xufol7),
                kmiam9 to listOf(wjwim5, siucn6, nhtor8),
                wjwim5 to listOf(zcoit1, dmkzx8, tebia4),
                zcoit1 to listOf(iqywu4, xkjgt0, ukjya3),
                iqywu4 to listOf(knqxr3, gskft0, eubbz1),
                knqxr3 to listOf(zpxof3),
                eubbz1 to listOf(ydfra2),
                ukjya3 to listOf(gdnpw1),
                tebia4 to listOf(xdhbg3),
                nhtor8 to listOf(pknzu4),
                wfhpi5 to listOf(avrpy7, yshud2, elxai4),
                yshud2 to listOf(euonj7, kdswb3, waypv2),
                euonj7 to listOf(rwsmq5, cqyzw1, dbqqq6),
                rwsmq5 to listOf(tlvih7, ynycw6, zuhkk7),
                tlvih7 to listOf(tzeav7, dhnnr6, spmmf0),
                tzeav7 to listOf(spbeq5),
                spmmf0 to listOf(zylna9),
                zuhkk7 to listOf(slvjm6),
                dbqqq6 to listOf(rfmxp7),
                waypv2 to listOf(sznbn2),
                bbtwz7 to listOf(niwro4, pneqr8, foayb7),
                pneqr8 to listOf(ogcuj3, abfhz1, cwpei3),
                ogcuj3 to listOf(kchou6, ushhp7, szhoe3),
                kchou6 to listOf(vnmaj6, yrmmt6, abpfi0),
                vnmaj6 to listOf(yjlsz1, cmkrb3, ibpzm2),
                yjlsz1 to listOf(pchec8),
                ibpzm2 to listOf(qbgol9),
                abpfi0 to listOf(rsdgf9),
                szhoe3 to listOf(mhfds1),
                cwpei3 to listOf(kjkmz1),
                eqqeh2 to listOf(claio0, ecuay4, bymms0, ygerl2, utxod3),
                claio0 to listOf(efvew6),
                bymms0 to listOf(jryve8),
                ygerl2 to listOf(uxurz8, lysxr4),
                lysxr4 to listOf(mznvv4, ccnbp7),
                mznvv4 to listOf(gsqps6),
                ccnbp7 to listOf(pwcml2, zpkcc6, sepnk2),
                zpkcc6 to listOf(roius4),
                utxod3 to listOf(fbqtg5, udulb5, mdujt6, srtrm2, qfshy0, fkxsa8, xntvk3, wfggg1, dlyyd6, xetal7, txryq5, skyuh1, vfdvv4, teemn9, thmxr8, vtggg1, helpj3, mbgfu6, cxpih5, vsdba1, dxybj6, rrocu2),
                udulb5 to listOf(bvpfh2, lsbio8, gagrf8, ynzqa0),
                bvpfh2 to listOf(wrasv4),
                lsbio8 to listOf(oaaws3, urzrb8),
                oaaws3 to listOf(tflcx7),
                urzrb8 to listOf(jpgmq0, zxseu8, xiqds1),
                zxseu8 to listOf(gdgfi7),
                gagrf8 to listOf(mpknh5, mbign8, iwxmu5),
                mpknh5 to listOf(dfoib5),
                iwxmu5 to listOf(opizh3, zqzzx0, neuwd8),
                zqzzx0 to listOf(lktcm1, dcxmu4),
                lktcm1 to listOf(iivqy4),
                dcxmu4 to listOf(nvnsa3, abxgn9),
                neuwd8 to listOf(wawdg7, meogr8),
                mdujt6 to listOf(rvgrq7, puwzn5, xuoln3, blclz8),
                rvgrq7 to listOf(gkmvc8),
                puwzn5 to listOf(wdtyf5),
                xuoln3 to listOf(mfpss3),
                mfpss3 to listOf(jyvbm8),
                srtrm2 to listOf(ripet3, bomts1, losft5, hvrlx7),
                ripet3 to listOf(jzotx0),
                bomts1 to listOf(rzvbl7),
                losft5 to listOf(zjndq8, yrvie1, ohtcn5),
                zjndq8 to listOf(itqpv8),
                ohtcn5 to listOf(irpyq8),
                qfshy0 to listOf(xlgqs1, sslxm9, mmumc5, xgdbd7),
                xlgqs1 to listOf(jfwfn8),
                sslxm9 to listOf(mavvi1),
                mmumc5 to listOf(niqgs9, mztlr2, uzkgx9),
                niqgs9 to listOf(rnety7),
                uzkgx9 to listOf(hgany3),
                fkxsa8 to listOf(xicoa6, fvrol2, vammx3, hhenq3),
                xicoa6 to listOf(vuhyd8),
                fvrol2 to listOf(slmao4),
                vammx3 to listOf(fulvc8),
                fulvc8 to listOf(zaxhp0),
                wfggg1 to listOf(nhvls4, tfgvd5, hnsoz0, oqmie5),
                nhvls4 to listOf(jjafl0),
                tfgvd5 to listOf(zndcx8),
                hnsoz0 to listOf(zjpze6, dafri2, zqmdb8, edxqa8, vwlvw5),
                dafri2 to listOf(cpfft3, kvpxf4),
                cpfft3 to listOf(calbd1),
                kvpxf4 to listOf(srisj4),
                edxqa8 to listOf(ydhdn2, uvian5),
                ydhdn2 to listOf(oiqrw2),
                uvian5 to listOf(caekx4),
                oqmie5 to listOf(nxmjc0, iebrm2, drjtl4, aybdb7, wvdff9, xauto9),
                iebrm2 to listOf(dvidt2, qbsiv3, pciwj1),
                qbsiv3 to listOf(jxuja8, kwruf7, rrgny6),
                kwruf7 to listOf(yqszr4, kbyet0, fesua7),
                yqszr4 to listOf(qjamq3),
                fesua7 to listOf(tctge8),
                pciwj1 to listOf(upydl1, zikfk9, avzdy0),
                zikfk9 to listOf(hvypg2, syxnf8, hefgn5),
                syxnf8 to listOf(mdwmc1),
                hefgn5 to listOf(sxies3, cmnza3, nniqg1),
                cmnza3 to listOf(okyfn9),
                drjtl4 to listOf(mmzie5, fxecr5, bdyuq0),
                fxecr5 to listOf(fivrt4, nspeu6, lcyeg1),
                nspeu6 to listOf(wmurc2, kfbnp5, fmvnc5),
                wmurc2 to listOf(zhfia3),
                fmvnc5 to listOf(ravmj7),
                bdyuq0 to listOf(mcxwr1, iuyrl0, pdzgs3),
                iuyrl0 to listOf(tqsgx5, oqjge2, iekyg2),
                oqjge2 to listOf(vdtop0),
                iekyg2 to listOf(hqhnr1, guehh7, uqrjw1),
                guehh7 to listOf(ztcxq6),
                aybdb7 to listOf(oyaqp9, zwzzh2),
                oyaqp9 to listOf(moakt1, tcmfw1, uslej9),
                moakt1 to listOf(lfbuh8, taxpj6, klwsi4),
                klwsi4 to listOf(skaio6),
                uslej9 to listOf(ekkyj3),
                wvdff9 to listOf(pysmg7, zdzkx7),
                pysmg7 to listOf(bvonc3, secai5, zdvhf3),
                bvonc3 to listOf(ocfon4, doztw6, hqvnu5),
                hqvnu5 to listOf(kptrr2),
                zdvhf3 to listOf(cnusb2),
                xetal7 to listOf(mwyaz0, ghosz3, ibhgr6, uikba7, zkjaq4),
                mwyaz0 to listOf(imhnv9),
                ghosz3 to listOf(togss2),
                ibhgr6 to listOf(xkjay7),
                uikba7 to listOf(obwlc5, lkjjr1),
                zkjaq4 to listOf(ihnnu9, zeauj2, xwmqh1),
                zeauj2 to listOf(kgxjo8, wcvfw8, bpwqa9),
                wcvfw8 to listOf(ecbzw3),
                skyuh1 to listOf(wkyvq6, lgtgh3, sjmva9, ftyuw5, xxkqn6, fpljl9),
                wkyvq6 to listOf(ybjmp5, fgiyu8),
                lgtgh3 to listOf(ewpwh4),
                sjmva9 to listOf(ocojf7),
                ftyuw5 to listOf(rqffp9, diwve6),
                xxkqn6 to listOf(pqzim2, bqohr7),
                bqohr7 to listOf(stljs7),
                fpljl9 to listOf(pulvs3, rqbtk0, yyevf8, fyzxz5, wkxet0),
                rqbtk0 to listOf(qnxhl0, mflvi8, uqmvn3),
                mflvi8 to listOf(ybxnf3, peshe1, ilygk2),
                peshe1 to listOf(eytok6, ahqvd2),
                ahqvd2 to listOf(azekm3, eqlda1),
                azekm3 to listOf(zicks6),
                eqlda1 to listOf(iwkyb1, agxne0),
                uqmvn3 to listOf(qabyn8, nywch2, kfpsl6),
                nywch2 to listOf(rocwp6, cfncx2, uxxas8),
                cfncx2 to listOf(iatvb5),
                uxxas8 to listOf(tarek8, iabhn4),
                yyevf8 to listOf(neknx8, naxdz1, xkjja6),
                naxdz1 to listOf(aytxq2, qzspp4, nesor2),
                qzspp4 to listOf(nxhmx4, cqckt3, kxjyy0),
                nxhmx4 to listOf(ieetu7),
                kxjyy0 to listOf(ekfoy3),
                xkjja6 to listOf(sqdkl7, tzhwv6, tnwsn3),
                tzhwv6 to listOf(grdgl2, cmgcc5, zrrqd0),
                grdgl2 to listOf(civdh5),
                zrrqd0 to listOf(mvnmm2, xipjv2, ohrfh4),
                mvnmm2 to listOf(rhhut8, dqwac0, rsmwa2, obzcr5),
                rhhut8 to listOf(hokpn8, cmwbq4, znjdo6),
                cmwbq4 to listOf(oclpn2),
                znjdo6 to listOf(ovbow5, tpvuu9),
                rsmwa2 to listOf(pfhvt7),
                obzcr5 to listOf(fpmjo4, ntcbd4),
                ohrfh4 to listOf(qzatw2),
                fyzxz5 to listOf(gragx8, vmrjp8, ncclg4),
                vmrjp8 to listOf(oqgxv5, erlmt6, lcdjv5),
                erlmt6 to listOf(piwaq0),
                lcdjv5 to listOf(brbhp1, dxpak0),
                teemn9 to listOf(jqbbx6, pqyda8, idmmn8, bresu8, ktgpe2),
                jqbbx6 to listOf(tchzc5),
                pqyda8 to listOf(dkhlk9),
                idmmn8 to listOf(zzjcz6),
                bresu8 to listOf(pyovc5, hfzwb9),
                ktgpe2 to listOf(kdecg1, jepah4, ngned0),
                jepah4 to listOf(copyp0, essqd2, bcgpx8),
                essqd2 to listOf(oqllf6),
                vtggg1 to listOf(xzeps5, bxqnr0, wxvat1, dnqbi3, bmxuj6),
                xzeps5 to listOf(yyyme7, bhkol7),
                wxvat1 to listOf(jredj2),
                dnqbi3 to listOf(tbasb0, dqltg8, rwjpi0),
                dqltg8 to listOf(xymhb1, utqzl5),
                xymhb1 to listOf(mhgio2),
                utqzl5 to listOf(eqqci4),
                bmxuj6 to listOf(gxlnr8, sqadz6, logxr8, tncod3, qqcqv1, wjoxc8, kjynr4, zdsui8, yracm3),
                sqadz6 to listOf(jlhqe5, thpev5, acgho5),
                thpev5 to listOf(juetr9, vsnrm2, bfhdm9),
                vsnrm2 to listOf(nuomb9, xnkyb7),
                xnkyb7 to listOf(wrdcf8, citbp8),
                wrdcf8 to listOf(rrtub2),
                citbp8 to listOf(vomei1, udoyk0),
                acgho5 to listOf(ylttf0, npumb4, ztbgw5),
                npumb4 to listOf(kavkz7, zvefe2, ncias7),
                zvefe2 to listOf(pcwrh2),
                ncias7 to listOf(pcdtb6, ogbfw6),
                logxr8 to listOf(qxrqb7, ryhcy0, ywfye4),
                ryhcy0 to listOf(vyiey0, gbijv6, pzpdh3),
                gbijv6 to listOf(mnvka1, hmnlj2, vjxno3),
                mnvka1 to listOf(dnmcn9),
                vjxno3 to listOf(fpgee3),
                ywfye4 to listOf(oyino0, rnlpv6, aowpq2),
                rnlpv6 to listOf(jgkoi8, onqmt2, wihpu1),
                onqmt2 to listOf(wbgvp9),
                wihpu1 to listOf(hkekx4, kwxan4, rzyhw8),
                kwxan4 to listOf(xexlm1),
                tncod3 to listOf(vohlv3, bledy3, uukpx2),
                bledy3 to listOf(nhkih3, oxvpn9, mwaje7),
                oxvpn9 to listOf(dpodq6, xnvxm1, slbnz3, iagyz7),
                dpodq6 to listOf(jbfep5),
                slbnz3 to listOf(ovsbs4),
                iagyz7 to listOf(qzdxn0, rrogc8, tmqdt3),
                rrogc8 to listOf(tktaq1),
                uukpx2 to listOf(wzwmm3, lhjft1, xzuxm1),
                lhjft1 to listOf(apkqy2, fjwxq7, xmabx9),
                fjwxq7 to listOf(afwsj8),
                xmabx9 to listOf(wyzkj3, mojcb3, qdokp6),
                mojcb3 to listOf(facfx3),
                qqcqv1 to listOf(gkgak2, uvbve6),
                gkgak2 to listOf(opmsg4, iawhz3, wuwtu7),
                opmsg4 to listOf(xzdbg4),
                wuwtu7 to listOf(thgjb8, mcbft2, mhrzf8, vtchj1),
                thgjb8 to listOf(knkuu0),
                mhrzf8 to listOf(ianvg1),
                vtchj1 to listOf(vxlei3, iplnq7),
                wjoxc8 to listOf(gbguk5, nisci9),
                gbguk5 to listOf(ilbkp7, xwawo5, yjdgb0, nhkwb6),
                ilbkp7 to listOf(tdrzl2),
                yjdgb0 to listOf(mrrvt4),
                nhkwb6 to listOf(viaeb4, paxxw4, sayry9),
                paxxw4 to listOf(xeewj1),
                kjynr4 to listOf(orycw6, mcrlx8, kwmps7),
                mcrlx8 to listOf(feswj9, hxiil3, jiund1),
                hxiil3 to listOf(mtdpv3, demth6, jhups7),
                mtdpv3 to listOf(wtomq1),
                jhups7 to listOf(iigzs3),
                kwmps7 to listOf(ufene7, juflt1),
                ufene7 to listOf(bgnmn9, nrort8),
                bgnmn9 to listOf(nhymg5),
                nrort8 to listOf(lpzsh9, wlyvv0),
                zdsui8 to listOf(kxulz1, fftye6, yffqd7),
                fftye6 to listOf(rjrje7, lnomh3, vbuws7),
                lnomh3 to listOf(whakw7, uhbaa7, oluzi4),
                whakw7 to listOf(buuwf1, ommos9, rimyj1, apmyb4),
                buuwf1 to listOf(qnagl2),
                rimyj1 to listOf(qylel4),
                apmyb4 to listOf(csmcz8, dyljl9, txrzp0),
                dyljl9 to listOf(bugyg8, remuf1, mwmtj4),
                bugyg8 to listOf(nwazo3),
                mwmtj4 to listOf(hfvmz6),
                oluzi4 to listOf(dexgy7),
                yffqd7 to listOf(refmw1, oihmk3),
                refmw1 to listOf(nlbll1, xpgoy8),
                nlbll1 to listOf(bnott1),
                xpgoy8 to listOf(rpdtw0, lmiik0),
                mbgfu6 to listOf(oqxjv1, iittj6, ojain7, xlern3, wqony5),
                oqxjv1 to listOf(ynayy6, gzpmp8),
                ojain7 to listOf(oagmz8),
                xlern3 to listOf(ompcx2, dvfqv5, helwn8),
                dvfqv5 to listOf(dcwck0, zayuy5),
                dcwck0 to listOf(jyhof6),
                zayuy5 to listOf(lobbh1),
                wqony5 to listOf(oqnsx5, yqifa4, qkltu4, ihxtc9, fjpcu8, fevnc9, alnvw2, zbqrh2, phpns3, btmpt8),
                yqifa4 to listOf(jqfad1, vwjcn6, vbodn0),
                vwjcn6 to listOf(setqj0, dyvxd3, bpiyc4),
                dyvxd3 to listOf(bzpjh5, mbjok9),
                mbjok9 to listOf(shdwy5, evxll7),
                shdwy5 to listOf(ipzuv3),
                evxll7 to listOf(eigqk6, hksuv4),
                vbodn0 to listOf(rilnn0, vdvcg8, inalw8),
                vdvcg8 to listOf(scuad5, nftgj9, rdgsm2),
                nftgj9 to listOf(ozuwv8),
                rdgsm2 to listOf(wgdog2, uofvs0),
                qkltu4 to listOf(rkccl2, nnmfp1, hgftt9),
                nnmfp1 to listOf(stoki5, xzitq2, eqcab9),
                xzitq2 to listOf(hravu4, beprc3),
                beprc3 to listOf(bramq3, hwmek0, pakkt4, tspby0),
                bramq3 to listOf(cfrvk3),
                pakkt4 to listOf(nynfo6),
                tspby0 to listOf(rncog6, mrsmz3, cxyml8),
                mrsmz3 to listOf(mrgrt4),
                hgftt9 to listOf(oqifg6, nclde1, srjnt9),
                nclde1 to listOf(kujgi4, gwxme1, khyzm4),
                gwxme1 to listOf(dyzcd2),
                khyzm4 to listOf(fmtey3, kxpww1, zlsrw3),
                kxpww1 to listOf(ximub7),
                fjpcu8 to listOf(cgggc1, citib0, jvkgm6),
                cgggc1 to listOf(flueh4),
                citib0 to listOf(xbzmp2, uqucv3, kdhma9),
                xbzmp2 to listOf(qacwj3),
                kdhma9 to listOf(ptqff0),
                fevnc9 to listOf(hlsjq1, rdnqg1, ccfom0, ppjnq5, eoqsv2, zxhua3, obqbl8, oxkdj5),
                ccfom0 to listOf(wbkmj6),
                ppjnq5 to listOf(llcpd6),
                zxhua3 to listOf(chdvr3),
                oxkdj5 to listOf(qgkiv7, ccfqj9),
                qgkiv7 to listOf(ltprv2, xaeiv7, uhpzp5),
                ltprv2 to listOf(hgbzu3),
                uhpzp5 to listOf(zitcy8, efsft9, pabbq9, lrxht4),
                zitcy8 to listOf(tfnfn8),
                pabbq9 to listOf(zakxy7),
                lrxht4 to listOf(vmmgs7, eshia8),
                alnvw2 to listOf(irdbj2, yowem0),
                irdbj2 to listOf(xotpj4, giwpi2, lcsbc3),
                xotpj4 to listOf(tmemu7),
                lcsbc3 to listOf(vxgsf1),
                zbqrh2 to listOf(vndkm5, giuiw1, scdxc8),
                giuiw1 to listOf(xcwkg5, erevu9, umnol5),
                erevu9 to listOf(ebeuz5, gnbfx9, ubdmf5),
                ebeuz5 to listOf(ocyvc9, pbrbx7, woifv1),
                ocyvc9 to listOf(olmcw6),
                woifv1 to listOf(vnfvr5),
                ubdmf5 to listOf(oiabl2, onwfl7, ibmvk8),
                oiabl2 to listOf(zljsg2),
                ibmvk8 to listOf(bypti2),
                scdxc8 to listOf(izsoy0, ixoro1),
                izsoy0 to listOf(ieccn7, axyfx3),
                ieccn7 to listOf(ginix3),
                axyfx3 to listOf(iuozl1, leldz9),
                phpns3 to listOf(zsjwx4, djpyu7, ddsjk8),
                djpyu7 to listOf(zjblg7, fytvv3, awsxd2),
                fytvv3 to listOf(skpky8, cgbkj8, dahqa6),
                skpky8 to listOf(xgkid0, kxoza4, kxmgy3),
                xgkid0 to listOf(ohzdj9),
                kxmgy3 to listOf(qvipw2),
                dahqa6 to listOf(sofaj1, jhhky1, iutvr1),
                sofaj1 to listOf(dvuuu2, shxme2, cjjkg1, zpwym6),
                dvuuu2 to listOf(ogufj2),
                cjjkg1 to listOf(donli0),
                zpwym6 to listOf(mejbf0, fcoap9, cbswa6),
                fcoap9 to listOf(pwiva1, mozzx5, jtcfh0),
                pwiva1 to listOf(nbxvn4),
                jtcfh0 to listOf(ijyiw1),
                iutvr1 to listOf(tnzbo0),
                ddsjk8 to listOf(gmrsa2, mfsux0),
                gmrsa2 to listOf(okqdf5, ylguo2),
                okqdf5 to listOf(frvrl0),
                ylguo2 to listOf(slrmu7, onuzg2),
                cxpih5 to listOf(pmcuq3, azrrh9, cpmno9, modza2, sdsse6),
                pmcuq3 to listOf(ztlgy8),
                cpmno9 to listOf(bgwuc3),
                modza2 to listOf(kudjn7, mssvm9),
                sdsse6 to listOf(fakqq4, naocg5, wtcwf9),
                naocg5 to listOf(nmwpt9, itmck0, khdlb5, ajada6, znbsu9, reduy8, jtjak3, ewroi5),
                khdlb5 to listOf(isuaf0),
                ajada6 to listOf(efweg9),
                reduy8 to listOf(guwwr4, ovwsj0),
                guwwr4 to listOf(zkdgw9),
                ovwsj0 to listOf(cndki4, vxpfx4),
                ewroi5 to listOf(wfyve1, gnpje1),
                wfyve1 to listOf(phbzd5, tbops9, lfsmm5, nmbfk9),
                phbzd5 to listOf(hesfy3),
                lfsmm5 to listOf(yciwm1),
                nmbfk9 to listOf(dffqr9, oufbs6, soogi2),
                vsdba1 to listOf(prbrj6, rkxqo5, soyvt6, svpfj3, csuhe6),
                prbrj6 to listOf(jwamw6),
                soyvt6 to listOf(kpvfw7),
                svpfj3 to listOf(ayuxa5, bnebl8),
                csuhe6 to listOf(kfvaj9, xdcvh1, bnkrd7, digje0),
                xdcvh1 to listOf(vneqr1, dfwwa1),
                vneqr1 to listOf(vhszf9, zcddh7, ncwni3),
                vhszf9 to listOf(wcnhv9),
                ncwni3 to listOf(swegz9),
                bnkrd7 to listOf(jgbza0, voops2, bxest0, fucxw7, cepak2, ljacg4, zftlv9, bvkba7),
                bxest0 to listOf(awscc6),
                fucxw7 to listOf(ptncg8),
                ljacg4 to listOf(ypiid6, xhtzn3),
                ypiid6 to listOf(ttoks0),
                xhtzn3 to listOf(faodr4, qphps5),
                bvkba7 to listOf(ufvom6, gmlyx9),
                ufvom6 to listOf(zdeeh3, tdpxi8, gsyzg1, qztfg5),
                zdeeh3 to listOf(dvher8),
                gsyzg1 to listOf(vvccf7),
                qztfg5 to listOf(dfjqk0, qnsbf1, uhgqs1),
                dxybj6 to listOf(tjyue7, hcsis3, wqory5, xenva2, vzlrz4),
                tjyue7 to listOf(axoir5),
                wqory5 to listOf(zckbn5),
                xenva2 to listOf(voeco8, ogljq2),
                vzlrz4 to listOf(mbznb1, dhzwm6, rohst1, gsepl5),
                dhzwm6 to listOf(pbuuk7, bdmcw3),
                pbuuk7 to listOf(yojjx9, uyojh9, hkrzg4),
                yojjx9 to listOf(zhlff6),
                hkrzg4 to listOf(vszmy9),
                rohst1 to listOf(abldg7, esvtd8, mceby1, tmqhs1, zxehi4, sdhbw0, cvldk9, deaeb9),
                mceby1 to listOf(rnbfa8),
                tmqhs1 to listOf(zefzq0),
                sdhbw0 to listOf(zzoae2, hudwc1),
                zzoae2 to listOf(cjakn4),
                hudwc1 to listOf(zjtkq6, tsqdi4),
                deaeb9 to listOf(mflhv2, olebk6),
                mflhv2 to listOf(maajy2, imdza8, tvktk0, dtucw8),
                maajy2 to listOf(akjpp2),
                tvktk0 to listOf(rprfi1),
                dtucw8 to listOf(kyefw8, tixot9, qlgoj9, qfahf6, jqpbx2),
                qfahf6 to listOf(vbydx3),
            )
        )

        graph1.visualize("ComplicatedV2/G1")
        graph2.visualize("ComplicatedV2/G2")
    }

    override fun checkCommonGraph(commonGraph: Graph) {
        graph1.visualize("ComplicatedV2/G1_Generalized")
        graph2.visualize("ComplicatedV2/G2_Generalized")
        commonGraph.visualize("ComplicatedV2/Generalization")
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {
        graph1Diff.visualize("ComplicatedV2/G1_Differences")
    }

    override fun checkGraph2Diff(graph2Diff: Graph) {
        graph2Diff.visualize("ComplicatedV2/G2_Differences")
    }
}