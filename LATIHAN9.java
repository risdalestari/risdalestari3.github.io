import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LATIHAN9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        // Input waktu masuk dan keluar
        System.out.print("Jam Datang : ");
        int masuk = scanner.nextInt();
        System.out.print("Jam Keluar : ");
        int keluar = scanner.nextInt();

        // Hitung lama parkir
        int lamaparkir = keluar - masuk;
        if (lamaparkir < 0 ) {
            lamaparkir += 24;
        }
        // Hitung biaya parkir
        int biayaparkir ;
        if (lamaparkir <= 2) {
            biayaparkir = lamaparkir * 2000;
        }else {
            biayaparkir = 5000 + (lamaparkir - 2) * 1000;
        }

        // Output biaya parkir
        System.out.println("biaya parkir: " + biayaparkir);
    }
}
