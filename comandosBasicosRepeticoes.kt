/**
 * Demonstrando laços de repetição
 * Imprimindo valores de lista e também imprimindo sequências numéricas
 */
fun main() {
    
   val nomes = listOf("Daniel", "Domingos", "Akira")
   for (nome in nomes){
       println(nome)
   }
   for (i in 1..5){
       println(i)
   }
   for (i in 1 until 5){
       print(i)
   }
}