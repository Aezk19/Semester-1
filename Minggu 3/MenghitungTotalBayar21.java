import java.util.Scanner;

public class MenghitungTotalBayar21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int harga;
        double potongan;
        double jml_bayar;
        double diskon=0.15;

        System.out.println("Masukkan harga");
        harga = sc.nextInt();
        
        potongan = diskon*harga;
        jml_bayar = harga-potongan;

        System.out.println(String.format("Jumlah bayar %d", jml_bayar));

    }
}
