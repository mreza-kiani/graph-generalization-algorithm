package ca.ucalgary.cs.comparison.basics

import ca.ucalgary.cs.Config
import ca.ucalgary.cs.Context
import ca.ucalgary.cs.comparison.BaseCompareGraphTest
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.graph.Node
import ca.ucalgary.cs.io.ASTPrinter
import ca.ucalgary.cs.io.visualize

class AST3 : BaseCompareGraphTest() {
    override fun initializeGraphs() {
        Config.CONTEXT = Context.AST

        val rzxeh2 = Node("program")
        val dhynw2 = Node("class_declaration", isDuplicate = true)
        val npkrg4 = Node("class", isDuplicate = true)
        val vxeru5 = Node("identifier", isDuplicate = true)
        val esoxd0 = Node("Animal", isDuplicate = true)
        val gwwdr5 = Node("class_body", isDuplicate = true)
        val ymgmh2 = Node("{", isDuplicate = true)
        val snjru0 = Node("method_declaration", isDuplicate = true)
        val uapru3 = Node("modifiers", isDuplicate = true)
        val xazav3 = Node("public", isDuplicate = true)
        val kupmg9 = Node("void_type", isDuplicate = true)
        val beedf4 = Node("identifier", isDuplicate = true)
        val uioef6 = Node("animalSound", isDuplicate = true)
        val vzven1 = Node("formal_parameters", isDuplicate = true)
        val btgad8 = Node("(", isDuplicate = true)
        val tnrkz0 = Node(")", isDuplicate = true)
        val cxzeo0 = Node("block", isDuplicate = true)
        val hzkmt5 = Node("{", isDuplicate = true)
        val enfpl2 = Node("expression_statement", isDuplicate = true)
        val povcq1 = Node("method_invocation", isDuplicate = true)
        val sujqj0 = Node("field_access")
        val jdlux6 = Node("identifier", isDuplicate = true)
        val rpsct7 = Node("System")
        val eqeuo8 = Node(".", isDuplicate = true)
        val uesfm8 = Node("identifier", isDuplicate = true)
        val ohknb0 = Node("out")
        val tqfuc9 = Node(".", isDuplicate = true)
        val eyvsq1 = Node("identifier", isDuplicate = true)
        val yxkjy9 = Node("println")
        val flbbh0 = Node("argument_list", isDuplicate = true)
        val gdiob7 = Node("(", isDuplicate = true)
        val ofmwn5 = Node("string_literal")
        val dgpou5 = Node("\"The animal makes a sound\"")
        val zzjbr2 = Node(")", isDuplicate = true)
        val rnzzi6 = Node(";", isDuplicate = true)
        val wlhkf9 = Node("}", isDuplicate = true)
        val hlszi4 = Node("method_declaration", isDuplicate = true)
        val bfzbc6 = Node("modifiers", isDuplicate = true)
        val qagoz4 = Node("public", isDuplicate = true)
        val evxfs3 = Node("floating_point_type")
        val vmxgy3 = Node("double")
        val fasvf9 = Node("identifier", isDuplicate = true)
        val hbdqw8 = Node("bye")
        val xmrdh1 = Node("formal_parameters", isDuplicate = true)
        val qztpj9 = Node("(", isDuplicate = true)
        val lngdt5 = Node(")", isDuplicate = true)
        val yfaic7 = Node("block", isDuplicate = true)
        val gmeip4 = Node("{", isDuplicate = true)
        val gbbwj4 = Node("if_statement")
        val tcnil8 = Node("if")
        val vmudj7 = Node("parenthesized_expression")
        val hxeqq4 = Node("(", isDuplicate = true)
        val islpq3 = Node("binary_expression")
        val hmogg2 = Node("decimal_integer_literal", isDuplicate = true)
        val mhwra3 = Node("2")
        val spqrr3 = Node(">")
        val npnvl7 = Node("decimal_integer_literal", isDuplicate = true)
        val szshk8 = Node("1")
        val qpgks7 = Node(")", isDuplicate = true)
        val kghbk3 = Node("return_statement", isDuplicate = true)
        val vlote4 = Node("return", isDuplicate = true)
        val fotpw6 = Node("decimal_floating_point_literal", isDuplicate = true)
        val kmdhj5 = Node("1.0")
        val kuvfb0 = Node(";", isDuplicate = true)
        val kvbwb7 = Node("return_statement", isDuplicate = true)
        val axdrn0 = Node("return", isDuplicate = true)
        val mshdk3 = Node("decimal_floating_point_literal", isDuplicate = true)
        val guvah3 = Node("2.0")
        val ezuzn9 = Node(";", isDuplicate = true)
        val aiqmi7 = Node("}", isDuplicate = true)
        val efrwb1 = Node("}", isDuplicate = true)
        val pzxmg9 = Node("class_declaration", isDuplicate = true)
        val gydmd4 = Node("class", isDuplicate = true)
        val dozfx0 = Node("identifier", isDuplicate = true)
        val wcnav3 = Node("Main")
        val pnsds4 = Node("class_body", isDuplicate = true)
        val frhua5 = Node("{", isDuplicate = true)
        val lxvzj8 = Node("method_declaration", isDuplicate = true)
        val obmaw1 = Node("modifiers", isDuplicate = true)
        val unwwe0 = Node("public", isDuplicate = true)
        val vernu7 = Node("static")
        val cyjlk0 = Node("void_type", isDuplicate = true)
        val xevft8 = Node("identifier", isDuplicate = true)
        val gxmys5 = Node("main")
        val nvrxf6 = Node("formal_parameters", isDuplicate = true)
        val bnbuu0 = Node("(", isDuplicate = true)
        val yxgam4 = Node("formal_parameter")
        val zvccb6 = Node("array_type")
        val xjqut6 = Node("type_identifier", isDuplicate = true)
        val wbffc1 = Node("String")
        val hovkk3 = Node("dimensions")
        val mxdhj3 = Node("[")
        val xvkpi7 = Node("]")
        val qdwbw6 = Node("identifier", isDuplicate = true)
        val uvyta2 = Node("args")
        val bxlvh5 = Node(")", isDuplicate = true)
        val unwwy4 = Node("block", isDuplicate = true)
        val xhtfv9 = Node("{", isDuplicate = true)
        val wtkfo1 = Node("local_variable_declaration", isDuplicate = true)
        val ejviy0 = Node("type_identifier", isDuplicate = true)
        val eozpe3 = Node("Animal", isDuplicate = true)
        val yqtej7 = Node("variable_declarator", isDuplicate = true)
        val zwaoj8 = Node("identifier", isDuplicate = true)
        val nqotu7 = Node("myAnimal", isDuplicate = true)
        val gzyrp8 = Node("=", isDuplicate = true)
        val tmcia3 = Node("object_creation_expression", isDuplicate = true)
        val siskn6 = Node("new", isDuplicate = true)
        val awwqe3 = Node("type_identifier", isDuplicate = true)
        val zbrdw5 = Node("Animal", isDuplicate = true)
        val rialo2 = Node("argument_list", isDuplicate = true)
        val hnkox9 = Node("(", isDuplicate = true)
        val wwnoe1 = Node(")", isDuplicate = true)
        val xueza8 = Node(";", isDuplicate = true)
        val pplqv4 = Node("line_comment", isDuplicate = true)
        val djrgy5 = Node("// Create a Animal object")
        val gggta6 = Node("local_variable_declaration", isDuplicate = true)
        val tsdun7 = Node("type_identifier", isDuplicate = true)
        val fkkvo3 = Node("Animal", isDuplicate = true)
        val xtbiq8 = Node("variable_declarator", isDuplicate = true)
        val fzwrb6 = Node("identifier", isDuplicate = true)
        val cgjop8 = Node("myDog", isDuplicate = true)
        val jylcg3 = Node("=", isDuplicate = true)
        val sxagl7 = Node("object_creation_expression", isDuplicate = true)
        val ppqpg9 = Node("new", isDuplicate = true)
        val cfsay9 = Node("type_identifier", isDuplicate = true)
        val mrzud1 = Node("Dog")
        val gchjj8 = Node("argument_list", isDuplicate = true)
        val carsy5 = Node("(", isDuplicate = true)
        val ycoau9 = Node(")", isDuplicate = true)
        val lussz2 = Node(";", isDuplicate = true)
        val mgtrf7 = Node("line_comment", isDuplicate = true)
        val qpjhm9 = Node("// Create a Dog object")
        val fnslm7 = Node("expression_statement", isDuplicate = true)
        val ybxnl9 = Node("method_invocation", isDuplicate = true)
        val dfcib3 = Node("identifier", isDuplicate = true)
        val numqe0 = Node("myAnimal", isDuplicate = true)
        val fqtjk8 = Node(".", isDuplicate = true)
        val swdgs6 = Node("identifier", isDuplicate = true)
        val ajobx3 = Node("animalSound", isDuplicate = true)
        val idddr3 = Node("argument_list", isDuplicate = true)
        val jmgtq9 = Node("(", isDuplicate = true)
        val ideso7 = Node(")", isDuplicate = true)
        val joqxp2 = Node(";", isDuplicate = true)
        val utzhy3 = Node("expression_statement", isDuplicate = true)
        val ycxdz5 = Node("method_invocation", isDuplicate = true)
        val ytvxn6 = Node("identifier", isDuplicate = true)
        val bzaba8 = Node("myDog", isDuplicate = true)
        val iihid3 = Node(".", isDuplicate = true)
        val uvrpq2 = Node("identifier", isDuplicate = true)
        val cfjmt7 = Node("animalSound", isDuplicate = true)
        val qsxpc9 = Node("argument_list", isDuplicate = true)
        val zomjj1 = Node("(", isDuplicate = true)
        val ezeuv6 = Node(")", isDuplicate = true)
        val hrrhv7 = Node(";", isDuplicate = true)
        val nulga2 = Node("}", isDuplicate = true)
        val odpdn8 = Node("}", isDuplicate = true)

        graph1 = Graph.from(
            nodes = listOf(rzxeh2, dhynw2, npkrg4, vxeru5, esoxd0, gwwdr5, ymgmh2, snjru0, uapru3, xazav3, kupmg9, beedf4, uioef6, vzven1, btgad8, tnrkz0, cxzeo0, hzkmt5, enfpl2, povcq1, sujqj0, jdlux6, rpsct7, eqeuo8, uesfm8, ohknb0, tqfuc9, eyvsq1, yxkjy9, flbbh0, gdiob7, ofmwn5, dgpou5, zzjbr2, rnzzi6, wlhkf9, hlszi4, bfzbc6, qagoz4, evxfs3, vmxgy3, fasvf9, hbdqw8, xmrdh1, qztpj9, lngdt5, yfaic7, gmeip4, gbbwj4, tcnil8, vmudj7, hxeqq4, islpq3, hmogg2, mhwra3, spqrr3, npnvl7, szshk8, qpgks7, kghbk3, vlote4, fotpw6, kmdhj5, kuvfb0, kvbwb7, axdrn0, mshdk3, guvah3, ezuzn9, aiqmi7, efrwb1, pzxmg9, gydmd4, dozfx0, wcnav3, pnsds4, frhua5, lxvzj8, obmaw1, unwwe0, vernu7, cyjlk0, xevft8, gxmys5, nvrxf6, bnbuu0, yxgam4, zvccb6, xjqut6, wbffc1, hovkk3, mxdhj3, xvkpi7, qdwbw6, uvyta2, bxlvh5, unwwy4, xhtfv9, wtkfo1, ejviy0, eozpe3, yqtej7, zwaoj8, nqotu7, gzyrp8, tmcia3, siskn6, awwqe3, zbrdw5, rialo2, hnkox9, wwnoe1, xueza8, pplqv4, djrgy5, gggta6, tsdun7, fkkvo3, xtbiq8, fzwrb6, cgjop8, jylcg3, sxagl7, ppqpg9, cfsay9, mrzud1, gchjj8, carsy5, ycoau9, lussz2, mgtrf7, qpjhm9, fnslm7, ybxnl9, dfcib3, numqe0, fqtjk8, swdgs6, ajobx3, idddr3, jmgtq9, ideso7, joqxp2, utzhy3, ycxdz5, ytvxn6, bzaba8, iihid3, uvrpq2, cfjmt7, qsxpc9, zomjj1, ezeuv6, hrrhv7, nulga2, odpdn8),
            edges = mapOf(
                rzxeh2 to listOf(dhynw2, pzxmg9),
                dhynw2 to listOf(npkrg4, vxeru5, gwwdr5),
                vxeru5 to listOf(esoxd0),
                gwwdr5 to listOf(ymgmh2, snjru0, hlszi4, efrwb1),
                snjru0 to listOf(uapru3, kupmg9, beedf4, vzven1, cxzeo0),
                uapru3 to listOf(xazav3),
                beedf4 to listOf(uioef6),
                vzven1 to listOf(btgad8, tnrkz0),
                cxzeo0 to listOf(hzkmt5, enfpl2, wlhkf9),
                enfpl2 to listOf(povcq1, rnzzi6),
                povcq1 to listOf(sujqj0, tqfuc9, eyvsq1, flbbh0),
                sujqj0 to listOf(jdlux6, eqeuo8, uesfm8),
                jdlux6 to listOf(rpsct7),
                uesfm8 to listOf(ohknb0),
                eyvsq1 to listOf(yxkjy9),
                flbbh0 to listOf(gdiob7, ofmwn5, zzjbr2),
                ofmwn5 to listOf(dgpou5),
                hlszi4 to listOf(bfzbc6, evxfs3, fasvf9, xmrdh1, yfaic7),
                bfzbc6 to listOf(qagoz4),
                evxfs3 to listOf(vmxgy3),
                fasvf9 to listOf(hbdqw8),
                xmrdh1 to listOf(qztpj9, lngdt5),
                yfaic7 to listOf(gmeip4, gbbwj4, kvbwb7, aiqmi7),
                gbbwj4 to listOf(tcnil8, vmudj7, kghbk3),
                vmudj7 to listOf(hxeqq4, islpq3, qpgks7),
                islpq3 to listOf(hmogg2, spqrr3, npnvl7),
                hmogg2 to listOf(mhwra3),
                npnvl7 to listOf(szshk8),
                kghbk3 to listOf(vlote4, fotpw6, kuvfb0),
                fotpw6 to listOf(kmdhj5),
                kvbwb7 to listOf(axdrn0, mshdk3, ezuzn9),
                mshdk3 to listOf(guvah3),
                pzxmg9 to listOf(gydmd4, dozfx0, pnsds4),
                dozfx0 to listOf(wcnav3),
                pnsds4 to listOf(frhua5, lxvzj8, odpdn8),
                lxvzj8 to listOf(obmaw1, cyjlk0, xevft8, nvrxf6, unwwy4),
                obmaw1 to listOf(unwwe0, vernu7),
                xevft8 to listOf(gxmys5),
                nvrxf6 to listOf(bnbuu0, yxgam4, bxlvh5),
                yxgam4 to listOf(zvccb6, qdwbw6),
                zvccb6 to listOf(xjqut6, hovkk3),
                xjqut6 to listOf(wbffc1),
                hovkk3 to listOf(mxdhj3, xvkpi7),
                qdwbw6 to listOf(uvyta2),
                unwwy4 to listOf(xhtfv9, wtkfo1, pplqv4, gggta6, mgtrf7, fnslm7, utzhy3, nulga2),
                wtkfo1 to listOf(ejviy0, yqtej7, xueza8),
                ejviy0 to listOf(eozpe3),
                yqtej7 to listOf(zwaoj8, gzyrp8, tmcia3),
                zwaoj8 to listOf(nqotu7),
                tmcia3 to listOf(siskn6, awwqe3, rialo2),
                awwqe3 to listOf(zbrdw5),
                rialo2 to listOf(hnkox9, wwnoe1),
                pplqv4 to listOf(djrgy5),
                gggta6 to listOf(tsdun7, xtbiq8, lussz2),
                tsdun7 to listOf(fkkvo3),
                xtbiq8 to listOf(fzwrb6, jylcg3, sxagl7),
                fzwrb6 to listOf(cgjop8),
                sxagl7 to listOf(ppqpg9, cfsay9, gchjj8),
                cfsay9 to listOf(mrzud1),
                gchjj8 to listOf(carsy5, ycoau9),
                mgtrf7 to listOf(qpjhm9),
                fnslm7 to listOf(ybxnl9, joqxp2),
                ybxnl9 to listOf(dfcib3, fqtjk8, swdgs6, idddr3),
                dfcib3 to listOf(numqe0),
                swdgs6 to listOf(ajobx3),
                idddr3 to listOf(jmgtq9, ideso7),
                utzhy3 to listOf(ycxdz5, hrrhv7),
                ycxdz5 to listOf(ytvxn6, iihid3, uvrpq2, qsxpc9),
                ytvxn6 to listOf(bzaba8),
                uvrpq2 to listOf(cfjmt7),
                qsxpc9 to listOf(zomjj1, ezeuv6),
            )
        )

        val tuhsa0 = Node("program")
        val xqjzc6 = Node("class_declaration", isDuplicate = true)
        val gymit1 = Node("class", isDuplicate = true)
        val cjiju3 = Node("identifier", isDuplicate = true)
        val yfqmi2 = Node("Animal", isDuplicate = true)
        val bolgm6 = Node("class_body", isDuplicate = true)
        val ttxmi9 = Node("{", isDuplicate = true)
        val sndjw6 = Node("method_declaration", isDuplicate = true)
        val esdcr7 = Node("modifiers", isDuplicate = true)
        val fifvx1 = Node("public", isDuplicate = true)
        val didig6 = Node("void_type", isDuplicate = true)
        val heavm0 = Node("identifier", isDuplicate = true)
        val hjehl9 = Node("animalSound", isDuplicate = true)
        val nfdeb3 = Node("formal_parameters", isDuplicate = true)
        val ooqgm7 = Node("(", isDuplicate = true)
        val ipswr3 = Node(")", isDuplicate = true)
        val zfmsp1 = Node("block", isDuplicate = true)
        val vftoa2 = Node("{", isDuplicate = true)
        val grint7 = Node("expression_statement", isDuplicate = true)
        val bneqo9 = Node("method_invocation", isDuplicate = true)
        val apath6 = Node("field_access")
        val onejc1 = Node("identifier", isDuplicate = true)
        val pcdfk1 = Node("System")
        val mejcv4 = Node(".", isDuplicate = true)
        val lcger7 = Node("identifier", isDuplicate = true)
        val uokmb0 = Node("out")
        val ejhdo3 = Node(".", isDuplicate = true)
        val aphrt0 = Node("identifier", isDuplicate = true)
        val udcdr5 = Node("println")
        val labha5 = Node("argument_list", isDuplicate = true)
        val yvsdu1 = Node("(", isDuplicate = true)
        val aowfd9 = Node("string_literal")
        val vcqej3 = Node("\"That animal makes a sound\"")
        val aytcv2 = Node(")", isDuplicate = true)
        val wjrve1 = Node(";", isDuplicate = true)
        val klmjs6 = Node("}", isDuplicate = true)
        val lqtlz4 = Node("method_declaration", isDuplicate = true)
        val jatyy1 = Node("modifiers", isDuplicate = true)
        val fpvlz9 = Node("public", isDuplicate = true)
        val rrxdk1 = Node("floating_point_type")
        val asgbi1 = Node("double")
        val dbbov4 = Node("identifier", isDuplicate = true)
        val bmbbe0 = Node("hello")
        val ygqeu6 = Node("formal_parameters", isDuplicate = true)
        val kzmrx3 = Node("(", isDuplicate = true)
        val mnukx9 = Node(")", isDuplicate = true)
        val cohrj7 = Node("block", isDuplicate = true)
        val ojymk6 = Node("{", isDuplicate = true)
        val ledra1 = Node("local_variable_declaration", isDuplicate = true)
        val hcibh7 = Node("integral_type")
        val xwyik1 = Node("int")
        val nqdcx7 = Node("variable_declarator", isDuplicate = true)
        val kxikv6 = Node("identifier", isDuplicate = true)
        val yjjju1 = Node("a", isDuplicate = true)
        val jhgpe4 = Node("=", isDuplicate = true)
        val fdgyx2 = Node("decimal_integer_literal")
        val fspwf1 = Node("1")
        val uxspy2 = Node(";", isDuplicate = true)
        val pwzxq5 = Node("return_statement")
        val gdyxg6 = Node("return")
        val bbrvr2 = Node("update_expression")
        val dfkbc2 = Node("identifier", isDuplicate = true)
        val tgfmp1 = Node("a", isDuplicate = true)
        val cxmyj0 = Node("++")
        val tsrir3 = Node(";", isDuplicate = true)
        val xwmqj0 = Node("}", isDuplicate = true)
        val bsgmo2 = Node("}", isDuplicate = true)
        val fkotn2 = Node("class_declaration", isDuplicate = true)
        val plqaf1 = Node("class", isDuplicate = true)
        val krqmv2 = Node("identifier", isDuplicate = true)
        val jxlpc2 = Node("Main")
        val wogiv0 = Node("class_body", isDuplicate = true)
        val zgrqn0 = Node("{", isDuplicate = true)
        val lxjwe1 = Node("method_declaration", isDuplicate = true)
        val szcbh9 = Node("modifiers", isDuplicate = true)
        val nmmsp7 = Node("public", isDuplicate = true)
        val tjluk6 = Node("static")
        val acoix8 = Node("void_type", isDuplicate = true)
        val nxrrw8 = Node("identifier", isDuplicate = true)
        val nakyo7 = Node("main")
        val qmqff0 = Node("formal_parameters", isDuplicate = true)
        val rrwzf4 = Node("(", isDuplicate = true)
        val vxfuy9 = Node("formal_parameter")
        val dxiek6 = Node("array_type")
        val lkqwm7 = Node("type_identifier", isDuplicate = true)
        val tzuhy7 = Node("String")
        val zhpyk6 = Node("dimensions")
        val igynl2 = Node("[")
        val pfofo8 = Node("]")
        val ddudu5 = Node("identifier", isDuplicate = true)
        val xqzrg3 = Node("args")
        val uozzn0 = Node(")", isDuplicate = true)
        val rkxzz9 = Node("block", isDuplicate = true)
        val ysfsl7 = Node("{", isDuplicate = true)
        val ijruk7 = Node("local_variable_declaration", isDuplicate = true)
        val qrxzk3 = Node("type_identifier", isDuplicate = true)
        val fpooe6 = Node("Animal", isDuplicate = true)
        val swzvf6 = Node("variable_declarator", isDuplicate = true)
        val zyxng7 = Node("identifier", isDuplicate = true)
        val ulqqu0 = Node("myAnimal", isDuplicate = true)
        val iiwrb4 = Node("=", isDuplicate = true)
        val nnuxr6 = Node("object_creation_expression", isDuplicate = true)
        val chrxd7 = Node("new", isDuplicate = true)
        val cdlrx4 = Node("type_identifier", isDuplicate = true)
        val qrrpj8 = Node("Animal", isDuplicate = true)
        val fuihc6 = Node("argument_list", isDuplicate = true)
        val mfmhg7 = Node("(", isDuplicate = true)
        val aypdi0 = Node(")", isDuplicate = true)
        val lhqay3 = Node(";", isDuplicate = true)
        val unbqt7 = Node("line_comment", isDuplicate = true)
        val pqdqo3 = Node("// Create a Animal object")
        val awzsl3 = Node("local_variable_declaration", isDuplicate = true)
        val becen2 = Node("type_identifier", isDuplicate = true)
        val ylkxh0 = Node("Animal", isDuplicate = true)
        val jtclg0 = Node("variable_declarator", isDuplicate = true)
        val dtmft8 = Node("identifier", isDuplicate = true)
        val steeq2 = Node("myDog", isDuplicate = true)
        val tssqp2 = Node("=", isDuplicate = true)
        val cfgnq9 = Node("object_creation_expression", isDuplicate = true)
        val hahyo9 = Node("new", isDuplicate = true)
        val gzvsr4 = Node("type_identifier", isDuplicate = true)
        val cdvdx6 = Node("Dog")
        val ybqxi1 = Node("argument_list", isDuplicate = true)
        val mawws1 = Node("(", isDuplicate = true)
        val bowfy6 = Node(")", isDuplicate = true)
        val scepq6 = Node(";", isDuplicate = true)
        val jujmq2 = Node("line_comment", isDuplicate = true)
        val gzklf2 = Node("// Create a Dog object")
        val lxoxb2 = Node("expression_statement", isDuplicate = true)
        val ywmse0 = Node("method_invocation", isDuplicate = true)
        val qvuqc9 = Node("identifier", isDuplicate = true)
        val umqxp0 = Node("myAnimal", isDuplicate = true)
        val ylell8 = Node(".", isDuplicate = true)
        val vscvq2 = Node("identifier", isDuplicate = true)
        val jygiq5 = Node("animalSound", isDuplicate = true)
        val nqbug5 = Node("argument_list", isDuplicate = true)
        val uphyk0 = Node("(", isDuplicate = true)
        val htsru2 = Node(")", isDuplicate = true)
        val dtdoi6 = Node(";", isDuplicate = true)
        val mepmz7 = Node("expression_statement", isDuplicate = true)
        val stvfn6 = Node("method_invocation", isDuplicate = true)
        val yvgxx1 = Node("identifier", isDuplicate = true)
        val wkafn4 = Node("myDog", isDuplicate = true)
        val pjbqk1 = Node(".", isDuplicate = true)
        val ahknh1 = Node("identifier", isDuplicate = true)
        val rdqtg3 = Node("animalSound", isDuplicate = true)
        val hniec7 = Node("argument_list", isDuplicate = true)
        val xcpvx9 = Node("(", isDuplicate = true)
        val kzecf3 = Node(")", isDuplicate = true)
        val iqfho5 = Node(";", isDuplicate = true)
        val nvoki9 = Node("}", isDuplicate = true)
        val fzvsk4 = Node("}", isDuplicate = true)

        graph2 = Graph.from(
            nodes = listOf(tuhsa0, xqjzc6, gymit1, cjiju3, yfqmi2, bolgm6, ttxmi9, sndjw6, esdcr7, fifvx1, didig6, heavm0, hjehl9, nfdeb3, ooqgm7, ipswr3, zfmsp1, vftoa2, grint7, bneqo9, apath6, onejc1, pcdfk1, mejcv4, lcger7, uokmb0, ejhdo3, aphrt0, udcdr5, labha5, yvsdu1, aowfd9, vcqej3, aytcv2, wjrve1, klmjs6, lqtlz4, jatyy1, fpvlz9, rrxdk1, asgbi1, dbbov4, bmbbe0, ygqeu6, kzmrx3, mnukx9, cohrj7, ojymk6, ledra1, hcibh7, xwyik1, nqdcx7, kxikv6, yjjju1, jhgpe4, fdgyx2, fspwf1, uxspy2, pwzxq5, gdyxg6, bbrvr2, dfkbc2, tgfmp1, cxmyj0, tsrir3, xwmqj0, bsgmo2, fkotn2, plqaf1, krqmv2, jxlpc2, wogiv0, zgrqn0, lxjwe1, szcbh9, nmmsp7, tjluk6, acoix8, nxrrw8, nakyo7, qmqff0, rrwzf4, vxfuy9, dxiek6, lkqwm7, tzuhy7, zhpyk6, igynl2, pfofo8, ddudu5, xqzrg3, uozzn0, rkxzz9, ysfsl7, ijruk7, qrxzk3, fpooe6, swzvf6, zyxng7, ulqqu0, iiwrb4, nnuxr6, chrxd7, cdlrx4, qrrpj8, fuihc6, mfmhg7, aypdi0, lhqay3, unbqt7, pqdqo3, awzsl3, becen2, ylkxh0, jtclg0, dtmft8, steeq2, tssqp2, cfgnq9, hahyo9, gzvsr4, cdvdx6, ybqxi1, mawws1, bowfy6, scepq6, jujmq2, gzklf2, lxoxb2, ywmse0, qvuqc9, umqxp0, ylell8, vscvq2, jygiq5, nqbug5, uphyk0, htsru2, dtdoi6, mepmz7, stvfn6, yvgxx1, wkafn4, pjbqk1, ahknh1, rdqtg3, hniec7, xcpvx9, kzecf3, iqfho5, nvoki9, fzvsk4),
            edges = mapOf(
                tuhsa0 to listOf(xqjzc6, fkotn2),
                xqjzc6 to listOf(gymit1, cjiju3, bolgm6),
                cjiju3 to listOf(yfqmi2),
                bolgm6 to listOf(ttxmi9, sndjw6, lqtlz4, bsgmo2),
                sndjw6 to listOf(esdcr7, didig6, heavm0, nfdeb3, zfmsp1),
                esdcr7 to listOf(fifvx1),
                heavm0 to listOf(hjehl9),
                nfdeb3 to listOf(ooqgm7, ipswr3),
                zfmsp1 to listOf(vftoa2, grint7, klmjs6),
                grint7 to listOf(bneqo9, wjrve1),
                bneqo9 to listOf(apath6, ejhdo3, aphrt0, labha5),
                apath6 to listOf(onejc1, mejcv4, lcger7),
                onejc1 to listOf(pcdfk1),
                lcger7 to listOf(uokmb0),
                aphrt0 to listOf(udcdr5),
                labha5 to listOf(yvsdu1, aowfd9, aytcv2),
                aowfd9 to listOf(vcqej3),
                lqtlz4 to listOf(jatyy1, rrxdk1, dbbov4, ygqeu6, cohrj7),
                jatyy1 to listOf(fpvlz9),
                rrxdk1 to listOf(asgbi1),
                dbbov4 to listOf(bmbbe0),
                ygqeu6 to listOf(kzmrx3, mnukx9),
                cohrj7 to listOf(ojymk6, ledra1, pwzxq5, xwmqj0),
                ledra1 to listOf(hcibh7, nqdcx7, uxspy2),
                hcibh7 to listOf(xwyik1),
                nqdcx7 to listOf(kxikv6, jhgpe4, fdgyx2),
                kxikv6 to listOf(yjjju1),
                fdgyx2 to listOf(fspwf1),
                pwzxq5 to listOf(gdyxg6, bbrvr2, tsrir3),
                bbrvr2 to listOf(dfkbc2, cxmyj0),
                dfkbc2 to listOf(tgfmp1),
                fkotn2 to listOf(plqaf1, krqmv2, wogiv0),
                krqmv2 to listOf(jxlpc2),
                wogiv0 to listOf(zgrqn0, lxjwe1, fzvsk4),
                lxjwe1 to listOf(szcbh9, acoix8, nxrrw8, qmqff0, rkxzz9),
                szcbh9 to listOf(nmmsp7, tjluk6),
                nxrrw8 to listOf(nakyo7),
                qmqff0 to listOf(rrwzf4, vxfuy9, uozzn0),
                vxfuy9 to listOf(dxiek6, ddudu5),
                dxiek6 to listOf(lkqwm7, zhpyk6),
                lkqwm7 to listOf(tzuhy7),
                zhpyk6 to listOf(igynl2, pfofo8),
                ddudu5 to listOf(xqzrg3),
                rkxzz9 to listOf(ysfsl7, ijruk7, unbqt7, awzsl3, jujmq2, lxoxb2, mepmz7, nvoki9),
                ijruk7 to listOf(qrxzk3, swzvf6, lhqay3),
                qrxzk3 to listOf(fpooe6),
                swzvf6 to listOf(zyxng7, iiwrb4, nnuxr6),
                zyxng7 to listOf(ulqqu0),
                nnuxr6 to listOf(chrxd7, cdlrx4, fuihc6),
                cdlrx4 to listOf(qrrpj8),
                fuihc6 to listOf(mfmhg7, aypdi0),
                unbqt7 to listOf(pqdqo3),
                awzsl3 to listOf(becen2, jtclg0, scepq6),
                becen2 to listOf(ylkxh0),
                jtclg0 to listOf(dtmft8, tssqp2, cfgnq9),
                dtmft8 to listOf(steeq2),
                cfgnq9 to listOf(hahyo9, gzvsr4, ybqxi1),
                gzvsr4 to listOf(cdvdx6),
                ybqxi1 to listOf(mawws1, bowfy6),
                jujmq2 to listOf(gzklf2),
                lxoxb2 to listOf(ywmse0, dtdoi6),
                ywmse0 to listOf(qvuqc9, ylell8, vscvq2, nqbug5),
                qvuqc9 to listOf(umqxp0),
                vscvq2 to listOf(jygiq5),
                nqbug5 to listOf(uphyk0, htsru2),
                mepmz7 to listOf(stvfn6, iqfho5),
                stvfn6 to listOf(yvgxx1, pjbqk1, ahknh1, hniec7),
                yvgxx1 to listOf(wkafn4),
                ahknh1 to listOf(rdqtg3),
                hniec7 to listOf(xcpvx9, kzecf3),
            )
        )

        graph1.visualize("ModerateV2.3/G1")
        graph2.visualize("ModerateV2.3/G2")
    }

    override fun checkCommonGraph(commonGraph: Graph) {
        ASTPrinter.from(graph1, graphNumber = 1, "ModerateV2.3/G1_Generalized")
        ASTPrinter.from(graph2, graphNumber = 2, "ModerateV2.3/G2_Generalized")
        ASTPrinter.from(commonGraph, "ModerateV2.3/Generalized")

        graph1.visualize("ModerateV2.3/G1_generalized", commonGraph)
        graph2.visualize("ModerateV2.3/G2_generalized", commonGraph)
        commonGraph.visualize("ModerateV2.3/Generalization")
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {
        graph1Diff.visualize("ModerateV2.3/G1_Diff")
    }
    override fun checkGraph2Diff(graph2Diff: Graph) {
        graph2Diff.visualize("ModerateV2.3/G2_Diff")
    }
}