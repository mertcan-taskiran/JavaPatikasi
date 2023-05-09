package Pratik;
import java.util.Scanner;
public class Faktoriyel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Kümenin eleman sayısını giriniz: ");
        int n = input.nextInt();
        System.out.print("Grup eleman sayısını giriniz: ");
        int r = input.nextInt();
        int pay = 1;
        int payda = 1;

        for (int i = n; i > (n - r); i--) {
            pay *= i;
        }
        for (int i = r; i >= 1; i--) {
            payda *= i;
        }

        int result = pay / payda;
        System.out.println(n + " elemanlı kümenin " + r + " elemanlı farklı grupları " + result + " adettir.");
    }
}
