import java.util.Scanner;

public class Tugas2Porseni28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah politeknik yang berpartisipasi: ");
        int jumlahPoliteknik = sc.nextInt();
        sc.nextLine(); 

        for (int i = 1; i <= jumlahPoliteknik; i++) {
            System.out.println("Politeknik ke-" + i + ":");

            System.out.println("Masukkan nama 5 atlet untuk cabang Badminton:");
            for (int j = 1; j <= 5; j++) {
                System.out.print("Atlet Badminton ke-" + j + ": ");
                String atletBadminton = sc.nextLine();
                System.out.println("Nama atlet Badminton ke-" + j + ": " + atletBadminton);
            }

            System.out.println("Masukkan nama 5 atlet untuk cabang Tenis Meja:");
            for (int j = 1; j <= 5; j++) {
                System.out.print("Atlet Tenis Meja ke-" + j + ": ");
                String atletTenisMeja = sc.nextLine();
                System.out.println("Nama atlet Tenis Meja ke-" + j + ": " + atletTenisMeja);
            }

            System.out.println("Masukkan nama 5 atlet untuk cabang Basket:");
            for (int j = 1; j <= 5; j++) {
                System.out.print("Atlet Basket ke-" + j + ": ");
                String atletBasket = sc.nextLine();
                System.out.println("Nama atlet Basket ke-" + j + ": " + atletBasket);
            }

            System.out.println("Masukkan nama 5 atlet untuk cabang Bola Voli:");
            for (int j = 1; j <= 5; j++) {
                System.out.print("Atlet Bola Voli ke-" + j + ": ");
                String atletBolaVoli = sc.nextLine();
                System.out.println("Nama atlet Bola Voli ke-" + j + ": " + atletBolaVoli);
            }
        }
    }
}
