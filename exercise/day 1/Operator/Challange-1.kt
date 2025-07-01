fun main() {
    println("Masukkan angka pertama: ")
    val angkaPertama = readLine()?.toDouble() ?: 0.0

    println("Operator: ")
    val operator = readLine()

    println("Masukkan angka kedua: ")
    val angkaKedua = readLine()?.toDouble() ?: 0.0

    val hasil = when (operator) {
        "+" -> angkaPertama + angkaKedua
        "-" -> angkaPertama - angkaKedua
        "*" -> angkaPertama * angkaKedua
        "/" -> angkaPertama / angkaKedua
        else -> {
            println("Operator tidak valid!")
        }
    }
    println("Hasil: $hasil")
}