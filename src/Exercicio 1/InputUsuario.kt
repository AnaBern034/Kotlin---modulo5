package `Exercicio 1`

import java.time.LocalDate
import kotlin.random.Random

fun main() {
    val input = InputUsuario()
    for (i in 1.. 3){

        val codigoDeBarras = input.gerarNumeroGrande()

        println("Produto $i")
        println("Digite o nome do produto")
        var nomeProduto1 = readlnOrNull().toString()

        println("Digite a data de validade do formato (Ano - Mes - Dia)")
        var dataProduto1 = readln().let { LocalDate.parse(it) }


        println("-- gerando um código -- ")
        val produto1 = Produtu(nomeProduto1, codigoDeBarras, dataProduto1)
        input.cadastrarProduto(produto1)

    }
    input.mostrarProdutos()
}
data class Produtu(val nome: String, val codigoDeBarras: Long, val dataValidade: LocalDate)

class InputUsuario {
    var produtos = mutableListOf<Produtu>()
    fun cadastrarProduto(produto: Produtu){
        produtos.add(produto)
    }
    fun gerarNumeroGrande(): Long{
        val random = Random(System.currentTimeMillis())
        return random.nextLong(Long.MAX_VALUE)
    }

    fun mostrarProdutos(){
        println("Produtos cadastrados")
        produtos.forEach(){
            println("Nome: ${it.nome},Codigo de barras ${it.codigoDeBarras},Data: ${it.dataValidade}")
        }
    }


}