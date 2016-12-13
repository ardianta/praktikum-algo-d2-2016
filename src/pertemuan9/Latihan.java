package pertemuan9;

public class Latihan {
    
    public static void main(String[] args) {
        biodata("Budi", "126", "A", "TI");
        tambah(4, 3); // Hasil: 7
        kurang(4, 3); // Hasil: 1
        bagi(4.0, 3.0); // Hasil: ?
        kali(4, 3); // Hasil: 12
    }
    
    static void biodata(String nama, String nim, String kelas, String jurusan){
        System.out.println("Nama \t: " + nama);
        System.out.println("NIM \t: " + nim);
        System.out.println("Kelas \t: " + kelas);
        System.out.println("Jurusan : " + jurusan);
    }
    
    static void cetak(String sesuatu){
        System.out.println(sesuatu);
    }
    
    static void tambah(int a, int b){
        System.out.println("Hasil: " + (a + b));
    }
    
    static void kurang(int a, int b){
        System.out.println("Hasil: " + (a - b));
    }
    
    static void bagi(double a, double b){
        System.out.println("Hasil: " + (a / b));
    }
    
    static void kali(int a, int b){
        System.out.println("Hasil: " + (a * b));
    }
    
}
