fun main() {
    println("Masukkan Nama: ")
    val name = readLine()

    println("Masukkan Umur: ")
    val umurInput = readLine()
    val umur = umurInput?.toIntOrNull() ?: 0

    println("Masukkan Kota Asal: ")
    val kota = readLine()

    println("\n--- Informasi Diri ---")
    println("Nama: $name")
    println("Umur: $umur")
    println("Kota: $kota")
}