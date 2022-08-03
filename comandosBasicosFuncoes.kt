/**
 * Demonstrando criação de funções
 * Criando função com passagem de parâmetro e
 * fazendo chamadas a estas funções dentro da função main
 */

fun novaFuncao(){
    println("Oi, tudo bem?")
}

private fun novaFuncao2(nome: String){
    println("Oi, $nome")
}

fun main() {
	novaFuncao()
    novaFuncao2("Daniel")
}