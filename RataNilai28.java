import java.util.Scanner;

public class RataNilai28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        float nilaimhs, ttlNilai, rataNilai;
            
        i=1;
        while (i<=5) {
            ttlNilai=0;
            System.out.println("Input Nilai Mahasiswa ke " + i);

            for (j = 1; j <=5; j++) {
                System.out.print("Nilai ke-" + j + " = ");
                nilaimhs=sc.nextFloat();
                ttlNilai+=nilaimhs;
            }
            rataNilai=ttlNilai/5;
            System.out.print("Rata-rata Nilai Mahasiswa ke " + i + " adalah " + rataNilai);
            System.out.println();
            i++;
        }
        
    }
}