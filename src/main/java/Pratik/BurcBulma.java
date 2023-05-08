package Pratik;
import java.util.Scanner;
public class BurcBulma {
    public static void main(String[] args) {
        int month, day;
        String burc = "";
        boolean isError = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz Ay: ");
        month = input.nextInt();
        System.out.print("Doğduğunuz Gün: ");
        day = input.nextInt();

        if (month == 1) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Oğlak";
                } else {
                    burc = "Kova";
                }
            } else {
                isError = true;
            }
        } else if (month == 2) {
            if (day >= 1 && day <= 28) {
                if (day < 20) {
                    burc = "Kova";
                } else {
                    burc = "Balık";
                }
            } else {
                isError = true;
            }
        } else if (month == 3) {
            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    burc = "Balık";
                } else {
                    burc = "Koç";
                }
            } else {
                isError = true;
            }
        } else {
            isError = true;
        }

        if (isError){
            System.out.println("Hatalı Giriş");
        } else {
            System.out.println("Burcunuz: " + burc);
        }

    }
}
