package com.liao.kotlin

import java.util.*

fun main() {
    //userInput()
    val stu = Student("Hank",60,50)
    stu.print()
    var test = 123
    println("High score:  ${stu.highest()}")
    println("Test is: $test")
}
class Student(var name:String?, var english:Int, var math:Int){
    fun print(){
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    fun passOrFailed() = if (getAverage() > 60) "PASS" else "FAILED"

    fun grading()  = when(getAverage()) {
            in 90..100 -> 'A'
            in 80..89 -> 'B'
            in 70..79 -> 'C'
            in 60..69 -> 'D'
            else -> 'F'
    }

    fun getAverage() = (english + math) / 2


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