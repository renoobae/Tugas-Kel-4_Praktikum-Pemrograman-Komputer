public class isPrime {
    // Method untuk mengecek apakah suatu bilangan bulat adalah bilangan prima
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Bilangan kurang dari atau sama dengan 1 bukan bilangan prima
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Jika ada pembagi selain 1 dan bilangan itu sendiri, bukan bilangan prima
            }
        }

        return true; // Jika tidak ada pembagi selain 1 dan bilangan itu sendiri, bilangan adalah prima
    }

    public static void main(String[] args) {
        // Contoh penggunaan method isPrime
        int bilangan = 7;

        if (isPrime(bilangan)) {
            System.out.println(bilangan + " adalah bilangan prima.");
        } else {
            System.out.println(bilangan + " bukan bilangan prima.");
        }
    }
}
