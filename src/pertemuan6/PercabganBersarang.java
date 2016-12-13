package pertemuan6;

import java.util.Scanner;

public class PercabganBersarang {
    
    public static void main(String[] argumen){
    
        int pilihanBangun, pilihanHitung;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("== PROGRAM BANGUN RUANG ==");
        System.out.println("Pilih bangun ruang");
        System.out.println("1. Balok");
        System.out.println("2. Kubus");
        System.out.println("3. Keluar");
        System.out.print("Silahkan pilih: ");
        
        pilihanBangun = input.nextInt();
        
        if(pilihanBangun == 1){
            // dia pilih balok
            System.out.println("Pilih yang akan dihitung");
            System.out.println("1. Volume Balok");
            System.out.println("2. Luas Permukaan Balok");
            System.out.print("Silahkan pilih:");
            
            pilihanHitung = input.nextInt();
            
            if(pilihanHitung == 1){
                // dia pilih volume
                double p,l,t,volume;
                
                System.out.print("Inputkan panjang: ");
                p = input.nextDouble();
                
                System.out.print("Inputkan lebar: ");
                l = input.nextDouble();
                
                System.out.print("Inputkan tinggi: ");
                t = input.nextDouble();
                
                volume = p * l * t;
                
                System.out.println("Volume = " + volume);
                
            } else {
                // dia pilih Luas
                double p,l,t,luas;
                
                System.out.print("Inputkan panjang: ");
                p = input.nextDouble();
                
                System.out.print("Inputkan lebar: ");
                l = input.nextDouble();
                
                System.out.print("Inputkan tinggi: ");
                t = input.nextDouble();
                
                luas = (2*p*l) + (2*p*t) + (2*l*t);
                
                System.out.println("Luas = " + luas);
            }
            
        } else if(pilihanBangun == 2) {
            // dia pilih kubus
            System.out.println("Pilih yang akan dihitung");
            System.out.println("1. Volume Kubus");
            System.out.println("2. Luas Permukaan Kubus");
            System.out.print("Silahkan Pilih: ");
            
            pilihanHitung = input.nextInt();
            
            if(pilihanHitung == 1){
                double s, volume;
                System.out.print("Inputkan sisi: ");
                s = input.nextDouble();
                volume = Math.pow(s, 3);
                System.out.println("Volume = " + volume);
            } else {
                double s, luas;
                System.out.print("Inputkan sisi: ");
                s = input.nextDouble();
                luas = 6 * Math.pow(s, 2);
                System.out.println("Luas = " + luas);
            }
            
        } else {
            System.exit(0);
        }

        
    }
    
}
