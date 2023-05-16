package TaskWeek2;
public class Frekans {
    public static void main(String[] args) {
        int[] arr = {3,6,9,4,3,6,9,3,3};
        int[] arr2 = new int[arr.length];

        for (int i=0;i<arr.length;i++)
        {
            if (arr2[i] == 1)
            {
                continue; // zaten kontrol edildi
            }

            int count = 1;

            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[i] == arr[j])
                {
                    count++;
                    arr2[j] = 1;
                }
            }
            System.out.println(arr[i] + " sayisi " + count + " kere tekrar edildi.");
        }
    }
}