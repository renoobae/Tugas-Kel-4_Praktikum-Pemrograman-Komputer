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