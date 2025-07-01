fun main(){
    while(true){
        println("\nMenu: ")
        println("1. Lihat Menu")
        println("2. Beli")
        println("3. Keluar")

        val option = readLine()?.toIntOrNull() ?: 0
        when(option){
            1 -> println("Menu: Nasi Goreng, Mie Ayam")
            2 -> println("Silahkan pilih makanan dan lakukan pembayaran")
            3 -> {
                println("Terima kasih!")
                break
            }
            else -> println("Pilihan tidak valid")
        }
    }
    

}