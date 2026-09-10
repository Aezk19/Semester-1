import java.util.Scanner;

public class CicilanRina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int harga;
        int uangMuka;
        int sisaHarga;
        int bulan;
        double bunga=0.02;
        double cicilanPerbulan;

        System.out.println("Masukkan harga laptop");
        harga = sc.nextInt();
        System.out.println("Masukkan uang muka");
        uangMuka = sc.nextInt();
        System.out.println("Masukkan bulan");
        bulan = sc.nextByte();

        sisaHarga = harga-uangMuka;
        cicilanPerbulan = sisaHarga/bulan+sisaHarga*bunga;
        
        System.out.println("Cicilan yang harus dibayar Rina setiap bulan adalah " + cicilanPerbulan);
    }
}
