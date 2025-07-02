fun konversiSuhu(celcius: Double): Double{
    return (celcius * 9 / 5) + 32
}

fun main(){
    println("Input suhu dalam Celcius: ")
    val celcius = readLine()?.toIntOrNull()

    if(celcius != null){
        val fahrenheit = konversiSuhu(celcius.toDouble())
        println("Suhu dalam Fahrenheit: $fahrenheit")
    } else {
        println("Input suhu tidak valid!")
    }
}