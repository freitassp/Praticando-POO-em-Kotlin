package br.com.samuel.conta

class ContaPessoaFisica (
    numero: Int,
    agencia: String

        ) {
    private val _numeroconta = numero
    private val _agencia = agencia

    init {
        println("num: ${_numeroconta} - agencia: ${_agencia}")
    }
}




fun main() {
   val conta1 = ContaPessoaFisica(123, "caixa")




   var conta2 = ContaPessoaFisica(56, "BB")
}