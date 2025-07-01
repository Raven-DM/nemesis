---
# 📄 **Pretest Kotlin & Basic Android Development (30 Soal)**
---

### ✅ **Bagian A – Pilihan Ganda (10 Soal)**

1. Apa tipe data untuk menyimpan teks di Kotlin?

   - a. `Char`
   - b. `Int`
   - c. `String`
   - d. `Double`
Jawaban: C

2. Kata kunci `val` digunakan untuk:

   - a. Variabel global
   - b. Variabel tetap (tidak bisa diubah)
   - c. Variabel bisa diubah
   - d. Fungsi cetak
Jawaban: B.

3. Apa hasil dari `println(5 + 3 * 2)`?

   - a. 16
   - b. 11
   - c. 13
   - d. 6
Jawaban: B.

4. Fungsi utama program Kotlin adalah:

   - a. `start()`
   - b. `main()`
   - c. `run()`
   - d. `launch()`
Jawaban: B.

5. Di Android Studio, layout antarmuka ditulis dengan:

   - a. Kotlin
   - b. Java
   - c. XML
   - d. JSON
Jawaban: C.

6. Apa hasil dari kode berikut?

   ```kotlin
   val x = "4"
   println(x + 1)
   ```

   - a. 5
   - b. 41
   - c. Error
   - d. 14
Jawaban: B.

7. Fungsi `readLine()` dalam Kotlin digunakan untuk:

   - a. Menyimpan file
   - b. Menampilkan teks
   - c. Membaca input
   - d. Membuat variabel

Jawaban: C.

8. Apa hasil dari perbandingan berikut: `5 > 3 && 2 < 1`?

   - a. true
   - b. false
   - c. error
   - d. null
Jawaban: B.

9. Android Studio adalah tools untuk:

   - a. Menulis HTML
   - b. Menjalankan script Python
   - c. Membuat aplikasi Android
   - d. Desain presentasi
Jawaban: C.

10. Untuk berpindah dari satu activity ke activity lain di Android, digunakan:

- a. Intent
- b. Fragment
- c. TextView
- d. XML
Jawaban: A.

---

### ✅ **Bagian B – Jawaban Penjelasan Singkat (15 Soal)**

11. Jelaskan perbedaan `val` dan `var` di Kotlin.
Jawaban: `val` meruapakan variabel yang tidak dapat diubah setelah diberi nilai, sedangkan `var` merupakan variabel yang nilainya dapat diubah (mutable)
12. Sebutkan dua tipe data numerik dalam Kotlin.
Jawaban: Int (integer) dan Double
13. Apa kegunaan fungsi `println()`? 
Jawaban: Menampilkan teks atau menampilkan nilai ke konsol
14. Bagaimana cara mengambil input angka dari pengguna dan mengubahnya ke tipe `Int` secara aman?
Jawaban: 
val input = readLine()
val angka = input?.toIntOrNull()
if (angka != null) {
   println("Angka: $angka")
} else {
   println("Tidak Valid.")
}
15. Sebutkan satu contoh layout yang sering digunakan dalam Android dan fungsinya.
Jawaban: LinearLayout untuk mengatur tampilan secara berurutan. baik horizontal maupun vertikal.
16. Apa itu `Intent` dalam Android?
Jawaban: Object yang digunakan untuk pindah antar activity dan kirim data antar komponen
17. Bagaimana cara menampilkan teks di layar Android menggunakan Kotlin dan XML?
Jawaban: 
XML
<TextView
      android:id="@+id/textView"
      android:text="Halo Dunia!"
      android:layout_width="wrap_content"
      android:layout_height="wrap_content" />
Kotlin
val textView = findViewById<TextView>(R.id.textView)
textView.text = "Teks Baru"
18. Apa arti dari null safety dalam Kotlin?
Jawaban: Fitur untuk mengindari error akibat nilai null, bisa gunakan ?, !!, dan ?:
19. Apa perbedaan antara `toInt()` dan `toIntOrNull()`?
Jawaban: `toInt()` mengubah langsung ke Int, bisa error kalau tidak valid. `toIntOrNull()` mengembalikkan null jika konversi gagal agar lebih aman. 
20. Sebutkan minimal satu keunggulan Kotlin dibandingkan Java dalam pengembangan Android.
Jawaban: Syntax yang lebih ringkas, sehingga lebih sedikit code untuk fungsi yang sama
21. Dalam Android Studio, di folder mana biasanya file `activity_main.xml` disimpan?
Jawaban: res/layout/activity_main.xml
22. Bagaimana struktur dasar fungsi utama (`main`) dalam Kotlin? Tuliskan contohnya.
Jawaban: 
fun main() {
   println("Hello World!")
}
23. Apa yang dimaksud dengan `String interpolation` dalam Kotlin?
Jawaban: Teknik menyisipkan variabel ke dalam string
24. Apa arti `?.` dan `?:` dalam penulisan kode Kotlin?
Jawaban:
    `?.` akses jika tidak null
    `?:` default jika null
25. Bagaimana Kotlin menangani error saat input dari user tidak sesuai tipe data?
Jawaban:
val angka = readLine()?.toIntOrNull()
if (angka == null) {
   println("Tidak valid")
}

---

### ✅ **Bagian C – Perbaiki Kode (5 Soal)**

26. Perbaiki dan jelaskan:

```kotlin
fun main() {
    val umur = readLine()
    println("Umur anda adalah " + umur + 5)
}
```
Jawaban:
readLine mengembalikkan String, pada line selanjutnya tambahan 5 juga dilakukan terhadap angka, jadi perlu konversi ke Int.
fun main() {
   val umur = readLine()?.toIntOrNull()
   if (umur != null) {
      println("Umur anda adalah" + (umur + 5))
} else {
      println("Tidak Valid!")
}

---

27. Perbaiki:

```kotlin
val nama: String
println("Halo $nama")
```
Jawaban: 
Variabel nama harus diberi nilai saat deklarasi.
val nama: String = "User"
println("Halo $nama")

---

28. Perbaiki dan jalankan:

```kotlin
fun main() {
    var nama = readLine()
    var umur = readLine()?.toInt()
    println("Nama saya: $nama, umur: umur tahun")
}
```
Jawaban: 
Umur perlu dikonversi dengan toIntOrNull() agar lebih aman dan untuk print variabel umur dalam string perlu ditambahkan interpolasi string.
fun main() {
   var nama = readLine()
   var umur = readLine()?.toIntOrNull()
   if (umur != null) {
      println("Nama saya: $nama, umur: $umur tahun")
} else {
      println("Input umur tidak valid!")
}

---

29. Perbaiki kode berikut agar tidak error:

```kotlin
val angka = "20"
val hasil = angka + 5
println(hasil)
```
Jawaban:
20 pada variabel angka bertipe String, jadi tidak bisa langsung dijumlahkan dengan angka. Perlu di konversi terlebih dahulu ke Int untuk operasi penjumlahan.
val angka = "20"
val hasil = angka.toInt() + 5
println(hasil)

---

30. Debug:

```kotlin
fun main() {
  val tinggi = readLine().toDouble()
  println("Tinggi kamu adalah $tinggi")
}
```
Jawaban: 
Langsung memanggil toDouble dari inputan readLine() tanpa validasi bisa menimbulkan Format Angka yang tidak sesuai serta ada kemungkinan inputan mengembalikkan null.
fun main() {
   val tinggi = readLine()
   val tinggi = input?.toDoubleOrNull()
   if (tinggi != null) {
      println("Tinggi kamu adalah $tinggi")
} else {
      println("Input tidak valid!")
}

---
