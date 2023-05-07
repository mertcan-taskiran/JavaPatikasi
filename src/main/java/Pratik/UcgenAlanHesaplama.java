package Pratik;
import java.util.Scanner;
public class UcgenAlanHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1. Kenar Uzunluğunu Giriniz: ");
        double a = input.nextDouble();

        System.out.print("2. Kenar Uzunluğunu Giriniz: ");
        double b = input.nextDouble();

        System.out.print("3. Kenar Uzunluğunu Giriniz: ");
        double c = input.nextDouble();

        double u = (a + b + c) / 2;
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin Alanı: " + alan);
    }
}
