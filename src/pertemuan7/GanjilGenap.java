package pertemuan7;

public class GanjilGenap {
    
    public static void main(String[] args){
        
        int i = 1;
        
        while(i <= 10){
            if( i % 2 == 0){
                System.out.println(i + " adalah bilangan genap");
            } else {
                System.out.println(i + " adalah bilangan ganjil");
            }
            
            i++;
        }
        
    }
    
}
