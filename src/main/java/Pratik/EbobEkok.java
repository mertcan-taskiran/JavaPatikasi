package Pratik;
import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı girin: ");
        int n1 = input.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        int n2 = input.nextInt();

        int ebob = 1;
        int ekok = n1 * n2;
        int i = 1;

        while (i <= n1 && i <= n2) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        i = n1 * n2;
        while (i >= n1 && i >= n2) {
            if (i % n1 == 0 && i % n2 == 0) {
                ekok = i;
            }
            i--;
        }

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);


    }
}
