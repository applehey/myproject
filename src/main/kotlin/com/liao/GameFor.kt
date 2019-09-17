package com.liao

import java.util.*

fun main() {
    val secret = Random().nextInt(10) + 1
    println(secret)
    val scanner = Scanner(System.`in`)
    for (i in 1..4) {
        println("Please enter a number (${i}/4): ")
        var number = scanner.nextInt()
        if (number > secret) {
            println("Lower")
        } else if (number < secret) {
            println("Higher")
        } else {
            println("Great, the number is $secret")
            break
        }
    }
}