package com.kotlincookbook.hogen

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import kotlin.math.pow
import org.junit.jupiter.api.assertAll
import java.awt.Color
import java.awt.Color.orange

infix fun Int.`**`(x: Int) = toDouble().pow(x).toInt()


fun main() {
    println(100 `**` 3)
    `doubling and halving`()
    val color = orange
    instFromColor(color).forEach {
        print("${it}|")
    }
}

@Test
fun `doubling and halving`(){
    assertAll("left shitfs doubling from 1", //0000_0001
        {assertThat( 2, equalTo(1 shl 1))}
    )
}

fun instFromColor(color: Color): List<Int>{
    val rgb = color.rgb
    val alpha = rgb shr 24 and 0xff
    val red = rgb shr 16 and 0xff
    val green = rgb shr 8 and 0xff
    val blue = rgb and 0xff
    return listOf(alpha,red,green,blue)
}
