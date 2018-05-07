package com.luckyshane.kotlin

import com.luckyshane.kotlin.testable.ForTestable
import com.luckyshane.kotlin.testable.Testable
import com.luckyshane.kotlin.testable.WhileTestable

/**
 * Created by luckyshane on 2018/5/4.
 */
object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        val testables = ArrayList<Testable>()
        testables.add(WhileTestable())
        testables.add(ForTestable())
        for (testable in testables) {
            testable.test()
        }
    }


}
