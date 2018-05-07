package com.luckyshane.kotlin.testable

/**
 * Created by luckyshane on 2018/5/4.
 */
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