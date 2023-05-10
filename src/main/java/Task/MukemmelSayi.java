/*
    README
    <---------------->
    Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan program

    Mükemmel Sayı Nedir ?
    Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.

    Sayi Giriniz: 496
    496 Mükemmel sayıdır.
*/

package Task;
import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan sayı istenir.
        System.out.print("Sayi Giriniz: ");
        int number = input.nextInt();
        int total = 0;

        // Bir sayının kendisi hariç en büyük böleni, sayının yarısıdır.
        for (int i=1; i<=number/2; i++)
        {
            if (number % i == 0)
            {
                total += i;
            }
        }

        // Sayının mükemmel olup olmadığı yazdırılır.
        if (total == number) {
            System.out.println(number + " Mükemmel sayıdır.");
        } else {
            System.out.println(number + " Mükemmel sayı değildir.");
        }
    }
}