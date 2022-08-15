package ru.netology.homework41

import org.junit.Assert.assertEquals
import org.junit.Test


class MainKtTest {

    @Test
    fun resultSummaForMonthAndTotalTaxLimitDayVisa() {
        val typeCard = "Visa"
        var summaForMonthAndTotalTax = Array(2) { 0.0; 0.0 }
        val summa = 200000_00
        //Сумму предыдущих переводов в этом месяце
        // и общий уплаченный налог занесем в массив

        summaForMonthAndTotalTax = resultSummaForMonthAndTotalTax(
            typeCard,
            summa, summaForMonthAndTotalTax
        )
        assertEquals(0.0, summaForMonthAndTotalTax[1], 0.00000001)
    }

    @Test
    fun resultSummaForMonthAndTotalTaxMonthLimitVisa() {
        val typeCard = "Visa"
        var summaForMonthAndTotalTax = Array(2) { 0.0; 0.0 }

        val summa = 120000_00

        //Сумму предыдущих переводов в этом месяце
        // и общий уплаченный налог занесем в массив
        summaForMonthAndTotalTax[0] = 610000_00.0
        summaForMonthAndTotalTax = resultSummaForMonthAndTotalTax(
            typeCard,
            summa, summaForMonthAndTotalTax
        )
        assertEquals(610000_00.00, summaForMonthAndTotalTax[0], 0.00000001)
    }

    @Test
    fun resultSummaForMonthAndTotalTaxLimitDayVk() {
        val typeCard = ""
        var summaForMonthAndTotalTax = Array(2) { 0.0; 0.0 }
        val summa = 120000_00
        //Сумму предыдущих переводов в этом месяце
        // и общий уплаченный налог занесем в массив

        summaForMonthAndTotalTax = resultSummaForMonthAndTotalTax(
            typeCard,
            summa, summaForMonthAndTotalTax
        )
        assertEquals(0.0, summaForMonthAndTotalTax[0], 0.00000001)
    }

    @Test
    fun resultSummaForMonthAndTotalTaxMonthLimitVK() {
        val typeCard = ""
        var summaForMonthAndTotalTax = Array(2) { 0.0; 0.0 }

        val summa = 15000_00

        //Сумму предыдущих переводов в этом месяце
        // и общий уплаченный налог занесем в массив
        summaForMonthAndTotalTax[0] = 610000_00.0
        summaForMonthAndTotalTax = resultSummaForMonthAndTotalTax(
            typeCard,
            summa, summaForMonthAndTotalTax
        )
        assertEquals(610000_00.00, summaForMonthAndTotalTax[0], 0.00000001)
    }

    @Test
    fun resultSummaForMonthAndTotalTaxVisa() {
        val typeCard = "Visa"
        var summaForMonthAndTotalTax = Array(2) { 0.0; 0.0 }
        val summa = 120000_00
        //Сумму предыдущих переводов в этом месяце
        // и общий уплаченный налог занесем в массив

        summaForMonthAndTotalTax = resultSummaForMonthAndTotalTax(
            typeCard,
            summa, summaForMonthAndTotalTax
        )
        assertEquals(90000.0, summaForMonthAndTotalTax[1], 0.00000001)
    }

    @Test
    fun resultSummaForMonthAndTotalTaxMastercard() {
        val typeCard = "Mastercard"
        var summaForMonthAndTotalTax = Array(2) { 0.0; 0.0 }
        val summa = 120000_00
        //Сумму предыдущих переводов в этом месяце
        // и общий уплаченный налог занесем в массив

        summaForMonthAndTotalTax = resultSummaForMonthAndTotalTax(
            typeCard,
            summa, summaForMonthAndTotalTax
        )
        assertEquals(74000.0, summaForMonthAndTotalTax[1], 0.00000001)
    }

    @Test
    fun resultSummaForMonthAndTotalTaxMastercardLowSumma() {
        val typeCard = "Mastercard"
        var summaForMonthAndTotalTax = Array(2) { 0.0; 0.0 }
        val summa = 100_00
        //Сумму предыдущих переводов в этом месяце
        // и общий уплаченный налог занесем в массив

        summaForMonthAndTotalTax = resultSummaForMonthAndTotalTax(
            typeCard,
            summa, summaForMonthAndTotalTax
        )
        assertEquals(2060.0, summaForMonthAndTotalTax[1], 0.00000001)
    }

    @Test
    fun resultSummaForMonthAndTotalTaxMastercardMiddleSumma() {
        val typeCard = "Mastercard"
        var summaForMonthAndTotalTax = Array(2) { 0.0; 0.0 }
        val summa = 500_00
        //Сумму предыдущих переводов в этом месяце
        // и общий уплаченный налог занесем в массив

        summaForMonthAndTotalTax = resultSummaForMonthAndTotalTax(
            typeCard,
            summa, summaForMonthAndTotalTax
        )
        assertEquals(0.0, summaForMonthAndTotalTax[1], 0.00000001)
    }

    @Test
    fun resultSummaForMonthAndTotalTaxVisaLowSumma() {
        val typeCard = "Visa"
        var summaForMonthAndTotalTax = Array(2) { 0.0; 0.0 }
        val summa = 100_00
        //Сумму предыдущих переводов в этом месяце
        // и общий уплаченный налог занесем в массив

        summaForMonthAndTotalTax = resultSummaForMonthAndTotalTax(
            typeCard,
            summa, summaForMonthAndTotalTax
        )
        assertEquals(3500.0, summaForMonthAndTotalTax[1], 0.00000001)
    }

    @Test
    fun resultSummaForMonthAndTotalTaxVK() {
        val typeCard = ""
        var summaForMonthAndTotalTax = Array(2) { 0.0; 0.0 }
        val summa = 14000_00
        //Сумму предыдущих переводов в этом месяце
        // и общий уплаченный налог занесем в массив

        summaForMonthAndTotalTax = resultSummaForMonthAndTotalTax(
            typeCard,
            summa, summaForMonthAndTotalTax
        )
        assertEquals(0.0, summaForMonthAndTotalTax[1], 0.00000001)
    }

}
