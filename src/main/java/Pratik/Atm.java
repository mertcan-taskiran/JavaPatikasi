package Pratik;
import java.util.Scanner;
public class Atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int hak = 3;
        int bakiye = 1500;
        int select;

        while (hak > 0)
        {
            System.out.print("Kullanıcı Adı: ");
            userName = input.nextLine();
            System.out.print("Şifre: ");
            password = input.nextLine();

            if (userName.equals("mert") && password.equals("tas"))
            {
                System.out.println("Merhaba X Bankasına Hoşgeldiniz !");
                do
                {
                    System.out.println("<--------------------->");
                    System.out.println("1 - Para Yatırma\n" +
                                       "2 - Para Çekme\n" +
                                       "3 - Bakiye Sorgulama\n" +
                                       "4 - Çıkış Yap");
                    System.out.print("Lütfen işlem seçiniz: ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.println("Yatırmak istediğiniz tutar: ");
                            int yatirilanMiktar = input.nextInt();
                            bakiye += yatirilanMiktar;
                            break;
                        case 2:
                            System.out.println("Güncel Bakiye: " + bakiye);
                            System.out.println("Çekmek istediğiniz tutar: ");
                            int cekilenMiktar = input.nextInt();
                            if (cekilenMiktar > bakiye) {
                                System.out.println("Yetersiz Bakiye");
                            } else {
                                bakiye -= cekilenMiktar;
                            }
                            break;
                        case 3:
                            System.out.println("Güncel Bakiye: " + bakiye);
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Hatalı işlem seçimi !");
                            break;
                    }

                }
                while (select != 4);
                break;
            }
            else
            {
                hak--;
                System.out.println("Kullanıcı adı veya şifre hatalı !");
                if (hak == 0)
                {
                    System.out.println("Hesabınız bloke oldu !");
                }
                else
                {
                    System.out.println("Kalan Hakkınız: " + hak);
                }
            }
        }
    }
}
