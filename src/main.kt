import CONTROLLER.MenuSalario
import MODEL.Pessoa
import REPOSITORY.ContaCorrente
import REPOSITORY.ContaSalario

fun main() {
    var ana = Pessoa()
    val contaSalario = ContaSalario(ana)


    println("============== MENU ==================")
    println("\n1 -  Conta Corrente" +
            "\n 2 - Conta Poupança " +
            "\n 3 - Conta Salario ")
    var input = readlnOrNull()?.toDoubleOrNull()

    when(input) {
        3.0 ->{MenuSalario().menu(contaSalario)

            3

        }
    }
}
