package ObjectOrientedProgramming.L01Abstraction.exercises.P02CardRak;

public class Main {
    public static void main(String[] args) {

        System.out.println("Card Ranks:");
        for (CardRank cardRank : CardRank.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", cardRank.ordinal(), cardRank);
        }
    }
}
