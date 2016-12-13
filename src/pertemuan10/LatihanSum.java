package pertemuan10;

import java.util.Scanner;

public class LatihanSum {
    
    public static void main(String[] args) {
        
        // Membuat array
        double bilangan[] = new double[6];
        
        // membuat scanner
        Scanner input = new Scanner(System.in);
        
        // Mengisi nilai Array
        for(int i = 0; i < bilangan.length; i++){
            System.out.print("Masukkan data bilangan untuk indeks ke-["+i+"]:");
            bilangan[i] = input.nextDouble();
        }
        
        // menampilkan isi array
        for(int i = 0; i < bilangan.length; i++){
            System.out.println(bilangan[i]);
        }
        
        
        // panggil fungsi untuk menghitung total dan rata-rata
        double total = hitungTotal(bilangan);
        double rata = hitungRata(bilangan);
        
        System.out.println("Total: " + total);
        System.out.println("Rata-rata: " + rata);
        
     }
    
    public static double hitungTotal(double bilangan[]){
        // hitung SUM
        double total = 0.0;
        
        for(int i = 0; i < bilangan.length; i++){
            total = total + bilangan[i];
        }
        
        return total;
    }
    
    public static double hitungRata(double bilangan[]){
        // hitung total
        double total = hitungTotal(bilangan);
        // total/banyak data
        double rata = total / bilangan.length;
        
        return rata;
    }
    
}
