package com.example.api_collections

fun main() {
    val vinicius = Funcionario("Vinicius", 5000.00, "CLT")
    val philar = Funcionario("Philar", 10000.00, "PJ")
    val pantina = Funcionario("Pantina", 3000.00, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(vinicius.nome, vinicius)
    repositorio.create(philar.nome, philar)
    repositorio.create(pantina.nome, pantina)

    println(repositorio.findById(pantina.nome))

    println("=========================")
    repositorio.findAll().forEach { println(it)}
    println("=========================")
    repositorio.remove(vinicius.nome)
    repositorio.findAll().forEach { println(it)}

}