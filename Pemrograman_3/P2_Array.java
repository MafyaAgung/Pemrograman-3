import java.util.Scanner;
public class P2_Array {
    public static void main(String[] args) {
        System.out.println("Tugas_2   : Data Array 2 Dimensi ");
        System.out.println("Nama      : Muhammad Agung Febriyanto ");
        System.out.println("NPM       : 2021 4350 2349");
        System.out.println();
        String[] nama;
        int n,T,P;
        float nilai;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Agung     : Masukan Jumlah Data : ");
        n = input.nextInt();
        System.out.println("-------------------------------------------------------");
        System.out.println();
        input.nextLine();
        nama = new String[n];
 
        int[][] nil =new int[n][2];
        for( int i = 0; i < n; i++ ){
            System.out.print("Agung     : Mata Kuliah = ");
            nama[i]=input.nextLine();
            System.out.print("Agung     : Nilai Teori = ");
            nil[i][0]=input.nextInt();
            System.out.print("Agung     : Nilai Pratikum = ");
            nil[i][1]=input.nextInt();
            System.out.println();
            input.nextLine();
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("Mata Kuliah\tTeori\tPratikum\tRata-rata");
        System.out.println("-------------------------------------------------------");
        for(int i=0;i<nama.length;i++){
            System.out.print(nama[i]+"\t");
            for(int j=0;j<2; j++){
                System.out.print("\t"+nil[i][j]);
            }
            T=nil[i][0];
            P=nil[i][1];
            nilai=(T+P)/2;
            System.out.println("\t\t"+nilai);
        }
        System.out.println("-------------------------------------------------------");
 
    }
}