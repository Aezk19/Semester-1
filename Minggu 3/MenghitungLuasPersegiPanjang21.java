import java.util.Scanner;

public class MenghitungLuasPersegiPanjang21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //diperlukan deklarasi scanner karena membutuhkan input dinamis dari user

        int panjang;
        int lebar;
        int luas;

        System.out.println("Masukkan panjang");
        panjang=sc.nextInt(); //Untuk mengambil input berupa interger
        System.out.println("Masukkan lebar");
        lebar=sc.nextInt();

        luas = panjang*lebar;

        System.out.println("Luas persegi adalah " + luas); 
    }
}
