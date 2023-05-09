package Pratik;
import java.util.Scanner;
public class UsluSayiHesaplama {
    public static void main(String[] args) {
        int n,k;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        n = input.nextInt();
        System.out.print("Bir üs giriniz: ");
        k = input.nextInt();
        int total = 1;

        /*int i = 1;
        while (i <= k)
        {
            total *= n;
            i++;
        }*/

        for (int i=1; i<=k; i++)
        {
            total *= n;
        }

        System.out.println(total);
    }
}
