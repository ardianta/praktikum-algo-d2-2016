package pertemuan10;

import pertemuan10.LatihanSum;

public class Contoh {
    public static void main(String[] args) {
        
        double[] nilai = {2,3,1,2,4,2};
        
        LatihanSum ls = new LatihanSum();
        
        double total = ls.hitungTotal(nilai);
        double rata = ls.hitungRata(nilai);
        
        System.out.println("Total: " + total);
        System.out.println("Rata-rata: " + rata);
    }
}
