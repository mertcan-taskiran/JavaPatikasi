package Task;
import java.util.Scanner;
public class ArtikYilHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Kullanıcıdan yıl bilgisi alınır.
        System.out.print("Yıl Giriniz : ");
        int yil = input.nextInt();

        if (yil % 4 == 0) { // Yılın 4'e tam olarak bölünüp bölünmediğini kontrol eder.
            if (yil % 100 == 0) { // Yılın 100'e tam olarak bölünüp bölünmediğini kontrol eder.
                if (yil % 400 == 0) { // Yılın 400'e tam olarak bölünüp bölünmediğini kontrol eder.
                    System.out.println(yil + " bir artık yıldır !"); // Eğer yıl 400'e tam olarak bölünüyorsa, artık yıldır.
                } else {
                    System.out.println(yil + " bir artık yıl değildir !"); // Yıl 100'e tam olarak bölünüyor ama 400'e tam olarak bölünmüyorsa, artık yıl değildir.
                }
            } else {
                System.out.println(yil + " bir artık yıldır !");
            }
        } else {
            System.out.println(yil + " bir artık yıl değildir !"); // Eğer yıl 4'e tam olarak bölünmüyorsa, artık yıl değildir.
        }
    }
}
