package TaskWeek2.Desen;
import java.util.Scanner;
public class Desen {
    static void desen(int n) {
        // Sayıyı ekrana yazdır
        System.out.print(n + " ");

        // Eğer sayı negatif veya 0 ise, metoddan çık
        if (n <= 0) {
            return;
        }

        // Sayıdan 5 çıkar ve metodu recursive olarak çağır
        desen(n - 5);

        // Sayıyı tekrar ekrana yazdır
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Kullanıcıdan bir sayı istenir
        System.out.print("N Sayısı : ");
        int n = scanner.nextInt();
        // Recursive metodu çağır
        desen(n);
    }
}
