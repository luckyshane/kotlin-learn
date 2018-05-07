package com.luckyshane.kotlin.testable

/**
 * Created by luckyshane on 2018/5/7.
 */
class OOTestable: SimpleTestable(){
    override fun doTest() {
        val xiaomin = Person()
        xiaomin.name = "XiaoMin"
        xiaomin.age = 28
        assert(xiaomin.isMale())

        var lilei = Person("lilei")
        println("name of lilei is ${lilei.name}")
    }

}

private open class Person(var name: String = "", var age: Int = 1, var sex: String = "male") {

    constructor(name: String ) : this(name, 1, "male")

    fun isMale(): Boolean {
        return sex == "male"
    }

    override fun toString(): String {
        return "person"
    }
}

private class Student: Person() {
    override fun toString(): String {
        return "student"
    }
}