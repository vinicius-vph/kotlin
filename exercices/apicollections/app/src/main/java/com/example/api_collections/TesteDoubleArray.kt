package com.example.api_collections

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1000.00
    salarios[1] = 2000.00
    salarios[2] = 3000.00
    salarios.forEach { println(it) }

    println("=================================")
    salarios.forEachIndexed {index, salario ->
        salarios[index] = salario * 1.1
    }

    salarios.forEach { println(it) }

    println("=================================")

    val arr = doubleArrayOf(5000.00,2000.00,3000.00)

    arr.sort()

    arr.forEach { println(it) }
}