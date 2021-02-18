package com.kotlincookbook.hogen.chapter3

/**
 * 3.7
 */
class Customer(val name:String){
    override fun equals(other: Any?): Boolean {
       if(this === other) return true
        val otherCustomer = (other as?Customer)?:return false
        return this.name == otherCustomer.name
    }

    override fun hashCode() = name.hashCode()
}

class AutoCustomer(val name:String){
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as AutoCustomer

        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }
}

/* 3.8 singleton
 */

fun main() {
    val processors = Runtime.getRuntime().availableProcessors()
    println(processors)
}

object MySingleton{
    val myProperty = 3
    fun myFunction() = "Hello"
}
