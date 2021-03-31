package com.example.api_collections

fun main() {
    val salarios = arrayOf(
            "2000".toBigDecimal(),
            "5000".toBigDecimal(),
            "3000".toBigDecimal()
    )

    println("=========================")
    println(salarios.somatoria())

    println("=========================")
    println(salarios.media())

}