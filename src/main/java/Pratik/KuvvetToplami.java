package Pratik;
import java.util.Scanner;
public class KuvvetToplami {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        System.out.println("Max sayı giriniz: ");
        n = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 4 == 0) {
                System.out.println(i + " 4'ün kuvvetidir.");
            }
            if (i % 5 == 0) {
                System.out.println(i + " 5'in kuvvetidir.");
            }
        }
        inp.close();
    }
}
