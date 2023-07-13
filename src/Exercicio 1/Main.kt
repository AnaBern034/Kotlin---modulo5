package `Exercicio 1`

import java.time.LocalDate
data class Produto(val nome: String, val codigoDeBarras: String, val dataValidade: LocalDate)
fun main() {
        val sistemaSupermercado = SistemaSupermercado()

        val produto1 = Produto("Frutinha", "7891234567890", LocalDate.of(2023, 12, 31))
        val produto2 = Produto("Acidos", "1234567890123", LocalDate.of(2024, 6, 30))
        val produto3 = Produto("Enlatados", "4567890123456", LocalDate.of(2023, 9, 30))

        sistemaSupermercado.cadastrarProduto(produto1)
        sistemaSupermercado.cadastrarProduto(produto2)
        sistemaSupermercado.cadastrarProduto(produto3)

        sistemaSupermercado.mostrarProdutosCadastrados()
    }class SistemaSupermercado {
    private val produtos = mutableListOf<Produto>()

    fun cadastrarProduto(produto: Produto) {
        produtos.add(produto)
    }

    fun mostrarProdutosCadastrados() {
        println("Produtos cadastrados:")
        produtos.forEach(){
            println("Nome : ${it.nome}, Código de barra: ${it.codigoDeBarras}, Data: ${it.dataValidade}")
        }
    }
}

