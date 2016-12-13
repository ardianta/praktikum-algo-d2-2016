package pertemuan10;


public class BelajarArray {
    
    public static void main(String[] args) {
        
        // Buat array kosong
        String mahasiswa[] = new String[4];
        
        // Buat array serta isinya
        String jurusan[] = {
            "TI", 
            "RPL", 
            "Jaringan",
            "Multimedia",
            "DKV",
            "Manajemen Informatika",
            "Bahasa Inggris"
        };
        
        // mengisi data ke array yang kosong
        mahasiswa[0] = "Budi";
        mahasiswa[1] = "Ilham";
        mahasiswa[2] = "Dira";
        mahasiswa[3] = "Sisi";
        
        // mengambil data array pada indeks ke-2
        for(int i = 0; i < 4; i++){
            System.out.println(mahasiswa[i]);
        }
        
        // cetak array Jurusan
        for(int i = 0; i < jurusan.length ; i++){
            System.out.println(jurusan[i]);
        }
    }
    
}
