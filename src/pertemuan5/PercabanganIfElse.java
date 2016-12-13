package pertemuan5;

import java.util.Scanner;

public class PercabanganIfElse {
    
    public static void main(String[] args){
    
        // deklarasi variabel
        int nilai = 0;
        String grade;
        
        // membuat scanner
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Nilai: ");
        nilai = input.nextInt();
        
        
        // tentukan grade
        if( nilai >= 90 ){
            grade = "A";
        } else if(nilai >= 80){
            grade = "B+";
        } else if(nilai >= 70){
            grade = "B";
        } else if(nilai >= 60){
            grade = "C";
        } else if(nilai >= 50){
            grade = "D";
        } else if(nilai >= 40) {
            grade = "E";
        } else {
            grade = "F";
        }
        
        
        System.out.println("Grade: " + grade);
        
        if( (nilai == 100) && (grade.equals("A")) ){
            System.out.println("Selamat Anda dapat Vocer WiFi.id 1 Bulan");
        }
        
        if(nilai >= 70){
            System.out.println("Selamat Anda Lulus");
        } else {
            System.out.println("Selamat Anda boleh mengikuti Remidi");
            System.out.println("Masih ada kesempatan, berjuanglah!");
        }
        
        
    }
    
}
