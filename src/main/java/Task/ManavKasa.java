package Task;
import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        double pearPrice = 2.14;
        double applePrice = 3.67;
        double tomatoesPrice = 1.11;
        double bananaPrice = 0.95;
        double eggplantPrice = 5.00;

        // Kullanıcıdan meyve ve sebzelerin kilogram miktarları alınır.
        Scanner input = new Scanner(System.in);

        System.out.print("How Many Kilos of Pear?: ");
        double pearWeight = input.nextDouble();

        System.out.print("How Many Kilos of Apple?: ");
        double appleweight = input.nextDouble();

        System.out.print("How Many Kilos of Tomatoes?: ");
        double tomatoesWeight = input.nextDouble();

        System.out.print("How Many Kilos of Banana?: ");
        double bananaWeight = input.nextDouble();

        System.out.print("How Many Kilos of Eggplant?: ");
        double eggplantPWeight = input.nextDouble();

        // Toplam tutar hesaplanır ve ekrana yazdırılır.
        double toplamTutar = pearPrice * pearWeight + applePrice * appleweight + tomatoesPrice * tomatoesWeight + bananaPrice * bananaWeight + eggplantPrice * eggplantPWeight;

        System.out.println("Total Prica : " + toplamTutar + " TL");
    }
}
