package Task;
import java.util.Scanner;
public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double height, weight, index;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        height = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        weight = input.nextDouble();

        index = weight / (height * height);

        System.out.println("Vücut Kitle İndeksiniz: " + index);
    }
}
