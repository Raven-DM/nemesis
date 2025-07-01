fun main() {
    println("Nama Barang: ")
    val nama = readLine()

    println("Jumlah Barang: ")
    val jumlahInput = readLine()
    val jumlah = jumlahInput?.toIntOrNull() ?:0

    print("Harga per Barang: ")
    val hargaInput = readLine()
    val harga = hargaInput?.toDouble() ?:0.00

    val total = jumlah * harga

    println("Barang: $nama")
    println("Jumlah: $jumlah")
    println("Harga Satuan: $harga")
    println("Total: $total")
}