import java.util.Scanner;

public class StudiKasus2Modifikasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short lebarTanah, panjangTanah, diameterKolam,sisiTaman;
        int luasTanah;
        float luasKolam,luasTaman,luasTanahYangTidakDigunakan;

        System.out.println("Masukkan lebar tanah");
        lebarTanah=sc.nextShort();
        System.out.println("Masukkan panjang tanah");
        panjangTanah=sc.nextShort();
        System.out.println("Masukkan diameter kolam");
        diameterKolam=sc.nextShort();
        System.out.println("Masukkan sisi taman");
        sisiTaman=sc.nextShort();

        luasTanah = lebarTanah*panjangTanah;
        luasKolam=(float)(Math.PI*diameterKolam*diameterKolam/4);
        luasTaman=sisiTaman*sisiTaman;
        luasTanahYangTidakDigunakan=luasTanah-(luasKolam+luasTaman);

        System.out.println(String.format("Luas tanah yang tidak digunakan adalah %fm",luasTanahYangTidakDigunakan));
    }
}
