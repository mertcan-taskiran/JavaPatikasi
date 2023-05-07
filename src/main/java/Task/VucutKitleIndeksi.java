package Task;
import java.util.Scanner;
public class VucutKitleIndeksi {
    public static void main(String[] args) { // Ana metod

        double height, weight, index; // Boy, kilo ve VKİ değeri tanımlanıyor
        Scanner input = new Scanner(System.in); // Scanner sınıfından input adında bir nesne oluşturuluyor

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: "); // Kullanıcıdan boy isteniyor
        height = input.nextDouble(); // Girilen boy input değişkenine atanıyor

        System.out.print("Lütfen kilonuzu giriniz: "); // Kullanıcıdan kilo isteniyor
        weight = input.nextDouble(); // Girilen kilo weight değişkenine atanıyor

        index = weight / (height * height); // VKİ hesaplanıyor

        System.out.println("Vücut Kitle İndeksiniz: " + index); // VKİ değeri ekrana yazdırılıyor
    }
}
