package `Exercicio 5`
open class Animal(val nome: String, val raca: String, val responsavel: String) {
    open fun mover() {}
    open fun comer() {}
    open fun dormir() {}
}

class Cachorro(nome: String, raca: String, responsavel: String) : Animal(nome, raca, responsavel) {
    override fun mover() {
        println("Cachorro $nome está andando em 4 patas")
    }

    override fun comer() {
        println("Cachorro $nome está comendo bife")
    }

    override fun dormir() {
        println("Cachorro $nome está dormindo na cama do(a) $responsavel")
    }
}

class Gato(nome: String, raca: String, responsavel: String) : Animal(nome, raca, responsavel) {
    override fun mover() {
        println("Gato $nome está andando e saltando em 4 patas")
    }

    override fun comer() {
        println("Gato $nome está comendo Whiskas sachê")
    }

    override fun dormir() {
        println("Gato $nome está dormindo na caixa")
    }
}

class Passarinho(nome: String, raca: String, responsavel: String) : Animal(nome, raca, responsavel) {
    override fun mover() {
        println("Passarinho $nome está voando")
    }

    override fun comer() {
        println("Passarinho $nome está comendo ração molhada")
    }

    override fun dormir() {
        println("Passarinho $nome está dormindo de olho aberto")
    }
}

fun main() {
    val cachorro1 = Cachorro("Bobby", "Golden Retriever", "Jessica")
    val cachorro2 = Cachorro("Max", "Labrador", "Pedro")

    val gato1 = Gato("Mimi", "Persa", "Maria")
    val gato2 = Gato("Simba", "Siamês", "Lucas")

    val passarinho1 = Passarinho("Piu", "Canário", "Ana")
    val passarinho2 = Passarinho("Tico", "Periquito", "João")

    cachorro1.mover()
    cachorro1.comer()
    cachorro1.dormir()
    println("--------------------")

    cachorro2.mover()
    cachorro2.comer()
    cachorro2.dormir()
    println("--------------------")

    gato1.mover()
    gato1.comer()
    gato1.dormir()
    println("--------------------")

    gato2.mover()
    gato2.comer()
    gato2.dormir()
    println("--------------------")

    passarinho1.mover()
    passarinho1.comer()
    passarinho1.dormir()
    println("--------------------")

    passarinho2.mover()
    passarinho2.comer()
    passarinho2.dormir()
    println("--------------------")
}
