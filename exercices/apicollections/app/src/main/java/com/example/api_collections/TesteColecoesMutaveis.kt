package com.example.api_collections

fun main() {
    val vinicius = Funcionario("Vinicius", 5000.00, "CLT")
    val philar = Funcionario("Philar", 10000.00, "PJ")
    val pantina = Funcionario("Pantina", 3000.00, "CLT")

    println("============LIST=============")

    val funcionarios = mutableListOf(vinicius, philar)
    funcionarios.forEach{ println(it)}
    println("============++++=============")
    funcionarios.add(pantina)
    funcionarios.forEach{ println(it)}
    println("============++++=============")
    funcionarios.remove(vinicius)
    funcionarios.forEach{ println(it)}

    println("============SET=============")
    val funcionariosSet = mutableSetOf(vinicius)

    funcionariosSet.add(philar)
    funcionariosSet.add(pantina)

    funcionariosSet.forEach{ println(it)}
    println("============++++=============")
    funcionariosSet.remove(vinicius)
    funcionariosSet.forEach{ println(it)}


}