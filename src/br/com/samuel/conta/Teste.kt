package br.com.samuel.conta

fun main(){
    val conta1  = Conta(0,"Caixa",13000.05)

    println("Extrato - " +
            "Agencia -${conta1.agencia } \n" +
            " Numero - ${conta1.numero}")
}