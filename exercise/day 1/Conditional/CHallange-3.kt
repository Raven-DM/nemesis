fun main(){
    println("Input username: ")
    val username = readLine()

    println("Input password: ")
    val password = readLine()

    val login = if(username == "admin" && password == "1234") "Login berhasil!" else "Username/password salah"
    println(login)
}