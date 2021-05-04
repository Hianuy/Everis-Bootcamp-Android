/*
Desafio
Há um país denominado Lolipad, todos os habitantes ficam felizes em pagar seus impostos, pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem qualquer desvio. A moeda deste país é o Loli, cujo símbolo é o R$.
Você terá o desafio de ler um valor com duas casas decimais, equivalente ao salário de uma pessoa de Loli. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais.
Entrada
A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.
Saída
Imprima o texto "R$" seguido de um espaço e do valor total devido de Imposto de Renda, com duas casas após o ponto. Se o valor de entrada for menor ou igual a 2000, deverá ser impressa a mensagem "Isento".
 */
fun main(args: Array<String>) {

    fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',', '.')
    val input = readLine()!!.toFloat()
    var tax = 0f

    when {
        input <= 2000 -> tax = 0f
        input in 2000.01..3000.0 ->
            tax = ((input - 2000.0) * 0.08).toFloat()

        input in 3000.01..4500.0 ->
            tax = (1000.0 * 0.08 + (input - 3000.0) * 0.18).toFloat()

        input > 4500 ->
            tax = (1000.0 * 0.08 + 1500.0 * 0.18 + (input - 4500.0) * 0.28).toFloat()

    }
    if (tax == 0F) println("Isento") else println("R$ ${tax.format(2)}")

}