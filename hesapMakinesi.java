import java.util.Scanner;
public class hesapMakinesi {
    public static void main(String[] args) {
        int n1,n2,result=0; String select;

        Scanner input=  new Scanner(System.in);
        System.out.print("İlk Sayıyı giriniz : ");
        n1=input.nextInt();
        System.out.print("İkinci Sayıyı giriniz : ");
        n2=input.nextInt();
        System.out.print("Seçiminizi Yapınız(+,-,*,/): ");
        select=input.next();
        switch(select){
            case "+": result=n1+n2;System.out.println("Sonuç: "+result); break;
            case "-": result=n1-n2;System.out.println("Sonuç: "+result); break;
            case "*": result=n1*n2;System.out.println("Sonuç: "+result); break;
            case "/": result=n1/n2;System.out.println("Sonuç: "+result); break;
            default:System.out.println("Yanlış Seçim yaptınız");
        }
    }
}
