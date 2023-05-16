package TaskWeek2;

import java.util.Arrays;
import java.util.Scanner;

public class MintoMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi Boyutu : ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Dizi Elemanlarını Giriniz");

        for (int i=0; i < n; i++)
        {
            System.out.print((i+1) + ". elemanı : ");
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        System.out.print("Sıralama : ");

        for (int number: arr)
        {
            System.out.print(number + " ");
        }
    }
}
