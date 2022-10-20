package ca.ucalgary.cs.comparison.ast

import ca.ucalgary.cs.comparison.BaseCompareGraphTest
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.graph.Node
import ca.ucalgary.cs.io.visualize

class AST2 : BaseCompareGraphTest() {
    override fun initializeGraphs() {
        val wzg2 = Node("program")
        val jbh7 = Node("class_declaration", isDuplicate = true)
        val znx6 = Node("class", isDuplicate = true)
        val ptz0 = Node("identifier", isDuplicate = true)
        val svq5 = Node("Animal")
        val msq1 = Node("class_body", isDuplicate = true)
        val ulh3 = Node("{", isDuplicate = true)
        val nvn8 = Node("method_declaration", isDuplicate = true)
        val ubp7 = Node("modifiers", isDuplicate = true)
        val iaq5 = Node("public", isDuplicate = true)
        val gjt1 = Node("void_type", isDuplicate = true)
        val rql2 = Node("identifier", isDuplicate = true)
        val etd4 = Node("animalSound", isDuplicate = true)
        val xck1 = Node("formal_parameters", isDuplicate = true)
        val wee4 = Node("(", isDuplicate = true)
        val efk0 = Node(")", isDuplicate = true)
        val pgt1 = Node("block", isDuplicate = true)
        val twu4 = Node("{", isDuplicate = true)
        val obi2 = Node("expression_statement", isDuplicate = true)
        val kgz8 = Node("method_invocation", isDuplicate = true)
        val efd1 = Node("field_access")
        val mze1 = Node("identifier", isDuplicate = true)
        val har7 = Node("System")
        val xxz3 = Node(".", isDuplicate = true)
        val gst8 = Node("identifier", isDuplicate = true)
        val mbp8 = Node("out")
        val sxr4 = Node(".", isDuplicate = true)
        val qum3 = Node("identifier", isDuplicate = true)
        val lsw5 = Node("println")
        val wxk0 = Node("argument_list", isDuplicate = true)
        val sgb1 = Node("(", isDuplicate = true)
        val osi5 = Node("string_literal")
        val ith7 = Node("\"The animal makes a sound\"")
        val vty1 = Node(")", isDuplicate = true)
        val pow9 = Node(";", isDuplicate = true)
        val gou7 = Node("}", isDuplicate = true)
        val uvu0 = Node("}", isDuplicate = true)
        val tfd3 = Node("class_declaration", isDuplicate = true)
        val xdb2 = Node("class", isDuplicate = true)
        val nkm3 = Node("identifier", isDuplicate = true)
        val gal3 = Node("Main")
        val wyc3 = Node("class_body", isDuplicate = true)
        val nnn9 = Node("{", isDuplicate = true)
        val cqi0 = Node("method_declaration", isDuplicate = true)
        val plh7 = Node("modifiers", isDuplicate = true)
        val cqu5 = Node("public", isDuplicate = true)
        val ufy9 = Node("static")
        val qep3 = Node("void_type", isDuplicate = true)
        val ero3 = Node("identifier", isDuplicate = true)
        val ndx8 = Node("main")
        val ixz4 = Node("formal_parameters", isDuplicate = true)
        val yvm6 = Node("(", isDuplicate = true)
        val gjn0 = Node("formal_parameter")
        val jhl1 = Node("array_type")
        val brm2 = Node("type_identifier", isDuplicate = true)
        val tsl1 = Node("dimensions")
        val sus3 = Node("[")
        val pqe0 = Node("]")
        val drz9 = Node("identifier", isDuplicate = true)
        val mcl5 = Node("args")
        val bkn5 = Node(")", isDuplicate = true)
        val wdm0 = Node("block", isDuplicate = true)
        val qjq7 = Node("{", isDuplicate = true)
        val xcf6 = Node("local_variable_declaration", isDuplicate = true)
        val urz9 = Node("type_identifier", isDuplicate = true)
        val joy6 = Node("variable_declarator", isDuplicate = true)
        val qtd3 = Node("identifier", isDuplicate = true)
        val kie3 = Node("myAnimal", isDuplicate = true)
        val hzp0 = Node("=", isDuplicate = true)
        val vxt8 = Node("object_creation_expression", isDuplicate = true)
        val sdd8 = Node("new", isDuplicate = true)
        val biq8 = Node("type_identifier", isDuplicate = true)
        val pax9 = Node("argument_list", isDuplicate = true)
        val bcq7 = Node("(", isDuplicate = true)
        val wbb7 = Node(")", isDuplicate = true)
        val dnj7 = Node(";", isDuplicate = true)
        val pkp6 = Node("line_comment", isDuplicate = true)
        val zle1 = Node("local_variable_declaration", isDuplicate = true)
        val nyl1 = Node("type_identifier", isDuplicate = true)
        val hkv0 = Node("variable_declarator", isDuplicate = true)
        val voc0 = Node("identifier", isDuplicate = true)
        val une2 = Node("myDog", isDuplicate = true)
        val koo5 = Node("=", isDuplicate = true)
        val bvv5 = Node("object_creation_expression", isDuplicate = true)
        val ybj5 = Node("new", isDuplicate = true)
        val jlp1 = Node("type_identifier", isDuplicate = true)
        val kun2 = Node("argument_list", isDuplicate = true)
        val mak7 = Node("(", isDuplicate = true)
        val aom3 = Node(")", isDuplicate = true)
        val zdq3 = Node(";", isDuplicate = true)
        val mom0 = Node("line_comment", isDuplicate = true)
        val yaj1 = Node("expression_statement", isDuplicate = true)
        val axc5 = Node("method_invocation", isDuplicate = true)
        val tmi0 = Node("identifier", isDuplicate = true)
        val cie1 = Node("myAnimal", isDuplicate = true)
        val uzp0 = Node(".", isDuplicate = true)
        val nwv8 = Node("identifier", isDuplicate = true)
        val jef1 = Node("animalSound", isDuplicate = true)
        val wvr5 = Node("argument_list", isDuplicate = true)
        val hca2 = Node("(", isDuplicate = true)
        val hpz8 = Node(")", isDuplicate = true)
        val sjh4 = Node(";", isDuplicate = true)
        val axx5 = Node("expression_statement", isDuplicate = true)
        val dhu4 = Node("method_invocation", isDuplicate = true)
        val xft5 = Node("identifier", isDuplicate = true)
        val lff2 = Node("myDog", isDuplicate = true)
        val ulw8 = Node(".", isDuplicate = true)
        val mxq6 = Node("identifier", isDuplicate = true)
        val iju1 = Node("animalSound", isDuplicate = true)
        val zms9 = Node("argument_list", isDuplicate = true)
        val zps7 = Node("(", isDuplicate = true)
        val ler7 = Node(")", isDuplicate = true)
        val kqv7 = Node(";", isDuplicate = true)
        val fjg9 = Node("}", isDuplicate = true)
        val qio5 = Node("}", isDuplicate = true)

        graph1 = Graph.from(
            nodes = listOf(wzg2, jbh7, znx6, ptz0, svq5, msq1, ulh3, nvn8, ubp7, iaq5, gjt1, rql2, etd4, xck1, wee4, efk0, pgt1, twu4, obi2, kgz8, efd1, mze1, har7, xxz3, gst8, mbp8, sxr4, qum3, lsw5, wxk0, sgb1, osi5, ith7, vty1, pow9, gou7, uvu0, tfd3, xdb2, nkm3, gal3, wyc3, nnn9, cqi0, plh7, cqu5, ufy9, qep3, ero3, ndx8, ixz4, yvm6, gjn0, jhl1, brm2, tsl1, sus3, pqe0, drz9, mcl5, bkn5, wdm0, qjq7, xcf6, urz9, joy6, qtd3, kie3, hzp0, vxt8, sdd8, biq8, pax9, bcq7, wbb7, dnj7, pkp6, zle1, nyl1, hkv0, voc0, une2, koo5, bvv5, ybj5, jlp1, kun2, mak7, aom3, zdq3, mom0, yaj1, axc5, tmi0, cie1, uzp0, nwv8, jef1, wvr5, hca2, hpz8, sjh4, axx5, dhu4, xft5, lff2, ulw8, mxq6, iju1, zms9, zps7, ler7, kqv7, fjg9, qio5),
            edges = mapOf(
                wzg2 to listOf(jbh7, tfd3),
                jbh7 to listOf(znx6, ptz0, msq1),
                ptz0 to listOf(svq5),
                msq1 to listOf(ulh3, nvn8, uvu0),
                nvn8 to listOf(ubp7, gjt1, rql2, xck1, pgt1),
                ubp7 to listOf(iaq5),
                rql2 to listOf(etd4),
                xck1 to listOf(wee4, efk0),
                pgt1 to listOf(twu4, obi2, gou7),
                obi2 to listOf(kgz8, pow9),
                kgz8 to listOf(efd1, sxr4, qum3, wxk0),
                efd1 to listOf(mze1, xxz3, gst8),
                mze1 to listOf(har7),
                gst8 to listOf(mbp8),
                qum3 to listOf(lsw5),
                wxk0 to listOf(sgb1, osi5, vty1),
                osi5 to listOf(ith7),
                tfd3 to listOf(xdb2, nkm3, wyc3),
                nkm3 to listOf(gal3),
                wyc3 to listOf(nnn9, cqi0, qio5),
                cqi0 to listOf(plh7, qep3, ero3, ixz4, wdm0),
                plh7 to listOf(cqu5, ufy9),
                ero3 to listOf(ndx8),
                ixz4 to listOf(yvm6, gjn0, bkn5),
                gjn0 to listOf(jhl1, drz9),
                jhl1 to listOf(brm2, tsl1),
                tsl1 to listOf(sus3, pqe0),
                drz9 to listOf(mcl5),
                wdm0 to listOf(qjq7, xcf6, pkp6, zle1, mom0, yaj1, axx5, fjg9),
                xcf6 to listOf(urz9, joy6, dnj7),
                joy6 to listOf(qtd3, hzp0, vxt8),
                qtd3 to listOf(kie3),
                vxt8 to listOf(sdd8, biq8, pax9),
                pax9 to listOf(bcq7, wbb7),
                zle1 to listOf(nyl1, hkv0, zdq3),
                hkv0 to listOf(voc0, koo5, bvv5),
                voc0 to listOf(une2),
                bvv5 to listOf(ybj5, jlp1, kun2),
                kun2 to listOf(mak7, aom3),
                yaj1 to listOf(axc5, sjh4),
                axc5 to listOf(tmi0, uzp0, nwv8, wvr5),
                tmi0 to listOf(cie1),
                nwv8 to listOf(jef1),
                wvr5 to listOf(hca2, hpz8),
                axx5 to listOf(dhu4, kqv7),
                dhu4 to listOf(xft5, ulw8, mxq6, zms9),
                xft5 to listOf(lff2),
                mxq6 to listOf(iju1),
                zms9 to listOf(zps7, ler7),
            )
        )

        val nxr7 = Node("program")
        val npc4 = Node("class_declaration", isDuplicate = true)
        val osh4 = Node("class", isDuplicate = true)
        val hkv3 = Node("identifier", isDuplicate = true)
        val cfa7 = Node("Animal")
        val cet1 = Node("class_body", isDuplicate = true)
        val qfp5 = Node("{", isDuplicate = true)
        val stm8 = Node("method_declaration", isDuplicate = true)
        val xxi9 = Node("modifiers", isDuplicate = true)
        val brr1 = Node("public", isDuplicate = true)
        val ala4 = Node("void_type", isDuplicate = true)
        val dyv1 = Node("identifier", isDuplicate = true)
        val hdy2 = Node("animalSound", isDuplicate = true)
        val ymi3 = Node("formal_parameters", isDuplicate = true)
        val wly2 = Node("(", isDuplicate = true)
        val zlm8 = Node(")", isDuplicate = true)
        val wjo8 = Node("block", isDuplicate = true)
        val jsh1 = Node("{", isDuplicate = true)
        val neo6 = Node("expression_statement", isDuplicate = true)
        val syy5 = Node("method_invocation", isDuplicate = true)
        val izr8 = Node("field_access")
        val hep4 = Node("identifier", isDuplicate = true)
        val dpu0 = Node("System")
        val etz4 = Node(".", isDuplicate = true)
        val cwi2 = Node("identifier", isDuplicate = true)
        val kft4 = Node("out")
        val xlk4 = Node(".", isDuplicate = true)
        val bvw9 = Node("identifier", isDuplicate = true)
        val sdc9 = Node("println")
        val icb2 = Node("argument_list", isDuplicate = true)
        val ara2 = Node("(", isDuplicate = true)
        val mhd7 = Node("string_literal")
        val gxb7 = Node("\"That animal makes a sound\"")
        val jjt4 = Node(")", isDuplicate = true)
        val hfv7 = Node(";", isDuplicate = true)
        val kdm0 = Node("}", isDuplicate = true)
        val pda0 = Node("method_declaration", isDuplicate = true)
        val nru7 = Node("modifiers", isDuplicate = true)
        val rqx1 = Node("public", isDuplicate = true)
        val suj3 = Node("integral_type", isDuplicate = true)
        val kep9 = Node("int", isDuplicate = true)
        val jhl4 = Node("identifier", isDuplicate = true)
        val ljh9 = Node("hello")
        val eye4 = Node("formal_parameters", isDuplicate = true)
        val rxh7 = Node("(", isDuplicate = true)
        val xnu7 = Node(")", isDuplicate = true)
        val xme0 = Node("block", isDuplicate = true)
        val zvg5 = Node("{", isDuplicate = true)
        val yws6 = Node("local_variable_declaration", isDuplicate = true)
        val qyd6 = Node("integral_type", isDuplicate = true)
        val xfw5 = Node("int", isDuplicate = true)
        val mnl4 = Node("variable_declarator", isDuplicate = true)
        val wop1 = Node("identifier", isDuplicate = true)
        val rgn6 = Node("a", isDuplicate = true)
        val xac3 = Node("=", isDuplicate = true)
        val yzy3 = Node("decimal_integer_literal")
        val plh4 = Node("1")
        val jcm6 = Node(";", isDuplicate = true)
        val qjb0 = Node("return_statement")
        val hom7 = Node("return")
        val okd7 = Node("update_expression")
        val okk8 = Node("identifier", isDuplicate = true)
        val bbc7 = Node("a", isDuplicate = true)
        val ylk5 = Node("++")
        val mgx5 = Node(";", isDuplicate = true)
        val dqf3 = Node("}", isDuplicate = true)
        val sqo2 = Node("}", isDuplicate = true)
        val eyc0 = Node("class_declaration", isDuplicate = true)
        val aiq6 = Node("class", isDuplicate = true)
        val uiv2 = Node("identifier", isDuplicate = true)
        val bnv5 = Node("Main")
        val bhm1 = Node("class_body", isDuplicate = true)
        val dbp7 = Node("{", isDuplicate = true)
        val rxu5 = Node("method_declaration", isDuplicate = true)
        val ewv4 = Node("modifiers", isDuplicate = true)
        val ffx5 = Node("public", isDuplicate = true)
        val gmm4 = Node("static")
        val xvk7 = Node("void_type", isDuplicate = true)
        val esk2 = Node("identifier", isDuplicate = true)
        val jde7 = Node("main")
        val kaj5 = Node("formal_parameters", isDuplicate = true)
        val pys9 = Node("(", isDuplicate = true)
        val kze1 = Node("formal_parameter")
        val mpn4 = Node("array_type")
        val qmk1 = Node("type_identifier", isDuplicate = true)
        val qza8 = Node("dimensions")
        val oso1 = Node("[")
        val oja8 = Node("]")
        val isf8 = Node("identifier", isDuplicate = true)
        val qwf3 = Node("args")
        val qpk1 = Node(")", isDuplicate = true)
        val uwt2 = Node("block", isDuplicate = true)
        val kny3 = Node("{", isDuplicate = true)
        val fli0 = Node("local_variable_declaration", isDuplicate = true)
        val hvt5 = Node("type_identifier", isDuplicate = true)
        val efj5 = Node("variable_declarator", isDuplicate = true)
        val jta0 = Node("identifier", isDuplicate = true)
        val lgz7 = Node("myAnimal", isDuplicate = true)
        val ood1 = Node("=", isDuplicate = true)
        val bwp4 = Node("object_creation_expression", isDuplicate = true)
        val djz9 = Node("new", isDuplicate = true)
        val ecn0 = Node("type_identifier", isDuplicate = true)
        val yyn3 = Node("argument_list", isDuplicate = true)
        val xdw2 = Node("(", isDuplicate = true)
        val vxn0 = Node(")", isDuplicate = true)
        val xaw4 = Node(";", isDuplicate = true)
        val vap1 = Node("line_comment", isDuplicate = true)
        val fns7 = Node("local_variable_declaration", isDuplicate = true)
        val rns7 = Node("type_identifier", isDuplicate = true)
        val hne1 = Node("variable_declarator", isDuplicate = true)
        val boe7 = Node("identifier", isDuplicate = true)
        val dyr7 = Node("myDog", isDuplicate = true)
        val beg0 = Node("=", isDuplicate = true)
        val gjr9 = Node("object_creation_expression", isDuplicate = true)
        val lfo0 = Node("new", isDuplicate = true)
        val yjj5 = Node("type_identifier", isDuplicate = true)
        val poc3 = Node("argument_list", isDuplicate = true)
        val pbv3 = Node("(", isDuplicate = true)
        val haw3 = Node(")", isDuplicate = true)
        val qna9 = Node(";", isDuplicate = true)
        val ojt2 = Node("line_comment", isDuplicate = true)
        val ycu4 = Node("expression_statement", isDuplicate = true)
        val tbv6 = Node("method_invocation", isDuplicate = true)
        val yeg4 = Node("identifier", isDuplicate = true)
        val juq7 = Node("myAnimal", isDuplicate = true)
        val oop6 = Node(".", isDuplicate = true)
        val ebo3 = Node("identifier", isDuplicate = true)
        val zsf2 = Node("animalSound", isDuplicate = true)
        val bzh3 = Node("argument_list", isDuplicate = true)
        val dfw2 = Node("(", isDuplicate = true)
        val qwr3 = Node(")", isDuplicate = true)
        val mgk4 = Node(";", isDuplicate = true)
        val svl2 = Node("expression_statement", isDuplicate = true)
        val xjb5 = Node("method_invocation", isDuplicate = true)
        val vfw2 = Node("identifier", isDuplicate = true)
        val ewb3 = Node("myDog", isDuplicate = true)
        val vme1 = Node(".", isDuplicate = true)
        val woe2 = Node("identifier", isDuplicate = true)
        val pqq2 = Node("animalSound", isDuplicate = true)
        val pts6 = Node("argument_list", isDuplicate = true)
        val hvl1 = Node("(", isDuplicate = true)
        val njd2 = Node(")", isDuplicate = true)
        val vax8 = Node(";", isDuplicate = true)
        val lqp6 = Node("}", isDuplicate = true)
        val fnd5 = Node("}", isDuplicate = true)

        graph2 = Graph.from(
            nodes = listOf(nxr7, npc4, osh4, hkv3, cfa7, cet1, qfp5, stm8, xxi9, brr1, ala4, dyv1, hdy2, ymi3, wly2, zlm8, wjo8, jsh1, neo6, syy5, izr8, hep4, dpu0, etz4, cwi2, kft4, xlk4, bvw9, sdc9, icb2, ara2, mhd7, gxb7, jjt4, hfv7, kdm0, pda0, nru7, rqx1, suj3, kep9, jhl4, ljh9, eye4, rxh7, xnu7, xme0, zvg5, yws6, qyd6, xfw5, mnl4, wop1, rgn6, xac3, yzy3, plh4, jcm6, qjb0, hom7, okd7, okk8, bbc7, ylk5, mgx5, dqf3, sqo2, eyc0, aiq6, uiv2, bnv5, bhm1, dbp7, rxu5, ewv4, ffx5, gmm4, xvk7, esk2, jde7, kaj5, pys9, kze1, mpn4, qmk1, qza8, oso1, oja8, isf8, qwf3, qpk1, uwt2, kny3, fli0, hvt5, efj5, jta0, lgz7, ood1, bwp4, djz9, ecn0, yyn3, xdw2, vxn0, xaw4, vap1, fns7, rns7, hne1, boe7, dyr7, beg0, gjr9, lfo0, yjj5, poc3, pbv3, haw3, qna9, ojt2, ycu4, tbv6, yeg4, juq7, oop6, ebo3, zsf2, bzh3, dfw2, qwr3, mgk4, svl2, xjb5, vfw2, ewb3, vme1, woe2, pqq2, pts6, hvl1, njd2, vax8, lqp6, fnd5),
            edges = mapOf(
                nxr7 to listOf(npc4, eyc0),
                npc4 to listOf(osh4, hkv3, cet1),
                hkv3 to listOf(cfa7),
                cet1 to listOf(qfp5, stm8, pda0, sqo2),
                stm8 to listOf(xxi9, ala4, dyv1, ymi3, wjo8),
                xxi9 to listOf(brr1),
                dyv1 to listOf(hdy2),
                ymi3 to listOf(wly2, zlm8),
                wjo8 to listOf(jsh1, neo6, kdm0),
                neo6 to listOf(syy5, hfv7),
                syy5 to listOf(izr8, xlk4, bvw9, icb2),
                izr8 to listOf(hep4, etz4, cwi2),
                hep4 to listOf(dpu0),
                cwi2 to listOf(kft4),
                bvw9 to listOf(sdc9),
                icb2 to listOf(ara2, mhd7, jjt4),
                mhd7 to listOf(gxb7),
                pda0 to listOf(nru7, suj3, jhl4, eye4, xme0),
                nru7 to listOf(rqx1),
                suj3 to listOf(kep9),
                jhl4 to listOf(ljh9),
                eye4 to listOf(rxh7, xnu7),
                xme0 to listOf(zvg5, yws6, qjb0, dqf3),
                yws6 to listOf(qyd6, mnl4, jcm6),
                qyd6 to listOf(xfw5),
                mnl4 to listOf(wop1, xac3, yzy3),
                wop1 to listOf(rgn6),
                yzy3 to listOf(plh4),
                qjb0 to listOf(hom7, okd7, mgx5),
                okd7 to listOf(okk8, ylk5),
                okk8 to listOf(bbc7),
                eyc0 to listOf(aiq6, uiv2, bhm1),
                uiv2 to listOf(bnv5),
                bhm1 to listOf(dbp7, rxu5, fnd5),
                rxu5 to listOf(ewv4, xvk7, esk2, kaj5, uwt2),
                ewv4 to listOf(ffx5, gmm4),
                esk2 to listOf(jde7),
                kaj5 to listOf(pys9, kze1, qpk1),
                kze1 to listOf(mpn4, isf8),
                mpn4 to listOf(qmk1, qza8),
                qza8 to listOf(oso1, oja8),
                isf8 to listOf(qwf3),
                uwt2 to listOf(kny3, fli0, vap1, fns7, ojt2, ycu4, svl2, lqp6),
                fli0 to listOf(hvt5, efj5, xaw4),
                efj5 to listOf(jta0, ood1, bwp4),
                jta0 to listOf(lgz7),
                bwp4 to listOf(djz9, ecn0, yyn3),
                yyn3 to listOf(xdw2, vxn0),
                fns7 to listOf(rns7, hne1, qna9),
                hne1 to listOf(boe7, beg0, gjr9),
                boe7 to listOf(dyr7),
                gjr9 to listOf(lfo0, yjj5, poc3),
                poc3 to listOf(pbv3, haw3),
                ycu4 to listOf(tbv6, mgk4),
                tbv6 to listOf(yeg4, oop6, ebo3, bzh3),
                yeg4 to listOf(juq7),
                ebo3 to listOf(zsf2),
                bzh3 to listOf(dfw2, qwr3),
                svl2 to listOf(xjb5, vax8),
                xjb5 to listOf(vfw2, vme1, woe2, pts6),
                vfw2 to listOf(ewb3),
                woe2 to listOf(pqq2),
                pts6 to listOf(hvl1, njd2),
            )
        )

        graph1.visualize("SimpleV1/G1")
        graph2.visualize("SimpleV1/G2")
    }

    override fun checkCommonGraph(commonGraph: Graph) {
        graph1.visualize("SimpleV1/G1_generalized")
        graph2.visualize("SimpleV1/G2_generalized")
        commonGraph.visualize("SimpleV1/Generalization")
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {
        graph1Diff.visualize("SimpleV1/G1_Diff")
    }
    override fun checkGraph2Diff(graph2Diff: Graph) {
        graph2Diff.visualize("SimpleV1/G2_Diff")
    }
}