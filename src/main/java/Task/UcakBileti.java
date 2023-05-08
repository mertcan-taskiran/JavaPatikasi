package Task;
import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int distance, age, trip_type;
        double normalAmount, ageDiscount, discountedAmount, roundTripDiscount, totalAmount;

        // Kullanıcıdan mesafe bilgisi istenir
        System.out.print("Mesafeyi km türünden giriniz : ");
        distance = input.nextInt();
        // Sıfırdan küçük mesafe girdiğinde
        if (distance <= 0) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

        // Kullanıcıdan yaş bilgisi istenir
        System.out.print("Yaşınız : ");
        age = input.nextInt();
        // Yaşı sıfırdan küçük olamaz
        if (age <= 0) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

        // Kullanıcıdan yolculuk tipi seçmesi istenir
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş-Dönüş): ");
        trip_type = input.nextInt();
        // Kullanıcı 1 veya 2 girmediğinde
        if (trip_type != 1 && trip_type != 2) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

        // Normal uçak fiyatı
        normalAmount = distance * 0.10;

        // Yaşa göre indirim yapılır
        if (age < 12) {
            ageDiscount = normalAmount * 0.50; // %50 indirim
        } else if (age < 25) {
            ageDiscount = normalAmount * 0.10; // %10 indirim
        } else if (age > 65) {
            ageDiscount = normalAmount * 0.30; // %30 indirim
        } else {
            ageDiscount = 0; // İndirim yok
        }

        // İndirimli Tutar
        discountedAmount = normalAmount - ageDiscount;

        // Bilet Tip Kontrol
        if (trip_type == 2)
            roundTripDiscount = discountedAmount * 0.20; // Bilet tipi 2 ise %20 indirim
        else
            roundTripDiscount = 0;

        // Eğer gidiş dönüş bileti aldı ise indirim yapılır ve gidiş-dönüş olduğu için 2 ile çarpılır.
        totalAmount = (discountedAmount - roundTripDiscount) * (trip_type == 2 ? 2 : 1);

        System.out.printf("Toplam Tutar = %.2f TL", totalAmount);

    }
}
