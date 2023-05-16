package TaskWeek2;

public class MatrisTranspoz {
    public static void main(String[] args) {
        int[][] matris = {
                {2, 3, 4},
                {5, 6, 4}
        };

        int rows = matris.length; // Matrisin satır sayısı
        int columns = matris[0].length; // Matrisin sütun sayısı
        // Transpozunu tutmak için yeni bir matris oluşturulur
        int[][] transpose = new int[columns][rows];

        // Matrisin transpozunu bulmak için iç içe döngüler kullanılır
        for (int i = 0; i<rows; i++)
        {
            for (int j=0; j<columns; j++)
            {
                // Matrisin satır ve sütun indeksleri yer değiştirerek transpoze matrisine aktarılır
                transpose[j][i] = matris[i][j];
            }
        }

        System.out.println("Matris : ");
        printMatrix(matris); // Orijinal matrisi yazdır

        System.out.println("Transpoze:");
        printMatrix(transpose); // Transpoze matrisi yazdır
    }

    static void printMatrix(int[][] matrix){
        int rows = matrix.length;
        int columns = matrix[0].length;

        // Matrisin tüm elemanları yazdırılır
        for (int i=0; i<rows; i++)
        {
            for (int j=0; j<columns; j++)
            {
                // Elemanlar arasında tab boşluğu ile ayrım yapılır
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
