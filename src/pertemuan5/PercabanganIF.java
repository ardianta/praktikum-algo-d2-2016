package pertemuan5;

import java.util.Scanner;

public class PercabanganIF {
    
    public static void main(String[] arg){
        
        int totalBelanja = 0;
        int uangBayar = 0;
        int kembalian = 0;
        
        Scanner input = new Scanner(System.in);
        
        // Mengambil input
        System.out.print("Masukkan Total Belanjaan: Rp ");
        totalBelanja = input.nextInt();
        
         // Mengambli input uang bayar
         System.out.print("Masukkan Uang Bayar: Rp ");
         uangBayar = input.nextInt();
        
        if( totalBelanja > 100000 ){
            System.out.println("Selamat, anda mendapatkan CocaCola 8L");
            System.out.println("dan Bebas ongkos parkir");
        }      
       
        
        kembalian = uangBayar - totalBelanja;
        
        System.out.println("Total Belanja: Rp " + totalBelanja);
        System.out.println("Bayar: Rp " + uangBayar);
        System.out.println("Kembalian: Rp " + kembalian);
        
    }
    
}
