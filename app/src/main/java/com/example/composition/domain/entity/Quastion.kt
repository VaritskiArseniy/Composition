package com.example.composition.domain.entity

data class Quastion(
    val sum : Int,
    val visibleNumber: Int,
    val options : List<Int>
){
    val rightAnswer:Int
        get() = sum - visibleNumber
}
