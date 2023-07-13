package `Exercicio 2`
class Livro(val genero: String, val nome: String, val autor: String)

class Biblioteca {
    private val livros = mutableListOf<Livro>()

    fun cadastrarLivro(livro: Livro) {
        livros.add(livro)
    }

    fun mostrarLivrosCadastrados() {
        println("Livros cadastrados:")
        livros.forEach(){
            println("\nGenero : ${it.genero},\nNome: ${it.nome}, Autor: ${it.autor}")
        }
    }
}

fun main() {
    val biblioteca = Biblioteca()

    val livro1 = Livro("Fantasia", "Harry Potter e a Pedra Filosofal", "J.K. Rowling")
    val livro2 = Livro("Suspense", "O Código Da Vinci", "Dan Brown")
    val livro3 = Livro("Romance", "Orgulho e Preconceito", "Jane Austen")

    biblioteca.cadastrarLivro(livro1)
    biblioteca.cadastrarLivro(livro2)
    biblioteca.cadastrarLivro(livro3)

    biblioteca.mostrarLivrosCadastrados()
}