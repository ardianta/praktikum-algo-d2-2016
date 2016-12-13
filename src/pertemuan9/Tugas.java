package pertemuan9;

import java.util.Scanner;

public class Tugas {
    
    public static void main(String[] args) {
        
       while(true){
           programUtama();
       }
        
    }
    
    static void programUtama(){
         int pilihan;
        
        double sisi, panjang, lebar, hasil = 0;
        
        // buat scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih: ");
        System.out.println("1. Luas Persegi ");
        System.out.println("2. Luas Persegi Panjang ");
        System.out.println("3. Keliling Persegi ");
        System.out.println("4. Keliling Persegi Panjang ");
        System.out.println("5. Keluar ");
        System.out.print("Masukan pilihan: ");
        pilihan = input.nextInt();
        
        switch(pilihan){
            case 1:
                // luas persegi
                System.out.print("Masukan panjang sisi: ");
                sisi = input.nextDouble();
                hasil = luasPersegi(sisi);
                break;
            case 2:
                // luas pergei panjang
                System.out.print("Masukan panjang: ");
                panjang = input.nextDouble();
                System.out.print("Masukan Lebar: ");
                lebar = input.nextDouble();
                hasil = luasPersegiPanjang(panjang, lebar);
                break;
            case 3:
                // keliling persegi
                System.out.print("Masukan panjang sisi: ");
                sisi = input.nextDouble();
                hasil = kelilingPersegi(sisi);
                break;
            case 4: 
                // keliling persegi panjang
                System.out.print("Masukan panjang: ");
                panjang = input.nextDouble();
                System.out.print("Masukan Lebar: ");
                lebar = input.nextDouble();
                hasil = kelilingPersegiPanjang(panjang, lebar);
                break;
            default:
                System.exit(0);
        }
        
        System.out.println("Hasil: " + hasil);
    }
    
    
    static double luasPersegi(double s){
        return s*s;
    }
    
    static double kelilingPersegi(double s){
        return 4*s;
    }
    
    static double luasPersegiPanjang(double p, double l){
        return p * l;
    }
    
    static double kelilingPersegiPanjang(double p, double l){
        return 2*(p+l);
    }
    
}
