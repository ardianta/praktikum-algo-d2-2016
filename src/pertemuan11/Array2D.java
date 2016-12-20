package pertemuan11;

import java.util.Scanner;

public class Array2D {
    
    public static void main(String[] args) {
        
        String mahasiswa[][] = new String[3][3];
        Scanner input = new Scanner(System.in);
        
        // Isi nilai array
        for(int baris = 0; baris < mahasiswa.length; baris++){
            for(int kolom = 0; kolom < mahasiswa[baris].length; kolom++){
                System.out.print("Inputkan mahasiswa yang ke["+baris+"]["+kolom+"]:");
                mahasiswa[baris][kolom] = input.next();
            }
        }
        
        // menampilkan isi array
        for(int baris = 0; baris < mahasiswa.length; baris++){
            for(int kolom = 0; kolom < mahasiswa[baris].length; kolom++){
                System.out.print(mahasiswa[baris][kolom] + "|");
            }
            System.out.println("");
        }
        
    }
    
}
