package Task;
import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan sayı istenir.
        System.out.print("Ters üçgen oluşturmak için sayi giriniz: ");
        int number = input.nextInt();

        for (int i = number; i >= 1; i--) {

            for (int j = 1; j <= number - i; j++) { // Boşluk oluşturan döngü
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) { // Yıldız oluşturan döngü
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

/*
    README
    <---------------->
    Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen program.
    Ters üçgen oluşturmak için sayi giriniz: 3
    *****
     ***
      *
*/