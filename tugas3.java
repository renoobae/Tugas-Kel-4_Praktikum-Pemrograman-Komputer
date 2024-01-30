import java.util.Scanner;

public class tugas3{
    // Metode untuk mengecek apakah suatu karakter adalah vokal
    public static boolean isVowel(char ch) {
        // Menggunakan switch untuk mengecek apakah karakter termasuk vokal
        switch (Character.toLowerCase(ch)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }

    // Metode utama untuk menghitung jumlah vokal dalam string
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menerima input string dari pengguna
        System.out.print("Masukkan sebuah string: ");
        String userInput = scanner.nextLine();

        // Menghitung jumlah vokal dalam string
        int vowelCount = 0;
        for (int i = 0; i < userInput.length(); i++) {
            if (isVowel(userInput.charAt(i))) {
                vowelCount++;
            }
        }

        // Menampilkan hasil jumlah vokal
        System.out.println("Jumlah vokal dalam string '" + userInput + "' adalah: " + vowelCount);

        // Menutup scanner
        scanner.close();
    }
}

Penjelasan singkat:
- Metode isVowel(char ch) menggunakan pernyataan switch untuk mengecek apakah karakter tertentu adalah vokal.
- Metode main() menerima input string dari pengguna, kemudian menggunakan loop untuk menghitung jumlah vokal dalam string tersebut.
- Hasil jumlah vokal ditampilkan kepada pengguna.
