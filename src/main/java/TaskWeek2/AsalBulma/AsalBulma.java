package TaskWeek2.AsalBulma;
import java.util.Scanner;
public class AsalBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Kullanıcıdan sayı isteriz
        System.out.print("Sayı Giriniz : ");
        int n = input.nextInt();

        // isPrime metodu, n sayısının asal olup olmadığını belirlemek için kullanılır.
        if (isPrime(n)) {
            System.out.println(n + " sayısı ASALDIR !");
        } else {
            System.out.println(n + " sayısı ASAL değildir !");
        }
    }

    // isPrime metodu, bir sayının asal olup olmadığını belirlemek için özyinelemeli bir yaklaşım kullanır.
    static boolean isPrime(int n) {
        if (n <= 1) { // 1'den küçük sayılar asal değildir
            return false;
        }
        if (n == 2) { // 2 asaldır
            return true;
        }
        if (n % 2 == 0) { // Çift sayılar asal olamazlar
            return false;
        }
        return isPrime(n, 3); // 3'ten başlayarak tek sayılarla bölünüp bölünmediği kontrol edilir.
    }

    static boolean isPrime(int n, int i) {
        if (n % i == 0) { // Eğer n, i'ye tam bölünüyorsa, n asal değildir
            return false;
        }
        if (i * i > n) { // Eğer i'nin karesi n'den büyükse, n asaldır
            return true;
        }
        return isPrime(n, i + 2); // Bir sonraki tek sayı ile tekrar kontrol edilir.
    }
}
