fun main() {
    println("Masukkan angka pertama: ")
    val angka1 = readLine()?.toIntOrNull() ?: 0

    println("Masukkan angka kedua: ")
    val angka2 = readLine()?.toIntOrNull() ?: 0

    println("Angka A: $angka1")
    println("Angka B: $angka2")
    val hasil = if(angka1 > angka2) println("Angka lebih besar: $angka1") else println("Angka lebih besar: $angka2")
}