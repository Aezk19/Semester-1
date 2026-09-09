
import java.util.Scanner;

public class BiayaCetakDokumen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lembarDokumen;
        int biayaCetak=500;
        int penjilidan=5000;
        int totalBiaya;

        System.out.println("Masukkan jumlah lembar dokumen yang akan dicetak");
        lembarDokumen = sc.nextInt();

        totalBiaya = lembarDokumen*biayaCetak+penjilidan;
        System.out.println("Total biaya yang harus dibayar adalah " + totalBiaya);
    }
}
