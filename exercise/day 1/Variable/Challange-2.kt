fun main() {

    println("Masukkan tahun lahir anda: ")
    val lahirInput = readLine()
    val lahir = lahirInput?.toIntOrNull() ?: 0

    println("Masukkan tahun sekarang: ")
    val sekarangInput = readLine()
    val sekarang = sekarangInput?.toIntOrNull() ?: 2025

    val usia = sekarang - lahir

    println("Tahun lahir: $lahir")
    println("Tahun sekarang: $sekarang")
    println("Usia Anda: $usia tahun")

}