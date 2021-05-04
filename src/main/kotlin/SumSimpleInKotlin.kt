//Entrada
//O arquivo de entrada contém 2 valores inteiros.

//Saída
//Imprima a variável SOMA com todas as letras maiúsculas, inserindo um espaço em branco antes e depois do símbolo de igualdade, seguido pelo valor correspondente à soma de A e B.
import java.util.Scanner

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)
    val numberOne = input.nextInt()
    val numberTwo = input.nextInt()

    val sum = numberOne + numberTwo

    println("SOMA = "+ sum)
}