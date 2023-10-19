import java.util.Scanner;

public class P1_Variabel{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int a,b,c;

        System.out.println(" ");
        System.out.println("Tugas_1 : Variabel ");
        System.out.println("Nama    :Muhammad Agung Febriyanto");
        System.out.println("NPM     :2021 4350 2349");
        System.out.println(" ");
        
        
        System.out.print("Agung   : Masukkan Angka Pertama = ");
        a=input.nextInt();
        System.out.print("Agung   : Masukkan Angka Kedua = ");
        b=input.nextInt();
        int hasiltambah = a+b;
        int hasilkurang = a-b;
        int hasilkali = a*b;
        c=a%b;
        System.out.println("Agung   : Hasil Penjumlahan = "+hasiltambah);
        System.out.println("Agung   : Hasil Pengurangan = "+hasilkurang);
        System.out.println("Agung   : Hasil Perkalian = "+hasilkali);
        System.out.print("Agung   : Hasil Sisa Pembagian = ");
        if(c>=7)
            System.out.println(c+"Agung     : Hasil Sisa Bagi Besar");
            else
                System.out.println(c+"Agung     : Hasil Sisa Bagi Kecil");
    }
}