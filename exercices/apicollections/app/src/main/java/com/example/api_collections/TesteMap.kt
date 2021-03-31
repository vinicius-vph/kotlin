package com.example.api_collections

fun main() {
    val  pair: Pair<String, Double> = Pair("Philar", 1000.0)
    val mapeamento = mapOf(pair)

    mapeamento.forEach { (k, v) -> println("Chave: $k - Valor: $v")}

    val mapeamento2 = mapOf(
            "Vinicius" to 2000,
            "Philar" to 5000,
            "Pantina" to 3000
    )

    println("=========================")

    mapeamento2.forEach { (k, v) -> println("Chave: $k - Valor: $v") }
}