import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //Farklı metodlarla return kavramı.
    public static int Toplama(int a, int b) {
        return a + b;
    }
    public static int Carpim(int a, int b) {
        return a*b;
    }
    public static int ikiCarpim(int a, int b) {
        return (a* 2) + (b * 2);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int a = sc.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int b = sc.nextInt();

        System.out.println("2 ile çarp topla metodu: "+ikiCarpim(a,b));
        System.out.println("Carpim metodu: "+Carpim(a,b));
        System.out.println("Toplama metodu: "+Toplama(a,b));
        //ilk önce toplama metodu çalışacak
        //daha sonra iki ile capım metodu
        //en son olarak carpim metodu çalışacak
        //RETURN KAVRAMI OLMASAYDI BU İŞLEMLERİ YAPAMAZDIK.
        System.out.println("Bütün işlemlerin sonucu: " +
                Carpim(ikiCarpim(Toplama(a,b),a),b));//return kavramı sayesinde iç içe method kullanmak
    }
}