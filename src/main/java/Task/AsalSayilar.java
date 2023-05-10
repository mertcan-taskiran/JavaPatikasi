/*
    README
    <---------------->
    Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran program.
    Her sayı kendinden küçük olan sayılara bölünerek asal olup olmadığı kontrol edilir.
    Asal sayı, kendinden küçük olan tam sayılarla tam bölünemez bir sayıdır.
    Bu yüzden iç içe iki for döngüsü kullanılır.

    Çıktı --> 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
*/

package Task;

public class AsalSayilar {
    public static void main(String[] args) {
        int i, j;
        boolean a; // asal sayı

        for (i = 2; i<=100; i++)
        {
            a = true;
            // Her sayı kendinden küçük olan sayılara bölünerek asal olup olmadığı kontrol edilir.
            for (j = 2; j<i; j++)
            {
                // Eğer i kendisine kadar olan sayılara kalansız bölünüyorsa, asal değildir ve break döngüyü bitiririz.
                if (i % j == 0)
                {
                    a = false;
                    break;
                }
            }
            if (a)
            {
                System.out.print(i + ", ");
            }
        }
    }
}
