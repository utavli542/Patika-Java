import java.util.Scanner;
public class daireDilimininAlani {
    public static void main(String[] args) {
        int r;
        double a , pi=3.14,alan;

        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin Yarı Çarpını Giriniz");
        r = input.nextInt();
     
        Scanner inputa = new Scanner(System.in);
        System.out.println("Merkez Açısının Ölçüsü a Giriniz");
        a= inputa.nextDouble();
        alan = (pi * (r*r) * a) / 360;

        System.out.println("Dairenin Alanı  : " +alan);
    }
}
