package com.example.kotlindersleri.odevler

class Odev2Fonk {

    //1.Soru -  Dereceyi Fahrenheit'a dönüştüren fonksiyon
    fun celsiusToFahrenheit(celsius: Double): Double{
        return celsius*1.8+32
    }

    //2.Soru - Dikdörtgenin çevresini hesaplayan fonksiyon
    fun calculateRectanglePerimeter(length: Double, width: Double):Double{
        return 2*(length+width)
    }

    //3.Soru -  Sayının faktöriyel hesaplayan fonksiyon
    fun factorial(number: Int): Long {
        require(number >= 0) { "Number must be non-negative" }
        var result = 1L
        for (i in 2..number) {
            result *= i
        }
        return result
    }

    //4.Soru - Kelime içinde 'a' harfi sayısını bulan fonksiyon
    fun countLetterA(word: String): Int{
        return word.count{it.lowercaseChar()=='a'}

    }
    // 5. Soru - İç açıları toplayan fonksiyon
    fun numberOfEdges(edges: Int): Int{
        return (edges-2)*180
    }

    // 6.Soru - Maaş hesaplayan fonksiyon
    fun calculateSalary(daysWorked: Int): Int{
        val hoursWorked = daysWorked*8
        val normalRate = 10
        val overtimeRate = 20
        val overtimeThreshold = 160
        return if (hoursWorked <= overtimeThreshold) {
            hoursWorked * normalRate
        } else {
            val normalPay = overtimeThreshold * normalRate
            val overtimeHours = hoursWorked - overtimeThreshold
            val overtimePay = overtimeHours * overtimeRate
            normalPay + overtimePay
        }
    }
    // 7. Soru - Kota ücretini hesaplayan method
    fun calculateQuotaFee(quotaUsed: Int): Int {
        val baseQuota = 50
        val baseFee = 100
        val extraFeePerGb = 4

        return if (quotaUsed <= baseQuota) {
            baseFee
        } else {
            val extraQuota = quotaUsed - baseQuota
            baseFee + (extraQuota * extraFeePerGb)
        }
    }


}