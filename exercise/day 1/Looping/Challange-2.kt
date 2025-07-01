fun main(){
    val secretNumber = 7
    var guess: Int? = null
    var test = 0

    while (guess != secretNumber){
        println("Tebak angka: ")
        guess = readLine()?.toIntOrNull()

        test++
    }
    println("Tebakan anda benar! Jumlah percobaan: $test")
}