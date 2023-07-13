package `Exercicio 4`

import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Funcionario(val nome: String, val setor: String, val salario: Double, val dataAdmissao: LocalDate)

class ControleRH {
    private val funcionarios = mutableListOf<Funcionario>()

    fun cadastrarFuncionario(funcionario: Funcionario) {
        funcionarios.add(funcionario)
    }

    fun mostrarFuncionariosCadastrados() {
        println("Funcionários cadastrados:")
        for (funcionario in funcionarios) {
            println("Nome: ${funcionario.nome}")
            println("Setor: ${funcionario.setor}")
            println("Salário: R$ ${funcionario.salario}")
            println("Data de Admissão: ${funcionario.dataAdmissao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))}")
            println("--------------------------")
        }
    }
}

fun main() {
    val controleRH = ControleRH()

    // Criando objetos de exemplo
    val funcionario1 = Funcionario("João da Silva", "Administrativo", 3500.0, LocalDate.of(2020, 5, 10))
    val funcionario2 = Funcionario("Maria Santos", "Financeiro", 4200.0, LocalDate.of(2019, 9, 15))
    val funcionario3 = Funcionario("Pedro Oliveira", "Desenvolvimento", 5000.0, LocalDate.of(2021, 3, 22))

    // Registrando funcionários no controle de RH
    controleRH.cadastrarFuncionario(funcionario1)
    controleRH.cadastrarFuncionario(funcionario2)
    controleRH.cadastrarFuncionario(funcionario3)

    // Mostrando funcionários cadastrados
    controleRH.mostrarFuncionariosCadastrados()
}