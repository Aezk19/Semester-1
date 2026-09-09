import java.util.Scanner;

public class StudiKasus1Modifikasi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int gajiPokok, tunjanganPerAnak, gajiBersih;
        byte jumlahAnak;
        
        System.out.println("Masukkan gaji pokok");
        gajiPokok = sc.nextInt();
        System.out.println("Masukkan besar tunjangan per anak");
        tunjanganPerAnak = sc.nextInt();
        System.out.println("Masukkan jumlah anak");
        jumlahAnak = (byte)sc.nextInt();

        gajiBersih = gajiPokok-(gajiPokok/10)+(jumlahAnak*tunjanganPerAnak);
        System.out.println("Gaji bersih adalah "+gajiBersih);
    }
}