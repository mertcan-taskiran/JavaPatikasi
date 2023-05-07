package Pratik;
import java.util.Scanner;
public class KdvTutari {
    public static void main(String[] args) {

        double tutar, kdv0ran = 0.18, kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Ucret Tutarini Giriniz : ");
        tutar = input.nextDouble();

        if (tutar > 0 && tutar <= 1000) {
            kdv0ran = 0.18;
        } else if (tutar > 1000) {
            kdv0ran = 0.08;
        } else {
            System.out.println("Hatalı Tutar Girdiniz!");
            return;
        }

        kdvTutar = tutar * kdv0ran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar :" + tutar);
        System.out.println("KDV Orani :" + kdv0ran);
        System.out.println("KDV Tutari :" + kdvTutar);
        System.out.println("Kv'li Tutari :" + kdvliTutar);

    }
}
