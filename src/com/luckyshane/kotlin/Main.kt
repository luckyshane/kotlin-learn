package com.luckyshane.kotlin

import com.luckyshane.kotlin.testable.*

/**
 * Created by luckyshane on 2018/5/4.
 */
object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        val testableList = ArrayList<Testable>()
        testableList.add(PrimitiveTypeTestable())
        testableList.add(IfTestable())
        testableList.add(WhenTestable())
        testableList.add(WhileTestable())
        testableList.add(ForTestable())
        testableList.add(ReturnTagTestable())
        testableList.add(OOTestable())
        for (testable in testableList) {
            testable.test()
        }
    }


}
