package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val vinicius = Cliente(
        nome = "Vinicius Santos",
        cpf = "123.456.789-01",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(vinicius)

    TesteAutenticacao().autentica(vinicius)
}