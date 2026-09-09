import java.util.Scanner;

public class SegitigaMuhammadAkbar {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int alas, tinggi;
    float luas; // karena hasil luas bisa saja koma

    System.out.print("Masukkan alas: ");
    alas = sc.nextInt();
    System.out.print("Masukkan tinggi: ");
    tinggi = sc.nextInt();
    sc.close();

    luas = alas * tinggi / 2.0f; //karena byte*byte/float=float(agar hasil akhir bisa pecahan)
    System.out.println("Luas Segitiga: "+luas);
    }
}
