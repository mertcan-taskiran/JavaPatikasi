package Pratik;
import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {

        // Kullanıcıdan iki sayı ve yapılacak işlemi seçmesi istenir.
        int n1, n2, select;
        Scanner input = new Scanner(System.in);

        System.out.print("ilk Sayiyi Giriniz : ");
        n1 = input.nextInt();

        System.out.print("İkinci Sayiyi Giriniz : ");
        n2 = input.nextInt();

        System.out.println("1-Toplama \n2-Cikarma \n3-Çarpma \n4-Bölme");
        System.out.print("Seciminiz : ");
        select = input.nextInt();

        // Seçime göre işlem yapılır.
        switch (select) {
            case 1:
                System.out.println("Toplam : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Cikarma: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Carpma : " + (n1 * n2));
                break;
            case 4:
                // Bölümde sıfır kontrolü yapılır.
                if (n2 != 0) {
                    System.out.println("Bölme : " + (n1 / n2));
                } else {
                    System.out.println("Bir sayi sifira bolunemez!");
                }
                break;
            default:
                // 4 seçenekten biri seçilmez ise hatalı seçimdir.
                System.out.println("Hatali Secim");
        }

    }
}
