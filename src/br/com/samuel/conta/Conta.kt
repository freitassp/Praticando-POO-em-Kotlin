package br.com.samuel.conta

abstract class Conta (
    val numero: Int,
    val agencia: String,
   private var _saldo: Double = 0.0
) : MovimentacaoFinanceira {

    abstract fun taxa(): Double

   private fun temSaldo(valor : Double) : Boolean {
        return (_saldo >= valor)
    }

     fun getSaldo() : Double {
        return _saldo
    }

    override fun sacar(valor: Double)  {
        if(temSaldo(valor){
            _saldo -= valor
            println("Saque  -> Valor: $valor ")
            }else {
                println("Saque -> Não há saldo suficiente!")
        }
    }

    override fun depositar(valor: Double) {
        if (_saldo > 0){
            _saldo += valor
            println("Deposito -> Valor: $valor")
        }else {
            println("Deposito -> Informe um valor válido para depósito")
        }
    }

    override fun transferir(contaBancariaDestino: Conta, valor: Double) {
        if(temSaldo(valor)){
            this.sacar(valor)
            contaBancariaDestino.depositar(valor)
            println("Transferir -> Valor: $valor")
        }
    }
}