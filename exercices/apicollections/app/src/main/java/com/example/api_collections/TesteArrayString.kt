package com.example.api_collections

fun main() {
    val nomes = Array(3) {""}

    nomes[0] = "Philar"
    nomes[1] = "Valentina"
    nomes[2] = "Pandora"

    for (nome in nomes) {
        println(nome)
    }

    println("====================")
    nomes.sort()
    nomes.forEach { println(it) }

    val arr = arrayOf("Philar","Valentina","Pandora")
    arr.forEach { print(it) }
}