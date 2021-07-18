package br.com.samuel.conta;

public interface MovimentacaoFinanceira {
    fun sacar(valor: Double)

    fun depositar(valor : Double)

    fun transferir(contaBancariaDestino: Conta, valor: Double)

}
