package com.example.api_collections

fun main() {
    val vinicius = Funcionario("Vinicius", 5000.00, "CLT")
    val philar = Funcionario("Philar", 10000.00, "PJ")
    val pantina = Funcionario("Pantina", 3000.00, "CLT")

    val funcionarios1 = setOf(vinicius, philar)
    val funcionarios2 = setOf(pantina)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println("=========================")
    val funcionarios3 = setOf(vinicius, philar,pantina)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it)}

    println("=========================")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it)}

}



