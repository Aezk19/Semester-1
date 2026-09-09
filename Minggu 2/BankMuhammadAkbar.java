import java.util.Scanner;

public class BankMuhammadAkbar {
    public static void main(String[] args) {
        int jml_tabungan_awal, lama_menabung;
        double jml_tabungan_akhir, bunga, presentase_bunga=0.02;
        Scanner input = new Scanner(System.in);

        System.out.println("masukkan jumlah tabungan awal anda");
        jml_tabungan_awal = input.nextInt();
        System.out.println("masukkan lama menabung anda");
        lama_menabung = input.nextInt();
        input.close();

        bunga = lama_menabung*presentase_bunga*jml_tabungan_awal;
        jml_tabungan_akhir=bunga+jml_tabungan_awal;

        System.out.println("Bunga adalah : "+bunga);
        System.out.println("Jumlah tabungan akhir anda adalah : "+jml_tabungan_akhir);
        
    }
}
