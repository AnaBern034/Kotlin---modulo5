package REPOSITORY

import MODEL.Pessoa

open class ContaSalario (pessoa: Pessoa) : Pessoa(){
    var saldoAtual : Double? = 0.0

    fun verificacaoSalario(){
        cadastroSalario()
        while (saldo != null && saldo!! < 1200) {
            println("Saldo insuficiete, digite novamente")
            cadastroSalario()
        }
    }

    fun verificacaoSaque( input : Double?){
        if (input != null) {
            while (input!! > saldo!!) {
                println("Saldo insuficiente para a retirada da conta")
            }
        }
        if (saldo!! > input!!){
            saldoAtual = saldo!! - input

        }
        println("Saldo atual $saldoAtual")
    }
    fun verificarSaldo(pessoa: Pessoa){
        println("Digite seu nome")
        var nome = readlnOrNull()?.toDoubleOrNull()

        for (i in adicionaPessoa){
            if (i.nome.equals(nome)){
                println("Digite a quantidade para adicionar")
                var input = readlnOrNull()?.toDoubleOrNull()
                if (input != null) {
                    saldoAtual = saldoAtual!! + input
                    println("Saldo atual $saldoAtual")
                }
            }else{
                println("Você não está cadastrado ")
            }
        }

    }
}
