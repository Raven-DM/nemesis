fun main (){
    println("Input nilai: ")
    val nilai = readLine()?.toIntOrNull() ?: return println("Input tidak valid")

    val predikat: String
    if (nilai in 85..100){
        predikat = "A"
    } else if (nilai in 70..84){
        predikat = "B"
    } else if (nilai in 60..69){
        predikat = "C"
    } else if (nilai in 50..59){
        predikat = "D"
    } else {
        predikat = "C"
    }

    println("Nilai: $nilai")
    println("Predikat: $predikat")

}