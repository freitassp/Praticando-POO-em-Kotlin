package br.com.samuel.conta

fun main(){
    val conta = ContaPoupanca(123,001)
    println("saldo: ${conta.getSaldo()}")
    //conta.depositar(50)
    println("saldo: ${conta.getSaldo()}")
}