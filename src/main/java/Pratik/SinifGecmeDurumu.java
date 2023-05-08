package Pratik;
import java.util.Scanner;
public class SinifGecmeDurumu {
    public static void main(String[] args) {

        int mat, fizik, turkce;
        int count = 0;
        double sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuz: ");
        mat = input.nextInt();
        if (mat >= 0 && mat <= 100) {
            sum += mat;
            count++;
        } else {
            System.out.println("Geçersiz Matematik Notu");
        }

        System.out.println("Fizik Notunuz: ");
        fizik = input.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            sum += fizik;
            count++;
        } else {
            System.out.println("Geçersiz Fizik Notu");
        }

        System.out.println("Türkçe Notunuz: ");
        turkce = input.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            sum += turkce;
            count++;
        } else {
            System.out.println("Geçersiz Türkçe Notu");
        }

        if (count > 0) {
            double average = sum / count;
            System.out.println("Ortalamanız: " + average);
            if (average <= 55) {
                System.out.println("Sınıfta Kaldınız...");
            } else {
                System.out.println("Tebrikler, Sınıfı Geçtiniz");
            }
        } else {
            System.out.println("Hiç geçerli not girilmedi.");
        }

    }
}
