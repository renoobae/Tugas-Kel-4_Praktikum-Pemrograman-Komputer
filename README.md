# Tugas-Kel-4_Praktikum-Pemrograman-Komputer
# Nama Kelompok 4
# 1. Satria Anugra
# 2. Reno
# 3. Muhammad Rio Perdana
# 4. Muhammad Raihan Maulana Zaqi
# 5. Muhammad Raffli Renaldi

1.Buat sebuah program dengan method bernama getTotal yang menerima dua bilangan bulat sebagai argumen dan mengembalikan jumlahnya. Panggil metode ini dari main() dan cetak hasilnya.

import java.util.Scanner;

public class tugas1 {
    static int getTotal(int bilangan1, int bilangan2){
        int hasil = bilangan1 + bilangan2;
        return hasil;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan bilangan ke 1");
        int bulat = input.nextInt();
        System.out.println("Masukan bilangan ke 2");
        int bulat2 = input.nextInt();
      
        int hasilsemua = getTotal(bulat, bulat2);
        System.out.println(" hasilnya adalah " + hasilsemua);

        input.close();
    }
    
}
penjelasan :

2.Buat method bernama isEven yang menerima argumen int. Metode harus mengembalikan nilai benar jika argumennya genap, atau salah jika sebaliknya. Tulis juga program untuk menguji metode Anda. 

import java.util.Scanner;
public class Main {
    public static boolean isEven(int angka) {
        return angka % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat: ");
        int bilangan = scanner.nextInt();

        if (isEven(bilangan)) {
            System.out.println(bilangan + " adalah bilangan genap.");
        } else {
            System.out.println(bilangan + " adalah bilangan ganjil.");
        }
    }
}
penjelasan :  dengan menggunakan metode is even bertipe int disebut angka untuk memeriksa angka habis dibagi 2 jika hasilnya 0 maka "true" jika hasil bukan 0 maka angka ganjil "false" mencetak hasil genap atau ganjil denagan scanner

3.Buat metode pengembalian nilai, isVowel yang mengembalikan nilai benar jika karakter tertentu adalah vokal, dan sebaliknya mengembalikan nilai salah. Dalam metode main(), terima string dari pengguna dan hitung jumlah vokal dalam string itu.

4 Bilangan prima adalah bilangan yang hanya habis dibagi oleh dirinya sendiri dan 1. Misalnya bilangan 5 adalah bilangan prima karena hanya dapat dibagi rata oleh 1 dan 5. Namun bilangan 6 bukan bilangan prima karena dapat dibagi merata sebesar 1, 2, 4, dan 6.

5.Buat method bernama isPrime, yang menggunakan bilangan bulat sebagai argumen dan mengembalikan nilai true jika argumennya adalah bilangan prima, atau false jika sebaliknya. Buat juga method main yang menampilkan bilangan prima antara 1 sampai 500.
