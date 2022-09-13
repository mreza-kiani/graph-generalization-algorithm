package ca.ucalgary.cs.comparison.ast

import ca.ucalgary.cs.comparison.BaseCompareGraphTest
import ca.ucalgary.cs.graph.Edge
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.graph.Node
import ca.ucalgary.cs.io.visualize

class RealExample: BaseCompareGraphTest() {
    override fun initializeGraphs() {
        val qxp9 = Node("program")
        val jwd3 = Node("class_declaration", isDuplicate = true)
        val bre9 = Node("class", isDuplicate = true)
        val gpy3 = Node("identifier", isDuplicate = true)
        val das0 = Node("Animal")
        val tlq1 = Node("class_body", isDuplicate = true)
        val qnu7 = Node("{", isDuplicate = true)
        val jlx5 = Node("method_declaration", isDuplicate = true)
        val oor7 = Node("modifiers", isDuplicate = true)
        val idu2 = Node("public", isDuplicate = true)
        val ntj8 = Node("void_type", isDuplicate = true)
        val mto6 = Node("identifier", isDuplicate = true)
        val spn1 = Node("animalSound", isDuplicate = true)
        val iyj7 = Node("formal_parameters", isDuplicate = true)
        val obl8 = Node("(", isDuplicate = true)
        val gwt2 = Node(")", isDuplicate = true)
        val wam5 = Node("block", isDuplicate = true)
        val uah7 = Node("{", isDuplicate = true)
        val yes6 = Node("expression_statement", isDuplicate = true)
        val lni3 = Node("method_invocation", isDuplicate = true)
        val gty7 = Node("field_access", isDuplicate = true)
        val ipl2 = Node("identifier", isDuplicate = true)
        val dgl5 = Node("System", isDuplicate = true)
        val pto4 = Node(".", isDuplicate = true)
        val ehg6 = Node("identifier", isDuplicate = true)
        val qef2 = Node("out", isDuplicate = true)
        val pog5 = Node(".", isDuplicate = true)
        val chl4 = Node("identifier", isDuplicate = true)
        val olm8 = Node("println", isDuplicate = true)
        val dgg7 = Node("argument_list", isDuplicate = true)
        val ins9 = Node("(", isDuplicate = true)
        val moj1 = Node("string_literal", isDuplicate = true)
        val eyl3 = Node("The animal makes a sound")
        val azw9 = Node(")", isDuplicate = true)
        val bla2 = Node(";", isDuplicate = true)
        val vto5 = Node("}", isDuplicate = true)
        val wqp0 = Node("}", isDuplicate = true)
        val pbr4 = Node("class_declaration", isDuplicate = true)
        val bro2 = Node("class", isDuplicate = true)
        val zbn2 = Node("identifier", isDuplicate = true)
        val fpy0 = Node("Pig")
        val osy2 = Node("superclass", isDuplicate = true)
        val aww8 = Node("extends", isDuplicate = true)
        val xyt7 = Node("type_identifier", isDuplicate = true)
        val jgo6 = Node("class_body", isDuplicate = true)
        val mle1 = Node("{", isDuplicate = true)
        val dyv8 = Node("method_declaration", isDuplicate = true)
        val yin4 = Node("modifiers", isDuplicate = true)
        val krx9 = Node("public", isDuplicate = true)
        val nzz8 = Node("void_type", isDuplicate = true)
        val csq8 = Node("identifier", isDuplicate = true)
        val zoj7 = Node("animalSound", isDuplicate = true)
        val vca2 = Node("formal_parameters", isDuplicate = true)
        val emd4 = Node("(", isDuplicate = true)
        val rlg2 = Node(")", isDuplicate = true)
        val mxs3 = Node("block", isDuplicate = true)
        val caq6 = Node("{", isDuplicate = true)
        val zwo7 = Node("expression_statement", isDuplicate = true)
        val isj4 = Node("method_invocation", isDuplicate = true)
        val juh8 = Node("field_access", isDuplicate = true)
        val djf3 = Node("identifier", isDuplicate = true)
        val wfy9 = Node("System", isDuplicate = true)
        val qdq9 = Node(".", isDuplicate = true)
        val fyl2 = Node("identifier", isDuplicate = true)
        val abn4 = Node("out", isDuplicate = true)
        val aaj7 = Node(".", isDuplicate = true)
        val qwl5 = Node("identifier", isDuplicate = true)
        val suq7 = Node("println", isDuplicate = true)
        val ohb4 = Node("argument_list", isDuplicate = true)
        val nod4 = Node("(", isDuplicate = true)
        val joa5 = Node("string_literal", isDuplicate = true)
        val who6 = Node("The pig says: wee wee")
        val lgn3 = Node(")", isDuplicate = true)
        val swv0 = Node(";", isDuplicate = true)
        val wbz7 = Node("}", isDuplicate = true)
        val ymm9 = Node("}", isDuplicate = true)
        val eey7 = Node("class_declaration", isDuplicate = true)
        val pew7 = Node("class", isDuplicate = true)
        val zeo1 = Node("identifier", isDuplicate = true)
        val iuw4 = Node("Dog")
        val oyy0 = Node("superclass", isDuplicate = true)
        val jvz6 = Node("extends", isDuplicate = true)
        val vqx6 = Node("type_identifier", isDuplicate = true)
        val npj5 = Node("class_body", isDuplicate = true)
        val rzn2 = Node("{", isDuplicate = true)
        val jnr9 = Node("method_declaration", isDuplicate = true)
        val jho4 = Node("modifiers", isDuplicate = true)
        val hnl5 = Node("public", isDuplicate = true)
        val hhq5 = Node("void_type", isDuplicate = true)
        val mme1 = Node("identifier", isDuplicate = true)
        val ltr3 = Node("animalSound", isDuplicate = true)
        val bfn2 = Node("formal_parameters", isDuplicate = true)
        val frn1 = Node("(", isDuplicate = true)
        val wej5 = Node(")", isDuplicate = true)
        val ywe9 = Node("block", isDuplicate = true)
        val acn7 = Node("{", isDuplicate = true)
        val lku2 = Node("expression_statement", isDuplicate = true)
        val lid8 = Node("method_invocation", isDuplicate = true)
        val flq7 = Node("field_access", isDuplicate = true)
        val cwt3 = Node("identifier", isDuplicate = true)
        val npe7 = Node("System", isDuplicate = true)
        val fcz8 = Node(".", isDuplicate = true)
        val lvr3 = Node("identifier", isDuplicate = true)
        val yde8 = Node("out", isDuplicate = true)
        val cyb0 = Node(".", isDuplicate = true)
        val qtf7 = Node("identifier", isDuplicate = true)
        val clw4 = Node("println", isDuplicate = true)
        val ltb0 = Node("argument_list", isDuplicate = true)
        val tpc5 = Node("(", isDuplicate = true)
        val gqh5 = Node("string_literal", isDuplicate = true)
        val yoj3 = Node("The dog says: bow wow")
        val rwh0 = Node(")", isDuplicate = true)
        val xlk5 = Node(";", isDuplicate = true)
        val crf6 = Node("}", isDuplicate = true)
        val vkw0 = Node("}", isDuplicate = true)
        val lzy6 = Node("class_declaration", isDuplicate = true)
        val nri0 = Node("class", isDuplicate = true)
        val ird9 = Node("identifier", isDuplicate = true)
        val hdk3 = Node("Main")
        val yxr9 = Node("class_body", isDuplicate = true)
        val wzw7 = Node("{", isDuplicate = true)
        val ynd9 = Node("method_declaration", isDuplicate = true)
        val gju8 = Node("modifiers", isDuplicate = true)
        val izf6 = Node("public", isDuplicate = true)
        val tag7 = Node("static")
        val zbq3 = Node("void_type", isDuplicate = true)
        val jfw5 = Node("identifier", isDuplicate = true)
        val yvg9 = Node("main")
        val nxj0 = Node("formal_parameters", isDuplicate = true)
        val jej4 = Node("(", isDuplicate = true)
        val wze8 = Node("formal_parameter")
        val uqj2 = Node("array_type")
        val cuk2 = Node("type_identifier", isDuplicate = true)
        val moh5 = Node("dimensions")
        val oax6 = Node("[")
        val dvg0 = Node("]")
        val wkk7 = Node("identifier", isDuplicate = true)
        val unl8 = Node("args")
        val pfy6 = Node(")", isDuplicate = true)
        val ffd0 = Node("block", isDuplicate = true)
        val mmx0 = Node("{", isDuplicate = true)
        val vkv1 = Node("local_variable_declaration", isDuplicate = true)
        val gpt1 = Node("type_identifier", isDuplicate = true)
        val vca4 = Node("variable_declarator", isDuplicate = true)
        val vjr0 = Node("identifier", isDuplicate = true)
        val scu7 = Node("myAnimal", isDuplicate = true)
        val tja7 = Node("=", isDuplicate = true)
        val nfj0 = Node("object_creation_expression", isDuplicate = true)
        val wwe3 = Node("new", isDuplicate = true)
        val edu1 = Node("type_identifier", isDuplicate = true)
        val yxg1 = Node("argument_list", isDuplicate = true)
        val faq7 = Node("(", isDuplicate = true)
        val xfc9 = Node(")", isDuplicate = true)
        val vwe7 = Node(";", isDuplicate = true)
        val fpk4 = Node("line_comment", isDuplicate = true)
        val sjs4 = Node("local_variable_declaration", isDuplicate = true)
        val fah8 = Node("type_identifier", isDuplicate = true)
        val eit8 = Node("variable_declarator", isDuplicate = true)
        val wlj5 = Node("identifier", isDuplicate = true)
        val qal1 = Node("myPig", isDuplicate = true)
        val ryd0 = Node("=", isDuplicate = true)
        val jke6 = Node("object_creation_expression", isDuplicate = true)
        val vbn8 = Node("new", isDuplicate = true)
        val hjd6 = Node("type_identifier", isDuplicate = true)
        val mec8 = Node("argument_list", isDuplicate = true)
        val svy4 = Node("(", isDuplicate = true)
        val cuz9 = Node(")", isDuplicate = true)
        val otb8 = Node(";", isDuplicate = true)
        val fpi6 = Node("line_comment", isDuplicate = true)
        val dje8 = Node("local_variable_declaration", isDuplicate = true)
        val rfi0 = Node("type_identifier", isDuplicate = true)
        val bla3 = Node("variable_declarator", isDuplicate = true)
        val gua7 = Node("identifier", isDuplicate = true)
        val lmi3 = Node("myDog", isDuplicate = true)
        val atj9 = Node("=", isDuplicate = true)
        val yqs4 = Node("object_creation_expression", isDuplicate = true)
        val jgq8 = Node("new", isDuplicate = true)
        val ezl2 = Node("type_identifier", isDuplicate = true)
        val piw9 = Node("argument_list", isDuplicate = true)
        val giu8 = Node("(", isDuplicate = true)
        val mda6 = Node(")", isDuplicate = true)
        val umc4 = Node(";", isDuplicate = true)
        val miy9 = Node("line_comment", isDuplicate = true)
        val xah9 = Node("expression_statement", isDuplicate = true)
        val ulf5 = Node("method_invocation", isDuplicate = true)
        val ank8 = Node("identifier", isDuplicate = true)
        val pxb3 = Node("myAnimal", isDuplicate = true)
        val acw0 = Node(".", isDuplicate = true)
        val vmq4 = Node("identifier", isDuplicate = true)
        val yru4 = Node("animalSound", isDuplicate = true)
        val pvh0 = Node("argument_list", isDuplicate = true)
        val hnb4 = Node("(", isDuplicate = true)
        val tee6 = Node(")", isDuplicate = true)
        val fdj1 = Node(";", isDuplicate = true)
        val ies7 = Node("expression_statement", isDuplicate = true)
        val nlb9 = Node("method_invocation", isDuplicate = true)
        val wec4 = Node("identifier", isDuplicate = true)
        val acz6 = Node("myPig", isDuplicate = true)
        val pgj9 = Node(".", isDuplicate = true)
        val aan7 = Node("identifier", isDuplicate = true)
        val cqw5 = Node("animalSound", isDuplicate = true)
        val jxq2 = Node("argument_list", isDuplicate = true)
        val rvg9 = Node("(", isDuplicate = true)
        val syy9 = Node(")", isDuplicate = true)
        val aex2 = Node(";", isDuplicate = true)
        val wzz1 = Node("expression_statement", isDuplicate = true)
        val thr0 = Node("method_invocation", isDuplicate = true)
        val npt5 = Node("identifier", isDuplicate = true)
        val ted1 = Node("myDog", isDuplicate = true)
        val moc2 = Node(".", isDuplicate = true)
        val zfs8 = Node("identifier", isDuplicate = true)
        val hxe9 = Node("animalSound", isDuplicate = true)
        val cnk9 = Node("argument_list", isDuplicate = true)
        val lfh3 = Node("(", isDuplicate = true)
        val osq7 = Node(")", isDuplicate = true)
        val fhr4 = Node(";", isDuplicate = true)
        val dyj2 = Node("}", isDuplicate = true)
        val yui2 = Node("}", isDuplicate = true)

        graph1 = Graph.from(
            nodes = listOf(qxp9, jwd3, bre9, gpy3, das0, tlq1, qnu7, jlx5, oor7, idu2, ntj8, mto6, spn1, iyj7, obl8, gwt2, wam5, uah7, yes6, lni3, gty7, ipl2, dgl5, pto4, ehg6, qef2, pog5, chl4, olm8, dgg7, ins9, moj1, eyl3, azw9, bla2, vto5, wqp0, pbr4, bro2, zbn2, fpy0, osy2, aww8, xyt7, jgo6, mle1, dyv8, yin4, krx9, nzz8, csq8, zoj7, vca2, emd4, rlg2, mxs3, caq6, zwo7, isj4, juh8, djf3, wfy9, qdq9, fyl2, abn4, aaj7, qwl5, suq7, ohb4, nod4, joa5, who6, lgn3, swv0, wbz7, ymm9, eey7, pew7, zeo1, iuw4, oyy0, jvz6, vqx6, npj5, rzn2, jnr9, jho4, hnl5, hhq5, mme1, ltr3, bfn2, frn1, wej5, ywe9, acn7, lku2, lid8, flq7, cwt3, npe7, fcz8, lvr3, yde8, cyb0, qtf7, clw4, ltb0, tpc5, gqh5, yoj3, rwh0, xlk5, crf6, vkw0, lzy6, nri0, ird9, hdk3, yxr9, wzw7, ynd9, gju8, izf6, tag7, zbq3, jfw5, yvg9, nxj0, jej4, wze8, uqj2, cuk2, moh5, oax6, dvg0, wkk7, unl8, pfy6, ffd0, mmx0, vkv1, gpt1, vca4, vjr0, scu7, tja7, nfj0, wwe3, edu1, yxg1, faq7, xfc9, vwe7, fpk4, sjs4, fah8, eit8, wlj5, qal1, ryd0, jke6, vbn8, hjd6, mec8, svy4, cuz9, otb8, fpi6, dje8, rfi0, bla3, gua7, lmi3, atj9, yqs4, jgq8, ezl2, piw9, giu8, mda6, umc4, miy9, xah9, ulf5, ank8, pxb3, acw0, vmq4, yru4, pvh0, hnb4, tee6, fdj1, ies7, nlb9, wec4, acz6, pgj9, aan7, cqw5, jxq2, rvg9, syy9, aex2, wzz1, thr0, npt5, ted1, moc2, zfs8, hxe9, cnk9, lfh3, osq7, fhr4, dyj2, yui2),
            edges = mapOf(
                qxp9 to listOf(jwd3, pbr4, eey7, lzy6),
                jwd3 to listOf(bre9, gpy3, tlq1),
                gpy3 to listOf(das0),
                tlq1 to listOf(qnu7, jlx5, wqp0),
                jlx5 to listOf(oor7, ntj8, mto6, iyj7, wam5),
                oor7 to listOf(idu2),
                mto6 to listOf(spn1),
                iyj7 to listOf(obl8, gwt2),
                wam5 to listOf(uah7, yes6, vto5),
                yes6 to listOf(lni3, bla2),
                lni3 to listOf(gty7, pog5, chl4, dgg7),
                gty7 to listOf(ipl2, pto4, ehg6),
                ipl2 to listOf(dgl5),
                ehg6 to listOf(qef2),
                chl4 to listOf(olm8),
                dgg7 to listOf(ins9, moj1, azw9),
                moj1 to listOf(eyl3),
                pbr4 to listOf(bro2, zbn2, osy2, jgo6),
                zbn2 to listOf(fpy0),
                osy2 to listOf(aww8, xyt7),
                jgo6 to listOf(mle1, dyv8, ymm9),
                dyv8 to listOf(yin4, nzz8, csq8, vca2, mxs3),
                yin4 to listOf(krx9),
                csq8 to listOf(zoj7),
                vca2 to listOf(emd4, rlg2),
                mxs3 to listOf(caq6, zwo7, wbz7),
                zwo7 to listOf(isj4, swv0),
                isj4 to listOf(juh8, aaj7, qwl5, ohb4),
                juh8 to listOf(djf3, qdq9, fyl2),
                djf3 to listOf(wfy9),
                fyl2 to listOf(abn4),
                qwl5 to listOf(suq7),
                ohb4 to listOf(nod4, joa5, lgn3),
                joa5 to listOf(who6),
                eey7 to listOf(pew7, zeo1, oyy0, npj5),
                zeo1 to listOf(iuw4),
                oyy0 to listOf(jvz6, vqx6),
                npj5 to listOf(rzn2, jnr9, vkw0),
                jnr9 to listOf(jho4, hhq5, mme1, bfn2, ywe9),
                jho4 to listOf(hnl5),
                mme1 to listOf(ltr3),
                bfn2 to listOf(frn1, wej5),
                ywe9 to listOf(acn7, lku2, crf6),
                lku2 to listOf(lid8, xlk5),
                lid8 to listOf(flq7, cyb0, qtf7, ltb0),
                flq7 to listOf(cwt3, fcz8, lvr3),
                cwt3 to listOf(npe7),
                lvr3 to listOf(yde8),
                qtf7 to listOf(clw4),
                ltb0 to listOf(tpc5, gqh5, rwh0),
                gqh5 to listOf(yoj3),
                lzy6 to listOf(nri0, ird9, yxr9),
                ird9 to listOf(hdk3),
                yxr9 to listOf(wzw7, ynd9, yui2),
                ynd9 to listOf(gju8, zbq3, jfw5, nxj0, ffd0),
                gju8 to listOf(izf6, tag7),
                jfw5 to listOf(yvg9),
                nxj0 to listOf(jej4, wze8, pfy6),
                wze8 to listOf(uqj2, wkk7),
                uqj2 to listOf(cuk2, moh5),
                moh5 to listOf(oax6, dvg0),
                wkk7 to listOf(unl8),
                ffd0 to listOf(mmx0, vkv1, fpk4, sjs4, fpi6, dje8, miy9, xah9, ies7, wzz1, dyj2),
                vkv1 to listOf(gpt1, vca4, vwe7),
                vca4 to listOf(vjr0, tja7, nfj0),
                vjr0 to listOf(scu7),
                nfj0 to listOf(wwe3, edu1, yxg1),
                yxg1 to listOf(faq7, xfc9),
                sjs4 to listOf(fah8, eit8, otb8),
                eit8 to listOf(wlj5, ryd0, jke6),
                wlj5 to listOf(qal1),
                jke6 to listOf(vbn8, hjd6, mec8),
                mec8 to listOf(svy4, cuz9),
                dje8 to listOf(rfi0, bla3, umc4),
                bla3 to listOf(gua7, atj9, yqs4),
                gua7 to listOf(lmi3),
                yqs4 to listOf(jgq8, ezl2, piw9),
                piw9 to listOf(giu8, mda6),
                xah9 to listOf(ulf5, fdj1),
                ulf5 to listOf(ank8, acw0, vmq4, pvh0),
                ank8 to listOf(pxb3),
                vmq4 to listOf(yru4),
                pvh0 to listOf(hnb4, tee6),
                ies7 to listOf(nlb9, aex2),
                nlb9 to listOf(wec4, pgj9, aan7, jxq2),
                wec4 to listOf(acz6),
                aan7 to listOf(cqw5),
                jxq2 to listOf(rvg9, syy9),
                wzz1 to listOf(thr0, fhr4),
                thr0 to listOf(npt5, moc2, zfs8, cnk9),
                npt5 to listOf(ted1),
                zfs8 to listOf(hxe9),
                cnk9 to listOf(lfh3, osq7),
            )
        )

        val bnn8 = Node("program")
        val btl7 = Node("class_declaration", isDuplicate = true)
        val sgb5 = Node("class", isDuplicate = true)
        val cox9 = Node("identifier", isDuplicate = true)
        val nnl9 = Node("Animal")
        val qjv2 = Node("class_body", isDuplicate = true)
        val sjt8 = Node("{", isDuplicate = true)
        val mxx5 = Node("method_declaration", isDuplicate = true)
        val crj6 = Node("modifiers", isDuplicate = true)
        val qoa2 = Node("public", isDuplicate = true)
        val agx2 = Node("void_type", isDuplicate = true)
        val iei2 = Node("identifier", isDuplicate = true)
        val exr6 = Node("animalSound", isDuplicate = true)
        val ios0 = Node("formal_parameters", isDuplicate = true)
        val lah2 = Node("(", isDuplicate = true)
        val sgs5 = Node(")", isDuplicate = true)
        val zzu1 = Node("block", isDuplicate = true)
        val ppt1 = Node("{", isDuplicate = true)
        val blm3 = Node("expression_statement", isDuplicate = true)
        val lcw5 = Node("method_invocation", isDuplicate = true)
        val oha6 = Node("field_access", isDuplicate = true)
        val pkl2 = Node("identifier", isDuplicate = true)
        val lqc4 = Node("System", isDuplicate = true)
        val lkm3 = Node(".", isDuplicate = true)
        val ygt1 = Node("identifier", isDuplicate = true)
        val njb2 = Node("out", isDuplicate = true)
        val mrb0 = Node(".", isDuplicate = true)
        val ber7 = Node("identifier", isDuplicate = true)
        val pub0 = Node("println", isDuplicate = true)
        val vhj7 = Node("argument_list", isDuplicate = true)
        val tvy2 = Node("(", isDuplicate = true)
        val mjn0 = Node("string_literal", isDuplicate = true)
        val cra1 = Node("The animal makes a sound")
        val mia5 = Node(")", isDuplicate = true)
        val itf4 = Node(";", isDuplicate = true)
        val rfg8 = Node("}", isDuplicate = true)
        val cpr9 = Node("}", isDuplicate = true)
        val tzx9 = Node("class_declaration", isDuplicate = true)
        val jty4 = Node("class", isDuplicate = true)
        val ruh6 = Node("identifier", isDuplicate = true)
        val gwn0 = Node("Dog")
        val pfa6 = Node("superclass")
        val ldq3 = Node("extends")
        val nfo9 = Node("type_identifier", isDuplicate = true)
        val ocy4 = Node("class_body", isDuplicate = true)
        val twk2 = Node("{", isDuplicate = true)
        val gby5 = Node("method_declaration", isDuplicate = true)
        val bxr6 = Node("modifiers", isDuplicate = true)
        val ezt9 = Node("public", isDuplicate = true)
        val tbs4 = Node("void_type", isDuplicate = true)
        val scq0 = Node("identifier", isDuplicate = true)
        val rsm4 = Node("animalSound", isDuplicate = true)
        val igi2 = Node("formal_parameters", isDuplicate = true)
        val mcb0 = Node("(", isDuplicate = true)
        val drd1 = Node(")", isDuplicate = true)
        val kfe8 = Node("block", isDuplicate = true)
        val kzl9 = Node("{", isDuplicate = true)
        val zjn6 = Node("expression_statement", isDuplicate = true)
        val inl2 = Node("method_invocation", isDuplicate = true)
        val kpk2 = Node("field_access", isDuplicate = true)
        val nnq0 = Node("identifier", isDuplicate = true)
        val wwz4 = Node("System", isDuplicate = true)
        val bxt2 = Node(".", isDuplicate = true)
        val usc6 = Node("identifier", isDuplicate = true)
        val irg1 = Node("out", isDuplicate = true)
        val vou4 = Node(".", isDuplicate = true)
        val uox8 = Node("identifier", isDuplicate = true)
        val nns4 = Node("println", isDuplicate = true)
        val xev3 = Node("argument_list", isDuplicate = true)
        val axz0 = Node("(", isDuplicate = true)
        val qwl6 = Node("string_literal", isDuplicate = true)
        val kdg9 = Node("The dog says: bow wow")
        val tpm4 = Node(")", isDuplicate = true)
        val iqe3 = Node(";", isDuplicate = true)
        val org9 = Node("}", isDuplicate = true)
        val hli7 = Node("}", isDuplicate = true)
        val bjp9 = Node("class_declaration", isDuplicate = true)
        val nac9 = Node("class", isDuplicate = true)
        val kny4 = Node("identifier", isDuplicate = true)
        val fmz1 = Node("Main")
        val pmy2 = Node("class_body", isDuplicate = true)
        val jal0 = Node("{", isDuplicate = true)
        val qcr3 = Node("method_declaration", isDuplicate = true)
        val azz9 = Node("modifiers", isDuplicate = true)
        val enn5 = Node("public", isDuplicate = true)
        val ygj1 = Node("static")
        val dxj3 = Node("void_type", isDuplicate = true)
        val gau4 = Node("identifier", isDuplicate = true)
        val esh6 = Node("main")
        val qzn7 = Node("formal_parameters", isDuplicate = true)
        val hug7 = Node("(", isDuplicate = true)
        val xsi3 = Node("formal_parameter")
        val rtj4 = Node("array_type")
        val dmk8 = Node("type_identifier", isDuplicate = true)
        val qhh2 = Node("dimensions")
        val dam3 = Node("[")
        val sun3 = Node("]")
        val qpy4 = Node("identifier", isDuplicate = true)
        val ncd1 = Node("args")
        val kxf6 = Node(")", isDuplicate = true)
        val qtw4 = Node("block", isDuplicate = true)
        val pbj1 = Node("{", isDuplicate = true)
        val coy2 = Node("local_variable_declaration", isDuplicate = true)
        val rsi2 = Node("type_identifier", isDuplicate = true)
        val kot9 = Node("variable_declarator", isDuplicate = true)
        val nzj7 = Node("identifier", isDuplicate = true)
        val eei4 = Node("myAnimal", isDuplicate = true)
        val ioi2 = Node("=", isDuplicate = true)
        val sri2 = Node("object_creation_expression", isDuplicate = true)
        val szl7 = Node("new", isDuplicate = true)
        val ggz4 = Node("type_identifier", isDuplicate = true)
        val tzt7 = Node("argument_list", isDuplicate = true)
        val oxx3 = Node("(", isDuplicate = true)
        val zzl2 = Node(")", isDuplicate = true)
        val iiq0 = Node(";", isDuplicate = true)
        val vrw1 = Node("line_comment", isDuplicate = true)
        val fvz4 = Node("local_variable_declaration", isDuplicate = true)
        val mmt4 = Node("type_identifier", isDuplicate = true)
        val kid8 = Node("variable_declarator", isDuplicate = true)
        val owd5 = Node("identifier", isDuplicate = true)
        val tpc9 = Node("myDog", isDuplicate = true)
        val jzh5 = Node("=", isDuplicate = true)
        val uen8 = Node("object_creation_expression", isDuplicate = true)
        val cfm2 = Node("new", isDuplicate = true)
        val qxs8 = Node("type_identifier", isDuplicate = true)
        val efg8 = Node("argument_list", isDuplicate = true)
        val jhm7 = Node("(", isDuplicate = true)
        val uoa2 = Node(")", isDuplicate = true)
        val luk9 = Node(";", isDuplicate = true)
        val gng0 = Node("line_comment", isDuplicate = true)
        val xnq6 = Node("expression_statement", isDuplicate = true)
        val npn1 = Node("method_invocation", isDuplicate = true)
        val yos9 = Node("identifier", isDuplicate = true)
        val vjk2 = Node("myAnimal", isDuplicate = true)
        val rvh2 = Node(".", isDuplicate = true)
        val gnf2 = Node("identifier", isDuplicate = true)
        val sbv8 = Node("animalSound", isDuplicate = true)
        val tfa0 = Node("argument_list", isDuplicate = true)
        val khb1 = Node("(", isDuplicate = true)
        val ljk2 = Node(")", isDuplicate = true)
        val naz4 = Node(";", isDuplicate = true)
        val aaz9 = Node("expression_statement", isDuplicate = true)
        val ozl6 = Node("method_invocation", isDuplicate = true)
        val guf2 = Node("identifier", isDuplicate = true)
        val ufz1 = Node("myDog", isDuplicate = true)
        val sqz5 = Node(".", isDuplicate = true)
        val nnr0 = Node("identifier", isDuplicate = true)
        val wrf0 = Node("animalSound", isDuplicate = true)
        val bih2 = Node("argument_list", isDuplicate = true)
        val awn8 = Node("(", isDuplicate = true)
        val ser0 = Node(")", isDuplicate = true)
        val ruf4 = Node(";", isDuplicate = true)
        val kks8 = Node("}", isDuplicate = true)
        val hhx0 = Node("}", isDuplicate = true)

        graph2 = Graph.from(
            nodes = listOf(bnn8, btl7, sgb5, cox9, nnl9, qjv2, sjt8, mxx5, crj6, qoa2, agx2, iei2, exr6, ios0, lah2, sgs5, zzu1, ppt1, blm3, lcw5, oha6, pkl2, lqc4, lkm3, ygt1, njb2, mrb0, ber7, pub0, vhj7, tvy2, mjn0, cra1, mia5, itf4, rfg8, cpr9, tzx9, jty4, ruh6, gwn0, pfa6, ldq3, nfo9, ocy4, twk2, gby5, bxr6, ezt9, tbs4, scq0, rsm4, igi2, mcb0, drd1, kfe8, kzl9, zjn6, inl2, kpk2, nnq0, wwz4, bxt2, usc6, irg1, vou4, uox8, nns4, xev3, axz0, qwl6, kdg9, tpm4, iqe3, org9, hli7, bjp9, nac9, kny4, fmz1, pmy2, jal0, qcr3, azz9, enn5, ygj1, dxj3, gau4, esh6, qzn7, hug7, xsi3, rtj4, dmk8, qhh2, dam3, sun3, qpy4, ncd1, kxf6, qtw4, pbj1, coy2, rsi2, kot9, nzj7, eei4, ioi2, sri2, szl7, ggz4, tzt7, oxx3, zzl2, iiq0, vrw1, fvz4, mmt4, kid8, owd5, tpc9, jzh5, uen8, cfm2, qxs8, efg8, jhm7, uoa2, luk9, gng0, xnq6, npn1, yos9, vjk2, rvh2, gnf2, sbv8, tfa0, khb1, ljk2, naz4, aaz9, ozl6, guf2, ufz1, sqz5, nnr0, wrf0, bih2, awn8, ser0, ruf4, kks8, hhx0),
            edges = mapOf(
                bnn8 to listOf(btl7, tzx9, bjp9),
                btl7 to listOf(sgb5, cox9, qjv2),
                cox9 to listOf(nnl9),
                qjv2 to listOf(sjt8, mxx5, cpr9),
                mxx5 to listOf(crj6, agx2, iei2, ios0, zzu1),
                crj6 to listOf(qoa2),
                iei2 to listOf(exr6),
                ios0 to listOf(lah2, sgs5),
                zzu1 to listOf(ppt1, blm3, rfg8),
                blm3 to listOf(lcw5, itf4),
                lcw5 to listOf(oha6, mrb0, ber7, vhj7),
                oha6 to listOf(pkl2, lkm3, ygt1),
                pkl2 to listOf(lqc4),
                ygt1 to listOf(njb2),
                ber7 to listOf(pub0),
                vhj7 to listOf(tvy2, mjn0, mia5),
                mjn0 to listOf(cra1),
                tzx9 to listOf(jty4, ruh6, pfa6, ocy4),
                ruh6 to listOf(gwn0),
                pfa6 to listOf(ldq3, nfo9),
                ocy4 to listOf(twk2, gby5, hli7),
                gby5 to listOf(bxr6, tbs4, scq0, igi2, kfe8),
                bxr6 to listOf(ezt9),
                scq0 to listOf(rsm4),
                igi2 to listOf(mcb0, drd1),
                kfe8 to listOf(kzl9, zjn6, org9),
                zjn6 to listOf(inl2, iqe3),
                inl2 to listOf(kpk2, vou4, uox8, xev3),
                kpk2 to listOf(nnq0, bxt2, usc6),
                nnq0 to listOf(wwz4),
                usc6 to listOf(irg1),
                uox8 to listOf(nns4),
                xev3 to listOf(axz0, qwl6, tpm4),
                qwl6 to listOf(kdg9),
                bjp9 to listOf(nac9, kny4, pmy2),
                kny4 to listOf(fmz1),
                pmy2 to listOf(jal0, qcr3, hhx0),
                qcr3 to listOf(azz9, dxj3, gau4, qzn7, qtw4),
                azz9 to listOf(enn5, ygj1),
                gau4 to listOf(esh6),
                qzn7 to listOf(hug7, xsi3, kxf6),
                xsi3 to listOf(rtj4, qpy4),
                rtj4 to listOf(dmk8, qhh2),
                qhh2 to listOf(dam3, sun3),
                qpy4 to listOf(ncd1),
                qtw4 to listOf(pbj1, coy2, vrw1, fvz4, gng0, xnq6, aaz9, kks8),
                coy2 to listOf(rsi2, kot9, iiq0),
                kot9 to listOf(nzj7, ioi2, sri2),
                nzj7 to listOf(eei4),
                sri2 to listOf(szl7, ggz4, tzt7),
                tzt7 to listOf(oxx3, zzl2),
                fvz4 to listOf(mmt4, kid8, luk9),
                kid8 to listOf(owd5, jzh5, uen8),
                owd5 to listOf(tpc9),
                uen8 to listOf(cfm2, qxs8, efg8),
                efg8 to listOf(jhm7, uoa2),
                xnq6 to listOf(npn1, naz4),
                npn1 to listOf(yos9, rvh2, gnf2, tfa0),
                yos9 to listOf(vjk2),
                gnf2 to listOf(sbv8),
                tfa0 to listOf(khb1, ljk2),
                aaz9 to listOf(ozl6, ruf4),
                ozl6 to listOf(guf2, sqz5, nnr0, bih2),
                guf2 to listOf(ufz1),
                nnr0 to listOf(wrf0),
                bih2 to listOf(awn8, ser0),
            )
        )

        graph1.visualize("RealExample_G1")
        graph2.visualize("RealExample_G2")
    }

    override fun checkCommonGraph(commonGraph: Graph) {
        commonGraph.visualize("RealExample_Generalization")
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {
        graph1Diff.visualize("RealExample_G1_Differences")
    }

    override fun checkGraph2Diff(graph2Diff: Graph) {
        graph2Diff.visualize("RealExample_G2_Differences")
    }
}