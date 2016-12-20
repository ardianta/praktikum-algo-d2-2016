package pertemuan11;

public class MinArray {

    public static void main(String[] args) {
        int nilai[] = new int[]{5, 4, 0, 1};

        int terkecil = nilai[0];
        int index = 0;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] < terkecil) {
                terkecil = nilai[i];
                index = i;
            }
        }

        System.out.println("Nilai terkecil: " + terkecil);
        System.out.println("Terletak pada indeks: " + index);

        
        System.out.println("Setelah disortir:");
        cetakArray(selectionSort(nilai));

    }

    public static void cetakArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            
            int index = i;
            
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            
            // penukaran nilai (Swap)
            int tmp = arr[index];
            arr[index] = arr[i];
            arr[i] = tmp;
        }
        return arr;
    }

}
