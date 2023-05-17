package BitirmeProjesi;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    char[][] board; // Oyun tahtasını temsil eden karakter dizisi
    boolean[][] mines; // Mayınların konumunu tutan boolean dizisi
    int rows; // Tahta satır sayısı
    int columns; // Tahta sütun sayısı
    int cells; // Hücre sayısı
    int score; // Skor

    MineSweeper(int rows, int columns) {
        this.rows = rows; // Satır sayılarını sınıf değişkenlerine atama
        this.columns = columns; // Sütun sayılarını sınıf değişkenlerine atama
        this.board = new char[rows][columns]; // Oyun tahtasını temsil eden char dizisi
        this.mines = new boolean[rows][columns]; // Mayınların konumunu tutan boolean dizisi
        this.cells = rows * columns; // Açık kalan hücre sayısı
        this.score = 0; // Skor
    }

    void initializeGame(){
        // Oyun tahtasını "-" karakteriyle doldurma
        for (int i=0; i<rows;i++){
            for (int j=0; j<columns; j++){
                board[i][j] = '-';
            }
        }

        // Rastgele mayınları yerleştirme
        int mineCount = cells / 4; // Mayın sayısını hesaplama: toplam hücre sayısının çeyreği
        Random random = new Random();
        while(mineCount > 0){
            int row = random.nextInt(rows);  // Rastgele bir satır indeksi seçme
            int col = random.nextInt(columns);  // Rastgele bir sütun indeksi seçme
            if (!mines[row][col]){
                mines[row][col] = true; // Seçilen konuma bir mayın yerleştirme
                mineCount--; // Yerleştirilen mayın sayısını azaltma
            }
        }
    }

    void printBoard(){
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns;j++){
                System.out.print(board[i][j] + " "); // Her hücrenin değerini ve aralarında boşluk bırakarak yazdırma
            }
            System.out.println();  // Bir satırın sonunda bir alt satıra geçme
        }
        System.out.println("===========================");
    }

    void playGame() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Satır Giriniz: ");  // Kullanıcıdan satır girişi isteme
            int row = scanner.nextInt();  // Kullanıcının girdiği satır değerini alma
            System.out.print("Sütun Giriniz: ");  // Kullanıcıdan sütun girişi isteme
            int col = scanner.nextInt();  // Kullanıcının girdiği sütun değerini alma

            if (!isValidCell(row, col)){ // Girilen hücre geçerli değilse
                System.out.println("Geçersiz Hücre !");
                continue; // Tekrar hücre girişi isteme
            }

            if (mines[row][col]){ // Girilen hücrede mayın varsa
                revealMines(); // Tüm mayınları ortaya çıkarma
                printBoard();  // Güncellenmiş tahtayı yazdırma
                System.out.println("Game Over!!");  // Oyun kaybetti
                break;  // Oyun döngüsünden çıkma
            }else {
                int count = countAdjacentMines(row, col); // Girilen hücreye komşu mayın sayısını hesaplama
                board[row][col] = (char)(count + '0'); // Hücreye komşu mayın sayısını yazma
                cells--;
                score++; // Doğru tahminde skoru artır

                if (cells == 0){ // Kalan hücre sayısı 0 ise
                    printBoard();  // Güncellenmiş tahtayı yazdırma
                    System.out.println("Oyunu Kazandınız! Skorunuz: " + score);
                    break;  // Oyun döngüsünden çıkma
                }
            }

            printBoard();  // Güncellenmiş tahtayı yazdırma
        }
    }

    boolean isValidCell(int row, int col){
        // Verilen satır ve sütun değerlerinin geçerli olup olmadığını kontrol eder.
        // Geçerli bir hücre, tahtanın içinde (0 ile rows-1 arasında) bulunan bir hücredir.
        // Eğer hücre geçerli ise true, değilse false döner.
        return row >= 0 && row<rows && col>=0 && col<columns;
    }

    int countAdjacentMines(int row, int col){
        int count = 0;
        // Verilen hücreye komşu olan hücrelerdeki mayınların sayısını hesaplar.
        // İki iç içe döngü kullanarak, verilen hücrenin sol üstünden sağ altına kadar olan komşu hücreleri kontrol eder.
        // Her bir komşu hücrenin geçerli olup olmadığını kontrol eder ve mayın içeriyorsa sayacı artırır.
        // Sonunda, komşu hücrelerdeki mayın sayısını döndürür.
        for (int i = row - 1; i <= row + 1; i++){
            for (int j = col - 1; j <= col + 1; j++) {
                if (isValidCell(i ,j) && mines[i][j]){ // Hücre geçerli ve mayın varsa
                    count++;
                }
            }
        }

        return count;
    }

     void revealMines() {
        // Tüm mayınları ortaya çıkarır ve tahtayı günceller.
        // İki iç içe döngü kullanarak, her hücreyi kontrol eder.
        // Eğer hücrede bir mayın varsa, tahta üzerinde "*" karakteriyle işaretler.
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                if (mines[i][j]){
                    board[i][j] = '*';
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Satır Sayısını Giriniz: ");
        int rows = scanner.nextInt();
        System.out.print("Sütun Sayısını Giriniz: ");
        int columns = scanner.nextInt();

        MineSweeper game = new MineSweeper(rows, columns); // MineSweeper sınıfından bir oyun nesnesi oluşturuluyor.
        game.initializeGame(); // Oyunun başlatılması için tahta ve mayınların başlangıç durumu ayarlanıyor.
        game.printBoard(); // Oyun tahtası ekrana yazdırılıyor.
        game.playGame(); // Oyunun oynanmasını sağlayan döngü başlatılıyor.
    }
}
