```

## ✅ **Bagian 1: Pilihan Ganda (5 Soal)**

1. Fragment digunakan untuk: A. Menyimpan data permanen
   B. Menampilkan halaman web
   C. Membagi antarmuka aplikasi ke dalam bagian modular
   D. Menyimpan file gambar

Jawaban: C

2. Kelas dasar untuk membuat fragment adalah: A. `AppCompatFragment`
   B. `FragmentManager`
   C. `Fragment`
   D. `SupportFragment`

Jawaban: C

3. Metode untuk menambahkan fragment ke activity adalah: A. `addView()`
   B. `beginTransaction().add()`
   C. `inflate()`
   D. `pushFragment()`

Jawaban: B

4. Untuk mengelola fragment, kita menggunakan: A. `ActivityManager`
   B. `FragmentAdapter`
   C. `FragmentManager`
   D. `Intent`

Jawaban: C

5. Layout container yang umum digunakan untuk menempatkan fragment di XML adalah:
   A. `TextView`
   B. `LinearLayout`
   C. `FrameLayout`
   D. `ListView`

Jawaban: C

```

---

## 🔄 **Bagian 2: True/False (5 Soal)**

6. Fragment memiliki lifecycle yang sama persis dengan Activity. (False)
7. Satu activity bisa menampilkan lebih dari satu fragment. (True)
8. Kita tidak bisa mengganti fragment yang sedang ditampilkan. (False)
9. Fragment bisa mengakses komponen UI dari activity langsung. (True)
10. Fragment tidak bisa hidup tanpa activity. (True)

---

## ✍️ **Bagian 3: Jawaban Singkat (10 Soal)**

11. Apa fungsi `FragmentManager` dalam Android?
Jawaban: Mengelola fragment di activity, seperti menambahkan, menghapus, mengganti, dan navigasi antar fragment
12. Apa metode yang digunakan untuk menghubungkan layout XML ke fragment?
Jawaban: menggunakan LayoutInflater.inflate() pada OnCreateView()
13. Sebutkan dua metode lifecycle penting pada fragment!
Jawaban: OnCreateView() dan OnCreate()
14. Bagaimana cara mengirim data dari activity ke fragment?
Jawaban: SetArgument(Bundle), untuk ambil data di fragment menggunakan getAruments()
15. Mengapa kita menggunakan `FrameLayout` untuk fragment container?
Jawaban: Karena fleksibel untuk menampung satu fragment penuh dan mudah dibuat saat transaksi fragment
16. Apa perbedaan antara `replace()` dan `add()` saat transaksi fragment?
Jawaban: replace() mengganti fragment lama dengan fragment baru, sedangkan add() menambahkan fragment baru di atas fragment lama tanpa menghapusnya
17. Apakah fragment bisa berdiri sendiri tanpa activity? Jelaskan singkat.
Jawaban: Tidak bisa, karena fragment membutuhkan Activity sebagai host dan lifecycle serta konteksnya bergantung pada Activity
18. Bagaimana cara kembali ke fragment sebelumnya setelah `replace()`?
Jawaban: Tambahkan transaksi back stack dengan addToBackStack() sebelum commit()
19. Apa tujuan dari `setArguments(Bundle)` di fragment?
Jawaban: Untuk mengirim data saat fragment dibuat agar bisa digunakan selama lifecycle fragment
20. Sebutkan alasan menggunakan fragment dibanding activity!
Jawaban: Lebih modular, hemat resource, UI dinamis, dan kompononen dalam satu Activity

---

## 🛠️ **Bagian 4: Perbaikan Kode (10 Soal)**

21.

```kotlin
val fragment = ExampleFragment()
supportFragmentManager.beginTransaction.add(R.id.container, fragment).commit()
```
Jawaban: .beginTransaction harusnya dipanggil sebagai method
Perbaikan:
val fragment = ExampleFragment()
supportFragmentManager.beginTransaction()
    .add(R.id.container, fragment)
    .commit()

22.

```kotlin
class MyFragment : Fragment {
    override fun onCreateView(...) { ... }
}
```
Jawaban: Fragment harus di-extend dengan ()
Perbaikan:
class MyFragment : Fragment() {
    override fun onCreateView(...) {...}
}

23.

```xml
<fragment
    android:name="MyFragment"
    android:id="@+id/my_fragment"
    android:layout_width="match_parent"
    android:layout_heigth="match_parent" />
```
Jawaban: Typo pada heigth
Perbaikan:
<fragment
    android:name="MyFragment"
    android:id="@+id/my_fragment"
    android:layout_width="match_parent"
    android:layout_height="match_parent" />

24.

```kotlin
val bundle = Bundle()
bundle.putString("key", "value")
fragment.arguments(bundle)
```
Jawaban: fragment.arguments(bundle) tidak valid
Perbaikan:
val bundle = Bundle()
bundle.putString("key", "value")
fragment.arguments = bundle

25.

```kotlin
supportFragmentManager.beginTransaction()
    .replace(R.id.container, NewFragment())
    .addToBackStack()
    .commit()
```
Jawaban: .addToBackStack() membutuhkan argumen
supportFragmentManager.beginTransaction()
    .replace(R.id.container, NewFragment())
    .addToBackStack(null)
    .commit()

26.

```kotlin
class MyFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_my, container, false)
    }
}
```
Jawaban: Code di atas sudah benar

27.

```kotlin
val fragment = MyFragment()
val args = Bundle()
args.putInt("id", 10)
fragment.setBundle(args)
```
Jawaban: setBundle tidak valid
Perbaikan:
val fragment = MyFragment()
val args = Bundle()
args.putInt("id", 10)
fragment.arguments = args

28.

```kotlin
supportFragmentManager.pop()
```
Jawaban: method pop() tidak valid
Perbaikan:
supportFragmentManager.popBackStack()

29.

```kotlin
activity.supportFragmentManager.beginTransaction()
    .remove(fragment)
    .commitNowAllowingStateLoss()
```
Jawaban: Code di atas sudah benar

30.

```kotlin
val view = inflater.inflate(R.layout.fragment_home)
```
Jawaban: parameter dalam inflate tidak lengkap
Perbaikan:
val view = inflater.inflate(R.layout.fragment_home, container, false)

---
