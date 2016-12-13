package pertemuan9;

public class Prosedur {
    
    public static void main(String args[]){
        salam("malam");
    }
    
    static void ucapSalam(){
        // kode prosedur
        for(int i=0; i <= 5; i++){
            System.out.println("Selamat Sore!");
        }
    }
    
    static void salam(String waktu){
        switch(waktu){
            case "pagi":
                System.out.println("Selamat Pagi");
                break;
            case "siang":
                System.out.println("Selamat Siang");
                break;
            case "malam":
                System.out.println("Selamat Malam");
                break;
            default:
                System.out.println("Hallo!");
                break;
        }
    }
    
}
