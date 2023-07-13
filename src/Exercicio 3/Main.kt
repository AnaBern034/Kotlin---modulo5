package `Exercicio 3`

class Time(val nome: String, val jogadores: Int, val vitorias: Int, val esporte: String)
class ControleTimes {
    private val times = mutableListOf<Time>()

    fun cadastrarTime(time: Time) {
        times.add(time)
    }

    fun mostrarTimesCadastrados() {
        println("Times cadastrados:")
        for (time in times) {
            println("Nome do Time: ${time.nome}")
            println("Quantidade de Jogadores: ${time.jogadores}")
            println("Número de Vitórias: ${time.vitorias}")
            println("Esporte: ${time.esporte}")
            println("--------------------------")
        }
    }
}

fun main() {
    val controleTimes = ControleTimes()

    // Criando objetos de exemplo
    val time1 = Time("Flamengo", 22, 15, "Futebol")
    val time2 = Time("Minas Tênis Clube", 12, 10, "Vôlei")
    val time3 = Time("São Paulo Storm", 20, 5, "Futebol Americano")

    // Registrando times no controle de times
    controleTimes.cadastrarTime(time1)
    controleTimes.cadastrarTime(time2)
    controleTimes.cadastrarTime(time3)

    // Mostrando times cadastrados
    controleTimes.mostrarTimesCadastrados()
}