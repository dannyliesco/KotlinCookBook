package com.kotlincookbook.hogen.chapter3
import org.apache.commons.math3.complex.Complex

//overload operator
data class Point(val x: Int,val y: Int)

operator fun Point.unaryMinus() = Point(-x,-y)

infix fun Point.newfun(x:Int) = println("a new func${x}")

fun Point.equals(compare:Point): () -> Boolean = {
    this.equals(compare)
    true
}

//complex doesn't implements operator "+"
operator fun Complex.plus(c:Complex) = this.add(c)

fun main() {
    val point = Point(10,20)
    val point2 = Point(10,20)
    println(-point)
    point newfun 3
    println(point.equals(point2))
    //lateinit is decorate var.Include top property.
    //lazy is a lambda ,decorate val field.
}
