package com.luckyshane.kotlin.testable


/**
 * Created by luckyshane on 2018/5/4.
 */
interface Testable {
    fun test()
}

abstract class SimpleTestable : Testable {

    private val name: String
        get() = javaClass.simpleName

    override fun test() {
        println("\n=====> START TEST: $name")
        doTest()
        println("\n<===== END TEST: $name")
    }

    abstract fun doTest()
}



