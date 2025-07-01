fun main() {
    println("Input umur: ")
    val umur = readLine()?.toIntOrNull() ?: 0

    println("Apakah aktif member? (true/false): ")
    val member = readLine()?.toBoolean() ?: false

    println("Umur: $umur")
    println("Member: $member")
    val status = if(umur > 21 && member==true) "Boleh masuk" else "Dilarang masuk"
    println("Status: $status")
}