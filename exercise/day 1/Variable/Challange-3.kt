fun main() {
    println("Masukkan Nama Mahasiswa: ")
    val nama = readLine()

    println("Apakah mahasiswa aktif? (true/false): ")
    val statusInput = readLine()
    val isAktif = statusInput.toBoolean() ?: false

    println("Nama: $nama")
    println("Mahasiswa Aktif: $isAktif")
}