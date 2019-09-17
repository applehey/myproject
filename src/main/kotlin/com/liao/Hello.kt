package com.liao

fun main() {
//    println("Hello Kotlin")
//    Human().hello()
    val h = Human(weight = 66.5f,height = 1.7f)
    println()
    /*var age = 19
    age =20
    var weight = 66.5f
    var name : String
    name = "Liao"*/
}

class Human(var name : String = "", var weight : Float, var height : Float){
    init {
        println("test $weight")
    }
//    constructor(name: String, weight: Float, height: Float) : this(weight, height)
    fun bmi() : Float{
        val bmi = weight / (height*height)
        return bmi
    }
    fun hello(){
        println("Hello Kotlin")
    }

}