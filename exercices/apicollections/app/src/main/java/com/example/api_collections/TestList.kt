package com.example.api_collections

fun main() {
    val vinicius = Funcionario("Vinicius", 5000.00, "CLT")
    val philar = Funcionario("Philar", 10000.00, "PJ")
    val pantina = Funcionario("Pantina", 3000.00, "CLT")

    val funcionarios = listOf(vinicius,pantina,philar)

    funcionarios.forEach { println(it) }
    println("=========================")
    println(funcionarios.find { it.nome == "Philar" } )

    println("============++++=============")
    funcionarios
            .sortedBy { it.salario }
            .forEach { println(it) }
    println("============+*****=============")
    funcionarios
            .groupBy { it.tipoContratacao }
            .forEach { println(it) }
}

data class Funcionario(
        val nome: String,
        val salario: Double,
        val tipoContratacao: String
) {
    override fun toString(): String =
        """
            Nome:   $nome
            Salário: $salario
            
        """.trimIndent()

}

