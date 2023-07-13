package CONTROLLER

import MODEL.Pessoa
import REPOSITORY.ContaSalario

class MenuSalario {

    fun menu (pessoa: ContaSalario){
        while(true){
        println("Digite para conta" +
                "\n 1 - Cadastrar" +
                "\n 2 - Saque" +
                "\n 3 - Saldo" +
                "\n 4 - Sair")
        var input = readlnOrNull()?.toDoubleOrNull()

        when(input){
            1.0 ->{ pessoa.verificacaoSalario()
            pessoa.cadastroPessoa()
            pessoa.adicionarPessoa(pessoa)}
            2.0 -> pessoa.verificarSaldo(pessoa)
            3.0 -> {
                println("Digite o valor para ser sacado")
                var input = readlnOrNull()?.toDoubleOrNull()
                pessoa.verificacaoSaque(input)
            }
            4.0 -> break .

        }

    }
    }
}