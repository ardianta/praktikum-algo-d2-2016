package pertemuan4;

import java.util.Scanner;

public class Balok {
    
    public static void main(String[] args) {
        
        double p,l,t, volume, luas;
        
        // membuat scanner
        Scanner input = new Scanner(System.in);
        
        // input nilai
        System.out.print("Input panajang = ");
        p = input.nextDouble();
        
        System.out.print("Input lebar = ");
        l = input.nextDouble();
        
        System.out.print("Input tinggi = ");
        t = input.nextDouble();
        
        // luas balok
        luas = 2*p*l + 2*p*t + 2*l*t;
        // volume balok
        volume = p * l * t;
        
        System.out.println("Luas = " + luas);
        System.out.println("Volume = " + volume);
        
    }
    
}
