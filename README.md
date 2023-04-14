# TP2DPBO2023
 
## Janji

Saya Apri Anggara Yudha NIM 2102585 mengerjakan soal TP2 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

## Desain Program

![desain_program](https://user-images.githubusercontent.com/100891594/231963730-7815925f-497d-4b8d-90b4-b7c4d947b992.png)

Program didesain sedemikian rupa karena kebutuhan menyesuaikan kebutuhan alur frame. Selain kelas komponen frame dan panel, terdapat kelas Country dan Volcano untuk membungkus data untuk diolah atau dipindah dan terdapat kelas TP2 sebagai kelas runnable.

## Alur Progarm

1. Kelas TP2 akan dijalankan pertama karena meiliki main
2. Fungsi main pada TP2 langsung memanggil frame Authentication
3. User dapat mengisi akun dan mengklik "Register" untuk menambahkan akun tersebut atau "Login" untuk masuk
4. Setelah user login, terdapat scrollable panel yang berisi kumpulan panel card pada MainFrame
5. Untuk mengganti isi scrollable panel user dapat mengklik tombol "Volcano" atau "Country"
6. Untuk menambahkan data pada list yang sedang ditampilkan, user dapat mengklik "Add"
7. Untuk mengedit atau menghapus sebuah card, user dapat mengklik "Edit" atau "Delete" pada card tersebut

## Menjalankan Progarm

1. Jalankan mySQL
2. Import file "db_volcano.sql" dari folder "SQL file" ke database anda
3. Buka folder "JAR/dist" pada command prompt dan ketikkan `java -jar "TP2.jar"`

## Dokumentasi

Hasil program (dari folder Screenshot):

![01Login Register](https://user-images.githubusercontent.com/100891594/231964002-8a48cf36-6da3-4659-8095-ca77caf9a913.png)
![02VolcanoList](https://user-images.githubusercontent.com/100891594/231964012-7a713eaa-85ba-44af-8326-e719a28112ab.png)
![03CountryList](https://user-images.githubusercontent.com/100891594/231964030-2ecb8360-a9e6-481a-9008-54762c69ed68.png)
![04AddVolcano](https://user-images.githubusercontent.com/100891594/231964039-cea01a67-14a3-4e0d-9c8d-c15af43ec031.png)
![05AddCountry](https://user-images.githubusercontent.com/100891594/231964048-4e79b33e-a5d6-4b64-860e-d581344d3664.png)
![06EditVolcano](https://user-images.githubusercontent.com/100891594/231964122-7846635b-b1c3-45c1-b692-0e01790cc43d.png)
![07EditCountry](https://user-images.githubusercontent.com/100891594/231964145-b26c24dd-cacc-4262-addb-192f57618f7e.png)
