public class OperasiString {
    public static void main(String [] args){
        String kata1 ="Belajar";
        String kata2 ="Pemrograman";
        String kata3 ="3";

        int angka = Integer.parseInt(kata3);
        int nilai = angka+80;

        String kalimat =kata1.concat(kata2).concat(kata3);
        System.out.println(kalimat);
        System.out.println(kalimat.toLowerCase());
        System.out.println(kalimat.toUpperCase());
        System.out.println(kalimat.length());
        System.out.println(kalimat.substring(3));
        System.out.println(kalimat.substring(0,4));
        System.out.println(kalimat.substring(8, 17));
        
        System.out.println(nilai);
        System.out.println(kata1.equals("Belajar"));
        System.out.println(kata1.equalsIgnoreCase("Belajar"));
    }
    
}
