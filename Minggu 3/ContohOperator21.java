public class ContohOperator21 {
    public static void main(String[] args) {

        int x = 10;
        System.out.println("x++ = " + x++);
        System.out.println("Setelah evaluasi, x = " + x);

        x=10;
        System.out.println("++x = " + ++x);
        System.out.println("Setelah evaluasi, x = " + x);

        int y = 12;
        System.out.println(x > y || y == x && y <= x); //x>y:false, y==x:false, y<=x:false; false||false=false&&false=false ;

        int z = x ^ y; // dikonversi ke biner dulu 11=1011 dan 12=1100 kemudian di xor(jika berbeda=1)
        System.out.println("Hasil x ^ y adalah " + z);

        z %= 2;
        System.out.println("Hasil akhir " + z);
    }
}
