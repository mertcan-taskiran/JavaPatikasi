package PracticalWeek2;

import java.util.Scanner;

public class DiziMinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi Giriniz: ");
        int sayi = input.nextInt();

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        int ksayi = -1;
        int bsayi = -1;

        for (int i : list) {
            if (i < sayi && (ksayi == -1 || i > ksayi)) {
                ksayi = i;
            }
            if (i > sayi && (bsayi == -1 || i < bsayi)) {
                bsayi = i;
            }
        }

        if (ksayi == -1) {
            System.out.println("Girilen sayıdan küçük bir sayı bulunamadı.");
        } else {
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + ksayi);
        }

        if (bsayi == -1) {
            System.out.println("Girilen sayıdan büyük bir sayı bulunamadı.");
        } else {
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + bsayi);
        }
    }
}
