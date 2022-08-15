package ru.netology.homework41

val scan = java.util.Scanner(System.`in`)
fun main() {
    var typeCard = "Visa"
    //Сумму предыдущих переводов в этом месяце
    // и общий уплаченный налог занесем в массив
    var summaForMonthAndTotalTax = Array(2) { 0.0; 0.0 }

    while (true) {
        println("Введите сумму платежа в руб. или введите 0 для выхода")

        var summa: Int = scan.nextInt()
        if (summa == 0) {
            break;
        }
        summa *= 100

        summaForMonthAndTotalTax = resultSummaForMonthAndTotalTax(
            typeCard,
            summa, summaForMonthAndTotalTax
        )

    }
}

fun resultSummaForMonthAndTotalTax(
    typeCard: String, summa: Int,
    summaForMonthAndTotalTax: Array<Double>
): Array<Double> {

    var outPut: String
    var resultSummaForMonthAndTotalTax = summaForMonthAndTotalTax
    when (typeCard) {

        "Mastercard", "Maestro", "Visa", "Мир" ->
            when {
                summa > 150000_00 ->
                    outPut = "Сумма платежа превышает дневной лимит, попробуйте завтра. \n" +
                            "Общая коммисия составила:" +
                            resultSummaForMonthAndTotalTax[1] + " коп. "


                resultSummaForMonthAndTotalTax[0] > 600000_00 ->
                    outPut = "Превышен месячный лимит, попробуйте в следующем месяце. \n" +
                            "Общая коммисия составила:" +
                            resultSummaForMonthAndTotalTax[1] + " коп. "


                else -> {
                    resultSummaForMonthAndTotalTax[0] += (summa - typeTaxes(typeCard, summa))

                    resultSummaForMonthAndTotalTax[1] += typeTaxes(typeCard, summa)
                    outPut = "Общая коммисия составила:" +
                            resultSummaForMonthAndTotalTax[1] + " коп. "
                }
            }


        else ->
            when {
                summa > 15000_00 ->
                    outPut = "Сумма платежа превышает дневной лимит, попробуйте завтра. \n" +
                            "Общая коммисия составила:" +
                            resultSummaForMonthAndTotalTax[1] + " коп. "


                resultSummaForMonthAndTotalTax[0] > 40000_00 ->
                    outPut = "Превышен месячный лимит, попробуйте в следующем месяце. \n" +
                            "Общая коммисия составила:" +
                            resultSummaForMonthAndTotalTax[1] + " коп. "


                else -> {
                    resultSummaForMonthAndTotalTax[0] += summa - typeTaxes(typeCard, summa)
                    resultSummaForMonthAndTotalTax[1] += typeTaxes(typeCard, summa)
                    outPut = "Общая коммисия составила:" +
                            resultSummaForMonthAndTotalTax[1] + " коп. "
                }


            }

    }


    println(outPut)
    return resultSummaForMonthAndTotalTax
}

fun typeTaxes(typeCard: String, summa: Int): Double = when (typeCard) {
    "Mastercard", "Maestro" ->
        when {
            summa in 300_00..75000_00 -> 0.0
            else -> summa * 0.006 + 20_00
        }

    "Visa", "Мир" ->
        when {
            (summa * 0.0075 < 35_00) -> 35_00.0
            else -> summa * 0.0075
        }

    else -> 0.0
}