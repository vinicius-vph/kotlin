package com.example.api_collections

fun main() {
    val salarios = doubleArrayOf(5000.00,2000.00,3000.00)

    for (salario in salarios) {
        println(salario)
    }
    println("=================================")

    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salarial: ${salarios.average()}")

    val salariosMaiorQue2500 = salarios.filter { it > 2500 }

    println("=================================")

    salariosMaiorQue2500.forEach { println(it) }

    println("=================================")

    println(salarios.count { it in 1000.00..10000.00 })

    println("=================================")

    println(salarios.find { it == 1000.00})
    println(salarios.find { it == 3000.00 })

    println("=================================")

    println(salarios.any { it == 2000.00})
    println(salarios.any { it == 500.00})

}