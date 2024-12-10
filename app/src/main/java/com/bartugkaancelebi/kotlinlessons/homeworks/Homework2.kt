package com.bartugkaancelebi.kotlinlessons.homeworks

fun main() {

    println(aciHesapla(4))

    maasHesapla(30)

    println(otoparkUcretiHesapla(1))

    println("${kmToMil(2.56)} Mil")

    println("Dikdortgenin alani ${dikDortgenAlanHesapla(3.4, 5.2)}")

    println(faktoryel(4))
    
    eHarfiHesapla("Yemek")
}

// 2.1
fun aciHesapla(kenarSayisi: Int): Int {
    if (kenarSayisi > 2) {
        return ((kenarSayisi - 2) * 180) / kenarSayisi
    } else {
        println("Hatalı kenar sayısı girdiniz")
        return 0
    }
}

// 2.2
fun maasHesapla(gunSayisi: Int) {

    val toplamSaat = gunSayisi * 8
    val normalUcret = 40
    val mesaiUcret = 80

    when (toplamSaat) {
        in 151..Int.MAX_VALUE -> println("Maas Tutari: ${(150 * normalUcret) + ((toplamSaat - 150) * mesaiUcret)} TL")
        in 1..150 -> println("Maas Tutari: ${toplamSaat * normalUcret} TL")
        else -> println("Gecersiz gun degeri girdiniz!")
    }
}

// 2.3
fun otoparkUcretiHesapla(saat: Int): Int {
    val sabitUcret = 50
    val saatlikUcret = 10
    if (saat > 0) {
        return (saat - 1) * saatlikUcret + sabitUcret
    } else {
        println("Gecersiz saat girdiniz!")
        return 0
    }
}

// 2.4
fun kmToMil(birim: Double): Double {
    return birim * 0.621
}

// 2.5
fun dikDortgenAlanHesapla(dikKenar: Double, yatayKenar: Double): Double {
    return dikKenar * yatayKenar
}

// 2.6
fun faktoryel(sayi: Int): Int {
    if (sayi > 1) {
        //recursive fun
        return sayi * faktoryel(sayi - 1)
    } else if (sayi == 1) {
        return sayi
    } else {
        println("Geçerli sayı giriniz")
        return 0
    }
}

// 2.7
fun eHarfiHesapla(kelime: String) {
    var eHarfiSayisi = 0
    for (c in kelime) {
        if (c == 'e') {
            eHarfiSayisi++
        }
    }
    println("$kelime kelimesinde $eHarfiSayisi tane 'e' harfi var!")
}