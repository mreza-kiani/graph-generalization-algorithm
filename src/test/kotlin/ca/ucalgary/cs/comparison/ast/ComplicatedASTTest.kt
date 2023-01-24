package ca.ucalgary.cs.comparison.ast

import ca.ucalgary.cs.comparison.BaseCompareGraphTest
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.graph.Node
import ca.ucalgary.cs.io.visualize

class ComplicatedASTTest : BaseCompareGraphTest() {
    override fun initializeGraphs() {
        val ndgbt4 = Node("program")
        val fvltv4 = Node("package_declaration")
        val ykchu8 = Node("package")
        val mddyf3 = Node("scoped_identifier", isDuplicate = true)
        val livww5 = Node("scoped_identifier", isDuplicate = true)
        val nfxdv7 = Node("identifier", isDuplicate = true)
        val meegw8 = Node("com", isDuplicate = true)
        val hpnag5 = Node(".", isDuplicate = true)
        val bglby3 = Node("identifier", isDuplicate = true)
        val ltbxx5 = Node("jimmyselectronics", isDuplicate = true)
        val pmctk8 = Node(".", isDuplicate = true)
        val aaifv6 = Node("identifier", isDuplicate = true)
        val sfshp7 = Node("necchi")
        val sgewd0 = Node(";", isDuplicate = true)
        val nyhuk1 = Node("import_declaration", isDuplicate = true)
        val hpsmj9 = Node("import", isDuplicate = true)
        val clbus1 = Node("scoped_identifier", isDuplicate = true)
        val vaksc9 = Node("scoped_identifier", isDuplicate = true)
        val wfezf2 = Node("identifier", isDuplicate = true)
        val ivpbf5 = Node("java")
        val atkbo4 = Node(".", isDuplicate = true)
        val wzxjj2 = Node("identifier", isDuplicate = true)
        val cnfmo6 = Node("util")
        val zqagp0 = Node(".", isDuplicate = true)
        val bfjjb8 = Node("identifier", isDuplicate = true)
        val maihq0 = Node("Random", isDuplicate = true)
        val svxza4 = Node(";", isDuplicate = true)
        val hgwpb5 = Node("import_declaration", isDuplicate = true)
        val dtxsu6 = Node("import", isDuplicate = true)
        val cycsd9 = Node("scoped_identifier", isDuplicate = true)
        val nyzeb1 = Node("scoped_identifier", isDuplicate = true)
        val mnhdt8 = Node("identifier", isDuplicate = true)
        val pcljc2 = Node("com", isDuplicate = true)
        val momzp8 = Node(".", isDuplicate = true)
        val lptbi8 = Node("identifier", isDuplicate = true)
        val ybnxs4 = Node("jimmyselectronics", isDuplicate = true)
        val mnteu7 = Node(".", isDuplicate = true)
        val bnovh4 = Node("identifier", isDuplicate = true)
        val fluqy0 = Node("AbstractDevice", isDuplicate = true)
        val gbmri5 = Node(";", isDuplicate = true)
        val howlb4 = Node("import_declaration", isDuplicate = true)
        val cfglh5 = Node("import", isDuplicate = true)
        val vczli9 = Node("scoped_identifier", isDuplicate = true)
        val fzsmk7 = Node("scoped_identifier", isDuplicate = true)
        val rofqw8 = Node("identifier", isDuplicate = true)
        val ebzyc7 = Node("ca", isDuplicate = true)
        val imjud0 = Node(".", isDuplicate = true)
        val vjvll2 = Node("identifier", isDuplicate = true)
        val byjwp2 = Node("powerutility")
        val gzxvu2 = Node(".", isDuplicate = true)
        val elwar9 = Node("identifier", isDuplicate = true)
        val qacum5 = Node("NoPowerException", isDuplicate = true)
        val wlfoh8 = Node(";", isDuplicate = true)
        val wwutl1 = Node("import_declaration", isDuplicate = true)
        val uuecc1 = Node("import", isDuplicate = true)
        val vvooa5 = Node("scoped_identifier", isDuplicate = true)
        val evqsa2 = Node("scoped_identifier", isDuplicate = true)
        val coxsv3 = Node("scoped_identifier", isDuplicate = true)
        val gpmqz9 = Node("scoped_identifier", isDuplicate = true)
        val wygfz4 = Node("identifier", isDuplicate = true)
        val afbme1 = Node("ca", isDuplicate = true)
        val yezkj0 = Node(".", isDuplicate = true)
        val huooi6 = Node("identifier", isDuplicate = true)
        val srfod6 = Node("ucalgary")
        val jxdao3 = Node(".", isDuplicate = true)
        val gsesi6 = Node("identifier", isDuplicate = true)
        val pjaay0 = Node("seng300")
        val ggnqt7 = Node(".", isDuplicate = true)
        val duaks5 = Node("identifier", isDuplicate = true)
        val dufbz9 = Node("simulation")
        val bicru0 = Node(".", isDuplicate = true)
        val wdpol0 = Node("identifier", isDuplicate = true)
        val nzpzz3 = Node("NullPointerSimulationException", isDuplicate = true)
        val gdufm7 = Node(";", isDuplicate = true)
        val dvxsc7 = Node("block_comment", isDuplicate = true)
        val esorj0 = Node("class_declaration")
        val xwhka0 = Node("modifiers", isDuplicate = true)
        val tgref7 = Node("public", isDuplicate = true)
        val oztdp0 = Node("class")
        val gwoox2 = Node("identifier", isDuplicate = true)
        val nzzou8 = Node("BarcodeScanner", isDuplicate = true)
        val mwsbi5 = Node("superclass")
        val zpurf6 = Node("extends")
        val mrskz5 = Node("generic_type")
        val ekhmw8 = Node("type_identifier", isDuplicate = true)
        val ngmxv7 = Node("AbstractDevice", isDuplicate = true)
        val zikno0 = Node("type_arguments")
        val wayxk7 = Node("<")
        val zqbka6 = Node("type_identifier", isDuplicate = true)
        val yzvhi1 = Node("BarcodeScannerListener", isDuplicate = true)
        val qszyg7 = Node(">")
        val vvvce8 = Node("class_body")
        val rbpur4 = Node("{", isDuplicate = true)
        val egklc8 = Node("block_comment", isDuplicate = true)
        val deevv9 = Node("constructor_declaration")
        val psvdt1 = Node("modifiers", isDuplicate = true)
        val daqtm6 = Node("public", isDuplicate = true)
        val xbzef8 = Node("identifier", isDuplicate = true)
        val djxgn9 = Node("BarcodeScanner", isDuplicate = true)
        val jfwxu3 = Node("formal_parameters", isDuplicate = true)
        val qbeiv9 = Node("(", isDuplicate = true)
        val arrye8 = Node(")", isDuplicate = true)
        val hvhep2 = Node("constructor_body")
        val gdpml4 = Node("{", isDuplicate = true)
        val rslyo9 = Node("}", isDuplicate = true)
        val dmclw8 = Node("field_declaration", isDuplicate = true)
        val igskw2 = Node("modifiers", isDuplicate = true)
        val ohoez3 = Node("private", isDuplicate = true)
        val hnivb3 = Node("type_identifier", isDuplicate = true)
        val zicdt4 = Node("Random", isDuplicate = true)
        val tsqwn8 = Node("variable_declarator", isDuplicate = true)
        val eqhon7 = Node("identifier", isDuplicate = true)
        val wfwfw3 = Node("random", isDuplicate = true)
        val pxjhl3 = Node("=", isDuplicate = true)
        val bjpnj9 = Node("object_creation_expression", isDuplicate = true)
        val jsqwi0 = Node("new", isDuplicate = true)
        val tdbek0 = Node("type_identifier", isDuplicate = true)
        val bvryl9 = Node("Random", isDuplicate = true)
        val zxrxx6 = Node("argument_list", isDuplicate = true)
        val kgflz1 = Node("(", isDuplicate = true)
        val rqeri6 = Node(")", isDuplicate = true)
        val wgclp0 = Node(";", isDuplicate = true)
        val bhvyh3 = Node("field_declaration", isDuplicate = true)
        val ahqjk4 = Node("modifiers", isDuplicate = true)
        val rcaxm6 = Node("private", isDuplicate = true)
        val trwuj5 = Node("static")
        val srbhr7 = Node("final")
        val xevof1 = Node("integral_type")
        val bfwzv2 = Node("int")
        val gtgfb5 = Node("variable_declarator", isDuplicate = true)
        val qityp7 = Node("identifier", isDuplicate = true)
        val dppmt5 = Node("PROBABILITY_OF_FAILED_SCAN", isDuplicate = true)
        val njvtn7 = Node("=", isDuplicate = true)
        val sjibc1 = Node("decimal_integer_literal", isDuplicate = true)
        val ottix1 = Node("10")
        val iqazd7 = Node(";", isDuplicate = true)
        val hangg8 = Node("block_comment", isDuplicate = true)
        val sdfej8 = Node("block_comment", isDuplicate = true)
        val cijqi6 = Node("method_declaration", isDuplicate = true)
        val dysna2 = Node("modifiers", isDuplicate = true)
        val blucj1 = Node("public", isDuplicate = true)
        val jaakl7 = Node("synchronized")
        val gqhln6 = Node("boolean_type")
        val lbkrx0 = Node("identifier", isDuplicate = true)
        val zxqgx4 = Node("scan")
        val zdari3 = Node("formal_parameters", isDuplicate = true)
        val japgm9 = Node("(", isDuplicate = true)
        val fysvk8 = Node("formal_parameter", isDuplicate = true)
        val npugy9 = Node("type_identifier", isDuplicate = true)
        val wmiov0 = Node("BarcodedItem")
        val lguum7 = Node("identifier", isDuplicate = true)
        val bckyj9 = Node("item", isDuplicate = true)
        val sgdrt2 = Node(")", isDuplicate = true)
        val jeokb2 = Node("block", isDuplicate = true)
        val jfnup5 = Node("{", isDuplicate = true)
        val panas4 = Node("if_statement", isDuplicate = true)
        val oigvl7 = Node("if", isDuplicate = true)
        val dpghc8 = Node("parenthesized_expression", isDuplicate = true)
        val inrzg5 = Node("(", isDuplicate = true)
        val kwsnd0 = Node("unary_expression")
        val aakzx2 = Node("!")
        val bxlco2 = Node("method_invocation", isDuplicate = true)
        val wfrdi1 = Node("identifier", isDuplicate = true)
        val pdwyi4 = Node("isPoweredUp")
        val aange5 = Node("argument_list", isDuplicate = true)
        val weoru1 = Node("(", isDuplicate = true)
        val mnplq1 = Node(")", isDuplicate = true)
        val rriyi0 = Node(")", isDuplicate = true)
        val ivjqn2 = Node("throw_statement", isDuplicate = true)
        val ttebu8 = Node("throw", isDuplicate = true)
        val flnlm9 = Node("object_creation_expression", isDuplicate = true)
        val mvycn8 = Node("new", isDuplicate = true)
        val fjooe9 = Node("type_identifier", isDuplicate = true)
        val hmulh4 = Node("NoPowerException", isDuplicate = true)
        val dfvaa1 = Node("argument_list", isDuplicate = true)
        val mbtcc6 = Node("(", isDuplicate = true)
        val debxb4 = Node(")", isDuplicate = true)
        val bgypq9 = Node(";", isDuplicate = true)
        val hgugf8 = Node("if_statement", isDuplicate = true)
        val ochmp6 = Node("if", isDuplicate = true)
        val kihsm5 = Node("parenthesized_expression", isDuplicate = true)
        val zwfxl9 = Node("(", isDuplicate = true)
        val mdagg6 = Node("binary_expression", isDuplicate = true)
        val dgfex4 = Node("identifier", isDuplicate = true)
        val vpdxx2 = Node("item", isDuplicate = true)
        val sgepq0 = Node("==")
        val dppdu9 = Node("null_literal")
        val spcah9 = Node("null")
        val ubdju6 = Node(")", isDuplicate = true)
        val rzcpo7 = Node("throw_statement", isDuplicate = true)
        val objyg6 = Node("throw", isDuplicate = true)
        val lvjyl3 = Node("object_creation_expression", isDuplicate = true)
        val nmfzm8 = Node("new", isDuplicate = true)
        val xcmvm9 = Node("type_identifier", isDuplicate = true)
        val yvcko4 = Node("NullPointerSimulationException", isDuplicate = true)
        val umuqu0 = Node("argument_list", isDuplicate = true)
        val quhdj0 = Node("(", isDuplicate = true)
        val qzmaj3 = Node("string_literal")
        val akftb7 = Node("\"item\"")
        val axqrg9 = Node(")", isDuplicate = true)
        val jrlej7 = Node(";", isDuplicate = true)
        val lovsc5 = Node("if_statement", isDuplicate = true)
        val jogkq4 = Node("if", isDuplicate = true)
        val zitsh7 = Node("parenthesized_expression", isDuplicate = true)
        val szuwb1 = Node("(", isDuplicate = true)
        val ftxrc2 = Node("method_invocation", isDuplicate = true)
        val zpseg1 = Node("identifier", isDuplicate = true)
        val tawqh0 = Node("isDisabled")
        val vxzkn9 = Node("argument_list", isDuplicate = true)
        val ooqwe9 = Node("(", isDuplicate = true)
        val dacpn3 = Node(")", isDuplicate = true)
        val wqnql5 = Node(")", isDuplicate = true)
        val pymix3 = Node("return_statement", isDuplicate = true)
        val vksix1 = Node("return", isDuplicate = true)
        val bkbck9 = Node("false", isDuplicate = true)
        val jfwyd6 = Node(";", isDuplicate = true)
        val guuaw0 = Node("if_statement", isDuplicate = true)
        val tuybe7 = Node("if", isDuplicate = true)
        val zvgql9 = Node("parenthesized_expression", isDuplicate = true)
        val cbfop7 = Node("(", isDuplicate = true)
        val ognzv9 = Node("binary_expression", isDuplicate = true)
        val aijcn2 = Node("method_invocation", isDuplicate = true)
        val ldetf5 = Node("identifier", isDuplicate = true)
        val itpox4 = Node("random", isDuplicate = true)
        val tsnmo7 = Node(".", isDuplicate = true)
        val gsnbn7 = Node("identifier", isDuplicate = true)
        val pihxw6 = Node("nextInt")
        val nahkl7 = Node("argument_list", isDuplicate = true)
        val aptdq7 = Node("(", isDuplicate = true)
        val bwotv8 = Node("decimal_integer_literal", isDuplicate = true)
        val ulwli7 = Node("100")
        val bsnno2 = Node(")", isDuplicate = true)
        val kzdpa3 = Node("<=")
        val tibhy7 = Node("identifier", isDuplicate = true)
        val kqwrf1 = Node("PROBABILITY_OF_FAILED_SCAN", isDuplicate = true)
        val hquuv1 = Node(")", isDuplicate = true)
        val xybit7 = Node("expression_statement", isDuplicate = true)
        val eqhgu7 = Node("method_invocation", isDuplicate = true)
        val bhscp5 = Node("identifier", isDuplicate = true)
        val ecenm5 = Node("notifyBarcodeScanned", isDuplicate = true)
        val cmjtz4 = Node("argument_list", isDuplicate = true)
        val tfvok9 = Node("(", isDuplicate = true)
        val myzjr6 = Node("method_invocation", isDuplicate = true)
        val nzneo2 = Node("identifier", isDuplicate = true)
        val hugxl4 = Node("item", isDuplicate = true)
        val kyksk7 = Node(".", isDuplicate = true)
        val ogejw7 = Node("identifier", isDuplicate = true)
        val atsjw9 = Node("getBarcode")
        val uqazb3 = Node("argument_list", isDuplicate = true)
        val pyrza9 = Node("(", isDuplicate = true)
        val htdio9 = Node(")", isDuplicate = true)
        val dfzmd5 = Node(")", isDuplicate = true)
        val oeimw0 = Node(";", isDuplicate = true)
        val vajjt9 = Node("else")
        val lhiyd6 = Node("return_statement", isDuplicate = true)
        val vnhco3 = Node("return", isDuplicate = true)
        val hrogx8 = Node("false", isDuplicate = true)
        val jusvv7 = Node(";", isDuplicate = true)
        val lmhco1 = Node("return_statement", isDuplicate = true)
        val zmjbv1 = Node("return", isDuplicate = true)
        val jmecx9 = Node("true")
        val gupjh4 = Node(";", isDuplicate = true)
        val oymto1 = Node("}", isDuplicate = true)
        val ickpt8 = Node("method_declaration", isDuplicate = true)
        val ioilc3 = Node("modifiers", isDuplicate = true)
        val aigtm6 = Node("private", isDuplicate = true)
        val vvkpd1 = Node("void_type")
        val tucoj3 = Node("identifier", isDuplicate = true)
        val oqdml7 = Node("notifyBarcodeScanned", isDuplicate = true)
        val lwblb0 = Node("formal_parameters", isDuplicate = true)
        val qivvz0 = Node("(", isDuplicate = true)
        val mjmwi8 = Node("formal_parameter", isDuplicate = true)
        val wdagp6 = Node("type_identifier", isDuplicate = true)
        val grzzs9 = Node("Barcode")
        val iuhpm8 = Node("identifier", isDuplicate = true)
        val fsjqv0 = Node("barcode", isDuplicate = true)
        val mvsgm6 = Node(")", isDuplicate = true)
        val hopxc3 = Node("block", isDuplicate = true)
        val kloht4 = Node("{", isDuplicate = true)
        val kkpzg9 = Node("enhanced_for_statement")
        val utgjj6 = Node("for")
        val pjslq8 = Node("(", isDuplicate = true)
        val gpqbo1 = Node("type_identifier", isDuplicate = true)
        val yyexh1 = Node("BarcodeScannerListener", isDuplicate = true)
        val xvfrz5 = Node("identifier", isDuplicate = true)
        val sxvri0 = Node("l", isDuplicate = true)
        val pznxi0 = Node(":")
        val cojmj7 = Node("method_invocation", isDuplicate = true)
        val vhigu8 = Node("identifier", isDuplicate = true)
        val tpxvj0 = Node("listeners")
        val pcyyb4 = Node("argument_list", isDuplicate = true)
        val jjcgr8 = Node("(", isDuplicate = true)
        val oyong8 = Node(")", isDuplicate = true)
        val ztpke6 = Node(")", isDuplicate = true)
        val qhlqw6 = Node("expression_statement", isDuplicate = true)
        val swbyc3 = Node("method_invocation", isDuplicate = true)
        val osaiv0 = Node("identifier", isDuplicate = true)
        val otsll4 = Node("l", isDuplicate = true)
        val plddt6 = Node(".", isDuplicate = true)
        val uonyt9 = Node("identifier", isDuplicate = true)
        val echnb8 = Node("barcodeScanned")
        val dbrow3 = Node("argument_list", isDuplicate = true)
        val pchxq8 = Node("(", isDuplicate = true)
        val qsdwo4 = Node("this")
        val tqaaq9 = Node(",")
        val dxccr0 = Node("identifier", isDuplicate = true)
        val mqvvy0 = Node("barcode", isDuplicate = true)
        val uslpk4 = Node(")", isDuplicate = true)
        val lmpop5 = Node(";", isDuplicate = true)
        val xgcau7 = Node("}", isDuplicate = true)
        val mjwmq5 = Node("}", isDuplicate = true)

        graph1 = Graph.from(
            nodes = listOf(ndgbt4, fvltv4, ykchu8, mddyf3, livww5, nfxdv7, meegw8, hpnag5, bglby3, ltbxx5, pmctk8, aaifv6, sfshp7, sgewd0, nyhuk1, hpsmj9, clbus1, vaksc9, wfezf2, ivpbf5, atkbo4, wzxjj2, cnfmo6, zqagp0, bfjjb8, maihq0, svxza4, hgwpb5, dtxsu6, cycsd9, nyzeb1, mnhdt8, pcljc2, momzp8, lptbi8, ybnxs4, mnteu7, bnovh4, fluqy0, gbmri5, howlb4, cfglh5, vczli9, fzsmk7, rofqw8, ebzyc7, imjud0, vjvll2, byjwp2, gzxvu2, elwar9, qacum5, wlfoh8, wwutl1, uuecc1, vvooa5, evqsa2, coxsv3, gpmqz9, wygfz4, afbme1, yezkj0, huooi6, srfod6, jxdao3, gsesi6, pjaay0, ggnqt7, duaks5, dufbz9, bicru0, wdpol0, nzpzz3, gdufm7, dvxsc7, esorj0, xwhka0, tgref7, oztdp0, gwoox2, nzzou8, mwsbi5, zpurf6, mrskz5, ekhmw8, ngmxv7, zikno0, wayxk7, zqbka6, yzvhi1, qszyg7, vvvce8, rbpur4, egklc8, deevv9, psvdt1, daqtm6, xbzef8, djxgn9, jfwxu3, qbeiv9, arrye8, hvhep2, gdpml4, rslyo9, dmclw8, igskw2, ohoez3, hnivb3, zicdt4, tsqwn8, eqhon7, wfwfw3, pxjhl3, bjpnj9, jsqwi0, tdbek0, bvryl9, zxrxx6, kgflz1, rqeri6, wgclp0, bhvyh3, ahqjk4, rcaxm6, trwuj5, srbhr7, xevof1, bfwzv2, gtgfb5, qityp7, dppmt5, njvtn7, sjibc1, ottix1, iqazd7, hangg8, sdfej8, cijqi6, dysna2, blucj1, jaakl7, gqhln6, lbkrx0, zxqgx4, zdari3, japgm9, fysvk8, npugy9, wmiov0, lguum7, bckyj9, sgdrt2, jeokb2, jfnup5, panas4, oigvl7, dpghc8, inrzg5, kwsnd0, aakzx2, bxlco2, wfrdi1, pdwyi4, aange5, weoru1, mnplq1, rriyi0, ivjqn2, ttebu8, flnlm9, mvycn8, fjooe9, hmulh4, dfvaa1, mbtcc6, debxb4, bgypq9, hgugf8, ochmp6, kihsm5, zwfxl9, mdagg6, dgfex4, vpdxx2, sgepq0, dppdu9, spcah9, ubdju6, rzcpo7, objyg6, lvjyl3, nmfzm8, xcmvm9, yvcko4, umuqu0, quhdj0, qzmaj3, akftb7, axqrg9, jrlej7, lovsc5, jogkq4, zitsh7, szuwb1, ftxrc2, zpseg1, tawqh0, vxzkn9, ooqwe9, dacpn3, wqnql5, pymix3, vksix1, bkbck9, jfwyd6, guuaw0, tuybe7, zvgql9, cbfop7, ognzv9, aijcn2, ldetf5, itpox4, tsnmo7, gsnbn7, pihxw6, nahkl7, aptdq7, bwotv8, ulwli7, bsnno2, kzdpa3, tibhy7, kqwrf1, hquuv1, xybit7, eqhgu7, bhscp5, ecenm5, cmjtz4, tfvok9, myzjr6, nzneo2, hugxl4, kyksk7, ogejw7, atsjw9, uqazb3, pyrza9, htdio9, dfzmd5, oeimw0, vajjt9, lhiyd6, vnhco3, hrogx8, jusvv7, lmhco1, zmjbv1, jmecx9, gupjh4, oymto1, ickpt8, ioilc3, aigtm6, vvkpd1, tucoj3, oqdml7, lwblb0, qivvz0, mjmwi8, wdagp6, grzzs9, iuhpm8, fsjqv0, mvsgm6, hopxc3, kloht4, kkpzg9, utgjj6, pjslq8, gpqbo1, yyexh1, xvfrz5, sxvri0, pznxi0, cojmj7, vhigu8, tpxvj0, pcyyb4, jjcgr8, oyong8, ztpke6, qhlqw6, swbyc3, osaiv0, otsll4, plddt6, uonyt9, echnb8, dbrow3, pchxq8, qsdwo4, tqaaq9, dxccr0, mqvvy0, uslpk4, lmpop5, xgcau7, mjwmq5),
            edges = mapOf(
                ndgbt4 to listOf(fvltv4, nyhuk1, hgwpb5, howlb4, wwutl1, dvxsc7, esorj0),
                fvltv4 to listOf(ykchu8, mddyf3, sgewd0),
                mddyf3 to listOf(livww5, pmctk8, aaifv6),
                livww5 to listOf(nfxdv7, hpnag5, bglby3),
                nfxdv7 to listOf(meegw8),
                bglby3 to listOf(ltbxx5),
                aaifv6 to listOf(sfshp7),
                nyhuk1 to listOf(hpsmj9, clbus1, svxza4),
                clbus1 to listOf(vaksc9, zqagp0, bfjjb8),
                vaksc9 to listOf(wfezf2, atkbo4, wzxjj2),
                wfezf2 to listOf(ivpbf5),
                wzxjj2 to listOf(cnfmo6),
                bfjjb8 to listOf(maihq0),
                hgwpb5 to listOf(dtxsu6, cycsd9, gbmri5),
                cycsd9 to listOf(nyzeb1, mnteu7, bnovh4),
                nyzeb1 to listOf(mnhdt8, momzp8, lptbi8),
                mnhdt8 to listOf(pcljc2),
                lptbi8 to listOf(ybnxs4),
                bnovh4 to listOf(fluqy0),
                howlb4 to listOf(cfglh5, vczli9, wlfoh8),
                vczli9 to listOf(fzsmk7, gzxvu2, elwar9),
                fzsmk7 to listOf(rofqw8, imjud0, vjvll2),
                rofqw8 to listOf(ebzyc7),
                vjvll2 to listOf(byjwp2),
                elwar9 to listOf(qacum5),
                wwutl1 to listOf(uuecc1, vvooa5, gdufm7),
                vvooa5 to listOf(evqsa2, bicru0, wdpol0),
                evqsa2 to listOf(coxsv3, ggnqt7, duaks5),
                coxsv3 to listOf(gpmqz9, jxdao3, gsesi6),
                gpmqz9 to listOf(wygfz4, yezkj0, huooi6),
                wygfz4 to listOf(afbme1),
                huooi6 to listOf(srfod6),
                gsesi6 to listOf(pjaay0),
                duaks5 to listOf(dufbz9),
                wdpol0 to listOf(nzpzz3),
                esorj0 to listOf(xwhka0, oztdp0, gwoox2, mwsbi5, vvvce8),
                xwhka0 to listOf(tgref7),
                gwoox2 to listOf(nzzou8),
                mwsbi5 to listOf(zpurf6, mrskz5),
                mrskz5 to listOf(ekhmw8, zikno0),
                ekhmw8 to listOf(ngmxv7),
                zikno0 to listOf(wayxk7, zqbka6, qszyg7),
                zqbka6 to listOf(yzvhi1),
                vvvce8 to listOf(rbpur4, egklc8, deevv9, dmclw8, bhvyh3, hangg8, sdfej8, cijqi6, ickpt8, mjwmq5),
                deevv9 to listOf(psvdt1, xbzef8, jfwxu3, hvhep2),
                psvdt1 to listOf(daqtm6),
                xbzef8 to listOf(djxgn9),
                jfwxu3 to listOf(qbeiv9, arrye8),
                hvhep2 to listOf(gdpml4, rslyo9),
                dmclw8 to listOf(igskw2, hnivb3, tsqwn8, wgclp0),
                igskw2 to listOf(ohoez3),
                hnivb3 to listOf(zicdt4),
                tsqwn8 to listOf(eqhon7, pxjhl3, bjpnj9),
                eqhon7 to listOf(wfwfw3),
                bjpnj9 to listOf(jsqwi0, tdbek0, zxrxx6),
                tdbek0 to listOf(bvryl9),
                zxrxx6 to listOf(kgflz1, rqeri6),
                bhvyh3 to listOf(ahqjk4, xevof1, gtgfb5, iqazd7),
                ahqjk4 to listOf(rcaxm6, trwuj5, srbhr7),
                xevof1 to listOf(bfwzv2),
                gtgfb5 to listOf(qityp7, njvtn7, sjibc1),
                qityp7 to listOf(dppmt5),
                sjibc1 to listOf(ottix1),
                cijqi6 to listOf(dysna2, gqhln6, lbkrx0, zdari3, jeokb2),
                dysna2 to listOf(blucj1, jaakl7),
                lbkrx0 to listOf(zxqgx4),
                zdari3 to listOf(japgm9, fysvk8, sgdrt2),
                fysvk8 to listOf(npugy9, lguum7),
                npugy9 to listOf(wmiov0),
                lguum7 to listOf(bckyj9),
                jeokb2 to listOf(jfnup5, panas4, hgugf8, lovsc5, guuaw0, lmhco1, oymto1),
                panas4 to listOf(oigvl7, dpghc8, ivjqn2),
                dpghc8 to listOf(inrzg5, kwsnd0, rriyi0),
                kwsnd0 to listOf(aakzx2, bxlco2),
                bxlco2 to listOf(wfrdi1, aange5),
                wfrdi1 to listOf(pdwyi4),
                aange5 to listOf(weoru1, mnplq1),
                ivjqn2 to listOf(ttebu8, flnlm9, bgypq9),
                flnlm9 to listOf(mvycn8, fjooe9, dfvaa1),
                fjooe9 to listOf(hmulh4),
                dfvaa1 to listOf(mbtcc6, debxb4),
                hgugf8 to listOf(ochmp6, kihsm5, rzcpo7),
                kihsm5 to listOf(zwfxl9, mdagg6, ubdju6),
                mdagg6 to listOf(dgfex4, sgepq0, dppdu9),
                dgfex4 to listOf(vpdxx2),
                dppdu9 to listOf(spcah9),
                rzcpo7 to listOf(objyg6, lvjyl3, jrlej7),
                lvjyl3 to listOf(nmfzm8, xcmvm9, umuqu0),
                xcmvm9 to listOf(yvcko4),
                umuqu0 to listOf(quhdj0, qzmaj3, axqrg9),
                qzmaj3 to listOf(akftb7),
                lovsc5 to listOf(jogkq4, zitsh7, pymix3),
                zitsh7 to listOf(szuwb1, ftxrc2, wqnql5),
                ftxrc2 to listOf(zpseg1, vxzkn9),
                zpseg1 to listOf(tawqh0),
                vxzkn9 to listOf(ooqwe9, dacpn3),
                pymix3 to listOf(vksix1, bkbck9, jfwyd6),
                guuaw0 to listOf(tuybe7, zvgql9, xybit7, vajjt9, lhiyd6),
                zvgql9 to listOf(cbfop7, ognzv9, hquuv1),
                ognzv9 to listOf(aijcn2, kzdpa3, tibhy7),
                aijcn2 to listOf(ldetf5, tsnmo7, gsnbn7, nahkl7),
                ldetf5 to listOf(itpox4),
                gsnbn7 to listOf(pihxw6),
                nahkl7 to listOf(aptdq7, bwotv8, bsnno2),
                bwotv8 to listOf(ulwli7),
                tibhy7 to listOf(kqwrf1),
                xybit7 to listOf(eqhgu7, oeimw0),
                eqhgu7 to listOf(bhscp5, cmjtz4),
                bhscp5 to listOf(ecenm5),
                cmjtz4 to listOf(tfvok9, myzjr6, dfzmd5),
                myzjr6 to listOf(nzneo2, kyksk7, ogejw7, uqazb3),
                nzneo2 to listOf(hugxl4),
                ogejw7 to listOf(atsjw9),
                uqazb3 to listOf(pyrza9, htdio9),
                lhiyd6 to listOf(vnhco3, hrogx8, jusvv7),
                lmhco1 to listOf(zmjbv1, jmecx9, gupjh4),
                ickpt8 to listOf(ioilc3, vvkpd1, tucoj3, lwblb0, hopxc3),
                ioilc3 to listOf(aigtm6),
                tucoj3 to listOf(oqdml7),
                lwblb0 to listOf(qivvz0, mjmwi8, mvsgm6),
                mjmwi8 to listOf(wdagp6, iuhpm8),
                wdagp6 to listOf(grzzs9),
                iuhpm8 to listOf(fsjqv0),
                hopxc3 to listOf(kloht4, kkpzg9, xgcau7),
                kkpzg9 to listOf(utgjj6, pjslq8, gpqbo1, xvfrz5, pznxi0, cojmj7, ztpke6, qhlqw6),
                gpqbo1 to listOf(yyexh1),
                xvfrz5 to listOf(sxvri0),
                cojmj7 to listOf(vhigu8, pcyyb4),
                vhigu8 to listOf(tpxvj0),
                pcyyb4 to listOf(jjcgr8, oyong8),
                qhlqw6 to listOf(swbyc3, lmpop5),
                swbyc3 to listOf(osaiv0, plddt6, uonyt9, dbrow3),
                osaiv0 to listOf(otsll4),
                uonyt9 to listOf(echnb8),
                dbrow3 to listOf(pchxq8, qsdwo4, tqaaq9, dxccr0, uslpk4),
                dxccr0 to listOf(mqvvy0),
            )
        )

        val oqckg1 = Node("program")
        val hrkvh1 = Node("package_declaration")
        val ksqtp5 = Node("package")
        val jsydz7 = Node("scoped_identifier", isDuplicate = true)
        val zlpkk7 = Node("scoped_identifier", isDuplicate = true)
        val jbjtv7 = Node("identifier", isDuplicate = true)
        val cepfa3 = Node("com", isDuplicate = true)
        val qtnnh4 = Node(".", isDuplicate = true)
        val uzbor6 = Node("identifier", isDuplicate = true)
        val ermgn3 = Node("jimmyselectronics", isDuplicate = true)
        val nzdre9 = Node(".", isDuplicate = true)
        val zrhrq1 = Node("identifier", isDuplicate = true)
        val xrecn0 = Node("virgilio")
        val wsqbk1 = Node(";", isDuplicate = true)
        val ehawa6 = Node("import_declaration", isDuplicate = true)
        val yrvbt9 = Node("import", isDuplicate = true)
        val zgqlt7 = Node("scoped_identifier", isDuplicate = true)
        val lrinq7 = Node("scoped_identifier", isDuplicate = true)
        val ysjno3 = Node("identifier", isDuplicate = true)
        val iprvv0 = Node("java", isDuplicate = true)
        val nrpzt0 = Node(".", isDuplicate = true)
        val yinye4 = Node("identifier", isDuplicate = true)
        val wmhac0 = Node("util", isDuplicate = true)
        val tdsho5 = Node(".", isDuplicate = true)
        val wmhsg4 = Node("identifier", isDuplicate = true)
        val dsqjz2 = Node("ArrayList", isDuplicate = true)
        val rkfge0 = Node(";", isDuplicate = true)
        val vjjvq4 = Node("import_declaration", isDuplicate = true)
        val gkxou4 = Node("import", isDuplicate = true)
        val ljyvj0 = Node("scoped_identifier", isDuplicate = true)
        val mfluc9 = Node("scoped_identifier", isDuplicate = true)
        val ndryf1 = Node("identifier", isDuplicate = true)
        val wzbbu4 = Node("java", isDuplicate = true)
        val vumad0 = Node(".", isDuplicate = true)
        val fxgqj4 = Node("identifier", isDuplicate = true)
        val oeayq7 = Node("util", isDuplicate = true)
        val vrahj1 = Node(".", isDuplicate = true)
        val nsgef5 = Node("identifier", isDuplicate = true)
        val thtlf5 = Node("Random", isDuplicate = true)
        val nenki3 = Node(";", isDuplicate = true)
        val cbpoc0 = Node("import_declaration", isDuplicate = true)
        val zohas0 = Node("import", isDuplicate = true)
        val ixaor7 = Node("scoped_identifier", isDuplicate = true)
        val nyanm3 = Node("scoped_identifier", isDuplicate = true)
        val smmnh4 = Node("identifier", isDuplicate = true)
        val amruz5 = Node("com", isDuplicate = true)
        val qzets5 = Node(".", isDuplicate = true)
        val vkdhr4 = Node("identifier", isDuplicate = true)
        val nrzil5 = Node("jimmyselectronics", isDuplicate = true)
        val oahaj1 = Node(".", isDuplicate = true)
        val fzanv8 = Node("identifier", isDuplicate = true)
        val azmnd8 = Node("AbstractDevice", isDuplicate = true)
        val pquda1 = Node(";", isDuplicate = true)
        val omhmo4 = Node("import_declaration", isDuplicate = true)
        val nxzop4 = Node("import", isDuplicate = true)
        val wxpkx3 = Node("scoped_identifier", isDuplicate = true)
        val ibhvv8 = Node("scoped_identifier", isDuplicate = true)
        val iiqhe9 = Node("identifier", isDuplicate = true)
        val izwqv0 = Node("com", isDuplicate = true)
        val pdpqf6 = Node(".", isDuplicate = true)
        val seyqq1 = Node("identifier", isDuplicate = true)
        val jydka4 = Node("jimmyselectronics", isDuplicate = true)
        val jbjdr0 = Node(".", isDuplicate = true)
        val hnspj3 = Node("identifier", isDuplicate = true)
        val cmqyk6 = Node("Item", isDuplicate = true)
        val ctdgd4 = Node(";", isDuplicate = true)
        val luwse2 = Node("import_declaration", isDuplicate = true)
        val mkefw7 = Node("import", isDuplicate = true)
        val tytyx6 = Node("scoped_identifier", isDuplicate = true)
        val shmml5 = Node("scoped_identifier", isDuplicate = true)
        val zgxpa2 = Node("identifier", isDuplicate = true)
        val quavr9 = Node("com", isDuplicate = true)
        val aszin8 = Node(".", isDuplicate = true)
        val jmdvw0 = Node("identifier", isDuplicate = true)
        val oxxnt3 = Node("jimmyselectronics", isDuplicate = true)
        val bexxx5 = Node(".", isDuplicate = true)
        val lksmy2 = Node("identifier", isDuplicate = true)
        val hxrrq2 = Node("OverloadException", isDuplicate = true)
        val rgnyf4 = Node(";", isDuplicate = true)
        val axejf8 = Node("import_declaration", isDuplicate = true)
        val zsdie7 = Node("import", isDuplicate = true)
        val wrkuw8 = Node("scoped_identifier", isDuplicate = true)
        val vzirp4 = Node("scoped_identifier", isDuplicate = true)
        val liusw7 = Node("identifier", isDuplicate = true)
        val cpits7 = Node("ca", isDuplicate = true)
        val kakvf3 = Node(".", isDuplicate = true)
        val lfzod3 = Node("identifier", isDuplicate = true)
        val zulxy0 = Node("powerutility")
        val dwqob1 = Node(".", isDuplicate = true)
        val bytzr0 = Node("identifier", isDuplicate = true)
        val zsqho4 = Node("NoPowerException", isDuplicate = true)
        val okogc6 = Node(";", isDuplicate = true)
        val ryfrg3 = Node("import_declaration", isDuplicate = true)
        val eeqeb5 = Node("import", isDuplicate = true)
        val teddg7 = Node("scoped_identifier", isDuplicate = true)
        val nmuzm6 = Node("scoped_identifier", isDuplicate = true)
        val mmnii8 = Node("scoped_identifier", isDuplicate = true)
        val slvoo7 = Node("scoped_identifier", isDuplicate = true)
        val tlzvk8 = Node("identifier", isDuplicate = true)
        val jlhtm0 = Node("ca", isDuplicate = true)
        val elejg0 = Node(".", isDuplicate = true)
        val kbxpf6 = Node("identifier", isDuplicate = true)
        val pqeyt4 = Node("ucalgary", isDuplicate = true)
        val xsjft6 = Node(".", isDuplicate = true)
        val vtkmz2 = Node("identifier", isDuplicate = true)
        val lqgyx8 = Node("seng300", isDuplicate = true)
        val zybdq2 = Node(".", isDuplicate = true)
        val bzkpj2 = Node("identifier", isDuplicate = true)
        val jlevn2 = Node("simulation", isDuplicate = true)
        val yzgqj8 = Node(".", isDuplicate = true)
        val dajcu8 = Node("identifier", isDuplicate = true)
        val yfbtf0 = Node("InvalidArgumentSimulationException", isDuplicate = true)
        val kxbun5 = Node(";", isDuplicate = true)
        val fhpep8 = Node("import_declaration", isDuplicate = true)
        val khapa2 = Node("import", isDuplicate = true)
        val gyztv4 = Node("scoped_identifier", isDuplicate = true)
        val zsqmj8 = Node("scoped_identifier", isDuplicate = true)
        val pgfex3 = Node("scoped_identifier", isDuplicate = true)
        val caxoy6 = Node("scoped_identifier", isDuplicate = true)
        val hmuxn4 = Node("identifier", isDuplicate = true)
        val fecid4 = Node("ca", isDuplicate = true)
        val gjyhh7 = Node(".", isDuplicate = true)
        val vgaet3 = Node("identifier", isDuplicate = true)
        val aaziw4 = Node("ucalgary", isDuplicate = true)
        val wqand1 = Node(".", isDuplicate = true)
        val kxute4 = Node("identifier", isDuplicate = true)
        val caaef2 = Node("seng300", isDuplicate = true)
        val paitr0 = Node(".", isDuplicate = true)
        val ysuyr2 = Node("identifier", isDuplicate = true)
        val dfqlz4 = Node("simulation", isDuplicate = true)
        val zohuz2 = Node(".", isDuplicate = true)
        val keejs2 = Node("identifier", isDuplicate = true)
        val bcwpz4 = Node("NullPointerSimulationException", isDuplicate = true)
        val enoni7 = Node(";", isDuplicate = true)
        val iwoge2 = Node("import_declaration", isDuplicate = true)
        val sdeek3 = Node("import", isDuplicate = true)
        val cnrtv4 = Node("scoped_identifier", isDuplicate = true)
        val qefvl1 = Node("scoped_identifier", isDuplicate = true)
        val deaqr6 = Node("scoped_identifier", isDuplicate = true)
        val rkjzj7 = Node("scoped_identifier", isDuplicate = true)
        val dehga5 = Node("identifier", isDuplicate = true)
        val exley6 = Node("ca", isDuplicate = true)
        val qveow4 = Node(".", isDuplicate = true)
        val egzfs5 = Node("identifier", isDuplicate = true)
        val tizsl5 = Node("ucalgary", isDuplicate = true)
        val kdjaa4 = Node(".", isDuplicate = true)
        val ercet3 = Node("identifier", isDuplicate = true)
        val neudt1 = Node("seng300", isDuplicate = true)
        val gwzcz0 = Node(".", isDuplicate = true)
        val vkcby3 = Node("identifier", isDuplicate = true)
        val nnxce4 = Node("simulation", isDuplicate = true)
        val ndpwh3 = Node(".", isDuplicate = true)
        val lpmym4 = Node("identifier", isDuplicate = true)
        val xjute6 = Node("SimulationException")
        val zvfhg3 = Node(";", isDuplicate = true)
        val upmeo1 = Node("block_comment", isDuplicate = true)
        val tojcb7 = Node("class_declaration")
        val smxzg6 = Node("modifiers", isDuplicate = true)
        val zcjfg0 = Node("public", isDuplicate = true)
        val sbiwv3 = Node("class")
        val eazve8 = Node("identifier", isDuplicate = true)
        val baxqo2 = Node("ElectronicScale", isDuplicate = true)
        val vfhxd6 = Node("superclass")
        val rwger9 = Node("extends")
        val kdwam2 = Node("generic_type", isDuplicate = true)
        val bhscp8 = Node("type_identifier", isDuplicate = true)
        val usyjh7 = Node("AbstractDevice", isDuplicate = true)
        val ckznr7 = Node("type_arguments", isDuplicate = true)
        val fjeok7 = Node("<", isDuplicate = true)
        val doakg0 = Node("type_identifier", isDuplicate = true)
        val dmywb2 = Node("ElectronicScaleListener", isDuplicate = true)
        val tpinn2 = Node(">", isDuplicate = true)
        val esdan7 = Node("class_body")
        val lcbyy7 = Node("{", isDuplicate = true)
        val pttni4 = Node("field_declaration", isDuplicate = true)
        val jgkfd3 = Node("modifiers", isDuplicate = true)
        val wrrda3 = Node("private", isDuplicate = true)
        val zdjyf1 = Node("generic_type", isDuplicate = true)
        val vkyga4 = Node("type_identifier", isDuplicate = true)
        val iswxp1 = Node("ArrayList", isDuplicate = true)
        val vqjlm0 = Node("type_arguments", isDuplicate = true)
        val wlvmk2 = Node("<", isDuplicate = true)
        val xlerx3 = Node("type_identifier", isDuplicate = true)
        val oljdn7 = Node("Item", isDuplicate = true)
        val hmitk6 = Node(">", isDuplicate = true)
        val qbjnr1 = Node("variable_declarator", isDuplicate = true)
        val ywell4 = Node("identifier", isDuplicate = true)
        val rijqf2 = Node("items", isDuplicate = true)
        val oekzy0 = Node("=", isDuplicate = true)
        val rieqk7 = Node("object_creation_expression", isDuplicate = true)
        val rhnem6 = Node("new", isDuplicate = true)
        val xekxu6 = Node("generic_type", isDuplicate = true)
        val zjlby2 = Node("type_identifier", isDuplicate = true)
        val rzdtf6 = Node("ArrayList", isDuplicate = true)
        val uqfbq1 = Node("type_arguments", isDuplicate = true)
        val isofe9 = Node("<", isDuplicate = true)
        val bxwar5 = Node(">", isDuplicate = true)
        val oixri0 = Node("argument_list", isDuplicate = true)
        val lelol8 = Node("(", isDuplicate = true)
        val xqfjs4 = Node(")", isDuplicate = true)
        val ysdii8 = Node(";", isDuplicate = true)
        val yhdvb0 = Node("field_declaration", isDuplicate = true)
        val xhewb1 = Node("modifiers", isDuplicate = true)
        val fibsh6 = Node("private", isDuplicate = true)
        val hsnjl7 = Node("floating_point_type", isDuplicate = true)
        val mchgr5 = Node("double", isDuplicate = true)
        val jvzod8 = Node("variable_declarator", isDuplicate = true)
        val bbyit1 = Node("identifier", isDuplicate = true)
        val cvqbe3 = Node("weightLimitInGrams", isDuplicate = true)
        val odupw1 = Node(";", isDuplicate = true)
        val qdavd9 = Node("field_declaration", isDuplicate = true)
        val mwzox1 = Node("modifiers", isDuplicate = true)
        val cgfkb1 = Node("private", isDuplicate = true)
        val zapfg9 = Node("floating_point_type", isDuplicate = true)
        val hishr4 = Node("double", isDuplicate = true)
        val dgxji1 = Node("variable_declarator", isDuplicate = true)
        val injzv2 = Node("identifier", isDuplicate = true)
        val iowgs7 = Node("currentWeightInGrams", isDuplicate = true)
        val dqies5 = Node("=", isDuplicate = true)
        val vtacd0 = Node("decimal_integer_literal", isDuplicate = true)
        val xbucl5 = Node("0", isDuplicate = true)
        val wqrgh8 = Node(";", isDuplicate = true)
        val efnod4 = Node("field_declaration", isDuplicate = true)
        val ginbe6 = Node("modifiers", isDuplicate = true)
        val krpsm8 = Node("private", isDuplicate = true)
        val kkfiu1 = Node("floating_point_type", isDuplicate = true)
        val ghzyq1 = Node("double", isDuplicate = true)
        val oeecl7 = Node("variable_declarator", isDuplicate = true)
        val csaxm8 = Node("identifier", isDuplicate = true)
        val brbxs5 = Node("weightAtLastEvent", isDuplicate = true)
        val igvlv4 = Node("=", isDuplicate = true)
        val ivzrj8 = Node("decimal_integer_literal", isDuplicate = true)
        val orhbp8 = Node("0", isDuplicate = true)
        val eafxj3 = Node(";", isDuplicate = true)
        val tybef9 = Node("field_declaration", isDuplicate = true)
        val batwf0 = Node("modifiers", isDuplicate = true)
        val sxxdv5 = Node("private", isDuplicate = true)
        val rvwwt6 = Node("floating_point_type", isDuplicate = true)
        val fyary4 = Node("double", isDuplicate = true)
        val pjsnn4 = Node("variable_declarator", isDuplicate = true)
        val bqsue4 = Node("identifier", isDuplicate = true)
        val fgofb1 = Node("sensitivity", isDuplicate = true)
        val axpae0 = Node(";", isDuplicate = true)
        val xuoot4 = Node("block_comment", isDuplicate = true)
        val mbuwy3 = Node("constructor_declaration")
        val kwsjw7 = Node("modifiers", isDuplicate = true)
        val cqecu7 = Node("public", isDuplicate = true)
        val eusbr0 = Node("identifier", isDuplicate = true)
        val rbzsj6 = Node("ElectronicScale", isDuplicate = true)
        val ikesw5 = Node("formal_parameters", isDuplicate = true)
        val jcisc0 = Node("(", isDuplicate = true)
        val jqpxc2 = Node("formal_parameter", isDuplicate = true)
        val sjeso8 = Node("floating_point_type", isDuplicate = true)
        val odvai8 = Node("double", isDuplicate = true)
        val nrzre1 = Node("identifier", isDuplicate = true)
        val tghoh9 = Node("weightLimitInGrams", isDuplicate = true)
        val uacxf9 = Node(",", isDuplicate = true)
        val tcgzz7 = Node("formal_parameter", isDuplicate = true)
        val rwfxs2 = Node("floating_point_type", isDuplicate = true)
        val ygvby2 = Node("double", isDuplicate = true)
        val igzxw6 = Node("identifier", isDuplicate = true)
        val gjphi5 = Node("sensitivity", isDuplicate = true)
        val egiej4 = Node(")", isDuplicate = true)
        val zweam4 = Node("constructor_body")
        val fquln8 = Node("{", isDuplicate = true)
        val vygut3 = Node("if_statement", isDuplicate = true)
        val qbfeo3 = Node("if", isDuplicate = true)
        val riciv0 = Node("parenthesized_expression", isDuplicate = true)
        val ifina6 = Node("(", isDuplicate = true)
        val sbjvy1 = Node("binary_expression", isDuplicate = true)
        val ryout8 = Node("identifier", isDuplicate = true)
        val rxqjb9 = Node("weightLimitInGrams", isDuplicate = true)
        val hjoic0 = Node("<=", isDuplicate = true)
        val vdaar0 = Node("decimal_floating_point_literal", isDuplicate = true)
        val pqgjq3 = Node("0.0", isDuplicate = true)
        val nkwzm3 = Node(")", isDuplicate = true)
        val cqwud5 = Node("throw_statement", isDuplicate = true)
        val amttq6 = Node("throw", isDuplicate = true)
        val yotef7 = Node("object_creation_expression", isDuplicate = true)
        val rpuls1 = Node("new", isDuplicate = true)
        val ulfmn6 = Node("type_identifier", isDuplicate = true)
        val iszax7 = Node("InvalidArgumentSimulationException", isDuplicate = true)
        val gijwn5 = Node("argument_list", isDuplicate = true)
        val hpejp2 = Node("(", isDuplicate = true)
        val enkbk0 = Node("string_literal", isDuplicate = true)
        val ahihv4 = Node("\"The maximum weight cannot be zero or less.\"")
        val grzrr0 = Node(")", isDuplicate = true)
        val tcfge4 = Node(";", isDuplicate = true)
        val pdfoc7 = Node("if_statement", isDuplicate = true)
        val ttgzm8 = Node("if", isDuplicate = true)
        val abutw6 = Node("parenthesized_expression", isDuplicate = true)
        val pmsoa2 = Node("(", isDuplicate = true)
        val tfbdx6 = Node("binary_expression", isDuplicate = true)
        val kpmqg2 = Node("identifier", isDuplicate = true)
        val jlryc7 = Node("sensitivity", isDuplicate = true)
        val tfjcn5 = Node("<=", isDuplicate = true)
        val pqcbo1 = Node("decimal_floating_point_literal", isDuplicate = true)
        val dpafc3 = Node("0.0", isDuplicate = true)
        val votwa4 = Node(")", isDuplicate = true)
        val xjpze9 = Node("throw_statement", isDuplicate = true)
        val gakno7 = Node("throw", isDuplicate = true)
        val rlpyz6 = Node("object_creation_expression", isDuplicate = true)
        val qhtga9 = Node("new", isDuplicate = true)
        val foyvn9 = Node("type_identifier", isDuplicate = true)
        val gadtb8 = Node("InvalidArgumentSimulationException", isDuplicate = true)
        val csnxl4 = Node("argument_list", isDuplicate = true)
        val wofdo6 = Node("(", isDuplicate = true)
        val bielp4 = Node("string_literal", isDuplicate = true)
        val uggel5 = Node("\"The sensitivity cannot be zero or less.\"")
        val csgds5 = Node(")", isDuplicate = true)
        val cketi8 = Node(";", isDuplicate = true)
        val vfwsz1 = Node("expression_statement", isDuplicate = true)
        val milhc4 = Node("assignment_expression", isDuplicate = true)
        val tcphw6 = Node("field_access", isDuplicate = true)
        val otfuu3 = Node("this", isDuplicate = true)
        val dlzhm6 = Node(".", isDuplicate = true)
        val tmwqx3 = Node("identifier", isDuplicate = true)
        val zwfuq2 = Node("weightLimitInGrams", isDuplicate = true)
        val tuepd3 = Node("=", isDuplicate = true)
        val rrcgw5 = Node("identifier", isDuplicate = true)
        val qqktp2 = Node("weightLimitInGrams", isDuplicate = true)
        val afjzz3 = Node(";", isDuplicate = true)
        val rmypd4 = Node("expression_statement", isDuplicate = true)
        val rfedz1 = Node("assignment_expression", isDuplicate = true)
        val dpiei1 = Node("field_access", isDuplicate = true)
        val nrpzk6 = Node("this", isDuplicate = true)
        val lcksi9 = Node(".", isDuplicate = true)
        val enmya8 = Node("identifier", isDuplicate = true)
        val xemzy8 = Node("sensitivity", isDuplicate = true)
        val ajofr2 = Node("=", isDuplicate = true)
        val gopya0 = Node("identifier", isDuplicate = true)
        val vzmdl0 = Node("sensitivity", isDuplicate = true)
        val fduvf9 = Node(";", isDuplicate = true)
        val ajazr1 = Node("}", isDuplicate = true)
        val gvdva5 = Node("block_comment", isDuplicate = true)
        val frvgk6 = Node("method_declaration", isDuplicate = true)
        val owwff0 = Node("modifiers", isDuplicate = true)
        val rislg1 = Node("public", isDuplicate = true)
        val txlyo6 = Node("floating_point_type", isDuplicate = true)
        val nktzr0 = Node("double", isDuplicate = true)
        val ojqhb2 = Node("identifier", isDuplicate = true)
        val ekrnl5 = Node("getWeightLimit")
        val jnzrs9 = Node("formal_parameters", isDuplicate = true)
        val ygsld8 = Node("(", isDuplicate = true)
        val gtnnq2 = Node(")", isDuplicate = true)
        val wbayx2 = Node("block", isDuplicate = true)
        val lrjbw2 = Node("{", isDuplicate = true)
        val yecte1 = Node("return_statement", isDuplicate = true)
        val clcoq9 = Node("return", isDuplicate = true)
        val hxmnv1 = Node("identifier", isDuplicate = true)
        val mtqpf3 = Node("weightLimitInGrams", isDuplicate = true)
        val mgpqo7 = Node(";", isDuplicate = true)
        val ybldc8 = Node("}", isDuplicate = true)
        val xfczb7 = Node("block_comment", isDuplicate = true)
        val lbede8 = Node("method_declaration", isDuplicate = true)
        val tphxv6 = Node("modifiers", isDuplicate = true)
        val frjyi8 = Node("public", isDuplicate = true)
        val wibtc6 = Node("synchronized", isDuplicate = true)
        val ovwcu2 = Node("floating_point_type", isDuplicate = true)
        val tfkbp9 = Node("double", isDuplicate = true)
        val ekolb0 = Node("identifier", isDuplicate = true)
        val olrgg4 = Node("getCurrentWeight")
        val zcmha8 = Node("formal_parameters", isDuplicate = true)
        val vppyu3 = Node("(", isDuplicate = true)
        val qbotf8 = Node(")", isDuplicate = true)
        val gbpot6 = Node("throws", isDuplicate = true)
        val bkyxz6 = Node("throws", isDuplicate = true)
        val xupxf0 = Node("type_identifier", isDuplicate = true)
        val wpdoh3 = Node("OverloadException", isDuplicate = true)
        val bpbzh5 = Node("block", isDuplicate = true)
        val lrnya3 = Node("{", isDuplicate = true)
        val asdnt5 = Node("if_statement", isDuplicate = true)
        val jewhq8 = Node("if", isDuplicate = true)
        val cttok1 = Node("parenthesized_expression", isDuplicate = true)
        val fvmfc8 = Node("(", isDuplicate = true)
        val ulluo3 = Node("unary_expression", isDuplicate = true)
        val djguv1 = Node("!", isDuplicate = true)
        val pskuf5 = Node("method_invocation", isDuplicate = true)
        val qfiwg3 = Node("identifier", isDuplicate = true)
        val oflci8 = Node("isPoweredUp", isDuplicate = true)
        val jkxgz7 = Node("argument_list", isDuplicate = true)
        val xzobo4 = Node("(", isDuplicate = true)
        val yotyr8 = Node(")", isDuplicate = true)
        val fkmsy2 = Node(")", isDuplicate = true)
        val fyohi7 = Node("throw_statement", isDuplicate = true)
        val kykho7 = Node("throw", isDuplicate = true)
        val jdetd7 = Node("object_creation_expression", isDuplicate = true)
        val gwipd5 = Node("new", isDuplicate = true)
        val esoqn7 = Node("type_identifier", isDuplicate = true)
        val bqcvd2 = Node("NoPowerException", isDuplicate = true)
        val khxpx1 = Node("argument_list", isDuplicate = true)
        val ekohl1 = Node("(", isDuplicate = true)
        val jmggy9 = Node(")", isDuplicate = true)
        val pxivg5 = Node(";", isDuplicate = true)
        val kuhok2 = Node("if_statement", isDuplicate = true)
        val kkcuj3 = Node("if", isDuplicate = true)
        val degqe7 = Node("parenthesized_expression", isDuplicate = true)
        val ciwcm7 = Node("(", isDuplicate = true)
        val tdwyn4 = Node("binary_expression", isDuplicate = true)
        val iddnz6 = Node("identifier", isDuplicate = true)
        val yamvl1 = Node("currentWeightInGrams", isDuplicate = true)
        val buxbv5 = Node("<=", isDuplicate = true)
        val acfgj9 = Node("identifier", isDuplicate = true)
        val ahbca6 = Node("weightLimitInGrams", isDuplicate = true)
        val funze8 = Node(")", isDuplicate = true)
        val nuauc0 = Node("return_statement", isDuplicate = true)
        val ogpjo1 = Node("return", isDuplicate = true)
        val sodkb8 = Node("binary_expression", isDuplicate = true)
        val zczqj8 = Node("identifier", isDuplicate = true)
        val fyqoo7 = Node("currentWeightInGrams", isDuplicate = true)
        val rfmxp8 = Node("+")
        val ljvkg1 = Node("binary_expression", isDuplicate = true)
        val hndcl1 = Node("method_invocation", isDuplicate = true)
        val vdcrv3 = Node("object_creation_expression", isDuplicate = true)
        val asiaz6 = Node("new", isDuplicate = true)
        val pttol7 = Node("type_identifier", isDuplicate = true)
        val tzopa8 = Node("Random", isDuplicate = true)
        val mtrot7 = Node("argument_list", isDuplicate = true)
        val cmjnr7 = Node("(", isDuplicate = true)
        val fjhvw1 = Node(")", isDuplicate = true)
        val xtmej0 = Node(".", isDuplicate = true)
        val jgigh5 = Node("identifier", isDuplicate = true)
        val nilbu7 = Node("nextDouble")
        val flwtu7 = Node("argument_list", isDuplicate = true)
        val ziqtn5 = Node("(", isDuplicate = true)
        val deveu6 = Node(")", isDuplicate = true)
        val ekrei2 = Node("/")
        val efyum7 = Node("decimal_floating_point_literal", isDuplicate = true)
        val mkgfv3 = Node("10.0")
        val ppmli8 = Node(";", isDuplicate = true)
        val clfom6 = Node("throw_statement", isDuplicate = true)
        val ujwbk3 = Node("throw", isDuplicate = true)
        val nqaax8 = Node("object_creation_expression", isDuplicate = true)
        val sdsuy8 = Node("new", isDuplicate = true)
        val lnlwv3 = Node("type_identifier", isDuplicate = true)
        val fdvzk2 = Node("OverloadException", isDuplicate = true)
        val xfcif0 = Node("argument_list", isDuplicate = true)
        val mzvcp0 = Node("(", isDuplicate = true)
        val crdgl4 = Node(")", isDuplicate = true)
        val akdbw5 = Node(";", isDuplicate = true)
        val rklha9 = Node("}", isDuplicate = true)
        val uzihd4 = Node("block_comment", isDuplicate = true)
        val iupks2 = Node("method_declaration", isDuplicate = true)
        val etpyu6 = Node("modifiers", isDuplicate = true)
        val uaare2 = Node("public", isDuplicate = true)
        val bdpye4 = Node("floating_point_type", isDuplicate = true)
        val salek0 = Node("double", isDuplicate = true)
        val kmvze3 = Node("identifier", isDuplicate = true)
        val mivap0 = Node("getSensitivity")
        val xzmut6 = Node("formal_parameters", isDuplicate = true)
        val decaz2 = Node("(", isDuplicate = true)
        val sywtq8 = Node(")", isDuplicate = true)
        val qkojn2 = Node("block", isDuplicate = true)
        val ugnlg2 = Node("{", isDuplicate = true)
        val xtjgl3 = Node("return_statement", isDuplicate = true)
        val lxzjq1 = Node("return", isDuplicate = true)
        val jlera5 = Node("identifier", isDuplicate = true)
        val iosgo3 = Node("sensitivity", isDuplicate = true)
        val boibz9 = Node(";", isDuplicate = true)
        val jvojt8 = Node("}", isDuplicate = true)
        val buivq2 = Node("block_comment", isDuplicate = true)
        val hylbp7 = Node("method_declaration", isDuplicate = true)
        val knezv2 = Node("modifiers", isDuplicate = true)
        val shrce5 = Node("public", isDuplicate = true)
        val bpbla1 = Node("synchronized", isDuplicate = true)
        val ywulk5 = Node("void_type", isDuplicate = true)
        val pbuko9 = Node("identifier", isDuplicate = true)
        val tsjfj2 = Node("add", isDuplicate = true)
        val tmkhy8 = Node("formal_parameters", isDuplicate = true)
        val usmwc5 = Node("(", isDuplicate = true)
        val pguqt8 = Node("formal_parameter", isDuplicate = true)
        val rpylh9 = Node("type_identifier", isDuplicate = true)
        val tflgr2 = Node("Item", isDuplicate = true)
        val oylgl6 = Node("identifier", isDuplicate = true)
        val ymhlz0 = Node("item", isDuplicate = true)
        val xkngo0 = Node(")", isDuplicate = true)
        val tlvrg7 = Node("block", isDuplicate = true)
        val wovsi5 = Node("{", isDuplicate = true)
        val oeywi9 = Node("if_statement", isDuplicate = true)
        val cinqv7 = Node("if", isDuplicate = true)
        val ojbgl8 = Node("parenthesized_expression", isDuplicate = true)
        val nflpi8 = Node("(", isDuplicate = true)
        val qaunq3 = Node("unary_expression", isDuplicate = true)
        val picfx6 = Node("!", isDuplicate = true)
        val ycwwv6 = Node("method_invocation", isDuplicate = true)
        val tabuu9 = Node("identifier", isDuplicate = true)
        val eecvg5 = Node("isPoweredUp", isDuplicate = true)
        val egglm8 = Node("argument_list", isDuplicate = true)
        val oklco7 = Node("(", isDuplicate = true)
        val omlrl7 = Node(")", isDuplicate = true)
        val ukhfc8 = Node(")", isDuplicate = true)
        val dbneh1 = Node("throw_statement", isDuplicate = true)
        val ershn3 = Node("throw", isDuplicate = true)
        val mcdsx9 = Node("object_creation_expression", isDuplicate = true)
        val cqfqf3 = Node("new", isDuplicate = true)
        val tmpxx0 = Node("type_identifier", isDuplicate = true)
        val xsape2 = Node("NoPowerException", isDuplicate = true)
        val dcayw7 = Node("argument_list", isDuplicate = true)
        val eamkm5 = Node("(", isDuplicate = true)
        val vofjw7 = Node(")", isDuplicate = true)
        val ocgxw2 = Node(";", isDuplicate = true)
        val huxvp1 = Node("if_statement", isDuplicate = true)
        val ktped6 = Node("if", isDuplicate = true)
        val glimc1 = Node("parenthesized_expression", isDuplicate = true)
        val xltbv3 = Node("(", isDuplicate = true)
        val obdrb0 = Node("binary_expression", isDuplicate = true)
        val tgtir4 = Node("identifier", isDuplicate = true)
        val novhy0 = Node("item", isDuplicate = true)
        val fetms4 = Node("==")
        val raxpi5 = Node("null_literal")
        val cyswz8 = Node("null")
        val petrw2 = Node(")", isDuplicate = true)
        val ypcjq1 = Node("throw_statement", isDuplicate = true)
        val rujtz2 = Node("throw", isDuplicate = true)
        val ooufk2 = Node("object_creation_expression", isDuplicate = true)
        val oluyp1 = Node("new", isDuplicate = true)
        val ugnfy3 = Node("type_identifier", isDuplicate = true)
        val khykh6 = Node("NullPointerSimulationException", isDuplicate = true)
        val znxwm5 = Node("argument_list", isDuplicate = true)
        val hcwfp8 = Node("(", isDuplicate = true)
        val dwvvd9 = Node("string_literal", isDuplicate = true)
        val djfam6 = Node("\"item\"")
        val eazjf7 = Node(")", isDuplicate = true)
        val dyqia5 = Node(";", isDuplicate = true)
        val xccwr5 = Node("if_statement", isDuplicate = true)
        val cxugn9 = Node("if", isDuplicate = true)
        val nawyk9 = Node("parenthesized_expression", isDuplicate = true)
        val cfryx1 = Node("(", isDuplicate = true)
        val mshsn6 = Node("method_invocation", isDuplicate = true)
        val wrwjb3 = Node("identifier", isDuplicate = true)
        val cexmx1 = Node("items", isDuplicate = true)
        val ojisb8 = Node(".", isDuplicate = true)
        val zipzo3 = Node("identifier", isDuplicate = true)
        val pzyyj7 = Node("contains")
        val bahwy1 = Node("argument_list", isDuplicate = true)
        val jxrur5 = Node("(", isDuplicate = true)
        val tsfwv2 = Node("identifier", isDuplicate = true)
        val fduji7 = Node("item", isDuplicate = true)
        val ktgzf2 = Node(")", isDuplicate = true)
        val somtx1 = Node(")", isDuplicate = true)
        val xrbqm1 = Node("throw_statement", isDuplicate = true)
        val ivyep0 = Node("throw", isDuplicate = true)
        val kblsa6 = Node("object_creation_expression", isDuplicate = true)
        val qkpsl0 = Node("new", isDuplicate = true)
        val weigr3 = Node("type_identifier", isDuplicate = true)
        val qdrrh6 = Node("InvalidArgumentSimulationException", isDuplicate = true)
        val rrplm3 = Node("argument_list", isDuplicate = true)
        val skruc5 = Node("(", isDuplicate = true)
        val qpxpr4 = Node("string_literal", isDuplicate = true)
        val dwuux1 = Node("\"The same item cannot be added more than once to the scale.\"")
        val oknac4 = Node(")", isDuplicate = true)
        val bsoxo3 = Node(";", isDuplicate = true)
        val ptjpb0 = Node("expression_statement", isDuplicate = true)
        val kdscc1 = Node("assignment_expression", isDuplicate = true)
        val mcbcw7 = Node("identifier", isDuplicate = true)
        val yhrfx7 = Node("currentWeightInGrams", isDuplicate = true)
        val baaqv6 = Node("+=", isDuplicate = true)
        val ospnv0 = Node("method_invocation", isDuplicate = true)
        val fpqxp0 = Node("identifier", isDuplicate = true)
        val vtctv6 = Node("item", isDuplicate = true)
        val btrel0 = Node(".", isDuplicate = true)
        val izucg0 = Node("identifier", isDuplicate = true)
        val rstzv3 = Node("getWeight", isDuplicate = true)
        val ilscw1 = Node("argument_list", isDuplicate = true)
        val sscdn7 = Node("(", isDuplicate = true)
        val gfvdu6 = Node(")", isDuplicate = true)
        val yizkr6 = Node(";", isDuplicate = true)
        val daquk3 = Node("expression_statement", isDuplicate = true)
        val ehepn2 = Node("method_invocation", isDuplicate = true)
        val ngbky1 = Node("identifier", isDuplicate = true)
        val gaose3 = Node("items", isDuplicate = true)
        val cblxf9 = Node(".", isDuplicate = true)
        val kbezf3 = Node("identifier", isDuplicate = true)
        val tjuii0 = Node("add", isDuplicate = true)
        val hfrbn5 = Node("argument_list", isDuplicate = true)
        val niror0 = Node("(", isDuplicate = true)
        val ppygf7 = Node("identifier", isDuplicate = true)
        val mpger8 = Node("item", isDuplicate = true)
        val itanx7 = Node(")", isDuplicate = true)
        val nqedu3 = Node(";", isDuplicate = true)
        val heqwo7 = Node("if_statement", isDuplicate = true)
        val hvwqh8 = Node("if", isDuplicate = true)
        val tfnwu6 = Node("parenthesized_expression", isDuplicate = true)
        val gytxk7 = Node("(", isDuplicate = true)
        val gsrox6 = Node("binary_expression", isDuplicate = true)
        val ovden8 = Node("identifier", isDuplicate = true)
        val cnsdo9 = Node("currentWeightInGrams", isDuplicate = true)
        val hwulv9 = Node(">", isDuplicate = true)
        val naazp1 = Node("identifier", isDuplicate = true)
        val qxbza7 = Node("weightLimitInGrams", isDuplicate = true)
        val jbdcg6 = Node(")", isDuplicate = true)
        val muegh1 = Node("expression_statement", isDuplicate = true)
        val mzorl7 = Node("method_invocation", isDuplicate = true)
        val rjcxu5 = Node("identifier", isDuplicate = true)
        val fovjf1 = Node("notifyOverload", isDuplicate = true)
        val ssgfd9 = Node("argument_list", isDuplicate = true)
        val qhqqs2 = Node("(", isDuplicate = true)
        val kzyyd2 = Node(")", isDuplicate = true)
        val bczdc4 = Node(";", isDuplicate = true)
        val cbedf8 = Node("if_statement", isDuplicate = true)
        val kxaiq2 = Node("if", isDuplicate = true)
        val gxuvb5 = Node("parenthesized_expression", isDuplicate = true)
        val ajunq2 = Node("(", isDuplicate = true)
        val yhcij3 = Node("binary_expression", isDuplicate = true)
        val eqeyw0 = Node("method_invocation", isDuplicate = true)
        val hnkgl6 = Node("identifier", isDuplicate = true)
        val qggkm6 = Node("Math", isDuplicate = true)
        val xudbr3 = Node(".", isDuplicate = true)
        val cjbaa3 = Node("identifier", isDuplicate = true)
        val phoft7 = Node("abs", isDuplicate = true)
        val raeat5 = Node("argument_list", isDuplicate = true)
        val hojtt6 = Node("(", isDuplicate = true)
        val umtrl5 = Node("binary_expression", isDuplicate = true)
        val octuv5 = Node("identifier", isDuplicate = true)
        val yzivi7 = Node("currentWeightInGrams", isDuplicate = true)
        val dadkv0 = Node("-", isDuplicate = true)
        val peqvs9 = Node("identifier", isDuplicate = true)
        val urlcv5 = Node("weightAtLastEvent", isDuplicate = true)
        val bubwn2 = Node(")", isDuplicate = true)
        val kybsk7 = Node(">", isDuplicate = true)
        val jbmas3 = Node("identifier", isDuplicate = true)
        val lclft1 = Node("sensitivity", isDuplicate = true)
        val gdjak6 = Node(")", isDuplicate = true)
        val oeskg4 = Node("expression_statement", isDuplicate = true)
        val iikbz7 = Node("method_invocation", isDuplicate = true)
        val kswhy8 = Node("identifier", isDuplicate = true)
        val cichq0 = Node("notifyWeightChanged", isDuplicate = true)
        val yrhzu6 = Node("argument_list", isDuplicate = true)
        val xmdue4 = Node("(", isDuplicate = true)
        val opvor5 = Node(")", isDuplicate = true)
        val lrfwg8 = Node(";", isDuplicate = true)
        val nzgjx1 = Node("}", isDuplicate = true)
        val nrwgu5 = Node("block_comment", isDuplicate = true)
        val adabq3 = Node("method_declaration", isDuplicate = true)
        val reiql1 = Node("modifiers", isDuplicate = true)
        val grrmb2 = Node("public", isDuplicate = true)
        val djclf6 = Node("synchronized", isDuplicate = true)
        val erent7 = Node("void_type", isDuplicate = true)
        val tbpct2 = Node("identifier", isDuplicate = true)
        val ovpna2 = Node("remove", isDuplicate = true)
        val dncsn9 = Node("formal_parameters", isDuplicate = true)
        val qourg2 = Node("(", isDuplicate = true)
        val zclis3 = Node("formal_parameter", isDuplicate = true)
        val iqroq8 = Node("type_identifier", isDuplicate = true)
        val gfcld8 = Node("Item", isDuplicate = true)
        val ollvx6 = Node("identifier", isDuplicate = true)
        val dcfkh3 = Node("item", isDuplicate = true)
        val fiebt0 = Node(")", isDuplicate = true)
        val ahamy2 = Node("block", isDuplicate = true)
        val tixtj5 = Node("{", isDuplicate = true)
        val wecla0 = Node("if_statement", isDuplicate = true)
        val syexa9 = Node("if", isDuplicate = true)
        val mvwsw6 = Node("parenthesized_expression", isDuplicate = true)
        val giovx3 = Node("(", isDuplicate = true)
        val tthze4 = Node("unary_expression", isDuplicate = true)
        val kqnti9 = Node("!", isDuplicate = true)
        val itjth5 = Node("method_invocation", isDuplicate = true)
        val jstvd6 = Node("identifier", isDuplicate = true)
        val zdagh1 = Node("isPoweredUp", isDuplicate = true)
        val kputj0 = Node("argument_list", isDuplicate = true)
        val loqxk6 = Node("(", isDuplicate = true)
        val hatre3 = Node(")", isDuplicate = true)
        val dcgut8 = Node(")", isDuplicate = true)
        val pjvfs8 = Node("throw_statement", isDuplicate = true)
        val oxnou0 = Node("throw", isDuplicate = true)
        val qscrl5 = Node("object_creation_expression", isDuplicate = true)
        val tmtkp0 = Node("new", isDuplicate = true)
        val lvjbz0 = Node("type_identifier", isDuplicate = true)
        val onnwl4 = Node("NoPowerException", isDuplicate = true)
        val jdsst8 = Node("argument_list", isDuplicate = true)
        val tjuid7 = Node("(", isDuplicate = true)
        val fpdyf9 = Node(")", isDuplicate = true)
        val zmiaw4 = Node(";", isDuplicate = true)
        val senep3 = Node("if_statement", isDuplicate = true)
        val crnky4 = Node("if", isDuplicate = true)
        val ivsjv8 = Node("parenthesized_expression", isDuplicate = true)
        val cqped2 = Node("(", isDuplicate = true)
        val uejjf4 = Node("unary_expression", isDuplicate = true)
        val cjaat6 = Node("!", isDuplicate = true)
        val zoqyw6 = Node("method_invocation", isDuplicate = true)
        val claiz3 = Node("identifier", isDuplicate = true)
        val cbdbq9 = Node("items", isDuplicate = true)
        val ksyik6 = Node(".", isDuplicate = true)
        val nsyfw2 = Node("identifier", isDuplicate = true)
        val yvuax7 = Node("remove", isDuplicate = true)
        val hjalc3 = Node("argument_list", isDuplicate = true)
        val fnolq0 = Node("(", isDuplicate = true)
        val hseux1 = Node("identifier", isDuplicate = true)
        val odhdh2 = Node("item", isDuplicate = true)
        val dotxv4 = Node(")", isDuplicate = true)
        val tezfx6 = Node(")", isDuplicate = true)
        val vakfz9 = Node("throw_statement", isDuplicate = true)
        val vjzpj5 = Node("throw", isDuplicate = true)
        val idbat1 = Node("object_creation_expression", isDuplicate = true)
        val eippo5 = Node("new", isDuplicate = true)
        val wnidh3 = Node("type_identifier", isDuplicate = true)
        val uqrkr7 = Node("InvalidArgumentSimulationException", isDuplicate = true)
        val lddix8 = Node("argument_list", isDuplicate = true)
        val sdwpf3 = Node("(", isDuplicate = true)
        val ezest0 = Node("string_literal", isDuplicate = true)
        val roqwr7 = Node("\"The item was not found amongst those on the scale.\"")
        val lttef0 = Node(")", isDuplicate = true)
        val fyvxd5 = Node(";", isDuplicate = true)
        val fasoa6 = Node("line_comment")
        val ohlck1 = Node("// To avoid drift in the sum due to round-off error, recalculate the weight.")
        val gxdlo9 = Node("local_variable_declaration")
        val acebm6 = Node("floating_point_type", isDuplicate = true)
        val avqxu2 = Node("double", isDuplicate = true)
        val eqdoy2 = Node("variable_declarator", isDuplicate = true)
        val qomlo5 = Node("identifier", isDuplicate = true)
        val jgrax0 = Node("newWeightInGrams", isDuplicate = true)
        val aqwer5 = Node("=", isDuplicate = true)
        val bowjt3 = Node("decimal_floating_point_literal", isDuplicate = true)
        val uhmft9 = Node("0.0", isDuplicate = true)
        val jpifz6 = Node(";", isDuplicate = true)
        val odwpc6 = Node("enhanced_for_statement", isDuplicate = true)
        val uzact6 = Node("for", isDuplicate = true)
        val zyoyf9 = Node("(", isDuplicate = true)
        val jdqed6 = Node("type_identifier", isDuplicate = true)
        val zpcbt0 = Node("Item", isDuplicate = true)
        val yfubw6 = Node("identifier", isDuplicate = true)
        val lzjsy0 = Node("itemOnScale", isDuplicate = true)
        val ixwos2 = Node(":", isDuplicate = true)
        val tuhmr6 = Node("identifier", isDuplicate = true)
        val ybewt1 = Node("items", isDuplicate = true)
        val twylb4 = Node(")", isDuplicate = true)
        val bbjym1 = Node("expression_statement", isDuplicate = true)
        val jemge4 = Node("assignment_expression", isDuplicate = true)
        val csavv1 = Node("identifier", isDuplicate = true)
        val xmumq7 = Node("newWeightInGrams", isDuplicate = true)
        val dlsya3 = Node("+=", isDuplicate = true)
        val hxyrb1 = Node("method_invocation", isDuplicate = true)
        val xavjr3 = Node("identifier", isDuplicate = true)
        val jugmi3 = Node("itemOnScale", isDuplicate = true)
        val wyrqn0 = Node(".", isDuplicate = true)
        val aaxfa6 = Node("identifier", isDuplicate = true)
        val iqucb4 = Node("getWeight", isDuplicate = true)
        val hukvq7 = Node("argument_list", isDuplicate = true)
        val jhmvc6 = Node("(", isDuplicate = true)
        val oxyep4 = Node(")", isDuplicate = true)
        val kdqut9 = Node(";", isDuplicate = true)
        val enhyr1 = Node("expression_statement", isDuplicate = true)
        val epvov5 = Node("assignment_expression", isDuplicate = true)
        val ehdio6 = Node("identifier", isDuplicate = true)
        val hhqle5 = Node("currentWeightInGrams", isDuplicate = true)
        val srhrh5 = Node("=", isDuplicate = true)
        val ocqrx9 = Node("identifier", isDuplicate = true)
        val wiqrq8 = Node("newWeightInGrams", isDuplicate = true)
        val yyxda7 = Node(";", isDuplicate = true)
        val vmbwb0 = Node("if_statement", isDuplicate = true)
        val umpxk1 = Node("if", isDuplicate = true)
        val guttt1 = Node("parenthesized_expression", isDuplicate = true)
        val iywyc4 = Node("(", isDuplicate = true)
        val sspzr0 = Node("binary_expression", isDuplicate = true)
        val ziclj3 = Node("binary_expression", isDuplicate = true)
        val jtjhs9 = Node("identifier", isDuplicate = true)
        val addbz2 = Node("weightAtLastEvent", isDuplicate = true)
        val cpftc7 = Node(">", isDuplicate = true)
        val ezcry6 = Node("identifier", isDuplicate = true)
        val tqfty7 = Node("weightLimitInGrams", isDuplicate = true)
        val fqajq1 = Node("&&", isDuplicate = true)
        val wnjfg3 = Node("binary_expression", isDuplicate = true)
        val nhrpf7 = Node("identifier", isDuplicate = true)
        val xgxpa8 = Node("newWeightInGrams", isDuplicate = true)
        val uqnyx6 = Node("<=", isDuplicate = true)
        val ykshs7 = Node("identifier", isDuplicate = true)
        val aixnj3 = Node("weightLimitInGrams", isDuplicate = true)
        val itqwt0 = Node(")", isDuplicate = true)
        val hdtlm2 = Node("expression_statement", isDuplicate = true)
        val laebs4 = Node("method_invocation", isDuplicate = true)
        val wuzcy6 = Node("identifier", isDuplicate = true)
        val gdmdy1 = Node("notifyOutOfOverload", isDuplicate = true)
        val ptbea0 = Node("argument_list", isDuplicate = true)
        val osjmu4 = Node("(", isDuplicate = true)
        val ewjdv0 = Node(")", isDuplicate = true)
        val gmdyw5 = Node(";", isDuplicate = true)
        val zojnz4 = Node("if_statement", isDuplicate = true)
        val sjony5 = Node("if", isDuplicate = true)
        val tnkix8 = Node("parenthesized_expression", isDuplicate = true)
        val vgbor5 = Node("(", isDuplicate = true)
        val htien6 = Node("binary_expression", isDuplicate = true)
        val llhbf0 = Node("binary_expression", isDuplicate = true)
        val bosml8 = Node("identifier", isDuplicate = true)
        val patgp2 = Node("currentWeightInGrams", isDuplicate = true)
        val aqihr4 = Node("<=", isDuplicate = true)
        val vzwbd9 = Node("identifier", isDuplicate = true)
        val hkidb3 = Node("weightLimitInGrams", isDuplicate = true)
        val vrwwv5 = Node("&&", isDuplicate = true)
        val gkaop8 = Node("binary_expression", isDuplicate = true)
        val atvmk6 = Node("method_invocation", isDuplicate = true)
        val lhzlz3 = Node("identifier", isDuplicate = true)
        val eynmj2 = Node("Math", isDuplicate = true)
        val nefru6 = Node(".", isDuplicate = true)
        val icmop0 = Node("identifier", isDuplicate = true)
        val jeuzo7 = Node("abs", isDuplicate = true)
        val xizkg6 = Node("argument_list", isDuplicate = true)
        val vkxgi2 = Node("(", isDuplicate = true)
        val rnsdj4 = Node("binary_expression", isDuplicate = true)
        val iulki8 = Node("identifier", isDuplicate = true)
        val cdzwl3 = Node("weightAtLastEvent", isDuplicate = true)
        val cofos7 = Node("-", isDuplicate = true)
        val vjdaf3 = Node("identifier", isDuplicate = true)
        val mcqai7 = Node("currentWeightInGrams", isDuplicate = true)
        val slmco2 = Node(")", isDuplicate = true)
        val wgzxe7 = Node(">", isDuplicate = true)
        val zigry9 = Node("identifier", isDuplicate = true)
        val sjjuc6 = Node("sensitivity", isDuplicate = true)
        val esevm2 = Node(")", isDuplicate = true)
        val kpbmq5 = Node("expression_statement", isDuplicate = true)
        val ctcma2 = Node("method_invocation", isDuplicate = true)
        val lgqms6 = Node("identifier", isDuplicate = true)
        val mkmzc4 = Node("notifyWeightChanged", isDuplicate = true)
        val wixpq8 = Node("argument_list", isDuplicate = true)
        val yubkl7 = Node("(", isDuplicate = true)
        val vkrep6 = Node(")", isDuplicate = true)
        val gedmn0 = Node(";", isDuplicate = true)
        val tjtcc6 = Node("}", isDuplicate = true)
        val oynug8 = Node("method_declaration", isDuplicate = true)
        val bjusb8 = Node("modifiers", isDuplicate = true)
        val qpyxg9 = Node("private", isDuplicate = true)
        val gkuvq7 = Node("void_type", isDuplicate = true)
        val vfuqf9 = Node("identifier", isDuplicate = true)
        val khfgo8 = Node("notifyOverload", isDuplicate = true)
        val dlqtk6 = Node("formal_parameters", isDuplicate = true)
        val ebjtf7 = Node("(", isDuplicate = true)
        val afxrc0 = Node(")", isDuplicate = true)
        val hkxiy5 = Node("block", isDuplicate = true)
        val yctfn6 = Node("{", isDuplicate = true)
        val tiswt9 = Node("enhanced_for_statement", isDuplicate = true)
        val ixvlu7 = Node("for", isDuplicate = true)
        val iiwkk5 = Node("(", isDuplicate = true)
        val vihsj5 = Node("type_identifier", isDuplicate = true)
        val bjwnm8 = Node("ElectronicScaleListener", isDuplicate = true)
        val uflyx2 = Node("identifier", isDuplicate = true)
        val ilhyw4 = Node("l", isDuplicate = true)
        val nagjy3 = Node(":", isDuplicate = true)
        val smhaj1 = Node("method_invocation", isDuplicate = true)
        val isdis5 = Node("identifier", isDuplicate = true)
        val oyqxi8 = Node("listeners", isDuplicate = true)
        val boewd4 = Node("argument_list", isDuplicate = true)
        val qxxyq4 = Node("(", isDuplicate = true)
        val sccyu4 = Node(")", isDuplicate = true)
        val lkkwb9 = Node(")", isDuplicate = true)
        val dvtlj7 = Node("expression_statement", isDuplicate = true)
        val ehgsd3 = Node("method_invocation", isDuplicate = true)
        val xhwjw9 = Node("identifier", isDuplicate = true)
        val qdrrs6 = Node("l", isDuplicate = true)
        val aisqh1 = Node(".", isDuplicate = true)
        val gbkrr6 = Node("identifier", isDuplicate = true)
        val jhdzu9 = Node("overload")
        val geazw9 = Node("argument_list", isDuplicate = true)
        val qwdzc6 = Node("(", isDuplicate = true)
        val bxgzs0 = Node("this", isDuplicate = true)
        val eutsj0 = Node(")", isDuplicate = true)
        val ujxvt1 = Node(";", isDuplicate = true)
        val ffhpw7 = Node("}", isDuplicate = true)
        val clzcu5 = Node("method_declaration", isDuplicate = true)
        val lafki1 = Node("modifiers", isDuplicate = true)
        val kwefx8 = Node("private", isDuplicate = true)
        val hdpob9 = Node("void_type", isDuplicate = true)
        val cvfzh6 = Node("identifier", isDuplicate = true)
        val jiubd1 = Node("notifyOutOfOverload", isDuplicate = true)
        val nrajx2 = Node("formal_parameters", isDuplicate = true)
        val uvxzt1 = Node("(", isDuplicate = true)
        val grwjt4 = Node(")", isDuplicate = true)
        val midyq7 = Node("block", isDuplicate = true)
        val rcflq6 = Node("{", isDuplicate = true)
        val jsbgk3 = Node("expression_statement", isDuplicate = true)
        val hfwzx7 = Node("assignment_expression", isDuplicate = true)
        val esmhc3 = Node("identifier", isDuplicate = true)
        val dheep1 = Node("weightAtLastEvent", isDuplicate = true)
        val sgaoo8 = Node("=", isDuplicate = true)
        val difiz4 = Node("identifier", isDuplicate = true)
        val ttxou6 = Node("currentWeightInGrams", isDuplicate = true)
        val undhf1 = Node(";", isDuplicate = true)
        val raydj9 = Node("enhanced_for_statement", isDuplicate = true)
        val birdg6 = Node("for", isDuplicate = true)
        val mfrwd7 = Node("(", isDuplicate = true)
        val npvib9 = Node("type_identifier", isDuplicate = true)
        val phnzt5 = Node("ElectronicScaleListener", isDuplicate = true)
        val xcvze6 = Node("identifier", isDuplicate = true)
        val viquh9 = Node("l", isDuplicate = true)
        val wustv0 = Node(":", isDuplicate = true)
        val hfojc8 = Node("method_invocation", isDuplicate = true)
        val meveh7 = Node("identifier", isDuplicate = true)
        val jjkrz8 = Node("listeners", isDuplicate = true)
        val ddtin5 = Node("argument_list", isDuplicate = true)
        val qvsds5 = Node("(", isDuplicate = true)
        val hywhh4 = Node(")", isDuplicate = true)
        val kqkzg6 = Node(")", isDuplicate = true)
        val seucm5 = Node("expression_statement", isDuplicate = true)
        val ssfiz6 = Node("method_invocation", isDuplicate = true)
        val kmhnx5 = Node("identifier", isDuplicate = true)
        val ltmvd6 = Node("l", isDuplicate = true)
        val wskuc1 = Node(".", isDuplicate = true)
        val hiesw3 = Node("identifier", isDuplicate = true)
        val algpq2 = Node("outOfOverload")
        val vydjd1 = Node("argument_list", isDuplicate = true)
        val vxiwp5 = Node("(", isDuplicate = true)
        val bxxam0 = Node("this", isDuplicate = true)
        val hgpns0 = Node(")", isDuplicate = true)
        val rpzjr6 = Node(";", isDuplicate = true)
        val nbmdc9 = Node("}", isDuplicate = true)
        val dvtcp4 = Node("method_declaration", isDuplicate = true)
        val maszy5 = Node("modifiers", isDuplicate = true)
        val njbqw9 = Node("private", isDuplicate = true)
        val cfmxw6 = Node("void_type", isDuplicate = true)
        val vofwt1 = Node("identifier", isDuplicate = true)
        val iuhod8 = Node("notifyWeightChanged", isDuplicate = true)
        val dtptk7 = Node("formal_parameters", isDuplicate = true)
        val djbyc3 = Node("(", isDuplicate = true)
        val hihws0 = Node(")", isDuplicate = true)
        val qujvq1 = Node("block", isDuplicate = true)
        val sykvs1 = Node("{", isDuplicate = true)
        val rjnwb1 = Node("expression_statement", isDuplicate = true)
        val bkscz9 = Node("assignment_expression", isDuplicate = true)
        val btluf5 = Node("identifier", isDuplicate = true)
        val klvah9 = Node("weightAtLastEvent", isDuplicate = true)
        val kzmtn2 = Node("=", isDuplicate = true)
        val brzee0 = Node("identifier", isDuplicate = true)
        val whicm9 = Node("currentWeightInGrams", isDuplicate = true)
        val veced5 = Node(";", isDuplicate = true)
        val cqawg8 = Node("enhanced_for_statement", isDuplicate = true)
        val qhboe0 = Node("for", isDuplicate = true)
        val injdk0 = Node("(", isDuplicate = true)
        val eunuq9 = Node("type_identifier", isDuplicate = true)
        val qbppp1 = Node("ElectronicScaleListener", isDuplicate = true)
        val rnqws8 = Node("identifier", isDuplicate = true)
        val aiexw7 = Node("l", isDuplicate = true)
        val gmlnz4 = Node(":", isDuplicate = true)
        val evzsh7 = Node("method_invocation", isDuplicate = true)
        val pdige9 = Node("identifier", isDuplicate = true)
        val jgrtx5 = Node("listeners", isDuplicate = true)
        val vozrz9 = Node("argument_list", isDuplicate = true)
        val bemeq9 = Node("(", isDuplicate = true)
        val cacft2 = Node(")", isDuplicate = true)
        val aozdr0 = Node(")", isDuplicate = true)
        val pfrsk3 = Node("expression_statement", isDuplicate = true)
        val wbvjo8 = Node("method_invocation", isDuplicate = true)
        val wxwdn6 = Node("identifier", isDuplicate = true)
        val uemlf4 = Node("l", isDuplicate = true)
        val elajd5 = Node(".", isDuplicate = true)
        val tmybi0 = Node("identifier", isDuplicate = true)
        val ukamg0 = Node("weightChanged")
        val qffmz2 = Node("argument_list", isDuplicate = true)
        val vhiys0 = Node("(", isDuplicate = true)
        val jfvha1 = Node("this", isDuplicate = true)
        val ztzma9 = Node(",", isDuplicate = true)
        val iqyfj7 = Node("identifier", isDuplicate = true)
        val fqkeg3 = Node("currentWeightInGrams", isDuplicate = true)
        val swrsp4 = Node(")", isDuplicate = true)
        val bybsm8 = Node(";", isDuplicate = true)
        val uhaxw6 = Node("}", isDuplicate = true)
        val muwub1 = Node("}", isDuplicate = true)

        graph2 = Graph.from(
            nodes = listOf(oqckg1, hrkvh1, ksqtp5, jsydz7, zlpkk7, jbjtv7, cepfa3, qtnnh4, uzbor6, ermgn3, nzdre9, zrhrq1, xrecn0, wsqbk1, ehawa6, yrvbt9, zgqlt7, lrinq7, ysjno3, iprvv0, nrpzt0, yinye4, wmhac0, tdsho5, wmhsg4, dsqjz2, rkfge0, vjjvq4, gkxou4, ljyvj0, mfluc9, ndryf1, wzbbu4, vumad0, fxgqj4, oeayq7, vrahj1, nsgef5, thtlf5, nenki3, cbpoc0, zohas0, ixaor7, nyanm3, smmnh4, amruz5, qzets5, vkdhr4, nrzil5, oahaj1, fzanv8, azmnd8, pquda1, omhmo4, nxzop4, wxpkx3, ibhvv8, iiqhe9, izwqv0, pdpqf6, seyqq1, jydka4, jbjdr0, hnspj3, cmqyk6, ctdgd4, luwse2, mkefw7, tytyx6, shmml5, zgxpa2, quavr9, aszin8, jmdvw0, oxxnt3, bexxx5, lksmy2, hxrrq2, rgnyf4, axejf8, zsdie7, wrkuw8, vzirp4, liusw7, cpits7, kakvf3, lfzod3, zulxy0, dwqob1, bytzr0, zsqho4, okogc6, ryfrg3, eeqeb5, teddg7, nmuzm6, mmnii8, slvoo7, tlzvk8, jlhtm0, elejg0, kbxpf6, pqeyt4, xsjft6, vtkmz2, lqgyx8, zybdq2, bzkpj2, jlevn2, yzgqj8, dajcu8, yfbtf0, kxbun5, fhpep8, khapa2, gyztv4, zsqmj8, pgfex3, caxoy6, hmuxn4, fecid4, gjyhh7, vgaet3, aaziw4, wqand1, kxute4, caaef2, paitr0, ysuyr2, dfqlz4, zohuz2, keejs2, bcwpz4, enoni7, iwoge2, sdeek3, cnrtv4, qefvl1, deaqr6, rkjzj7, dehga5, exley6, qveow4, egzfs5, tizsl5, kdjaa4, ercet3, neudt1, gwzcz0, vkcby3, nnxce4, ndpwh3, lpmym4, xjute6, zvfhg3, upmeo1, tojcb7, smxzg6, zcjfg0, sbiwv3, eazve8, baxqo2, vfhxd6, rwger9, kdwam2, bhscp8, usyjh7, ckznr7, fjeok7, doakg0, dmywb2, tpinn2, esdan7, lcbyy7, pttni4, jgkfd3, wrrda3, zdjyf1, vkyga4, iswxp1, vqjlm0, wlvmk2, xlerx3, oljdn7, hmitk6, qbjnr1, ywell4, rijqf2, oekzy0, rieqk7, rhnem6, xekxu6, zjlby2, rzdtf6, uqfbq1, isofe9, bxwar5, oixri0, lelol8, xqfjs4, ysdii8, yhdvb0, xhewb1, fibsh6, hsnjl7, mchgr5, jvzod8, bbyit1, cvqbe3, odupw1, qdavd9, mwzox1, cgfkb1, zapfg9, hishr4, dgxji1, injzv2, iowgs7, dqies5, vtacd0, xbucl5, wqrgh8, efnod4, ginbe6, krpsm8, kkfiu1, ghzyq1, oeecl7, csaxm8, brbxs5, igvlv4, ivzrj8, orhbp8, eafxj3, tybef9, batwf0, sxxdv5, rvwwt6, fyary4, pjsnn4, bqsue4, fgofb1, axpae0, xuoot4, mbuwy3, kwsjw7, cqecu7, eusbr0, rbzsj6, ikesw5, jcisc0, jqpxc2, sjeso8, odvai8, nrzre1, tghoh9, uacxf9, tcgzz7, rwfxs2, ygvby2, igzxw6, gjphi5, egiej4, zweam4, fquln8, vygut3, qbfeo3, riciv0, ifina6, sbjvy1, ryout8, rxqjb9, hjoic0, vdaar0, pqgjq3, nkwzm3, cqwud5, amttq6, yotef7, rpuls1, ulfmn6, iszax7, gijwn5, hpejp2, enkbk0, ahihv4, grzrr0, tcfge4, pdfoc7, ttgzm8, abutw6, pmsoa2, tfbdx6, kpmqg2, jlryc7, tfjcn5, pqcbo1, dpafc3, votwa4, xjpze9, gakno7, rlpyz6, qhtga9, foyvn9, gadtb8, csnxl4, wofdo6, bielp4, uggel5, csgds5, cketi8, vfwsz1, milhc4, tcphw6, otfuu3, dlzhm6, tmwqx3, zwfuq2, tuepd3, rrcgw5, qqktp2, afjzz3, rmypd4, rfedz1, dpiei1, nrpzk6, lcksi9, enmya8, xemzy8, ajofr2, gopya0, vzmdl0, fduvf9, ajazr1, gvdva5, frvgk6, owwff0, rislg1, txlyo6, nktzr0, ojqhb2, ekrnl5, jnzrs9, ygsld8, gtnnq2, wbayx2, lrjbw2, yecte1, clcoq9, hxmnv1, mtqpf3, mgpqo7, ybldc8, xfczb7, lbede8, tphxv6, frjyi8, wibtc6, ovwcu2, tfkbp9, ekolb0, olrgg4, zcmha8, vppyu3, qbotf8, gbpot6, bkyxz6, xupxf0, wpdoh3, bpbzh5, lrnya3, asdnt5, jewhq8, cttok1, fvmfc8, ulluo3, djguv1, pskuf5, qfiwg3, oflci8, jkxgz7, xzobo4, yotyr8, fkmsy2, fyohi7, kykho7, jdetd7, gwipd5, esoqn7, bqcvd2, khxpx1, ekohl1, jmggy9, pxivg5, kuhok2, kkcuj3, degqe7, ciwcm7, tdwyn4, iddnz6, yamvl1, buxbv5, acfgj9, ahbca6, funze8, nuauc0, ogpjo1, sodkb8, zczqj8, fyqoo7, rfmxp8, ljvkg1, hndcl1, vdcrv3, asiaz6, pttol7, tzopa8, mtrot7, cmjnr7, fjhvw1, xtmej0, jgigh5, nilbu7, flwtu7, ziqtn5, deveu6, ekrei2, efyum7, mkgfv3, ppmli8, clfom6, ujwbk3, nqaax8, sdsuy8, lnlwv3, fdvzk2, xfcif0, mzvcp0, crdgl4, akdbw5, rklha9, uzihd4, iupks2, etpyu6, uaare2, bdpye4, salek0, kmvze3, mivap0, xzmut6, decaz2, sywtq8, qkojn2, ugnlg2, xtjgl3, lxzjq1, jlera5, iosgo3, boibz9, jvojt8, buivq2, hylbp7, knezv2, shrce5, bpbla1, ywulk5, pbuko9, tsjfj2, tmkhy8, usmwc5, pguqt8, rpylh9, tflgr2, oylgl6, ymhlz0, xkngo0, tlvrg7, wovsi5, oeywi9, cinqv7, ojbgl8, nflpi8, qaunq3, picfx6, ycwwv6, tabuu9, eecvg5, egglm8, oklco7, omlrl7, ukhfc8, dbneh1, ershn3, mcdsx9, cqfqf3, tmpxx0, xsape2, dcayw7, eamkm5, vofjw7, ocgxw2, huxvp1, ktped6, glimc1, xltbv3, obdrb0, tgtir4, novhy0, fetms4, raxpi5, cyswz8, petrw2, ypcjq1, rujtz2, ooufk2, oluyp1, ugnfy3, khykh6, znxwm5, hcwfp8, dwvvd9, djfam6, eazjf7, dyqia5, xccwr5, cxugn9, nawyk9, cfryx1, mshsn6, wrwjb3, cexmx1, ojisb8, zipzo3, pzyyj7, bahwy1, jxrur5, tsfwv2, fduji7, ktgzf2, somtx1, xrbqm1, ivyep0, kblsa6, qkpsl0, weigr3, qdrrh6, rrplm3, skruc5, qpxpr4, dwuux1, oknac4, bsoxo3, ptjpb0, kdscc1, mcbcw7, yhrfx7, baaqv6, ospnv0, fpqxp0, vtctv6, btrel0, izucg0, rstzv3, ilscw1, sscdn7, gfvdu6, yizkr6, daquk3, ehepn2, ngbky1, gaose3, cblxf9, kbezf3, tjuii0, hfrbn5, niror0, ppygf7, mpger8, itanx7, nqedu3, heqwo7, hvwqh8, tfnwu6, gytxk7, gsrox6, ovden8, cnsdo9, hwulv9, naazp1, qxbza7, jbdcg6, muegh1, mzorl7, rjcxu5, fovjf1, ssgfd9, qhqqs2, kzyyd2, bczdc4, cbedf8, kxaiq2, gxuvb5, ajunq2, yhcij3, eqeyw0, hnkgl6, qggkm6, xudbr3, cjbaa3, phoft7, raeat5, hojtt6, umtrl5, octuv5, yzivi7, dadkv0, peqvs9, urlcv5, bubwn2, kybsk7, jbmas3, lclft1, gdjak6, oeskg4, iikbz7, kswhy8, cichq0, yrhzu6, xmdue4, opvor5, lrfwg8, nzgjx1, nrwgu5, adabq3, reiql1, grrmb2, djclf6, erent7, tbpct2, ovpna2, dncsn9, qourg2, zclis3, iqroq8, gfcld8, ollvx6, dcfkh3, fiebt0, ahamy2, tixtj5, wecla0, syexa9, mvwsw6, giovx3, tthze4, kqnti9, itjth5, jstvd6, zdagh1, kputj0, loqxk6, hatre3, dcgut8, pjvfs8, oxnou0, qscrl5, tmtkp0, lvjbz0, onnwl4, jdsst8, tjuid7, fpdyf9, zmiaw4, senep3, crnky4, ivsjv8, cqped2, uejjf4, cjaat6, zoqyw6, claiz3, cbdbq9, ksyik6, nsyfw2, yvuax7, hjalc3, fnolq0, hseux1, odhdh2, dotxv4, tezfx6, vakfz9, vjzpj5, idbat1, eippo5, wnidh3, uqrkr7, lddix8, sdwpf3, ezest0, roqwr7, lttef0, fyvxd5, fasoa6, ohlck1, gxdlo9, acebm6, avqxu2, eqdoy2, qomlo5, jgrax0, aqwer5, bowjt3, uhmft9, jpifz6, odwpc6, uzact6, zyoyf9, jdqed6, zpcbt0, yfubw6, lzjsy0, ixwos2, tuhmr6, ybewt1, twylb4, bbjym1, jemge4, csavv1, xmumq7, dlsya3, hxyrb1, xavjr3, jugmi3, wyrqn0, aaxfa6, iqucb4, hukvq7, jhmvc6, oxyep4, kdqut9, enhyr1, epvov5, ehdio6, hhqle5, srhrh5, ocqrx9, wiqrq8, yyxda7, vmbwb0, umpxk1, guttt1, iywyc4, sspzr0, ziclj3, jtjhs9, addbz2, cpftc7, ezcry6, tqfty7, fqajq1, wnjfg3, nhrpf7, xgxpa8, uqnyx6, ykshs7, aixnj3, itqwt0, hdtlm2, laebs4, wuzcy6, gdmdy1, ptbea0, osjmu4, ewjdv0, gmdyw5, zojnz4, sjony5, tnkix8, vgbor5, htien6, llhbf0, bosml8, patgp2, aqihr4, vzwbd9, hkidb3, vrwwv5, gkaop8, atvmk6, lhzlz3, eynmj2, nefru6, icmop0, jeuzo7, xizkg6, vkxgi2, rnsdj4, iulki8, cdzwl3, cofos7, vjdaf3, mcqai7, slmco2, wgzxe7, zigry9, sjjuc6, esevm2, kpbmq5, ctcma2, lgqms6, mkmzc4, wixpq8, yubkl7, vkrep6, gedmn0, tjtcc6, oynug8, bjusb8, qpyxg9, gkuvq7, vfuqf9, khfgo8, dlqtk6, ebjtf7, afxrc0, hkxiy5, yctfn6, tiswt9, ixvlu7, iiwkk5, vihsj5, bjwnm8, uflyx2, ilhyw4, nagjy3, smhaj1, isdis5, oyqxi8, boewd4, qxxyq4, sccyu4, lkkwb9, dvtlj7, ehgsd3, xhwjw9, qdrrs6, aisqh1, gbkrr6, jhdzu9, geazw9, qwdzc6, bxgzs0, eutsj0, ujxvt1, ffhpw7, clzcu5, lafki1, kwefx8, hdpob9, cvfzh6, jiubd1, nrajx2, uvxzt1, grwjt4, midyq7, rcflq6, jsbgk3, hfwzx7, esmhc3, dheep1, sgaoo8, difiz4, ttxou6, undhf1, raydj9, birdg6, mfrwd7, npvib9, phnzt5, xcvze6, viquh9, wustv0, hfojc8, meveh7, jjkrz8, ddtin5, qvsds5, hywhh4, kqkzg6, seucm5, ssfiz6, kmhnx5, ltmvd6, wskuc1, hiesw3, algpq2, vydjd1, vxiwp5, bxxam0, hgpns0, rpzjr6, nbmdc9, dvtcp4, maszy5, njbqw9, cfmxw6, vofwt1, iuhod8, dtptk7, djbyc3, hihws0, qujvq1, sykvs1, rjnwb1, bkscz9, btluf5, klvah9, kzmtn2, brzee0, whicm9, veced5, cqawg8, qhboe0, injdk0, eunuq9, qbppp1, rnqws8, aiexw7, gmlnz4, evzsh7, pdige9, jgrtx5, vozrz9, bemeq9, cacft2, aozdr0, pfrsk3, wbvjo8, wxwdn6, uemlf4, elajd5, tmybi0, ukamg0, qffmz2, vhiys0, jfvha1, ztzma9, iqyfj7, fqkeg3, swrsp4, bybsm8, uhaxw6, muwub1),
            edges = mapOf(
                oqckg1 to listOf(hrkvh1, ehawa6, vjjvq4, cbpoc0, omhmo4, luwse2, axejf8, ryfrg3, fhpep8, iwoge2, upmeo1, tojcb7),
                hrkvh1 to listOf(ksqtp5, jsydz7, wsqbk1),
                jsydz7 to listOf(zlpkk7, nzdre9, zrhrq1),
                zlpkk7 to listOf(jbjtv7, qtnnh4, uzbor6),
                jbjtv7 to listOf(cepfa3),
                uzbor6 to listOf(ermgn3),
                zrhrq1 to listOf(xrecn0),
                ehawa6 to listOf(yrvbt9, zgqlt7, rkfge0),
                zgqlt7 to listOf(lrinq7, tdsho5, wmhsg4),
                lrinq7 to listOf(ysjno3, nrpzt0, yinye4),
                ysjno3 to listOf(iprvv0),
                yinye4 to listOf(wmhac0),
                wmhsg4 to listOf(dsqjz2),
                vjjvq4 to listOf(gkxou4, ljyvj0, nenki3),
                ljyvj0 to listOf(mfluc9, vrahj1, nsgef5),
                mfluc9 to listOf(ndryf1, vumad0, fxgqj4),
                ndryf1 to listOf(wzbbu4),
                fxgqj4 to listOf(oeayq7),
                nsgef5 to listOf(thtlf5),
                cbpoc0 to listOf(zohas0, ixaor7, pquda1),
                ixaor7 to listOf(nyanm3, oahaj1, fzanv8),
                nyanm3 to listOf(smmnh4, qzets5, vkdhr4),
                smmnh4 to listOf(amruz5),
                vkdhr4 to listOf(nrzil5),
                fzanv8 to listOf(azmnd8),
                omhmo4 to listOf(nxzop4, wxpkx3, ctdgd4),
                wxpkx3 to listOf(ibhvv8, jbjdr0, hnspj3),
                ibhvv8 to listOf(iiqhe9, pdpqf6, seyqq1),
                iiqhe9 to listOf(izwqv0),
                seyqq1 to listOf(jydka4),
                hnspj3 to listOf(cmqyk6),
                luwse2 to listOf(mkefw7, tytyx6, rgnyf4),
                tytyx6 to listOf(shmml5, bexxx5, lksmy2),
                shmml5 to listOf(zgxpa2, aszin8, jmdvw0),
                zgxpa2 to listOf(quavr9),
                jmdvw0 to listOf(oxxnt3),
                lksmy2 to listOf(hxrrq2),
                axejf8 to listOf(zsdie7, wrkuw8, okogc6),
                wrkuw8 to listOf(vzirp4, dwqob1, bytzr0),
                vzirp4 to listOf(liusw7, kakvf3, lfzod3),
                liusw7 to listOf(cpits7),
                lfzod3 to listOf(zulxy0),
                bytzr0 to listOf(zsqho4),
                ryfrg3 to listOf(eeqeb5, teddg7, kxbun5),
                teddg7 to listOf(nmuzm6, yzgqj8, dajcu8),
                nmuzm6 to listOf(mmnii8, zybdq2, bzkpj2),
                mmnii8 to listOf(slvoo7, xsjft6, vtkmz2),
                slvoo7 to listOf(tlzvk8, elejg0, kbxpf6),
                tlzvk8 to listOf(jlhtm0),
                kbxpf6 to listOf(pqeyt4),
                vtkmz2 to listOf(lqgyx8),
                bzkpj2 to listOf(jlevn2),
                dajcu8 to listOf(yfbtf0),
                fhpep8 to listOf(khapa2, gyztv4, enoni7),
                gyztv4 to listOf(zsqmj8, zohuz2, keejs2),
                zsqmj8 to listOf(pgfex3, paitr0, ysuyr2),
                pgfex3 to listOf(caxoy6, wqand1, kxute4),
                caxoy6 to listOf(hmuxn4, gjyhh7, vgaet3),
                hmuxn4 to listOf(fecid4),
                vgaet3 to listOf(aaziw4),
                kxute4 to listOf(caaef2),
                ysuyr2 to listOf(dfqlz4),
                keejs2 to listOf(bcwpz4),
                iwoge2 to listOf(sdeek3, cnrtv4, zvfhg3),
                cnrtv4 to listOf(qefvl1, ndpwh3, lpmym4),
                qefvl1 to listOf(deaqr6, gwzcz0, vkcby3),
                deaqr6 to listOf(rkjzj7, kdjaa4, ercet3),
                rkjzj7 to listOf(dehga5, qveow4, egzfs5),
                dehga5 to listOf(exley6),
                egzfs5 to listOf(tizsl5),
                ercet3 to listOf(neudt1),
                vkcby3 to listOf(nnxce4),
                lpmym4 to listOf(xjute6),
                tojcb7 to listOf(smxzg6, sbiwv3, eazve8, vfhxd6, esdan7),
                smxzg6 to listOf(zcjfg0),
                eazve8 to listOf(baxqo2),
                vfhxd6 to listOf(rwger9, kdwam2),
                kdwam2 to listOf(bhscp8, ckznr7),
                bhscp8 to listOf(usyjh7),
                ckznr7 to listOf(fjeok7, doakg0, tpinn2),
                doakg0 to listOf(dmywb2),
                esdan7 to listOf(lcbyy7, pttni4, yhdvb0, qdavd9, efnod4, tybef9, xuoot4, mbuwy3, gvdva5, frvgk6, xfczb7, lbede8, uzihd4, iupks2, buivq2, hylbp7, nrwgu5, adabq3, oynug8, clzcu5, dvtcp4, muwub1),
                pttni4 to listOf(jgkfd3, zdjyf1, qbjnr1, ysdii8),
                jgkfd3 to listOf(wrrda3),
                zdjyf1 to listOf(vkyga4, vqjlm0),
                vkyga4 to listOf(iswxp1),
                vqjlm0 to listOf(wlvmk2, xlerx3, hmitk6),
                xlerx3 to listOf(oljdn7),
                qbjnr1 to listOf(ywell4, oekzy0, rieqk7),
                ywell4 to listOf(rijqf2),
                rieqk7 to listOf(rhnem6, xekxu6, oixri0),
                xekxu6 to listOf(zjlby2, uqfbq1),
                zjlby2 to listOf(rzdtf6),
                uqfbq1 to listOf(isofe9, bxwar5),
                oixri0 to listOf(lelol8, xqfjs4),
                yhdvb0 to listOf(xhewb1, hsnjl7, jvzod8, odupw1),
                xhewb1 to listOf(fibsh6),
                hsnjl7 to listOf(mchgr5),
                jvzod8 to listOf(bbyit1),
                bbyit1 to listOf(cvqbe3),
                qdavd9 to listOf(mwzox1, zapfg9, dgxji1, wqrgh8),
                mwzox1 to listOf(cgfkb1),
                zapfg9 to listOf(hishr4),
                dgxji1 to listOf(injzv2, dqies5, vtacd0),
                injzv2 to listOf(iowgs7),
                vtacd0 to listOf(xbucl5),
                efnod4 to listOf(ginbe6, kkfiu1, oeecl7, eafxj3),
                ginbe6 to listOf(krpsm8),
                kkfiu1 to listOf(ghzyq1),
                oeecl7 to listOf(csaxm8, igvlv4, ivzrj8),
                csaxm8 to listOf(brbxs5),
                ivzrj8 to listOf(orhbp8),
                tybef9 to listOf(batwf0, rvwwt6, pjsnn4, axpae0),
                batwf0 to listOf(sxxdv5),
                rvwwt6 to listOf(fyary4),
                pjsnn4 to listOf(bqsue4),
                bqsue4 to listOf(fgofb1),
                mbuwy3 to listOf(kwsjw7, eusbr0, ikesw5, zweam4),
                kwsjw7 to listOf(cqecu7),
                eusbr0 to listOf(rbzsj6),
                ikesw5 to listOf(jcisc0, jqpxc2, uacxf9, tcgzz7, egiej4),
                jqpxc2 to listOf(sjeso8, nrzre1),
                sjeso8 to listOf(odvai8),
                nrzre1 to listOf(tghoh9),
                tcgzz7 to listOf(rwfxs2, igzxw6),
                rwfxs2 to listOf(ygvby2),
                igzxw6 to listOf(gjphi5),
                zweam4 to listOf(fquln8, vygut3, pdfoc7, vfwsz1, rmypd4, ajazr1),
                vygut3 to listOf(qbfeo3, riciv0, cqwud5),
                riciv0 to listOf(ifina6, sbjvy1, nkwzm3),
                sbjvy1 to listOf(ryout8, hjoic0, vdaar0),
                ryout8 to listOf(rxqjb9),
                vdaar0 to listOf(pqgjq3),
                cqwud5 to listOf(amttq6, yotef7, tcfge4),
                yotef7 to listOf(rpuls1, ulfmn6, gijwn5),
                ulfmn6 to listOf(iszax7),
                gijwn5 to listOf(hpejp2, enkbk0, grzrr0),
                enkbk0 to listOf(ahihv4),
                pdfoc7 to listOf(ttgzm8, abutw6, xjpze9),
                abutw6 to listOf(pmsoa2, tfbdx6, votwa4),
                tfbdx6 to listOf(kpmqg2, tfjcn5, pqcbo1),
                kpmqg2 to listOf(jlryc7),
                pqcbo1 to listOf(dpafc3),
                xjpze9 to listOf(gakno7, rlpyz6, cketi8),
                rlpyz6 to listOf(qhtga9, foyvn9, csnxl4),
                foyvn9 to listOf(gadtb8),
                csnxl4 to listOf(wofdo6, bielp4, csgds5),
                bielp4 to listOf(uggel5),
                vfwsz1 to listOf(milhc4, afjzz3),
                milhc4 to listOf(tcphw6, tuepd3, rrcgw5),
                tcphw6 to listOf(otfuu3, dlzhm6, tmwqx3),
                tmwqx3 to listOf(zwfuq2),
                rrcgw5 to listOf(qqktp2),
                rmypd4 to listOf(rfedz1, fduvf9),
                rfedz1 to listOf(dpiei1, ajofr2, gopya0),
                dpiei1 to listOf(nrpzk6, lcksi9, enmya8),
                enmya8 to listOf(xemzy8),
                gopya0 to listOf(vzmdl0),
                frvgk6 to listOf(owwff0, txlyo6, ojqhb2, jnzrs9, wbayx2),
                owwff0 to listOf(rislg1),
                txlyo6 to listOf(nktzr0),
                ojqhb2 to listOf(ekrnl5),
                jnzrs9 to listOf(ygsld8, gtnnq2),
                wbayx2 to listOf(lrjbw2, yecte1, ybldc8),
                yecte1 to listOf(clcoq9, hxmnv1, mgpqo7),
                hxmnv1 to listOf(mtqpf3),
                lbede8 to listOf(tphxv6, ovwcu2, ekolb0, zcmha8, gbpot6, bpbzh5),
                tphxv6 to listOf(frjyi8, wibtc6),
                ovwcu2 to listOf(tfkbp9),
                ekolb0 to listOf(olrgg4),
                zcmha8 to listOf(vppyu3, qbotf8),
                gbpot6 to listOf(bkyxz6, xupxf0),
                xupxf0 to listOf(wpdoh3),
                bpbzh5 to listOf(lrnya3, asdnt5, kuhok2, clfom6, rklha9),
                asdnt5 to listOf(jewhq8, cttok1, fyohi7),
                cttok1 to listOf(fvmfc8, ulluo3, fkmsy2),
                ulluo3 to listOf(djguv1, pskuf5),
                pskuf5 to listOf(qfiwg3, jkxgz7),
                qfiwg3 to listOf(oflci8),
                jkxgz7 to listOf(xzobo4, yotyr8),
                fyohi7 to listOf(kykho7, jdetd7, pxivg5),
                jdetd7 to listOf(gwipd5, esoqn7, khxpx1),
                esoqn7 to listOf(bqcvd2),
                khxpx1 to listOf(ekohl1, jmggy9),
                kuhok2 to listOf(kkcuj3, degqe7, nuauc0),
                degqe7 to listOf(ciwcm7, tdwyn4, funze8),
                tdwyn4 to listOf(iddnz6, buxbv5, acfgj9),
                iddnz6 to listOf(yamvl1),
                acfgj9 to listOf(ahbca6),
                nuauc0 to listOf(ogpjo1, sodkb8, ppmli8),
                sodkb8 to listOf(zczqj8, rfmxp8, ljvkg1),
                zczqj8 to listOf(fyqoo7),
                ljvkg1 to listOf(hndcl1, ekrei2, efyum7),
                hndcl1 to listOf(vdcrv3, xtmej0, jgigh5, flwtu7),
                vdcrv3 to listOf(asiaz6, pttol7, mtrot7),
                pttol7 to listOf(tzopa8),
                mtrot7 to listOf(cmjnr7, fjhvw1),
                jgigh5 to listOf(nilbu7),
                flwtu7 to listOf(ziqtn5, deveu6),
                efyum7 to listOf(mkgfv3),
                clfom6 to listOf(ujwbk3, nqaax8, akdbw5),
                nqaax8 to listOf(sdsuy8, lnlwv3, xfcif0),
                lnlwv3 to listOf(fdvzk2),
                xfcif0 to listOf(mzvcp0, crdgl4),
                iupks2 to listOf(etpyu6, bdpye4, kmvze3, xzmut6, qkojn2),
                etpyu6 to listOf(uaare2),
                bdpye4 to listOf(salek0),
                kmvze3 to listOf(mivap0),
                xzmut6 to listOf(decaz2, sywtq8),
                qkojn2 to listOf(ugnlg2, xtjgl3, jvojt8),
                xtjgl3 to listOf(lxzjq1, jlera5, boibz9),
                jlera5 to listOf(iosgo3),
                hylbp7 to listOf(knezv2, ywulk5, pbuko9, tmkhy8, tlvrg7),
                knezv2 to listOf(shrce5, bpbla1),
                pbuko9 to listOf(tsjfj2),
                tmkhy8 to listOf(usmwc5, pguqt8, xkngo0),
                pguqt8 to listOf(rpylh9, oylgl6),
                rpylh9 to listOf(tflgr2),
                oylgl6 to listOf(ymhlz0),
                tlvrg7 to listOf(wovsi5, oeywi9, huxvp1, xccwr5, ptjpb0, daquk3, heqwo7, cbedf8, nzgjx1),
                oeywi9 to listOf(cinqv7, ojbgl8, dbneh1),
                ojbgl8 to listOf(nflpi8, qaunq3, ukhfc8),
                qaunq3 to listOf(picfx6, ycwwv6),
                ycwwv6 to listOf(tabuu9, egglm8),
                tabuu9 to listOf(eecvg5),
                egglm8 to listOf(oklco7, omlrl7),
                dbneh1 to listOf(ershn3, mcdsx9, ocgxw2),
                mcdsx9 to listOf(cqfqf3, tmpxx0, dcayw7),
                tmpxx0 to listOf(xsape2),
                dcayw7 to listOf(eamkm5, vofjw7),
                huxvp1 to listOf(ktped6, glimc1, ypcjq1),
                glimc1 to listOf(xltbv3, obdrb0, petrw2),
                obdrb0 to listOf(tgtir4, fetms4, raxpi5),
                tgtir4 to listOf(novhy0),
                raxpi5 to listOf(cyswz8),
                ypcjq1 to listOf(rujtz2, ooufk2, dyqia5),
                ooufk2 to listOf(oluyp1, ugnfy3, znxwm5),
                ugnfy3 to listOf(khykh6),
                znxwm5 to listOf(hcwfp8, dwvvd9, eazjf7),
                dwvvd9 to listOf(djfam6),
                xccwr5 to listOf(cxugn9, nawyk9, xrbqm1),
                nawyk9 to listOf(cfryx1, mshsn6, somtx1),
                mshsn6 to listOf(wrwjb3, ojisb8, zipzo3, bahwy1),
                wrwjb3 to listOf(cexmx1),
                zipzo3 to listOf(pzyyj7),
                bahwy1 to listOf(jxrur5, tsfwv2, ktgzf2),
                tsfwv2 to listOf(fduji7),
                xrbqm1 to listOf(ivyep0, kblsa6, bsoxo3),
                kblsa6 to listOf(qkpsl0, weigr3, rrplm3),
                weigr3 to listOf(qdrrh6),
                rrplm3 to listOf(skruc5, qpxpr4, oknac4),
                qpxpr4 to listOf(dwuux1),
                ptjpb0 to listOf(kdscc1, yizkr6),
                kdscc1 to listOf(mcbcw7, baaqv6, ospnv0),
                mcbcw7 to listOf(yhrfx7),
                ospnv0 to listOf(fpqxp0, btrel0, izucg0, ilscw1),
                fpqxp0 to listOf(vtctv6),
                izucg0 to listOf(rstzv3),
                ilscw1 to listOf(sscdn7, gfvdu6),
                daquk3 to listOf(ehepn2, nqedu3),
                ehepn2 to listOf(ngbky1, cblxf9, kbezf3, hfrbn5),
                ngbky1 to listOf(gaose3),
                kbezf3 to listOf(tjuii0),
                hfrbn5 to listOf(niror0, ppygf7, itanx7),
                ppygf7 to listOf(mpger8),
                heqwo7 to listOf(hvwqh8, tfnwu6, muegh1),
                tfnwu6 to listOf(gytxk7, gsrox6, jbdcg6),
                gsrox6 to listOf(ovden8, hwulv9, naazp1),
                ovden8 to listOf(cnsdo9),
                naazp1 to listOf(qxbza7),
                muegh1 to listOf(mzorl7, bczdc4),
                mzorl7 to listOf(rjcxu5, ssgfd9),
                rjcxu5 to listOf(fovjf1),
                ssgfd9 to listOf(qhqqs2, kzyyd2),
                cbedf8 to listOf(kxaiq2, gxuvb5, oeskg4),
                gxuvb5 to listOf(ajunq2, yhcij3, gdjak6),
                yhcij3 to listOf(eqeyw0, kybsk7, jbmas3),
                eqeyw0 to listOf(hnkgl6, xudbr3, cjbaa3, raeat5),
                hnkgl6 to listOf(qggkm6),
                cjbaa3 to listOf(phoft7),
                raeat5 to listOf(hojtt6, umtrl5, bubwn2),
                umtrl5 to listOf(octuv5, dadkv0, peqvs9),
                octuv5 to listOf(yzivi7),
                peqvs9 to listOf(urlcv5),
                jbmas3 to listOf(lclft1),
                oeskg4 to listOf(iikbz7, lrfwg8),
                iikbz7 to listOf(kswhy8, yrhzu6),
                kswhy8 to listOf(cichq0),
                yrhzu6 to listOf(xmdue4, opvor5),
                adabq3 to listOf(reiql1, erent7, tbpct2, dncsn9, ahamy2),
                reiql1 to listOf(grrmb2, djclf6),
                tbpct2 to listOf(ovpna2),
                dncsn9 to listOf(qourg2, zclis3, fiebt0),
                zclis3 to listOf(iqroq8, ollvx6),
                iqroq8 to listOf(gfcld8),
                ollvx6 to listOf(dcfkh3),
                ahamy2 to listOf(tixtj5, wecla0, senep3, fasoa6, gxdlo9, odwpc6, enhyr1, vmbwb0, zojnz4, tjtcc6),
                wecla0 to listOf(syexa9, mvwsw6, pjvfs8),
                mvwsw6 to listOf(giovx3, tthze4, dcgut8),
                tthze4 to listOf(kqnti9, itjth5),
                itjth5 to listOf(jstvd6, kputj0),
                jstvd6 to listOf(zdagh1),
                kputj0 to listOf(loqxk6, hatre3),
                pjvfs8 to listOf(oxnou0, qscrl5, zmiaw4),
                qscrl5 to listOf(tmtkp0, lvjbz0, jdsst8),
                lvjbz0 to listOf(onnwl4),
                jdsst8 to listOf(tjuid7, fpdyf9),
                senep3 to listOf(crnky4, ivsjv8, vakfz9),
                ivsjv8 to listOf(cqped2, uejjf4, tezfx6),
                uejjf4 to listOf(cjaat6, zoqyw6),
                zoqyw6 to listOf(claiz3, ksyik6, nsyfw2, hjalc3),
                claiz3 to listOf(cbdbq9),
                nsyfw2 to listOf(yvuax7),
                hjalc3 to listOf(fnolq0, hseux1, dotxv4),
                hseux1 to listOf(odhdh2),
                vakfz9 to listOf(vjzpj5, idbat1, fyvxd5),
                idbat1 to listOf(eippo5, wnidh3, lddix8),
                wnidh3 to listOf(uqrkr7),
                lddix8 to listOf(sdwpf3, ezest0, lttef0),
                ezest0 to listOf(roqwr7),
                fasoa6 to listOf(ohlck1),
                gxdlo9 to listOf(acebm6, eqdoy2, jpifz6),
                acebm6 to listOf(avqxu2),
                eqdoy2 to listOf(qomlo5, aqwer5, bowjt3),
                qomlo5 to listOf(jgrax0),
                bowjt3 to listOf(uhmft9),
                odwpc6 to listOf(uzact6, zyoyf9, jdqed6, yfubw6, ixwos2, tuhmr6, twylb4, bbjym1),
                jdqed6 to listOf(zpcbt0),
                yfubw6 to listOf(lzjsy0),
                tuhmr6 to listOf(ybewt1),
                bbjym1 to listOf(jemge4, kdqut9),
                jemge4 to listOf(csavv1, dlsya3, hxyrb1),
                csavv1 to listOf(xmumq7),
                hxyrb1 to listOf(xavjr3, wyrqn0, aaxfa6, hukvq7),
                xavjr3 to listOf(jugmi3),
                aaxfa6 to listOf(iqucb4),
                hukvq7 to listOf(jhmvc6, oxyep4),
                enhyr1 to listOf(epvov5, yyxda7),
                epvov5 to listOf(ehdio6, srhrh5, ocqrx9),
                ehdio6 to listOf(hhqle5),
                ocqrx9 to listOf(wiqrq8),
                vmbwb0 to listOf(umpxk1, guttt1, hdtlm2),
                guttt1 to listOf(iywyc4, sspzr0, itqwt0),
                sspzr0 to listOf(ziclj3, fqajq1, wnjfg3),
                ziclj3 to listOf(jtjhs9, cpftc7, ezcry6),
                jtjhs9 to listOf(addbz2),
                ezcry6 to listOf(tqfty7),
                wnjfg3 to listOf(nhrpf7, uqnyx6, ykshs7),
                nhrpf7 to listOf(xgxpa8),
                ykshs7 to listOf(aixnj3),
                hdtlm2 to listOf(laebs4, gmdyw5),
                laebs4 to listOf(wuzcy6, ptbea0),
                wuzcy6 to listOf(gdmdy1),
                ptbea0 to listOf(osjmu4, ewjdv0),
                zojnz4 to listOf(sjony5, tnkix8, kpbmq5),
                tnkix8 to listOf(vgbor5, htien6, esevm2),
                htien6 to listOf(llhbf0, vrwwv5, gkaop8),
                llhbf0 to listOf(bosml8, aqihr4, vzwbd9),
                bosml8 to listOf(patgp2),
                vzwbd9 to listOf(hkidb3),
                gkaop8 to listOf(atvmk6, wgzxe7, zigry9),
                atvmk6 to listOf(lhzlz3, nefru6, icmop0, xizkg6),
                lhzlz3 to listOf(eynmj2),
                icmop0 to listOf(jeuzo7),
                xizkg6 to listOf(vkxgi2, rnsdj4, slmco2),
                rnsdj4 to listOf(iulki8, cofos7, vjdaf3),
                iulki8 to listOf(cdzwl3),
                vjdaf3 to listOf(mcqai7),
                zigry9 to listOf(sjjuc6),
                kpbmq5 to listOf(ctcma2, gedmn0),
                ctcma2 to listOf(lgqms6, wixpq8),
                lgqms6 to listOf(mkmzc4),
                wixpq8 to listOf(yubkl7, vkrep6),
                oynug8 to listOf(bjusb8, gkuvq7, vfuqf9, dlqtk6, hkxiy5),
                bjusb8 to listOf(qpyxg9),
                vfuqf9 to listOf(khfgo8),
                dlqtk6 to listOf(ebjtf7, afxrc0),
                hkxiy5 to listOf(yctfn6, tiswt9, ffhpw7),
                tiswt9 to listOf(ixvlu7, iiwkk5, vihsj5, uflyx2, nagjy3, smhaj1, lkkwb9, dvtlj7),
                vihsj5 to listOf(bjwnm8),
                uflyx2 to listOf(ilhyw4),
                smhaj1 to listOf(isdis5, boewd4),
                isdis5 to listOf(oyqxi8),
                boewd4 to listOf(qxxyq4, sccyu4),
                dvtlj7 to listOf(ehgsd3, ujxvt1),
                ehgsd3 to listOf(xhwjw9, aisqh1, gbkrr6, geazw9),
                xhwjw9 to listOf(qdrrs6),
                gbkrr6 to listOf(jhdzu9),
                geazw9 to listOf(qwdzc6, bxgzs0, eutsj0),
                clzcu5 to listOf(lafki1, hdpob9, cvfzh6, nrajx2, midyq7),
                lafki1 to listOf(kwefx8),
                cvfzh6 to listOf(jiubd1),
                nrajx2 to listOf(uvxzt1, grwjt4),
                midyq7 to listOf(rcflq6, jsbgk3, raydj9, nbmdc9),
                jsbgk3 to listOf(hfwzx7, undhf1),
                hfwzx7 to listOf(esmhc3, sgaoo8, difiz4),
                esmhc3 to listOf(dheep1),
                difiz4 to listOf(ttxou6),
                raydj9 to listOf(birdg6, mfrwd7, npvib9, xcvze6, wustv0, hfojc8, kqkzg6, seucm5),
                npvib9 to listOf(phnzt5),
                xcvze6 to listOf(viquh9),
                hfojc8 to listOf(meveh7, ddtin5),
                meveh7 to listOf(jjkrz8),
                ddtin5 to listOf(qvsds5, hywhh4),
                seucm5 to listOf(ssfiz6, rpzjr6),
                ssfiz6 to listOf(kmhnx5, wskuc1, hiesw3, vydjd1),
                kmhnx5 to listOf(ltmvd6),
                hiesw3 to listOf(algpq2),
                vydjd1 to listOf(vxiwp5, bxxam0, hgpns0),
                dvtcp4 to listOf(maszy5, cfmxw6, vofwt1, dtptk7, qujvq1),
                maszy5 to listOf(njbqw9),
                vofwt1 to listOf(iuhod8),
                dtptk7 to listOf(djbyc3, hihws0),
                qujvq1 to listOf(sykvs1, rjnwb1, cqawg8, uhaxw6),
                rjnwb1 to listOf(bkscz9, veced5),
                bkscz9 to listOf(btluf5, kzmtn2, brzee0),
                btluf5 to listOf(klvah9),
                brzee0 to listOf(whicm9),
                cqawg8 to listOf(qhboe0, injdk0, eunuq9, rnqws8, gmlnz4, evzsh7, aozdr0, pfrsk3),
                eunuq9 to listOf(qbppp1),
                rnqws8 to listOf(aiexw7),
                evzsh7 to listOf(pdige9, vozrz9),
                pdige9 to listOf(jgrtx5),
                vozrz9 to listOf(bemeq9, cacft2),
                pfrsk3 to listOf(wbvjo8, bybsm8),
                wbvjo8 to listOf(wxwdn6, elajd5, tmybi0, qffmz2),
                wxwdn6 to listOf(uemlf4),
                tmybi0 to listOf(ukamg0),
                qffmz2 to listOf(vhiys0, jfvha1, ztzma9, iqyfj7, swrsp4),
                iqyfj7 to listOf(fqkeg3),
            )
        )

        graph1.visualize("ComplicatedV2.5/G1")
        graph2.visualize("ComplicatedV2.5/G2")
    }

    override fun checkCommonGraph(commonGraph: Graph) {
        graph1.visualize("ComplicatedV2.5/G1_Generalized", commonGraph)
        graph2.visualize("ComplicatedV2.5/G2_Generalized", commonGraph)
        commonGraph.visualize("ComplicatedV2.5/Generalization")
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {
        graph1Diff.visualize("ComplicatedV2.5/G1_Differences")
    }

    override fun checkGraph2Diff(graph2Diff: Graph) {
        graph2Diff.visualize("ComplicatedV2.5/G2_Differences")
    }
}