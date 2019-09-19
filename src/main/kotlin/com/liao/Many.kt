package com.liao

fun main() {
    val list = listOf(5, 1 ,7 ,3)
    println(list)
    val scores =  listOf(68 , 77 , 50 ,76 ,82)
    for (score in scores) {
        println(score)
    }
    println(list.get(3))
    var mutableList = mutableListOf(5 , 1 ,7 ,3)
    mutableList.add(8)
    println(mutableList)
}