package Pratik;
import java.util.Scanner;
public class UcDortTamBolen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        double sum = 0;
        int count = 0;

        System.out.print("Sayı Giriniz: ");
        n = input.nextInt();

        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }
        }

        if (count > 0) {
            double average = sum / count;
            System.out.println("Ortalama: " + average);
        } else {
            System.out.println("3 ve 4'e tam bölünen sayı bulunamadı.");
        }

        input.close();
    }
}
