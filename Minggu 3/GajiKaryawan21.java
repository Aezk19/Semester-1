import java.util.Scanner;

public class GajiKaryawan21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
         int gajiPokok;
         double bonus;
         double totGaji;
         int tunjTrans = 600000;
         int tunjMakan = 400000;

         System.out.println("Masukkan gaji");
         gajiPokok = sc.nextInt();
         
         bonus = 0.05*gajiPokok;
         totGaji = gajiPokok+tunjTrans+tunjMakan+bonus-(0.1*gajiPokok);

         System.out.println("Bonus bulanan anda adalah Rp." + (int)bonus);
         System.out.println("Gaji yang diterima adalah Rp." + (int)totGaji);
    }
}
