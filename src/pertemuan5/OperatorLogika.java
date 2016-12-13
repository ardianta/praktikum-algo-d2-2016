package pertemuan5;


public class OperatorLogika {
    
    public static void main(String[] argumen){
    
        // membuat variabel
        int a = 6;
        int b = 4;
        boolean hasil;
        
        // operasi AND
        hasil = (a > b) && (a == b);
        
        System.out.println(hasil);
        
        // Operasi OR
        hasil = (a >= b) || (b < a) || (b != a);
        System.out.println(hasil);

    }
    
}
