package com.luckyshane.kotlin.testable

import java.util.*
import kotlin.test.assertEquals

/**
 * Created by luckyshane on 2018/5/8.
 */
class IfTestable: SimpleTestable() {
    override fun doTest() {
        val a = 1
        val b = 10
        println("max of $a and $b is ${max(a, b)}")
        val c = 20
        val max = if (c > b) b else c
        println("max of $b and $c is $max")
    }
    private fun max(a: Int, b: Int) = if (a > b) a else b
}

class WhenTestable: SimpleTestable() {
    override fun doTest() {
        val x: Int = Random().nextInt(100)
        when {
            isOdd(x) -> println("$x is odd")
            isEven(x) -> println("$x is even")
            else -> {
                println("$x is funny")
            }
        }
        when (x) {
            50 -> println("wow x is the lucky number")
            in 1..10 -> println("$x is in 1..10")
            in 99..100 -> println("$x is in the large range")
            in 20 until 50 -> println("$x is in the small range")
            in 60 until 70, in 80..90 -> println("$x is haha")
            else -> {
                println(x)
            }
        }
    }

    private fun isOdd(x: Int) = x % 2 != 0
    private fun isEven(x : Int) = x % 2 == 0
}

class ForTestable: SimpleTestable() {
    override fun doTest() {
        // [0, 10)
        for (i in 0 until 10) {
            print("$i ")
        }
        println()
        // equals this [0, 9]
        for (i in 0..9) {
            print("$i ")
        }
        println()
        // down [9, 0]
        for (i in 9 downTo 0) {
            print("$i ")
        }
        println()
        // below code block will print "0 2 4 6 8"
        for (i in 0..9 step 2) {
            print("$i ")
        }
        println()
        val array = arrayOf(1, 2, 3, "4", "Kotlin", 4.5f)
        for (i in array.indices) {
            print("${array[i]} ")
        }
        println("\nreverse: ")
        for (i in (array.size-1) downTo 0) {
            print("${array[i]} ")
        }
    }
}

class WhileTestable : SimpleTestable() {

    override fun doTest() {
        var x = 100
        while (x >= 0) {
            x--
        }
        assertEquals(x, -1)
        println()
        do  {
            x++
        } while (x < 100)
        assertEquals(x, 100)
    }
}

class ReturnTagTestable : SimpleTestable() {
    override fun doTest() {
        // avoid to use this return tag, or you will get confused
        var count = 0
         for (i in 0 until 10) {
             innerLoop@ for (j in 0 until 2) {
                print("$i$j ")
                if (i == 9 && j == 1 && count < 2) {
                    count++
                    break@innerLoop
                }
            }
        }
        println("over")
    }

}


