fun main(){
    println("Input Text: ")
    val text = readLine()
    
    println("Jumlah Text: ")
    val total = readLine()?.toIntOrNull() ?: 0

    for(i in 1..total){
        println(text)
    }
}