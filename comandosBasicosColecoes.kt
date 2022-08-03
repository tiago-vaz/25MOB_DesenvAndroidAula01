/**
 * Demonstrando utilização de coleções
 * Criando listas fixas e mutáveis
 * Imprimindo listas completas, itens da matriz 
 * e adicionando itens em lista mutável
 */
fun main() {
    
   val nomes = listOf("Daniel", "Domingos", "Akira")
   println(nomes)
   println(nomes[2])
   val sobrenomes = mutableListOf("Silva", "Lima", "Pereira")
   println(sobrenomes)
   sobrenomes.add("Fagundes")
   println(sobrenomes)
   
}