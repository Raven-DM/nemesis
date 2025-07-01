fun main() {
    println("Nomor Kursi: ")
    val nomor = readLine()?.toIntOrNull() ?: return println("Input tidak valid")

    val status = if (nomor % 2 == 0) "Genap" else "Ganjil"

    println("Nomor Kursi: $nomor")
    println("Status: $status")
    
}