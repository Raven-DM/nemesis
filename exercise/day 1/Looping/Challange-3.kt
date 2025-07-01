fun main(){
    var total = 0
    for(i in 1..5){
        println("Input nilai: ")
        val nilai = readLine()?.toIntOrNull() ?: 0
        total += nilai
    }

    val average = total / 5

    println("Total: $total")
    println("Rata-rata: $average")
}