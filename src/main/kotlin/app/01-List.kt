package app

//list adalah collection yang datanya seperti array dan memiliki akses data menggunakan index
//list merupakan sebuah interface yang menampung function-function yang dapat berguna dalam penulisan list
//data di list boleh duplicate artinya kita boleh memasukkan data yang sama berkali-kali ke dalam sebuah list yang sama
//perbedaan array dan list adalah pada array ukuran datanya bersifat constant/sudah fix jadi tidak bisa ditambah lagi sedangkan pada list datanya masih dapat ditambah sebanyak yang kita mau

fun main() {
    val list: List<String> = listOf("Eko", "Kurniawan", "Khannedy")

    println(list[0])//ini merupakan proses pengaksesan data menggunakan index
    println(list[1])//ini merupakan proses pengaksesan data menggunakan index
    println(list[2])//ini merupakan proses pengaksesan data menggunakan index
    println(list.indexOf("Kurniawan"))//untuk mengecek pada data ke berapa posisi "Kurniawan"
    println(list.indexOf("Tidak Ada"))//karena data yang dicek tidak tersedia maka hasil yang akan ditampilkan adalah negatif satu atau -1
    println(list.contains("Eko"))//untuk mengecek apakah data tersedia apa tidak,yang mana sifat dari function contains adalah boolean jadi true atau false
    println(list.contains("Tidak Ada"))
    println(list.containsAll(listOf("Eko", "Khannedy")))//untuk mengecek apakah data tersedia apa tidak lebih dari satu buah,yang mana sifat dari function contains adalah boolean jadi true atau false
    println(list.isEmpty())//untuk mengecek listnya kosong atau tidak,namun ini bukan merupakan function dari interface list melainkan berasal dari generic function
    println(list.isNotEmpty())//untuk mengecek listnya terdapat isi atau tidak,namun ini bukan merupakan function dari interface list melainkan berasal dari generic function
}