package com.liao.kotlin

import java.util.*

fun main() {
    //userInput()
    Student.pass = 50
    val stu = Student("Hank",45,55)
    val stu2 = Student("Emma", 80, 35)
    val stu3 = Student("Hong", 40, 30)
    val gstu = GraduateStuden("Pupu", 55, 65 , 90)
    gstu.print()
    stu.print()
    stu2.print()
    stu3.print()
    var test = 123
    println("High score:  ${stu.highest()}")
    println("Test is: $test")
}

class GraduateStuden(name: String?, english: Int, math: Int,var thesis : Int) : Student(name, english, math) {
    companion object {
        var pass = 70
    }

    override fun print() {
        println("$name\t$english\t$math\t$thesis\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }
    override fun passOrFailed() = if (getAverage() >= pass) "PASS" else "FAILED"
    override fun getAverage() = (english + math + thesis) / 3

}
open class Student(var name:String?, var english:Int, var math:Int){
    companion object {
        @JvmStatic //在Java使用Kotlin類別層級屬性可減少一層companion
        var pass = 60
        fun test() {
            println("testing")
        }
    }

    open fun print(){
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    open fun passOrFailed() = if (getAverage() >= pass) "PASS" else "FAILED"

    fun grading()  = when(getAverage()) {
            in 90..100 -> 'A'
            in 80..89 -> 'B'
            in 70..79 -> 'C'
            in 60..69 -> 'D'
            else -> 'F'
    }

    open fun getAverage() = (english + math) / 2


    fun highest() = if (english > math) {
            println("highest: english")
            english
        } else {
            println("highest: math")
            math
        }

    fun nameCheck(){
        println(name?.length)
    }
}

private fun userInput() {
    val scanner = Scanner(System.`in`)
    /*println("Please enter student's name:")
    var name = scanner.next()*/
    var name = null
    println("Please enter student's english:")
    var english = scanner.nextInt()
    println("Please enter student's math:")
    var math = scanner.nextInt()
    val stu = Student(name, english, math)
    stu.print()
    stu.nameCheck()
}