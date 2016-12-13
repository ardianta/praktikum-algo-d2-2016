package pertemuan9;

public class Fungsi {
    
    public static void main(String[] args) {
        System.out.println( kali(2,3) );
        System.out.println( f(2,3) );
    }
    
    static int kali(int a, int b){
        int hasil = a * b;
        return hasil;
    }
    
    static double f(double x, double y){
        return Math.pow(x, 2) + y;
    }
    
}
