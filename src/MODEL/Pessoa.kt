package MODEL

open class Pessoa(nome : String,saldo: Double) {
    var saldo: Double? = 0.0
    var nome = ""

   var adicionaPessoa = mutableListOf<Pessoa>()
    constructor() : this("",0.0)
    fun cadastroSalario() : Double? {
        println("DIGITE SEU SALARIO")
        saldo = readlnOrNull()?.toDoubleOrNull()
        this.saldo = saldo
        return saldo
    }
    fun cadastroPessoa(){
        println("DIGITE SEU NOME")
        var nome = readlnOrNull()?.toString()
    }
    fun adicionarPessoa(pessoa : Pessoa){
        val pessoa = Pessoa(nome,saldo!!)
        adicionaPessoa.add(pessoa)
    }
}
