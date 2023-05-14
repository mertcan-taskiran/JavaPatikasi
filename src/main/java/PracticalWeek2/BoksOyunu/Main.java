package PracticalWeek2.BoksOyunu;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("A", 10, 100, 70, 40);
        Fighter f2 = new Fighter("B", 8, 100, 80, 50);

        Match match = new Match(f1, f2, 60, 90);
        match.run();
    }
}
