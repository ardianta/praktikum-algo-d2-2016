package pertemuan5;

import java.util.Scanner;

public class PercabanganCase {
    
    public static void main(String[] args) {
        
        String lampu;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Inputkan warna lampu: ");
        lampu = input.next();
        
        switch(lampu){
            case "merah":
                System.out.println("Berhenti!");
                break;
            case "hijau":
                System.out.println("Silahkan Jalan!");
                break;
            case "kuning":
                System.out.println("Hati-hati, jagan ngebut!");
                break;
            default:
                System.out.println("Lampu Salah!");
                break;
        }
        
        
    }
    
}
