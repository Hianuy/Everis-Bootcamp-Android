/*

Neste problema você é solicitado a escrever um simples programa de conversão de base. A entrada será um valor hexadecimal ou decimal. Você deverá converter cada valor da entrada. Se o valor for hexadecimal, você deve convertê-lo para decimal e vice-versa. O valor hexadecimal inicia sempre com “0x” ou também, é aquele valor cuja segunda casa contém a letra 'x'.

Entrada
A entrada contém vários casos de teste. Cada linha de entrada, com exceção da última, contém um número não-negativo, decimal ou hexa. O valor decimal será menor ou igual a 231. A última linha contém um número negativo que não deve ser processado, indicando o encerramento do programa.

Saída
Para cada linha de entrada (exceto a última) deve ser produzido uma linha de saída. Todos os número hexadecimal deve ser precedido na saída por '0x' (zero xis).
 */
fun main(args: Array<String>) {


    val patternHexadecimal = """0[a-zA-Z].*""".toRegex()
    val patternHex = """[a-zA-Z].*""".toRegex()
    val listTotal = mutableListOf<String>()
    var valor = true

    while(valor) {
        val input = readLine()!!.toString()

        //Se o número for decimal
        if (!input.contains(patternHexadecimal) && input.toInt() > 0 && input.toInt() < Integer.MAX_VALUE)  {
            val inputInt = input.toInt()
            val decimal = Integer.toHexString(inputInt).toUpperCase()
            val hexadecimal = "0x$decimal"

            listTotal.add(hexadecimal)
        }

        if(input == "-1"){
            valor = false
        }

        //Se o número for hexadecimal
        if (input.contains(patternHexadecimal) && input.contains(patternHex)) {
            val remover = input.removeRange(0,2)
            val result: Int = remover.toInt(16)
            listTotal.add(result.toString())
        }
    }

    for (i in listTotal){
        println(i)
    }
}