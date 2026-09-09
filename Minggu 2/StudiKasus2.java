public class StudiKasus2 {
    public static void main(String[] args) {
        short lebarTanahPakTono=30, panjangTanahPakTono=100, diameterKolamLele=5,sisiTamanBunga=2;
        int luasTanahPakTono;
        float luasKolamIkan,luasTamanBunga,luasTanahYangTidakDigunakan;

        luasTanahPakTono = lebarTanahPakTono*panjangTanahPakTono;
        luasKolamIkan=(float)(Math.PI*diameterKolamLele*diameterKolamLele/4);
        luasTamanBunga=sisiTamanBunga*sisiTamanBunga;
        luasTanahYangTidakDigunakan=luasTanahPakTono-(luasKolamIkan+luasTamanBunga);

        System.out.println(String.format("Luas tanah yang tidak digunakan Pak Tono adalah %fm",luasTanahYangTidakDigunakan));
    }
}
