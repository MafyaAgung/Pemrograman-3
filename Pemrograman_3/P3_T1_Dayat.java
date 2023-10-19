import java.util.Scanner;

public class P3_T1_Dayat{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int a,b,c;

        System.out.println(" ");
        System.out.println("Tugas_1 : Variabel ");
        System.out.println("Nama    :Muhammad Anwar Hidayat");
        System.out.println("NPM     :2021 4350 2347");
        System.out.println(" ");
        
        
        System.out.print("Anwar   : Masukkan Angka Pertama = ");
        a=input.nextInt();
        System.out.print("Anwar   : Masukkan Angka Kedua = ");
        b=input.nextInt();
        int hasiltambah = a+b;
        int hasilkurang = a-b;
        int hasilkali = a*b;
        c=a%b;
        System.out.println("Anwar   : Hasil Penjumlahan = "+hasiltambah);
        System.out.println("Anwar   : Hasil Pengurangan = "+hasilkurang);
        System.out.println("Anwar   : Hasil Perkalian = "+hasilkali);
        System.out.println("Anwar   : Hasil Sisa Pembagian = ");
        if(c>=7)
            System.out.println(c+"Anwar     : Hasil Sisa Bagi Besar");
            else
                System.out.println(c+"Anwar     : Hasil Sisa Bagi Kecil");
    }
}