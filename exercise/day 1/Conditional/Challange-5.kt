fun main() {
    println("Input umur: ")
    val umur = readLine()?.toIntOrNull() ?: 0

    println("Apakah aktif member VIP? (true/false): ")
    val member = readLine()?.toBoolean() ?: false

    println("Umur: $umur")
    println("Member VIP: $member")
    val status = if(umur > 18 && member==true) "Diperbolehkan masuk" else "Dilarang masuk"
    println("Status: $status")
}