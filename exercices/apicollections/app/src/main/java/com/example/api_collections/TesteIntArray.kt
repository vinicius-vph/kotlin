package com.example.api_collections

fun main() {
    val values = IntArray( 5)

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    values.sort()
    for (index in values.indices) {
        println(values[index])
    }

/*    values.forEach { valor ->
        println(valor)
    }*/
}
