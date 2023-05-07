package Pratik;
import java.util.Scanner;
public class DaireDilimAlani {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Yarıçapı Giriniz: ");
        double r = input.nextDouble();

        System.out.print("Merkez Açısının Ölçüsü Giriniz: ");
        double a = input.nextDouble();

        double pi = 3.14;
        double area = (pi * (r * r) * a) / 360;

        System.out.println("Daire Diliminin Alanı: " + area);

    }
}
