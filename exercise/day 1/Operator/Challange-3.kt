fun main() {
    println("Total belanja: ")
    val  belanja = readLine()?.toDouble() ?: 0.0

    val diskon = (if (belanja > 100000) 0.1 * belanja else 0).toDouble() ?: 0.0

    val total = belanja - diskon

    println("Total belanja: $belanja")
    println("Diskon: $diskon")
    println("Total bayar: $total")
}