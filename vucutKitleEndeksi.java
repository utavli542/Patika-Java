import  java.util.Scanner;

public class vucutKitleEndeksi {
    public static void main(String[] args) {

        double boy,kilo,indeks;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = input.nextDouble();
        Scanner result = new Scanner(System.in);
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = result.nextDouble();
        indeks = kilo / (boy * boy);
        System.out.print("Vücut Kitle Indeksiniz :"+indeks);


    }
}
