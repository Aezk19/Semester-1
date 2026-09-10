
import java.util.Scanner;

public class BiayaCetakDokumen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahLembar;
        int biayaCetak=500;
        int biayaPenjilidan=5000;
        int totalBiaya;

        System.out.println("Masukkan jumlah lembar dokumen yang akan dicetak");
        jumlahLembar = sc.nextInt();

        totalBiaya = jumlahLembar*biayaCetak+biayaPenjilidan;
        System.out.println("Total biaya yang harus dibayar adalah " + totalBiaya);
    }
}
