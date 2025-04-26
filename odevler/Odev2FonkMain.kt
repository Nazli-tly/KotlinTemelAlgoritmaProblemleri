package com.example.kotlindersleri.odevler

fun main(){
    val odevler = Odev2Fonk()

    // 1.Soru - Dereceyi Fahrenheit'a dönüştür
    val celsius = 25.0
    println("$celsius derece = ${odevler.celsiusToFahrenheit(celsius)} Fahrenheit")

    // 2.Soru - Diktörtgenin çevresini hesapla
    val length = 5.0
    val width = 10.0
    println("Diktörtgenin çevresi = ${odevler.calculateRectanglePerimeter(length,width)}")

    // 3.Soru - Faktöriyel hesapla
    val number = 5
    println(" $number!=  ${odevler.factorial(number)} ")


    // 4.Soru - 'a' harfi sayısı
    val word = "Ankara"
    println("'$word' kelimesinde ${odevler.countLetterA(word)} adet 'a' harfi var.")

    // 5.Soru - İç açıların toplamı
    val edges = 5
    println("İç açılar toplamı: ${odevler.numberOfEdges(edges)}")

    // 6. Soru - Maaş hesaplayan method
    val daysworked = 20
    println("Toplam Maaş: ${odevler.calculateSalary(daysworked)}")

    // 7.Soru - Kota ücretini hesaplayan method
    val quotaUsed = 52
    println("Kota Ücreti: ${odevler.calculateQuotaFee(quotaUsed)}")

}