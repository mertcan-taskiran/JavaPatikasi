package TaskWeek2.UsHesabi;

import java.util.Scanner;

public class UsHesabi {
    static void power() {
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan taban değeri isteriz
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        // Kullanıcıdan üs değeri alırız
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();

        int result = 1;

        // Döngüyü 1 den Yazılan üs değerinen kadar artırırız
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        //Sonucu yazdırırız
        System.out.println("Sonuç : " + result);
    }

    public static void main(String[] args) {
        power();
    }
}
