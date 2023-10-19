import java.util.Scanner;

public class P1_Variabel{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int a,b,c;

        System.out.println(" ");
        System.out.println("Tugas_1 : Variabel ");
        System.out.println("Nama    :Ahmad Al - Hafidz");
        System.out.println("NPM     :2021 4350 2389");
        System.out.println(" ");
        
        
        System.out.print("Hafidz   : Masukkan Angka Pertama = ");
        a=input.nextInt();
        System.out.print("Hafiddz   : Masukkan Angka Kedua = ");
        b=input.nextInt();
        int hasiltambah = a+b;
        int hasilkurang = a-b;
        int hasilkali = a*b;
        c=a%b;
        System.out.println("Hafidz   : Hasil Penjumlahan = "+hasiltambah);
        System.out.println("Hafidz  : Hasil Pengurangan = "+hasilkurang);
        System.out.println("Hafidz   : Hasil Perkalian = "+hasilkali);
        System.out.print("Hafidz  : Hasil Sisa Pembagian = ");
        if(c>=7)
            System.out.println(c+"Hafidz     : Hasil Sisa Bagi Besar");
            else
                System.out.println(c+"Hafidz     : Hasil Sisa Bagi Kecil");
    }
}