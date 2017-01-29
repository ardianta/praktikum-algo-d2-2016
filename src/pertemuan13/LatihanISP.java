package pertemuan13;

import java.util.ArrayList;
import java.util.Scanner;

public class LatihanISP {
    
    // Variabel Global --------------------------
    static String paket[][] = {
        {"Reguler", "50000", "384 kbps", "0"},
        {"Premium", "100000", "512 kbps", "0"},
        {"Premium", "200000", "2 Mbps", "0"},
    };
    
    static ArrayList<Object> pelanggan = new ArrayList<>();
    static double pendapatan = 0.0;
    
    static Scanner input = new Scanner(System.in);
    
    // ------------------------------------------
    
    public static void main(String[] args) {
        
        boolean running = true;
        
        while(running){
            menu();
        }
 
    }
    
    static void menu(){
        System.out.println("----- PROGRAM LATIHAN ISP -----");
        System.out.println("Paket: ");
        
        for(int i = 0; i < paket.length; i++){
            System.out.print(i + ". ");
            for(String pkt : paket[i]){
                System.out.print(pkt + " \t| ");
            }
            System.out.println();
        }
        
        System.out.println("3. Tampilkan Status");
        System.out.println("4. Cari Pelanggan");
        System.out.println("5. Keluar");
        
        // ambil input
        System.out.print("PILIHAN: ");
        int pilihan = input.nextInt();
        
        switch(pilihan){
            case 0:
                // paket reguler
                beliPaket(0);
                break;
            case 1:
                // paket Premium
                beliPaket(1);
                break;
            case 2:
                // paket istimewa
                beliPaket(2);
                break;
            case 3:
                status();
                break;
            case 4:
                cariPelanggan();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                // salah pilih
                System.out.println("Menu tidak tersedia!");
                break;
        }
        
        
    }
    
    static void beliPaket(int menu){
        System.out.print("Nama pelanggan: ");
        // simpan nama pelanggan ke variabel pelanggan
        pelanggan.add(input.next());
        
        // ambil harga paket yang dipilih 
        double hargaPaket = Double.valueOf(paket[menu][1]);
        // simpan ke variabel pendapatan
        pendapatan = pendapatan + hargaPaket;
        
        // hitung pelanggan untuk setiap paket
        int pelangganSebelum = Integer.valueOf(paket[menu][3]);
        int pelangganBaru = pelangganSebelum + 1;
        paket[menu][3] = String.valueOf(pelangganBaru);
    }
    
    static void status(){
        System.out.println("#####################");
        // tampilkan jumlah pelangan
        System.out.println("Jumlah Pelanggan: " + pelanggan.size());
        System.out.println("- Reguler: " + paket[0][3]);
        System.out.println("- Premium: " + paket[1][3]);
        System.out.println("- Istimewa: " + paket[2][3]);
        System.out.println("Pendapatan: Rp " + pendapatan);
        System.out.println("#####################");
    }

    static void cariPelanggan(){
        System.out.print("Cari: ");
        String cari = input.next();
        
        for(int i=0; i < pelanggan.size(); i++){
            if( cari.equals(pelanggan.get(i))){
                System.out.println("Ditemukan pada indeks ke-"+i);
                break;
            } else {
                System.out.println("Tidak ditemukan");
            }
        }
    }
}
