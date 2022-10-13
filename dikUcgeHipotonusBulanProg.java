import java.util.Scanner;
import Math;
public class dikUcgeHipotonusBulanProg {
    public static void main(String[] args) {

        //değişkenlerimizi oluşturalım
        int a, b;
        double c;

        //kullanıcıdan verilerimizi alalım
        Scanner girdi = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz : ");
        a = girdi.nextInt();
        System.out.print("2. Kenarı Giriniz : ");
        b = girdi.nextInt();

        c= Math.sqrt((a*a)+(b*b));
        System.out.print("Hipotenüs : " + c + " cm ");

    }

}