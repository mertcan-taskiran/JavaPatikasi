package Pratik;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password, newPassword;

        Scanner inp = new Scanner(System.in);

        // Kullanıcı adı gir
        System.out.print("Kullanıcı Adınız: ");
        userName = inp.nextLine();

        // Şifre gir
        System.out.print("Şifreniz: ");
        password = inp.nextLine();

        // Kontrol ediliyor
        if (userName.equals("patika") && password.equals("java")) {
            System.out.println("Giriş Başarılı");
        } else {
            System.out.println("Giriş Başarısız");

            System.out.print("Şifrenizi sıfırlamak istiyor musunuz? (E/H): ");
            String reset = inp.nextLine();

            if (reset.equals("E")) {

                // Yeni şifre girişi
                System.out.print("Yeni Şifrenizi Giriniz: ");
                newPassword = inp.nextLine();

                if (!newPassword.equals(password)) {
                    System.out.println("Şifre oluşturuldu");
                } else {
                    // Eski şifre kullanılamaz
                    System.out.println("Hata: Yeni şifre eski şifreyle aynı olamaz.");
                    System.out.print("Başka bir şifre giriniz: ");
                    newPassword = inp.nextLine();

                    if (!newPassword.equals(password)) {
                        System.out.println("Şifre oluşturuldu");
                    } else {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }
                }
            }
        }
    }
}
