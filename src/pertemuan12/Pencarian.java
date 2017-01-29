package pertemuan12;

import java.util.Scanner;

public class Pencarian {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String data[] = {
            "andi", 
            "budi", 
            "caca",
            "deni",
            "emi"};

        int k = 0;
        
        System.out.print("Cari data: ");
        String kataKunci = input.next();
        
        for(int i = 0; i < data.length; i++){
            if(kataKunci.equalsIgnoreCase(data[i])){
                k++;
                System.out.println(kataKunci+" ditemukan pada indeks ke-"+i);
            } 
        }
        
        if(k == 0){
            System.out.println("tidak ditemukan!");
        }

    }

}
