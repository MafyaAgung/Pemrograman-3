public class Pertemuan3_Tugas1 {
    public static void main(String[] args) {
        int[][] matrix ={{3, 2, 7, 11},
                         {13, 15, 0, 2},
                         {3, 3, 5, 7}
                        };
        for (int i=0; i <matrix.length; i++) {
            for (int j=0; j< matrix[0].length; j++){
                System.out.println(matrix[i][j]);
            }
        }
    }
}