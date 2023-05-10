/*
    README
    <---------------->
    Fibonacci Serisi Nedir ?
    Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir.
    Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar.
    Yani bir sayı kendisinden önceki sayıya bölündüğünde altın orana gittikçe yaklaşan bir dizi elde edilir.
    Fibonacci dizisi, 0'dan başlar ve sonsuza kadar. Her rakam, bir önceki rakamla toplanır. Elde edilen sonuç rakamın sağ tarafına yazılır.

    Fibonacci Serisi için eleman sayısı girin: 10
    0 1 1 2 3 5 8 13 21 34
*/

package Task;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        // 1. sayıyı sıfır 2. sayıyı birden başlattık
        int n, previous = 0, next = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci Serisi için eleman sayısı girin: ");
        n = input.nextInt();

        // 1. ve 2. sayıyı yazdırır
        System.out.print(previous + " " + next);

        for (int i = 2; i < n; i++) {
            int nextNumber = previous + next; // yeni sayı için önceki ve sonraki değer toplanır.
            System.out.print(" " + nextNumber); // sıradaki sayıyı yazdırır.
            previous = next; // sonraki sayı, önceki sayı değişkenine atanır.
            next = nextNumber; // yeni toplanan sayı, sonraki sayı değişkenine atanır.
        }
    }
}
