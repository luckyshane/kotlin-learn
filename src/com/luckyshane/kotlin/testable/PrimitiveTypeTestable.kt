package com.luckyshane.kotlin.testable

import kotlin.test.assertEquals

/**
 * Created by luckyshane on 2018/5/7.
 */
class PrimitiveTypeTestable : SimpleTestable() {
    override fun doTest() {
        val a = 1000
        val b: Int? = a
        val c: Int? = a
        println("b == c: ${b == c}")
        println("b === c: ${b === c}") // output is false, but why?
        assertEquals(true, b == c)
        assertEquals(false, b === c)

        val oneMillion = 1_000_000
        val hexBytes = 0xFF_AB_CD_EF
        assertEquals(oneMillion, 1000000)
        assertEquals(hexBytes, 0xFFABCDEF)

        val z = 1L
        val zL: Long = z
        assert(z == zL)

        println("a number: ${getCharDigitalNumber('a')}, A number: ${getCharDigitalNumber('A')}")

        val array = arrayOf(1, "2", 3)
        val intArray = intArrayOf(1, 2, 3)
        for (a in array) {
            println(a)
        }
        for (item in array.withIndex()) {
            println("index ${item.index} is ${item.value}")
        }
        println("size is ${array.size}")
        array.forEach { v ->
            println("$v")
        }
        array.withIndex().forEach { a ->
            println("pos ${a.index} is ${a.value}")
        }
        for ((k, v) in intArray.withIndex()) {
            println("pos $k is $v")
        }

        val aa = Array(5, { i -> (i * i).toString() })
        aa.withIndex().forEach { item -> assert(item.value == (item.index * item.index).toString()) }

        val text = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """
        println(text)

        val txt = "|Tell me and I forget.\n" +
                "    |Teach me and I remember.\n" +
                "    |Involve me and I learn.\n" +
                "    |(Benjamin Franklin)"
        println(txt)
        for (c in text) {
            print(c)
        }
        println()
    }

    private fun getCharDigitalNumber(c: Char): Int {
        return c.toInt()
    }


}