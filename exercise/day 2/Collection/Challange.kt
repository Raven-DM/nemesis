

val scoreData: MutableMap<String, MutableList<Int>> = mutableMapOf()

fun scoreAverage(nilai: List<Int>): Double {
    return if (nilai.isNotEmpty()) nilai.average() else 0.0
}

fun addStudent() {
    print("Masukkan nama siswa: ")
    val name = readLine()?.trim().orEmpty()

    if (name.isEmpty()) {
        println("Nama tidak boleh kosong.")
        return
    }

    print("Berapa jumlah mata pelajaran? ")

    val totalSubject = readLine()?.toIntOrNull()

    if (totalSubject == null || totalSubject <= 0) {
        println("Jumlah mapel harus diinput.")
        return
    }

    val scoreList = mutableListOf<Int>()
    for(i in 1..totalSubject) {
        print("Nilai mapel ke-$i: ")
        val nilai = readLine()?.toIntOrNull()
        if(nilai !=null && nilai in 0..100) {
            scoreList.add(nilai)
        } else {
            println("Nilai harus dalam rentang 0-100!")
            return
        }
    }
    scoreData[name] = scoreList
    println("Data berhasil ditambahkan. \n")
}

fun lookData(){
    if(scoreData.isEmpty()) {
        println("Belum ada data siswa")
        return
    }

    for((name, nilai) in scoreData) {
        val rataRata = scoreAverage(nilai)
        println("Nama: $name")
        println("Nilai: ${nilai.joinToString(", ")}")
        println("Rata-rata: ${"%.2f".format(rataRata)}\n")

    }
}
    
fun maxScore() {
    val siswaTertinggi = scoreData.maxByOrNull { it.value.maxOrNull() ?: 0 }

    if (siswaTertinggi != null) {
        val nilaiTertinggi = siswaTertinggi.value.maxOrNull() ?: 0
        println("Siswa dengan nilai tertinggi: ${siswaTertinggi.key}")
        println("Nilai Tertinggi: $nilaiTertinggi\n")
    } else {
        println("Belum ada data untuk dianalisis.")
    }
}

fun passStudent(){
    val siswaLulus = scoreData.filter {scoreAverage(it.value) >= 75}

    if(siswaLulus.isEmpty()) {
        println("Tidak ada siswa yang lulus.\n")
    } else {
        println("Daftar siswa yang lulus: ")
        for ((name, nilai) in siswaLulus) {
            val rata = scoreAverage(nilai)
            println(" - $name (Rata-rata: ${"%.2f".format(rata)})")
        }
        println()
    }
}

fun main(){
    while (true) {
        println("=== Menu Nilai Siswa ===")
        println("1. Tambah Nilai Siswa")
        println("2. Lihat Semua Data")
        println("3. Cari Nilai Tertinggi")
        println("4. Siswa yang Lulus")
        println("5. Keluar")

        when (readLine()) {
            "1" -> addStudent()
            "2" -> lookData()
            "3" -> maxScore()
            "4" -> passStudent()
            "5" -> {
                println("Program selesai. Terima kasih.")
                break
            }
            else -> println("Pilihan tidak valid.\n")
        }
    }
}