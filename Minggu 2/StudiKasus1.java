public class StudiKasus1 {
    public static void main(String[] args) {
        int gajiPokokPakDanur = 5000000, gajiBersihPakDanur, tunjanganPerAnak = 100000;
        byte anakPakDanur = 4;

        gajiBersihPakDanur = gajiPokokPakDanur-(gajiPokokPakDanur/10)+(anakPakDanur*tunjanganPerAnak);
        System.out.println("Gaji  bersih pak Danur adalah "+gajiBersihPakDanur);
    }
}
