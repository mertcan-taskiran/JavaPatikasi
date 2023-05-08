package Pratik;
import java.util.Scanner;
public class HavaSicakligi {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.println("Hava Kaç Derece?: ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat <= 15) {
            System.out.println("Sinemaya gidebilirsin.");
            if (heat >= 10) {
                System.out.println("Pikniğe gidebilirsin.");
            }
        } else if (heat <= 25) {
            System.out.println("Pikniğe gidebilirsin.");
            if (heat > 15) {
                System.out.println("Yüzmeye gidebilirsin.");
            }
        } else {
            System.out.println("Yüzmeye gidebilirsin.");
        }


    }
}
