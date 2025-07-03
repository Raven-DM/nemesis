---

## ✅ **Bagian 1: Pilihan Ganda (5 Soal)**

```
1. Komponen Android yang digunakan untuk menampilkan teks adalah:
   A. Button
   B. EditText
   C. TextView
   D. ImageView

Jawaban: C

2. Komponen UI yang digunakan untuk mengambil input teks dari pengguna adalah:
   A. Button
   B. TextView
   C. EditText
   D. Spinner

Jawaban: C

3. Untuk menampilkan gambar, kita menggunakan komponen:
   A. WebView
   B. ImageView
   C. RecyclerView
   D. VideoView

Jawaban: B

4. Layout yang memungkinkan penempatan elemen secara bebas dengan constraint disebut:
   A. LinearLayout
   B. RelativeLayout
   C. ConstraintLayout
   D. FrameLayout

Jawaban: C

5. Manakah yang merupakan komponen UI untuk menampilkan daftar data besar secara efisien?
   A. ListView
   B. GridView
   C. RecyclerView
   D. TextView

Jawaban: C

```
---

## 🔄 **Bagian 2: True/False (5 Soal)**

6. `LinearLayout` hanya bisa digunakan untuk tata letak horizontal. (False)
7. `Button` bisa digunakan untuk menampilkan gambar. (True)
8. `ScrollView` hanya dapat memiliki satu child langsung. (True)
9. `Toast` digunakan untuk menampilkan notifikasi yang butuh interaksi pengguna. (False)
10. `findViewById()` digunakan untuk mengambil referensi UI dari layout XML. (True)

---

## ✍️ **Bagian 3: Jawaban Singkat (10 Soal)**

11. Apa nama layout yang cocok untuk membuat UI kompleks dengan aturan posisi antar elemen?
Jawaban: ConstraintLayout
12. Sebutkan dua komponen UI untuk input pilihan pengguna!
Jawaban: Spinner dan RadioButton
13. Fungsi dari `TextInputLayout` adalah untuk...?
Jawaban: Menyediakan label dan validasi intput di EditText
14. Bagaimana cara menambahkan teks ke `TextView` di Kotlin?
Jawaban: TextView.text = "Ini Teks"
15. Apa fungsi `RecyclerView.Adapter` dalam RecyclerView?
Jawaban: Untuk menghubungkan data dan menampilkan item di RecyclerView
16. Apa perbedaan utama antara `TextView` dan `EditText`?
Jawaban: TextView hanya menampilkan teks, sedangkan EditText menerima input teks dari user
17. Komponen apa yang digunakan untuk membuat notifikasi pop-up singkat di layar?
Jawaban: Toast
18. Sebutkan satu perbedaan antara `LinearLayout` dan `RelativeLayout`!
Jawaban: LinearLayout menyusun elemen secara horizontal/vertikal, sedangkan RelativeLayout menyusun elemen berdasarkan posisi relatif antar elemen
19. Apa nama komponen UI untuk menampilkan teks dengan opsi "hint"?
Jawaban: EditText
20. Jika ingin menambahkan ikon di atas tombol, komponen apa yang sebaiknya digunakan?
Jawaban: ImageButton

---

## 🛠️ **Bagian 4: Perbaiki Kode (10 Soal)**

21.

```xml
<TextView
    android:layout_width="match_content"
    android:layout_height="wrap_content"
    android:text="Hello" />
```
Jawaban: syntax match_content tidak valid.
Perbaikan:
<TextView
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Hello" />

22.

```kotlin
val btn = findViewById<Button>(R.id.button)
btn.text("Click Me")
```
Jawaban: btn.text tidak valid
Perbaikan:
val btn = findViewById<Button>(R.id.button)
btn.text = "Click Me"

23.

```xml
<LinearLayout
    android:orientation="vertikal"
    ...>
```
Jawaban: vertikal tidak valid
Perbaikan:
<LinearLayout
    android:orientation="vertical"
    ...>

24.

```kotlin
val text = findViewById<TextView>(R.id.textView)
text.setText = "Hi"
```
Jawaban: text.setText tidak valid
Perbaikan:
val text = findViewById<TextView>(R.id.textView)
text.text = "Hi"

25.

```xml
<ImageView
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:src="image.png" />
```
Jawaban: Isi android:src seharusnya referensi resource
Perbaikan:
<ImageView
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:src="@drawable/image" />

26.

```kotlin
val input = findViewById<EditText>(R.id.input)
val value = input.getText().toString
```
Jawaban: toString harus dipanggil dengan tanda kurung
Perbaikan:
val input = findViewById<EditText>(R.id.input)
val value = input.text.toString()

27.

```xml
<Button
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:onClick="doSomething()" />
```
Jawaban: Pemanggilan syntax doSomething salah.
Perbaikan:
<Button
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:onClick="doSomething" />

28.

```kotlin
Toast.makeText(this, "Saved!", LENGTH_LONG).show()
```
Jawaban: LENGTH_LONG perlu dipanggil dari Toast
Perbaikan:
Toast.makeText(this, "Saved!", Toast.LENGTH_LONG).show()

29.

```xml
<EditText
    android:hintText="Enter name"
    ... />
```
Jawaban: android:hintText bukan atribut yang valid
Perbaikan:
<EditText
    android:hint="Enter name"
    ... />

30.

```kotlin
val layout = LinearLayout(this)
layout.orientation = LinearLayout.VERTICAL
setContent(layout)
```
Jawaban: setContent bukan metode yang valid
Perbaikan:
val layout = LinearLayout(this)
layout.orientation = LinearLayout.VERTICAL
setContentView(layout)

---
