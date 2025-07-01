fun main (){
    println("Input umur: ")
    val umur = readLine()?.toIntOrNull() ?: return println("Input tidak valid")

    val kategori: String
    if (umur < 13 ){
        kategori = "Anak-anak"
    } else if (umur in 13..19){
        kategori = "Remaja"
    } else if (umur in 20..59){
        kategori = "Dewasa"
    }  else {
        kategori = "Lansia"
    }

    println("Umur: $umur")
    println("Kategori: $kategori")
}