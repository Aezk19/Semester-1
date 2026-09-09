public class ContohVaribelMuhammadAkbar {
    public static void main(String[] args){
        String hobi = "Bermain petak umpet"; //agar lebih pendek nama variabel diubah menjadi hoby
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte umur = 20; //agar lebih pendek nama variabel diganti dengan umur
        double ipk = 3.24, tinggi = 1.78; //agar lebih efektif nama variabel diganti dengan ipk
        System.out.println(hobi);
        System.out.println("Apakah pandai? " + isPandai);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("Umurku saat ini: " + umur);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk, tinggi));
    }
}