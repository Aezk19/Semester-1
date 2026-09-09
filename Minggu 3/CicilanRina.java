import java.util.Scanner;

public class CicilanRina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int harga;
        int uangMuka;
        int sisaHarga;
        int bulan;
        double cicilanPerBulan;

        System.out.println("Masukkan harga");
        harga = sc.nextInt();
        System.out.println("Masukkan uang muka");
        uangMuka = sc.nextInt();
        System.out.println("Masukkan bulan");
        bulan = sc.nextByte();

        sisaHarga = harga-uangMuka;
        cicilanPerBulan = sisaHarga/bulan+sisaHarga*0.02;
        
        System.out.println("Cicilan yang harus dibayar Rina setiap bulan adalah " + cicilanPerBulan);
    }
}
