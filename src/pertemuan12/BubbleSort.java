package pertemuan12;

public class BubbleSort {

    public static void main(String[] args) {

        int data[] = {2, 4, 2, 4, 1, 3, 5};
        int c, d, tmp;
        int n = data.length;

        // bubble sort
        for (c = 0; c < (n - 1); c++) {
            for (d = 0; d < n - c - 1; d++) {
                if (data[d] > data[d + 1]){
                    tmp = data[d];
                    data[d] = data[d + 1];
                    data[d + 1] = tmp;
                }
            }
        }
        
        // cetak hasil
        for(int i = 0; i < n; i++)
            System.out.print(data[i]);

    }

}
