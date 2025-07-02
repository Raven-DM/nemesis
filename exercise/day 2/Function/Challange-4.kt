fun tambah(a: Int, b: Int): Int {
    return a + b
}

fun kurang(a: Int, b: Int): Int {
    return a - b
}

fun kali(a: Int, b: Int): Int {
    return a * b
}

fun bagi(a: Int, b: Int): Int {
    return a / b
}

fun main() {
    println("Masukkan angka pertama: ")
    val a = readLine()?.toIntOrNull() ?: 0

    println("Masukkan angka kedua: ")
    val b = readLine()?.toIntOrNull() ?: 0

    println("Masukkan operator: ")
    val operator = readLine()
    when (operator) {
        "+" -> println("Hasil: ${tambah(a, b)}")
        "-" -> println("Hasil: ${kurang(a, b)}")
        "*" -> println("Hasil: ${kali(a, b)}")
        "/" -> println("Hasil: ${bagi(a, b)}")
     else -> {println("Inputan tidak valid!")}
    }
}
