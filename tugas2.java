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