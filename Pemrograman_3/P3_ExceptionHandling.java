import java.util.Scanner;
public class P3_ExceptionHandling {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println();
        System.out.println("Tugas_3     : EXCEPTION HANDLING");
        System.out.println("Nama        : Muhammad Agung Febriyanto");
        System.out.println("NPM         : 2021 4350 2349");
        System.out.println();

        try{
            System.out.print("Agung       : Masukan bilangan pertama  = ");
            int a=input.nextInt();
            System.out.print("Agung       : Masukan operator yang ingin dimasukan (+, -, *, /) = ");
            char op=input.next().charAt(0);
            System.out.print("Agung       : Masukan bilangan kedua  = ");
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
                default:System.out.println("Agung       : Terjadi kesalahan dalam inputan Operator");
            }
        }
        catch(Exception e){
            System.out.println("Agung   : Terjadi Error");
        }
    }
}
