package ca.ucalgary.cs.comparison.ast

import ca.ucalgary.cs.comparison.BaseCompareGraphTest
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.graph.Node
import ca.ucalgary.cs.io.ASTPrinter
import ca.ucalgary.cs.io.visualize

class AST2 : BaseCompareGraphTest() {
    override fun initializeGraphs() {
        val lsxug3 = Node("program")
        val ggfxm2 = Node("class_declaration", isDuplicate = true)
        val cqook5 = Node("class", isDuplicate = true)
        val mvwmn3 = Node("identifier", isDuplicate = true)
        val zwexe0 = Node("Animal", isDuplicate = true)
        val mwjqa8 = Node("class_body", isDuplicate = true)
        val xmzlu0 = Node("{", isDuplicate = true)
        val yexfm8 = Node("method_declaration", isDuplicate = true)
        val jmwpc8 = Node("modifiers", isDuplicate = true)
        val tvvvy9 = Node("public", isDuplicate = true)
        val qtkip4 = Node("void_type", isDuplicate = true)
        val vakpl4 = Node("identifier", isDuplicate = true)
        val loaxl9 = Node("animalSound", isDuplicate = true)
        val rtqgv4 = Node("formal_parameters", isDuplicate = true)
        val avmee6 = Node("(", isDuplicate = true)
        val jqnbf1 = Node(")", isDuplicate = true)
        val dkgle4 = Node("block", isDuplicate = true)
        val jqnpp8 = Node("{", isDuplicate = true)
        val pfwlq1 = Node("expression_statement", isDuplicate = true)
        val flepn0 = Node("method_invocation", isDuplicate = true)
        val kflaf4 = Node("field_access")
        val wynow2 = Node("identifier", isDuplicate = true)
        val onzbf3 = Node("System")
        val kyzne0 = Node(".", isDuplicate = true)
        val dhcaf0 = Node("identifier", isDuplicate = true)
        val rfipx4 = Node("out")
        val qpnsz9 = Node(".", isDuplicate = true)
        val ycveg2 = Node("identifier", isDuplicate = true)
        val hyrfe1 = Node("println")
        val fetpq3 = Node("argument_list", isDuplicate = true)
        val hydza6 = Node("(", isDuplicate = true)
        val mpvix9 = Node("string_literal")
        val iwxxc5 = Node("\"The animal makes a sound\"")
        val uwbru2 = Node(")", isDuplicate = true)
        val pffnj4 = Node(";", isDuplicate = true)
        val nayfv8 = Node("}", isDuplicate = true)
        val orvwd0 = Node("}", isDuplicate = true)
        val encca3 = Node("class_declaration", isDuplicate = true)
        val comyk8 = Node("class", isDuplicate = true)
        val ydcum2 = Node("identifier", isDuplicate = true)
        val zhhev9 = Node("Main")
        val zhett8 = Node("class_body", isDuplicate = true)
        val utmfs9 = Node("{", isDuplicate = true)
        val xfjmh7 = Node("method_declaration", isDuplicate = true)
        val tqjrz9 = Node("modifiers", isDuplicate = true)
        val denqx1 = Node("public", isDuplicate = true)
        val zftmf1 = Node("static")
        val onswj4 = Node("void_type", isDuplicate = true)
        val sgagy5 = Node("identifier", isDuplicate = true)
        val ksbuj2 = Node("main")
        val jyrud0 = Node("formal_parameters", isDuplicate = true)
        val xlqrs4 = Node("(", isDuplicate = true)
        val uunpg2 = Node("formal_parameter")
        val bafsb0 = Node("array_type")
        val mgpzg0 = Node("type_identifier", isDuplicate = true)
        val ftrbv8 = Node("String")
        val ywcnf7 = Node("dimensions")
        val fvymh1 = Node("[")
        val twjer8 = Node("]")
        val xppud2 = Node("identifier", isDuplicate = true)
        val uotjh3 = Node("args")
        val gkhsb8 = Node(")", isDuplicate = true)
        val uwndi6 = Node("block", isDuplicate = true)
        val wtafa1 = Node("{", isDuplicate = true)
        val hiyas4 = Node("local_variable_declaration", isDuplicate = true)
        val febzi7 = Node("type_identifier", isDuplicate = true)
        val cvokr8 = Node("Animal", isDuplicate = true)
        val qyjip7 = Node("variable_declarator", isDuplicate = true)
        val imwof3 = Node("identifier", isDuplicate = true)
        val eogau6 = Node("myAnimal", isDuplicate = true)
        val bbdhx8 = Node("=", isDuplicate = true)
        val jvluu4 = Node("object_creation_expression", isDuplicate = true)
        val xwnis1 = Node("new", isDuplicate = true)
        val dqqnt8 = Node("type_identifier", isDuplicate = true)
        val mffrb0 = Node("Animal", isDuplicate = true)
        val jxbqk2 = Node("argument_list", isDuplicate = true)
        val vbjri4 = Node("(", isDuplicate = true)
        val oopsb5 = Node(")", isDuplicate = true)
        val nijdh9 = Node(";", isDuplicate = true)
        val djbsu9 = Node("line_comment", isDuplicate = true)
        val iaogt4 = Node("local_variable_declaration", isDuplicate = true)
        val eivup4 = Node("type_identifier", isDuplicate = true)
        val gbsww4 = Node("Animal", isDuplicate = true)
        val fphpm9 = Node("variable_declarator", isDuplicate = true)
        val hjdxy4 = Node("identifier", isDuplicate = true)
        val ifxmf8 = Node("myDog", isDuplicate = true)
        val ffcih3 = Node("=", isDuplicate = true)
        val kvcyy6 = Node("object_creation_expression", isDuplicate = true)
        val xylqh0 = Node("new", isDuplicate = true)
        val plbsj2 = Node("type_identifier", isDuplicate = true)
        val jpkir7 = Node("Dog")
        val gzykt6 = Node("argument_list", isDuplicate = true)
        val hgrla0 = Node("(", isDuplicate = true)
        val kijcb6 = Node(")", isDuplicate = true)
        val hdfur0 = Node(";", isDuplicate = true)
        val vviwp5 = Node("line_comment", isDuplicate = true)
        val gcbmz5 = Node("expression_statement", isDuplicate = true)
        val gwrqw8 = Node("method_invocation", isDuplicate = true)
        val xhitt7 = Node("identifier", isDuplicate = true)
        val zxzgr5 = Node("myAnimal", isDuplicate = true)
        val zumng3 = Node(".", isDuplicate = true)
        val jrvii3 = Node("identifier", isDuplicate = true)
        val iyyju1 = Node("animalSound", isDuplicate = true)
        val tkufs9 = Node("argument_list", isDuplicate = true)
        val xyfyk5 = Node("(", isDuplicate = true)
        val uwwdq8 = Node(")", isDuplicate = true)
        val uophc3 = Node(";", isDuplicate = true)
        val tyoqw7 = Node("expression_statement", isDuplicate = true)
        val oxxld8 = Node("method_invocation", isDuplicate = true)
        val hlnch0 = Node("identifier", isDuplicate = true)
        val knbio8 = Node("myDog", isDuplicate = true)
        val ykqup2 = Node(".", isDuplicate = true)
        val eczve3 = Node("identifier", isDuplicate = true)
        val sdgrz3 = Node("animalSound", isDuplicate = true)
        val rpsvy7 = Node("argument_list", isDuplicate = true)
        val fwoqx1 = Node("(", isDuplicate = true)
        val gpakl1 = Node(")", isDuplicate = true)
        val ebpsm6 = Node(";", isDuplicate = true)
        val kzojq7 = Node("}", isDuplicate = true)
        val uvjqj0 = Node("}", isDuplicate = true)

        graph1 = Graph.from(
            nodes = listOf(lsxug3, ggfxm2, cqook5, mvwmn3, zwexe0, mwjqa8, xmzlu0, yexfm8, jmwpc8, tvvvy9, qtkip4, vakpl4, loaxl9, rtqgv4, avmee6, jqnbf1, dkgle4, jqnpp8, pfwlq1, flepn0, kflaf4, wynow2, onzbf3, kyzne0, dhcaf0, rfipx4, qpnsz9, ycveg2, hyrfe1, fetpq3, hydza6, mpvix9, iwxxc5, uwbru2, pffnj4, nayfv8, orvwd0, encca3, comyk8, ydcum2, zhhev9, zhett8, utmfs9, xfjmh7, tqjrz9, denqx1, zftmf1, onswj4, sgagy5, ksbuj2, jyrud0, xlqrs4, uunpg2, bafsb0, mgpzg0, ftrbv8, ywcnf7, fvymh1, twjer8, xppud2, uotjh3, gkhsb8, uwndi6, wtafa1, hiyas4, febzi7, cvokr8, qyjip7, imwof3, eogau6, bbdhx8, jvluu4, xwnis1, dqqnt8, mffrb0, jxbqk2, vbjri4, oopsb5, nijdh9, djbsu9, iaogt4, eivup4, gbsww4, fphpm9, hjdxy4, ifxmf8, ffcih3, kvcyy6, xylqh0, plbsj2, jpkir7, gzykt6, hgrla0, kijcb6, hdfur0, vviwp5, gcbmz5, gwrqw8, xhitt7, zxzgr5, zumng3, jrvii3, iyyju1, tkufs9, xyfyk5, uwwdq8, uophc3, tyoqw7, oxxld8, hlnch0, knbio8, ykqup2, eczve3, sdgrz3, rpsvy7, fwoqx1, gpakl1, ebpsm6, kzojq7, uvjqj0),
            edges = mapOf(
                lsxug3 to listOf(ggfxm2, encca3),
                ggfxm2 to listOf(cqook5, mvwmn3, mwjqa8),
                mvwmn3 to listOf(zwexe0),
                mwjqa8 to listOf(xmzlu0, yexfm8, orvwd0),
                yexfm8 to listOf(jmwpc8, qtkip4, vakpl4, rtqgv4, dkgle4),
                jmwpc8 to listOf(tvvvy9),
                vakpl4 to listOf(loaxl9),
                rtqgv4 to listOf(avmee6, jqnbf1),
                dkgle4 to listOf(jqnpp8, pfwlq1, nayfv8),
                pfwlq1 to listOf(flepn0, pffnj4),
                flepn0 to listOf(kflaf4, qpnsz9, ycveg2, fetpq3),
                kflaf4 to listOf(wynow2, kyzne0, dhcaf0),
                wynow2 to listOf(onzbf3),
                dhcaf0 to listOf(rfipx4),
                ycveg2 to listOf(hyrfe1),
                fetpq3 to listOf(hydza6, mpvix9, uwbru2),
                mpvix9 to listOf(iwxxc5),
                encca3 to listOf(comyk8, ydcum2, zhett8),
                ydcum2 to listOf(zhhev9),
                zhett8 to listOf(utmfs9, xfjmh7, uvjqj0),
                xfjmh7 to listOf(tqjrz9, onswj4, sgagy5, jyrud0, uwndi6),
                tqjrz9 to listOf(denqx1, zftmf1),
                sgagy5 to listOf(ksbuj2),
                jyrud0 to listOf(xlqrs4, uunpg2, gkhsb8),
                uunpg2 to listOf(bafsb0, xppud2),
                bafsb0 to listOf(mgpzg0, ywcnf7),
                mgpzg0 to listOf(ftrbv8),
                ywcnf7 to listOf(fvymh1, twjer8),
                xppud2 to listOf(uotjh3),
                uwndi6 to listOf(wtafa1, hiyas4, djbsu9, iaogt4, vviwp5, gcbmz5, tyoqw7, kzojq7),
                hiyas4 to listOf(febzi7, qyjip7, nijdh9),
                febzi7 to listOf(cvokr8),
                qyjip7 to listOf(imwof3, bbdhx8, jvluu4),
                imwof3 to listOf(eogau6),
                jvluu4 to listOf(xwnis1, dqqnt8, jxbqk2),
                dqqnt8 to listOf(mffrb0),
                jxbqk2 to listOf(vbjri4, oopsb5),
                iaogt4 to listOf(eivup4, fphpm9, hdfur0),
                eivup4 to listOf(gbsww4),
                fphpm9 to listOf(hjdxy4, ffcih3, kvcyy6),
                hjdxy4 to listOf(ifxmf8),
                kvcyy6 to listOf(xylqh0, plbsj2, gzykt6),
                plbsj2 to listOf(jpkir7),
                gzykt6 to listOf(hgrla0, kijcb6),
                gcbmz5 to listOf(gwrqw8, uophc3),
                gwrqw8 to listOf(xhitt7, zumng3, jrvii3, tkufs9),
                xhitt7 to listOf(zxzgr5),
                jrvii3 to listOf(iyyju1),
                tkufs9 to listOf(xyfyk5, uwwdq8),
                tyoqw7 to listOf(oxxld8, ebpsm6),
                oxxld8 to listOf(hlnch0, ykqup2, eczve3, rpsvy7),
                hlnch0 to listOf(knbio8),
                eczve3 to listOf(sdgrz3),
                rpsvy7 to listOf(fwoqx1, gpakl1),
            )
        )

        val stjyq3 = Node("program")
        val vofry4 = Node("class_declaration", isDuplicate = true)
        val rmqkg0 = Node("class", isDuplicate = true)
        val qfmqv8 = Node("identifier", isDuplicate = true)
        val frkan9 = Node("Animal", isDuplicate = true)
        val rbzze3 = Node("class_body", isDuplicate = true)
        val tapon9 = Node("{", isDuplicate = true)
        val wyvqx6 = Node("method_declaration", isDuplicate = true)
        val rucad9 = Node("modifiers", isDuplicate = true)
        val bvmwp5 = Node("public", isDuplicate = true)
        val mlrzd7 = Node("void_type", isDuplicate = true)
        val jeqoz6 = Node("identifier", isDuplicate = true)
        val gosob8 = Node("animalSound", isDuplicate = true)
        val gjdrq9 = Node("formal_parameters", isDuplicate = true)
        val pvbng7 = Node("(", isDuplicate = true)
        val mvgqd1 = Node(")", isDuplicate = true)
        val gspdk4 = Node("block", isDuplicate = true)
        val qyail3 = Node("{", isDuplicate = true)
        val fgaaz4 = Node("expression_statement", isDuplicate = true)
        val vjlce3 = Node("method_invocation", isDuplicate = true)
        val zmjfo7 = Node("field_access")
        val spidv8 = Node("identifier", isDuplicate = true)
        val nlnon3 = Node("System")
        val alpdu5 = Node(".", isDuplicate = true)
        val ahqqs9 = Node("identifier", isDuplicate = true)
        val valto3 = Node("out")
        val kbcdq7 = Node(".", isDuplicate = true)
        val jzcmo2 = Node("identifier", isDuplicate = true)
        val hicpy1 = Node("println")
        val djrnu7 = Node("argument_list", isDuplicate = true)
        val vkddp4 = Node("(", isDuplicate = true)
        val jdldf8 = Node("string_literal")
        val jwres1 = Node("\"That animal makes a sound\"")
        val uzlcf5 = Node(")", isDuplicate = true)
        val imhno8 = Node(";", isDuplicate = true)
        val kflll3 = Node("}", isDuplicate = true)
        val wyzzk1 = Node("method_declaration", isDuplicate = true)
        val wznub6 = Node("modifiers", isDuplicate = true)
        val zjjno1 = Node("public", isDuplicate = true)
        val erkuo5 = Node("floating_point_type")
        val airlt0 = Node("double")
        val gvyxg0 = Node("identifier", isDuplicate = true)
        val ppiqk3 = Node("hello")
        val jsseo2 = Node("formal_parameters", isDuplicate = true)
        val tkoor7 = Node("(", isDuplicate = true)
        val zxptn2 = Node(")", isDuplicate = true)
        val upkaq4 = Node("block", isDuplicate = true)
        val wmxpi2 = Node("{", isDuplicate = true)
        val qrtjt7 = Node("local_variable_declaration", isDuplicate = true)
        val nctsm1 = Node("integral_type")
        val ethcu6 = Node("int")
        val zrxbq9 = Node("variable_declarator", isDuplicate = true)
        val eluqe2 = Node("identifier", isDuplicate = true)
        val wwyzu2 = Node("a", isDuplicate = true)
        val cnvye8 = Node("=", isDuplicate = true)
        val rpprd5 = Node("decimal_integer_literal")
        val mttus2 = Node("1")
        val ydlqq8 = Node(";", isDuplicate = true)
        val tsveu8 = Node("return_statement")
        val taxsi6 = Node("return")
        val qzmcb5 = Node("update_expression")
        val aqokx3 = Node("identifier", isDuplicate = true)
        val ubohu4 = Node("a", isDuplicate = true)
        val iaqar5 = Node("++")
        val lzhvv3 = Node(";", isDuplicate = true)
        val mrypq7 = Node("}", isDuplicate = true)
        val xrxnf9 = Node("}", isDuplicate = true)
        val nozwf5 = Node("class_declaration", isDuplicate = true)
        val odwwi7 = Node("class", isDuplicate = true)
        val gpliz5 = Node("identifier", isDuplicate = true)
        val avfrz8 = Node("Main")
        val aojgd2 = Node("class_body", isDuplicate = true)
        val lucpq5 = Node("{", isDuplicate = true)
        val bcovd2 = Node("method_declaration", isDuplicate = true)
        val hsqbi7 = Node("modifiers", isDuplicate = true)
        val hogml8 = Node("public", isDuplicate = true)
        val ekjcj5 = Node("static")
        val ndfsr5 = Node("void_type", isDuplicate = true)
        val sgnhs7 = Node("identifier", isDuplicate = true)
        val uxyiz1 = Node("main")
        val rokay9 = Node("formal_parameters", isDuplicate = true)
        val chhnv1 = Node("(", isDuplicate = true)
        val uqbjy7 = Node("formal_parameter")
        val ekhkh6 = Node("array_type")
        val gnexe9 = Node("type_identifier", isDuplicate = true)
        val eokpu1 = Node("String")
        val iytcx5 = Node("dimensions")
        val awtwf3 = Node("[")
        val tcuyz6 = Node("]")
        val rtdpp2 = Node("identifier", isDuplicate = true)
        val ikpra9 = Node("args")
        val uehsx6 = Node(")", isDuplicate = true)
        val lirfk8 = Node("block", isDuplicate = true)
        val bcrzg5 = Node("{", isDuplicate = true)
        val bjcnq7 = Node("local_variable_declaration", isDuplicate = true)
        val ourjb5 = Node("type_identifier", isDuplicate = true)
        val uakav8 = Node("Animal", isDuplicate = true)
        val mbixt9 = Node("variable_declarator", isDuplicate = true)
        val smdoy4 = Node("identifier", isDuplicate = true)
        val codbt2 = Node("myAnimal", isDuplicate = true)
        val rfddv0 = Node("=", isDuplicate = true)
        val rgpnt6 = Node("object_creation_expression", isDuplicate = true)
        val bvppz8 = Node("new", isDuplicate = true)
        val guzge1 = Node("type_identifier", isDuplicate = true)
        val umako7 = Node("Animal", isDuplicate = true)
        val ezuvq8 = Node("argument_list", isDuplicate = true)
        val acetr2 = Node("(", isDuplicate = true)
        val jzndh1 = Node(")", isDuplicate = true)
        val ygtua5 = Node(";", isDuplicate = true)
        val kadhn9 = Node("line_comment", isDuplicate = true)
        val dsurx5 = Node("local_variable_declaration", isDuplicate = true)
        val lmloe3 = Node("type_identifier", isDuplicate = true)
        val lsaql3 = Node("Animal", isDuplicate = true)
        val ealvw5 = Node("variable_declarator", isDuplicate = true)
        val scsav0 = Node("identifier", isDuplicate = true)
        val dxlgf2 = Node("myDog", isDuplicate = true)
        val trqdu5 = Node("=", isDuplicate = true)
        val qfdvw1 = Node("object_creation_expression", isDuplicate = true)
        val pdkoe7 = Node("new", isDuplicate = true)
        val ocfwh3 = Node("type_identifier", isDuplicate = true)
        val yodhb0 = Node("Dog")
        val qmmuv0 = Node("argument_list", isDuplicate = true)
        val voqfh0 = Node("(", isDuplicate = true)
        val msnek4 = Node(")", isDuplicate = true)
        val hywmc4 = Node(";", isDuplicate = true)
        val xfqhe8 = Node("line_comment", isDuplicate = true)
        val flume1 = Node("expression_statement", isDuplicate = true)
        val lmwua1 = Node("method_invocation", isDuplicate = true)
        val ixkot2 = Node("identifier", isDuplicate = true)
        val cxwvo2 = Node("myAnimal", isDuplicate = true)
        val dmxrp9 = Node(".", isDuplicate = true)
        val agjkd4 = Node("identifier", isDuplicate = true)
        val tmroc1 = Node("animalSound", isDuplicate = true)
        val jplxl0 = Node("argument_list", isDuplicate = true)
        val lfobj8 = Node("(", isDuplicate = true)
        val eaofh3 = Node(")", isDuplicate = true)
        val cbwxe2 = Node(";", isDuplicate = true)
        val naxzd9 = Node("expression_statement", isDuplicate = true)
        val tjjvg6 = Node("method_invocation", isDuplicate = true)
        val mdmhq3 = Node("identifier", isDuplicate = true)
        val ofico6 = Node("myDog", isDuplicate = true)
        val nbugk3 = Node(".", isDuplicate = true)
        val pxmrf4 = Node("identifier", isDuplicate = true)
        val shvzt7 = Node("animalSound", isDuplicate = true)
        val rfzjr1 = Node("argument_list", isDuplicate = true)
        val csnlq3 = Node("(", isDuplicate = true)
        val hgvia7 = Node(")", isDuplicate = true)
        val zutim7 = Node(";", isDuplicate = true)
        val esctf7 = Node("}", isDuplicate = true)
        val kwtqx0 = Node("}", isDuplicate = true)

        graph2 = Graph.from(
            nodes = listOf(stjyq3, vofry4, rmqkg0, qfmqv8, frkan9, rbzze3, tapon9, wyvqx6, rucad9, bvmwp5, mlrzd7, jeqoz6, gosob8, gjdrq9, pvbng7, mvgqd1, gspdk4, qyail3, fgaaz4, vjlce3, zmjfo7, spidv8, nlnon3, alpdu5, ahqqs9, valto3, kbcdq7, jzcmo2, hicpy1, djrnu7, vkddp4, jdldf8, jwres1, uzlcf5, imhno8, kflll3, wyzzk1, wznub6, zjjno1, erkuo5, airlt0, gvyxg0, ppiqk3, jsseo2, tkoor7, zxptn2, upkaq4, wmxpi2, qrtjt7, nctsm1, ethcu6, zrxbq9, eluqe2, wwyzu2, cnvye8, rpprd5, mttus2, ydlqq8, tsveu8, taxsi6, qzmcb5, aqokx3, ubohu4, iaqar5, lzhvv3, mrypq7, xrxnf9, nozwf5, odwwi7, gpliz5, avfrz8, aojgd2, lucpq5, bcovd2, hsqbi7, hogml8, ekjcj5, ndfsr5, sgnhs7, uxyiz1, rokay9, chhnv1, uqbjy7, ekhkh6, gnexe9, eokpu1, iytcx5, awtwf3, tcuyz6, rtdpp2, ikpra9, uehsx6, lirfk8, bcrzg5, bjcnq7, ourjb5, uakav8, mbixt9, smdoy4, codbt2, rfddv0, rgpnt6, bvppz8, guzge1, umako7, ezuvq8, acetr2, jzndh1, ygtua5, kadhn9, dsurx5, lmloe3, lsaql3, ealvw5, scsav0, dxlgf2, trqdu5, qfdvw1, pdkoe7, ocfwh3, yodhb0, qmmuv0, voqfh0, msnek4, hywmc4, xfqhe8, flume1, lmwua1, ixkot2, cxwvo2, dmxrp9, agjkd4, tmroc1, jplxl0, lfobj8, eaofh3, cbwxe2, naxzd9, tjjvg6, mdmhq3, ofico6, nbugk3, pxmrf4, shvzt7, rfzjr1, csnlq3, hgvia7, zutim7, esctf7, kwtqx0),
            edges = mapOf(
                stjyq3 to listOf(vofry4, nozwf5),
                vofry4 to listOf(rmqkg0, qfmqv8, rbzze3),
                qfmqv8 to listOf(frkan9),
                rbzze3 to listOf(tapon9, wyvqx6, wyzzk1, xrxnf9),
                wyvqx6 to listOf(rucad9, mlrzd7, jeqoz6, gjdrq9, gspdk4),
                rucad9 to listOf(bvmwp5),
                jeqoz6 to listOf(gosob8),
                gjdrq9 to listOf(pvbng7, mvgqd1),
                gspdk4 to listOf(qyail3, fgaaz4, kflll3),
                fgaaz4 to listOf(vjlce3, imhno8),
                vjlce3 to listOf(zmjfo7, kbcdq7, jzcmo2, djrnu7),
                zmjfo7 to listOf(spidv8, alpdu5, ahqqs9),
                spidv8 to listOf(nlnon3),
                ahqqs9 to listOf(valto3),
                jzcmo2 to listOf(hicpy1),
                djrnu7 to listOf(vkddp4, jdldf8, uzlcf5),
                jdldf8 to listOf(jwres1),
                wyzzk1 to listOf(wznub6, erkuo5, gvyxg0, jsseo2, upkaq4),
                wznub6 to listOf(zjjno1),
                erkuo5 to listOf(airlt0),
                gvyxg0 to listOf(ppiqk3),
                jsseo2 to listOf(tkoor7, zxptn2),
                upkaq4 to listOf(wmxpi2, qrtjt7, tsveu8, mrypq7),
                qrtjt7 to listOf(nctsm1, zrxbq9, ydlqq8),
                nctsm1 to listOf(ethcu6),
                zrxbq9 to listOf(eluqe2, cnvye8, rpprd5),
                eluqe2 to listOf(wwyzu2),
                rpprd5 to listOf(mttus2),
                tsveu8 to listOf(taxsi6, qzmcb5, lzhvv3),
                qzmcb5 to listOf(aqokx3, iaqar5),
                aqokx3 to listOf(ubohu4),
                nozwf5 to listOf(odwwi7, gpliz5, aojgd2),
                gpliz5 to listOf(avfrz8),
                aojgd2 to listOf(lucpq5, bcovd2, kwtqx0),
                bcovd2 to listOf(hsqbi7, ndfsr5, sgnhs7, rokay9, lirfk8),
                hsqbi7 to listOf(hogml8, ekjcj5),
                sgnhs7 to listOf(uxyiz1),
                rokay9 to listOf(chhnv1, uqbjy7, uehsx6),
                uqbjy7 to listOf(ekhkh6, rtdpp2),
                ekhkh6 to listOf(gnexe9, iytcx5),
                gnexe9 to listOf(eokpu1),
                iytcx5 to listOf(awtwf3, tcuyz6),
                rtdpp2 to listOf(ikpra9),
                lirfk8 to listOf(bcrzg5, bjcnq7, kadhn9, dsurx5, xfqhe8, flume1, naxzd9, esctf7),
                bjcnq7 to listOf(ourjb5, mbixt9, ygtua5),
                ourjb5 to listOf(uakav8),
                mbixt9 to listOf(smdoy4, rfddv0, rgpnt6),
                smdoy4 to listOf(codbt2),
                rgpnt6 to listOf(bvppz8, guzge1, ezuvq8),
                guzge1 to listOf(umako7),
                ezuvq8 to listOf(acetr2, jzndh1),
                dsurx5 to listOf(lmloe3, ealvw5, hywmc4),
                lmloe3 to listOf(lsaql3),
                ealvw5 to listOf(scsav0, trqdu5, qfdvw1),
                scsav0 to listOf(dxlgf2),
                qfdvw1 to listOf(pdkoe7, ocfwh3, qmmuv0),
                ocfwh3 to listOf(yodhb0),
                qmmuv0 to listOf(voqfh0, msnek4),
                flume1 to listOf(lmwua1, cbwxe2),
                lmwua1 to listOf(ixkot2, dmxrp9, agjkd4, jplxl0),
                ixkot2 to listOf(cxwvo2),
                agjkd4 to listOf(tmroc1),
                jplxl0 to listOf(lfobj8, eaofh3),
                naxzd9 to listOf(tjjvg6, zutim7),
                tjjvg6 to listOf(mdmhq3, nbugk3, pxmrf4, rfzjr1),
                mdmhq3 to listOf(ofico6),
                pxmrf4 to listOf(shvzt7),
                rfzjr1 to listOf(csnlq3, hgvia7),
            )
        )

        graph1.visualize("SimpleV2.5/G1")
        graph2.visualize("SimpleV2.5/G2")
    }

    override fun checkCommonGraph(commonGraph: Graph) {
        ASTPrinter.from(graph1, graphNumber = 1, "SimpleV2.5/G1_Generalized")
        ASTPrinter.from(graph2, graphNumber = 2, "SimpleV2.5/G2_Generalized")
        ASTPrinter.from(commonGraph, "SimpleV2.5/Generalized")

        graph1.visualize("SimpleV2.5/G1_generalized", commonGraph)
        graph2.visualize("SimpleV2.5/G2_generalized", commonGraph)
        commonGraph.visualize("SimpleV2.5/Generalization")
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {
        graph1Diff.visualize("SimpleV2.5/G1_Diff")
    }
    override fun checkGraph2Diff(graph2Diff: Graph) {
        graph2Diff.visualize("SimpleV2.5/G2_Diff")
    }
}