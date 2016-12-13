package pertemuan7;


public class Perulangan {
    
    public static void main(String[] args) {
         
        // nomer 1
        for(int i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }
        
        System.out.println();
        
        // nomer 2
        for(int i = 1; i < 10; i+=2){
           System.out.print(i + " "); 
        }
        
        System.out.println();
        // nomer 3
        for(int i = 2; i <= 10; i+=2){
            System.out.print(i + " ");
        }
        
        System.out.println("");
        // perulangan dengan counter descending
        for(int i=5; i >= 0; i--){
            System.out.print(i + " ");
        }
        
        System.out.println("\n");
        
        for(int i=10; i > 1; i--){
            System.out.println(Math.pow(2, i));
        }
        
    }
    
}
