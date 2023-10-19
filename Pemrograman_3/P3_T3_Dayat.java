import java.util.Scanner;
public class P3_T3_Dayat {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println();
        System.out.println("Tugas_3     : EXCEPTION HANDLING");
        System.out.println("Nama        : Muhammad Anwar Hidayat");
        System.out.println("NPM         : 2021 4350 2347");
        System.out.println();

        try{
            System.out.print("Anwar       : Masukan bilangan pertama  = ");
            int a=input.nextInt();
            System.out.print("Anwar       : Masukan operator yang ingin dimasukan (+, -, *, /) = ");
            char op=input.next().charAt(0);
            System.out.print("Anwar       : Masukan bilangan kedua  = ");
            int b=input.nextInt();

            switch(op){
                case'+':System.out.println(a+b);
                break;
                case'-':System.out.println(a-b);
                break;
                case'*':System.out.println(a*b);
                break;
                case'/':System.out.println(a/b);
                break;
                default:System.out.println("Anwar       : Terjadi kesalahan dalam inputan Operator");
            }
        }
        catch(Exception e){
            System.out.println("Anwar   : Terjadi Error");
        }
    }
}
