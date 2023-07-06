package ca.ucalgary.cs.comparison.ast

import ca.ucalgary.cs.comparison.BaseCompareGraphTest
import ca.ucalgary.cs.graph.Edge
import ca.ucalgary.cs.graph.Graph
import ca.ucalgary.cs.graph.Node
import ca.ucalgary.cs.io.visualize

class RealExample: BaseCompareGraphTest() {
    override fun initializeGraphs() {
        val xui5 = Node("program")
        val ttx6 = Node("class_declaration", isDuplicate = true)
        val mii9 = Node("class", isDuplicate = true)
        val pij9 = Node("identifier", isDuplicate = true)
        val vol5 = Node("Animal")
        val xut6 = Node("class_body", isDuplicate = true)
        val mic0 = Node("{", isDuplicate = true)
        val mok8 = Node("method_declaration", isDuplicate = true)
        val ngp1 = Node("modifiers", isDuplicate = true)
        val chy2 = Node("public", isDuplicate = true)
        val hxu6 = Node("void_type", isDuplicate = true)
        val qax6 = Node("identifier", isDuplicate = true)
        val uts2 = Node("animalSound", isDuplicate = true)
        val kwt8 = Node("formal_parameters", isDuplicate = true)
        val qzy1 = Node("(", isDuplicate = true)
        val zlj7 = Node(")", isDuplicate = true)
        val ezg4 = Node("block", isDuplicate = true)
        val mtg1 = Node("{", isDuplicate = true)
        val fdu1 = Node("expression_statement", isDuplicate = true)
        val bzw3 = Node("method_invocation", isDuplicate = true)
        val rge7 = Node("field_access", isDuplicate = true)
        val bal1 = Node("identifier", isDuplicate = true)
        val cvh7 = Node("System", isDuplicate = true)
        val ztf3 = Node(".", isDuplicate = true)
        val aqg2 = Node("identifier", isDuplicate = true)
        val dsj8 = Node("out", isDuplicate = true)
        val qyc0 = Node(".", isDuplicate = true)
        val wgi0 = Node("identifier", isDuplicate = true)
        val dzh0 = Node("println", isDuplicate = true)
        val uzg4 = Node("argument_list", isDuplicate = true)
        val lla8 = Node("(", isDuplicate = true)
        val cve1 = Node("string_literal", isDuplicate = true)
        val jqe6 = Node("\"The animal makes a sound\"")
        val nxh8 = Node(")", isDuplicate = true)
        val kwr3 = Node(";", isDuplicate = true)
        val iyq8 = Node("}", isDuplicate = true)
        val aex6 = Node("}", isDuplicate = true)
        val lan8 = Node("class_declaration", isDuplicate = true)
        val uyi0 = Node("class", isDuplicate = true)
        val kjo5 = Node("identifier", isDuplicate = true)
        val pxo1 = Node("Dog")
        val vuw3 = Node("superclass", isDuplicate = true)
        val twv5 = Node("extends", isDuplicate = true)
        val xbz7 = Node("type_identifier", isDuplicate = true)
        val qtb7 = Node("class_body", isDuplicate = true)
        val wbd8 = Node("{", isDuplicate = true)
        val mqi7 = Node("method_declaration", isDuplicate = true)
        val htj2 = Node("modifiers", isDuplicate = true)
        val ief6 = Node("public", isDuplicate = true)
        val kls9 = Node("void_type", isDuplicate = true)
        val yir2 = Node("identifier", isDuplicate = true)
        val pxw0 = Node("animalSound", isDuplicate = true)
        val tnv1 = Node("formal_parameters", isDuplicate = true)
        val upp2 = Node("(", isDuplicate = true)
        val wbs5 = Node(")", isDuplicate = true)
        val uhj1 = Node("block", isDuplicate = true)
        val fya8 = Node("{", isDuplicate = true)
        val wdc3 = Node("expression_statement", isDuplicate = true)
        val ztr6 = Node("method_invocation", isDuplicate = true)
        val qfn3 = Node("field_access", isDuplicate = true)
        val rao8 = Node("identifier", isDuplicate = true)
        val aee0 = Node("System", isDuplicate = true)
        val yww8 = Node(".", isDuplicate = true)
        val kxt6 = Node("identifier", isDuplicate = true)
        val esd5 = Node("out", isDuplicate = true)
        val bgx0 = Node(".", isDuplicate = true)
        val wwp7 = Node("identifier", isDuplicate = true)
        val hoq0 = Node("println", isDuplicate = true)
        val pya3 = Node("argument_list", isDuplicate = true)
        val dua4 = Node("(", isDuplicate = true)
        val oxl1 = Node("string_literal", isDuplicate = true)
        val fbj9 = Node("\"The dog says: bow wow\"")
        val ico5 = Node(")", isDuplicate = true)
        val tam6 = Node(";", isDuplicate = true)
        val txm1 = Node("}", isDuplicate = true)
        val jgq3 = Node("}", isDuplicate = true)
        val duq0 = Node("class_declaration", isDuplicate = true)
        val bam5 = Node("class", isDuplicate = true)
        val mbo9 = Node("identifier", isDuplicate = true)
        val hus7 = Node("Pig")
        val wzf8 = Node("superclass", isDuplicate = true)
        val szz5 = Node("extends", isDuplicate = true)
        val ymu0 = Node("type_identifier", isDuplicate = true)
        val axa4 = Node("class_body", isDuplicate = true)
        val bfd0 = Node("{", isDuplicate = true)
        val nht4 = Node("method_declaration", isDuplicate = true)
        val nmc7 = Node("modifiers", isDuplicate = true)
        val zeb2 = Node("public", isDuplicate = true)
        val nvj3 = Node("void_type", isDuplicate = true)
        val qhs7 = Node("identifier", isDuplicate = true)
        val dhb5 = Node("animalSound", isDuplicate = true)
        val uum5 = Node("formal_parameters", isDuplicate = true)
        val bke8 = Node("(", isDuplicate = true)
        val ypk9 = Node(")", isDuplicate = true)
        val sln2 = Node("block", isDuplicate = true)
        val veh9 = Node("{", isDuplicate = true)
        val gpx6 = Node("expression_statement", isDuplicate = true)
        val ldz8 = Node("method_invocation", isDuplicate = true)
        val rwt9 = Node("field_access", isDuplicate = true)
        val pac6 = Node("identifier", isDuplicate = true)
        val htb4 = Node("System", isDuplicate = true)
        val urt6 = Node(".", isDuplicate = true)
        val ucl2 = Node("identifier", isDuplicate = true)
        val bpf1 = Node("out", isDuplicate = true)
        val vot4 = Node(".", isDuplicate = true)
        val nxf7 = Node("identifier", isDuplicate = true)
        val cow9 = Node("println", isDuplicate = true)
        val zkm5 = Node("argument_list", isDuplicate = true)
        val zrq0 = Node("(", isDuplicate = true)
        val rrn7 = Node("string_literal", isDuplicate = true)
        val zwd9 = Node("\"The pig says: wee wee\"")
        val ixl9 = Node(")", isDuplicate = true)
        val azi9 = Node(";", isDuplicate = true)
        val iqh1 = Node("}", isDuplicate = true)
        val lbe9 = Node("}", isDuplicate = true)
        val lwq2 = Node("class_declaration", isDuplicate = true)
        val dii5 = Node("class", isDuplicate = true)
        val mll2 = Node("identifier", isDuplicate = true)
        val rfv6 = Node("Main")
        val kpu3 = Node("class_body", isDuplicate = true)
        val uyh8 = Node("{", isDuplicate = true)
        val xst7 = Node("method_declaration", isDuplicate = true)
        val sxd1 = Node("modifiers", isDuplicate = true)
        val nys1 = Node("public", isDuplicate = true)
        val nbg5 = Node("static")
        val vqs7 = Node("void_type", isDuplicate = true)
        val mzi4 = Node("identifier", isDuplicate = true)
        val jzm7 = Node("main")
        val jcj0 = Node("formal_parameters", isDuplicate = true)
        val jty2 = Node("(", isDuplicate = true)
        val gpc0 = Node("formal_parameter")
        val tuh2 = Node("array_type")
        val ebb3 = Node("type_identifier", isDuplicate = true)
        val zlq9 = Node("dimensions")
        val mhf7 = Node("[")
        val rxj4 = Node("]")
        val gjt1 = Node("identifier", isDuplicate = true)
        val mjp9 = Node("args")
        val auy8 = Node(")", isDuplicate = true)
        val ejy1 = Node("block", isDuplicate = true)
        val fdy6 = Node("{", isDuplicate = true)
        val zdn3 = Node("local_variable_declaration", isDuplicate = true)
        val evc1 = Node("type_identifier", isDuplicate = true)
        val ipw1 = Node("variable_declarator", isDuplicate = true)
        val mlc9 = Node("identifier", isDuplicate = true)
        val utk7 = Node("myAnimal", isDuplicate = true)
        val ysr2 = Node("=", isDuplicate = true)
        val efe6 = Node("object_creation_expression", isDuplicate = true)
        val wrd1 = Node("new", isDuplicate = true)
        val tly6 = Node("type_identifier", isDuplicate = true)
        val wxe0 = Node("argument_list", isDuplicate = true)
        val ukn0 = Node("(", isDuplicate = true)
        val fvm9 = Node(")", isDuplicate = true)
        val zgh4 = Node(";", isDuplicate = true)
        val brn6 = Node("line_comment", isDuplicate = true)
        val byf0 = Node("local_variable_declaration", isDuplicate = true)
        val nlv9 = Node("type_identifier", isDuplicate = true)
        val edd0 = Node("variable_declarator", isDuplicate = true)
        val ptu8 = Node("identifier", isDuplicate = true)
        val igt2 = Node("myPig", isDuplicate = true)
        val usv9 = Node("=", isDuplicate = true)
        val fyl0 = Node("object_creation_expression", isDuplicate = true)
        val nwr5 = Node("new", isDuplicate = true)
        val zlh8 = Node("type_identifier", isDuplicate = true)
        val xsy7 = Node("argument_list", isDuplicate = true)
        val pgk3 = Node("(", isDuplicate = true)
        val aht0 = Node(")", isDuplicate = true)
        val gqm0 = Node(";", isDuplicate = true)
        val lsp0 = Node("line_comment", isDuplicate = true)
        val luo0 = Node("local_variable_declaration", isDuplicate = true)
        val npz4 = Node("type_identifier", isDuplicate = true)
        val xmn4 = Node("variable_declarator", isDuplicate = true)
        val mvc6 = Node("identifier", isDuplicate = true)
        val byo6 = Node("myDog", isDuplicate = true)
        val acd0 = Node("=", isDuplicate = true)
        val iry5 = Node("object_creation_expression", isDuplicate = true)
        val zvj5 = Node("new", isDuplicate = true)
        val hsc4 = Node("type_identifier", isDuplicate = true)
        val ucy2 = Node("argument_list", isDuplicate = true)
        val qca3 = Node("(", isDuplicate = true)
        val ggs4 = Node(")", isDuplicate = true)
        val raf8 = Node(";", isDuplicate = true)
        val ifi8 = Node("line_comment", isDuplicate = true)
        val pdc9 = Node("expression_statement", isDuplicate = true)
        val oam8 = Node("method_invocation", isDuplicate = true)
        val cur6 = Node("identifier", isDuplicate = true)
        val bob6 = Node("myAnimal", isDuplicate = true)
        val ack8 = Node(".", isDuplicate = true)
        val zde1 = Node("identifier", isDuplicate = true)
        val uko3 = Node("animalSound", isDuplicate = true)
        val ydq8 = Node("argument_list", isDuplicate = true)
        val hmt2 = Node("(", isDuplicate = true)
        val bdm2 = Node(")", isDuplicate = true)
        val rvq3 = Node(";", isDuplicate = true)
        val glw7 = Node("expression_statement", isDuplicate = true)
        val kgd1 = Node("method_invocation", isDuplicate = true)
        val qpo9 = Node("identifier", isDuplicate = true)
        val man3 = Node("myPig", isDuplicate = true)
        val ixc2 = Node(".", isDuplicate = true)
        val kgf6 = Node("identifier", isDuplicate = true)
        val ycb7 = Node("animalSound", isDuplicate = true)
        val xws1 = Node("argument_list", isDuplicate = true)
        val rgl0 = Node("(", isDuplicate = true)
        val vwc1 = Node(")", isDuplicate = true)
        val fso9 = Node(";", isDuplicate = true)
        val smr5 = Node("expression_statement", isDuplicate = true)
        val xdg9 = Node("method_invocation", isDuplicate = true)
        val tfz5 = Node("identifier", isDuplicate = true)
        val ctb4 = Node("myDog", isDuplicate = true)
        val fgf4 = Node(".", isDuplicate = true)
        val mnq6 = Node("identifier", isDuplicate = true)
        val ced7 = Node("animalSound", isDuplicate = true)
        val grh0 = Node("argument_list", isDuplicate = true)
        val hmn3 = Node("(", isDuplicate = true)
        val ybw8 = Node(")", isDuplicate = true)
        val uph3 = Node(";", isDuplicate = true)
        val uod4 = Node("}", isDuplicate = true)
        val vyl6 = Node("}", isDuplicate = true)

        graph1 = Graph.from(
            nodes = listOf(xui5, ttx6, mii9, pij9, vol5, xut6, mic0, mok8, ngp1, chy2, hxu6, qax6, uts2, kwt8, qzy1, zlj7, ezg4, mtg1, fdu1, bzw3, rge7, bal1, cvh7, ztf3, aqg2, dsj8, qyc0, wgi0, dzh0, uzg4, lla8, cve1, jqe6, nxh8, kwr3, iyq8, aex6, lan8, uyi0, kjo5, pxo1, vuw3, twv5, xbz7, qtb7, wbd8, mqi7, htj2, ief6, kls9, yir2, pxw0, tnv1, upp2, wbs5, uhj1, fya8, wdc3, ztr6, qfn3, rao8, aee0, yww8, kxt6, esd5, bgx0, wwp7, hoq0, pya3, dua4, oxl1, fbj9, ico5, tam6, txm1, jgq3, duq0, bam5, mbo9, hus7, wzf8, szz5, ymu0, axa4, bfd0, nht4, nmc7, zeb2, nvj3, qhs7, dhb5, uum5, bke8, ypk9, sln2, veh9, gpx6, ldz8, rwt9, pac6, htb4, urt6, ucl2, bpf1, vot4, nxf7, cow9, zkm5, zrq0, rrn7, zwd9, ixl9, azi9, iqh1, lbe9, lwq2, dii5, mll2, rfv6, kpu3, uyh8, xst7, sxd1, nys1, nbg5, vqs7, mzi4, jzm7, jcj0, jty2, gpc0, tuh2, ebb3, zlq9, mhf7, rxj4, gjt1, mjp9, auy8, ejy1, fdy6, zdn3, evc1, ipw1, mlc9, utk7, ysr2, efe6, wrd1, tly6, wxe0, ukn0, fvm9, zgh4, brn6, byf0, nlv9, edd0, ptu8, igt2, usv9, fyl0, nwr5, zlh8, xsy7, pgk3, aht0, gqm0, lsp0, luo0, npz4, xmn4, mvc6, byo6, acd0, iry5, zvj5, hsc4, ucy2, qca3, ggs4, raf8, ifi8, pdc9, oam8, cur6, bob6, ack8, zde1, uko3, ydq8, hmt2, bdm2, rvq3, glw7, kgd1, qpo9, man3, ixc2, kgf6, ycb7, xws1, rgl0, vwc1, fso9, smr5, xdg9, tfz5, ctb4, fgf4, mnq6, ced7, grh0, hmn3, ybw8, uph3, uod4, vyl6),
            edges = mapOf(
                xui5 to listOf(ttx6, lan8, duq0, lwq2),
                ttx6 to listOf(mii9, pij9, xut6),
                pij9 to listOf(vol5),
                xut6 to listOf(mic0, mok8, aex6),
                mok8 to listOf(ngp1, hxu6, qax6, kwt8, ezg4),
                ngp1 to listOf(chy2),
                qax6 to listOf(uts2),
                kwt8 to listOf(qzy1, zlj7),
                ezg4 to listOf(mtg1, fdu1, iyq8),
                fdu1 to listOf(bzw3, kwr3),
                bzw3 to listOf(rge7, qyc0, wgi0, uzg4),
                rge7 to listOf(bal1, ztf3, aqg2),
                bal1 to listOf(cvh7),
                aqg2 to listOf(dsj8),
                wgi0 to listOf(dzh0),
                uzg4 to listOf(lla8, cve1, nxh8),
                cve1 to listOf(jqe6),
                lan8 to listOf(uyi0, kjo5, vuw3, qtb7),
                kjo5 to listOf(pxo1),
                vuw3 to listOf(twv5, xbz7),
                qtb7 to listOf(wbd8, mqi7, jgq3),
                mqi7 to listOf(htj2, kls9, yir2, tnv1, uhj1),
                htj2 to listOf(ief6),
                yir2 to listOf(pxw0),
                tnv1 to listOf(upp2, wbs5),
                uhj1 to listOf(fya8, wdc3, txm1),
                wdc3 to listOf(ztr6, tam6),
                ztr6 to listOf(qfn3, bgx0, wwp7, pya3),
                qfn3 to listOf(rao8, yww8, kxt6),
                rao8 to listOf(aee0),
                kxt6 to listOf(esd5),
                wwp7 to listOf(hoq0),
                pya3 to listOf(dua4, oxl1, ico5),
                oxl1 to listOf(fbj9),
                duq0 to listOf(bam5, mbo9, wzf8, axa4),
                mbo9 to listOf(hus7),
                wzf8 to listOf(szz5, ymu0),
                axa4 to listOf(bfd0, nht4, lbe9),
                nht4 to listOf(nmc7, nvj3, qhs7, uum5, sln2),
                nmc7 to listOf(zeb2),
                qhs7 to listOf(dhb5),
                uum5 to listOf(bke8, ypk9),
                sln2 to listOf(veh9, gpx6, iqh1),
                gpx6 to listOf(ldz8, azi9),
                ldz8 to listOf(rwt9, vot4, nxf7, zkm5),
                rwt9 to listOf(pac6, urt6, ucl2),
                pac6 to listOf(htb4),
                ucl2 to listOf(bpf1),
                nxf7 to listOf(cow9),
                zkm5 to listOf(zrq0, rrn7, ixl9),
                rrn7 to listOf(zwd9),
                lwq2 to listOf(dii5, mll2, kpu3),
                mll2 to listOf(rfv6),
                kpu3 to listOf(uyh8, xst7, vyl6),
                xst7 to listOf(sxd1, vqs7, mzi4, jcj0, ejy1),
                sxd1 to listOf(nys1, nbg5),
                mzi4 to listOf(jzm7),
                jcj0 to listOf(jty2, gpc0, auy8),
                gpc0 to listOf(tuh2, gjt1),
                tuh2 to listOf(ebb3, zlq9),
                zlq9 to listOf(mhf7, rxj4),
                gjt1 to listOf(mjp9),
                ejy1 to listOf(fdy6, zdn3, brn6, byf0, lsp0, luo0, ifi8, pdc9, glw7, smr5, uod4),
                zdn3 to listOf(evc1, ipw1, zgh4),
                ipw1 to listOf(mlc9, ysr2, efe6),
                mlc9 to listOf(utk7),
                efe6 to listOf(wrd1, tly6, wxe0),
                wxe0 to listOf(ukn0, fvm9),
                byf0 to listOf(nlv9, edd0, gqm0),
                edd0 to listOf(ptu8, usv9, fyl0),
                ptu8 to listOf(igt2),
                fyl0 to listOf(nwr5, zlh8, xsy7),
                xsy7 to listOf(pgk3, aht0),
                luo0 to listOf(npz4, xmn4, raf8),
                xmn4 to listOf(mvc6, acd0, iry5),
                mvc6 to listOf(byo6),
                iry5 to listOf(zvj5, hsc4, ucy2),
                ucy2 to listOf(qca3, ggs4),
                pdc9 to listOf(oam8, rvq3),
                oam8 to listOf(cur6, ack8, zde1, ydq8),
                cur6 to listOf(bob6),
                zde1 to listOf(uko3),
                ydq8 to listOf(hmt2, bdm2),
                glw7 to listOf(kgd1, fso9),
                kgd1 to listOf(qpo9, ixc2, kgf6, xws1),
                qpo9 to listOf(man3),
                kgf6 to listOf(ycb7),
                xws1 to listOf(rgl0, vwc1),
                smr5 to listOf(xdg9, uph3),
                xdg9 to listOf(tfz5, fgf4, mnq6, grh0),
                tfz5 to listOf(ctb4),
                mnq6 to listOf(ced7),
                grh0 to listOf(hmn3, ybw8),
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
        val cra1 = Node("\"The animal makes a sound\"")
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
        val kdg9 = Node("\"The dog says: bow wow\"")
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

        graph1.visualize("ComplexV2.3/G1")
        graph2.visualize("ComplexV2.3/G2")
    }

    override fun checkCommonGraph(commonGraph: Graph) {
        graph1.visualize("ComplexV2.3/G1_Generalized", commonGraph)
        graph2.visualize("ComplexV2.3/G2_Generalized", commonGraph)
        commonGraph.visualize("ComplexV2.3/Generalization")
    }

    override fun checkGraph1Diff(graph1Diff: Graph) {
        graph1Diff.visualize("ComplexV2.3/G1_Differences")
    }

    override fun checkGraph2Diff(graph2Diff: Graph) {
        graph2Diff.visualize("ComplexV2.3/G2_Differences")
    }
}