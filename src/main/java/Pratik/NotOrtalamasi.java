package Pratik;
import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {

        // değişken oluşturduk
        int mat, fizik, kimya;

        // scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        // kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();

        int total = (mat + fizik + kimya);
        double result = total / 3;

        System.out.println("Result: " + result);

        String status = (result > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(status);

    }
}
