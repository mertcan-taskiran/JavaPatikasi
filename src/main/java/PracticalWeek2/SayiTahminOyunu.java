package PracticalWeek2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int number = random.nextInt(100);
        System.out.println(number);
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        int right = 0;
        while (right < 5)
        {
            System.out.println("Lütfen tahmininizi giriniz : ");
            selected = scanner.nextInt();

            if (selected < 0 || selected > 99)
            {
                System.out.println("Lütfen 0-100 arasında değer giriniz.");
                if (!isWrong)
                {
                    isWrong = true;
                    System.out.println("Sonraki hatalı girişinizde hakkınızdan eksilecek.");
                }
                else
                {
                    right++;
                    System.out.println("Kalan Hakkınız : " + (5-right));
                }
                continue;
            }

            if (selected == number)
            {
                System.out.println("Tebrikler...");
                isWin = true;
                break;
            }
            else
            {
                System.out.println("Yanlış Tahmin !");
                if (selected > number)
                {
                    System.out.println("Aşağı");
                }
                else
                {
                    System.out.println("Yukarı");
                }

                wrong[right++] = selected;

                System.out.println("Kalan Hakkınız : " + (5-right));
            }
        }
        if (!isWin && !isWrong)
        {
            System.out.println("Kaybettin !");
            if (!isWrong)
            {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }
    }
}
