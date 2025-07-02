fun luasPersegi(sisi: Int): Int {
    return sisi * sisi
}

fun main() {
    println("Input sisi: ")
    val sisi = readLine()?.toIntOrNull()

    if(sisi != null){
        val luas = luasPersegi(sisi)
        println("Luas persegi: $luas")
    } else {
        println("Inputan tidak valid!")
    }
}
