package pertemuan4;

import java.util.Scanner;

public class OperatorAritmatika {
    
    public static void main(String[] args) {
        
        double a, b, c;
        
        // membuat objek Scanner
        Scanner input = new Scanner(System.in);
        
        // mengisi nilai
        System.out.print("Masukan nilai a = ");
        a = input.nextDouble();
        
        System.out.print("Masukan nilai b = ");
        b = input.nextDouble();
        
        // operasi penjumlahan
        c = a + b;
        System.out.println("a + b = " + c);
        
        // operasi pengurangan
        c = a - b;
        System.out.println("a - b = " + c);
        
        // operasi kali
        c = a * b;
        System.out.println("a x b = " + c);
        
        // operasi bagi
        c = a / b;
        System.out.println("a / b = " + c);
        
        // operasi modulo
        c = a % b;
        System.out.println("a % b = " + c);
        
    }
    
}
