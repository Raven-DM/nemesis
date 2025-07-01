fun main(){
    println("Silahkan pilih menu berikut: \n1. Nasi Goreng\n2. Mie Ayam\n3. Ayam Geprek")
    println("Input:")
    val option = readLine()

    println("Pilihan: $option")
    val chosen = when (option){
        "1" -> "Kamu memilih: Nasi Goreng"
        "2" -> "Kamu memilih: Mie Ayam"
        "3" -> "Kamu memilih: Ayam Geprek"
        else -> {"Pilihan tidak valid"}
    }
    println("Kamu pilih: $chosen")
}