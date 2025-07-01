fun main () {
    print("Masukkan nilai ujian (0-100): ")
    val nilai = readLine()?.toDouble() ?: 0.00

    val skala4 = nilai / 25
    val hasilFormat = String.format("%.2f", skala4)

    println("Nilai $nilai >>> skala 4.0 = $hasilFormat")
}