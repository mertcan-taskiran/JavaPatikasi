package Pratik;
import java.util.Scanner;
public class HipotenusBulma {
    public static void main(String[] args) {

        // Degiskenlerimizi olusturalim.
        int a, b;
        double c;

        // Kullanicidan verilerimizi alalim.
        Scanner inp = new Scanner (System.in);
        System.out.print("1. Kenarı Giriniz : ");
        a = inp.nextInt();

        System.out.print("2. Kenari Giriniz : ");
        b = inp.nextInt();

        c = Math.sqrt( (a*a) + (b*b) );
        System.out.println("Hipotenüs: " + c);

    }
}
