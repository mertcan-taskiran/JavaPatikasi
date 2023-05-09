package Pratik;
import java.util.Scanner;
public class BasamakToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number = input.nextInt();
        int sum = 0;

        while (number > 0)
        {
            sum += number % 10;
            number = number / 10;
        }
        System.out.println("Basamak Toplamı: " + sum);

    }
}
