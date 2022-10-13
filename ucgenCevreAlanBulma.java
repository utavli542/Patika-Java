import java.util.Scanner;
public class ucgenCevreAlanBulma {
    public static void main(String[] args) {

        //değişkenlerimizi oluşturalım
        double a, b, c, alan, u, cevresi;

        //kullanıcıdan verilerimizi alalım
        Scanner girdi = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz : ");
        a = girdi.nextDouble();
        System.out.print("2. Kenarı Giriniz : ");
        b = girdi.nextDouble();
        System.out.print("3. Kenarı Giriniz : ");
        c = girdi.nextDouble();

        //heron yöntemini uyguluyoruz.
        u = (a + b + c) / 2;
        cevresi = (2*u);
        System.out.println("Üçgenin Çevresi : " +cevresi + " cm ");
        alan = Math.sqrt(u*((u-a)*(u-b)*(u-c)));
        System.out.print("Üçgenin Alanı : " + alan + " cm2");




    } 
}
