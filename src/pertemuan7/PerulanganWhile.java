package pertemuan7;

import java.util.Scanner;

public class PerulanganWhile {
    
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        
        String jawab = "tidak";
        int i = 0;
        
        while(jawab.equalsIgnoreCase("tidak")){
            System.out.print("Apakah anda ingin keluar? ");
            jawab = input.next();
            i++;
        }
        
        System.out.println("Perulangan telah dilakukan sebanyak " + i +" kali");
        
    
    }
    
}
