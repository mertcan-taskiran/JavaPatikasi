package Task;
import java.util.Scanner;
public class CinZodyagiHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Kullanıcıdan doğum yılı bilgisi alınır.
        System.out.print("Doğum Yılınızı Giriniz: ");
        int year = scanner.nextInt();
        // Doğum yılının 12 ye göre modu alınır.
        int mod = year % 12;
        // Mod ile Çin Zodyağı ekrana yazdırılır.
        if (mod == 0) {
            System.out.println("Çin Zodyağı Burcunuz : Maymun");
        } else if (mod == 1) {
            System.out.println("Çin Zodyağı Burcunuz : Horoz");
        } else if (mod == 2) {
            System.out.println("Çin Zodyağı Burcunuz : Köpek");
        } else if (mod == 3) {
            System.out.println("Çin Zodyağı Burcunuz : Domuz");
        } else if (mod == 4) {
            System.out.println("Çin Zodyağı Burcunuz : Fare");
        } else if (mod == 5) {
            System.out.println("Çin Zodyağı Burcunuz : Öküz");
        } else if (mod == 6) {
            System.out.println("Çin Zodyağı Burcunuz : Kaplan");
        } else if (mod == 7) {
            System.out.println("Çin Zodyağı Burcunuz : Tavşan");
        } else if (mod == 8) {
            System.out.println("Çin Zodyağı Burcunuz : Ejderha");
        } else if (mod == 9) {
            System.out.println("Çin Zodyağı Burcunuz : Yılan");
        } else if (mod == 10) {
            System.out.println("Çin Zodyağı Burcunuz : At");
        } else if (mod == 11) {
            System.out.println("Çin Zodyağı Burcunuz : Koyun");
        }
    }
}
