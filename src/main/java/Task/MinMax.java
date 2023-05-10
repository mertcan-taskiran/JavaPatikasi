/*
    README
    <---------------->
    Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan program

    Kaç tane sayı gireceksiniz: 3

    1. Sayiyi Giriniz: 3
    2. Sayiyi Giriniz: 5
    3. Sayiyi Giriniz: 7

    En büyük sayı: 7
    En küçük sayı: 3
*/

package Task;
import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, max, min;

        System.out.print("Kaç tane sayı gireceksiniz: ");
        n = input.nextInt();

        // ilk sayıyı hem max hem de min olarak kabul ediyoruz.
        System.out.print("1. Sayiyi Giriniz: ");
        max = input.nextInt();
        min = max;

        // İlk sayıyı zaten aldığımız için 2. sayıdan başlattık.
        for (int i=2; i<=n; i++)
        {
            System.out.print(i + ". Sayiyi Giriniz: ");
            int number = input.nextInt();

            // Büyük sayı kontrol edilir.
            if (number > max)
            {
                max = number;
            }

            // Küçük sayı kontrol edilir.
            if (number < min)
            {
                min = number;
            }
        }

        // Max ve Min yazdırılır.
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
