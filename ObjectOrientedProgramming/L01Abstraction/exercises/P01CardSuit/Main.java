package ObjectOrientedProgramming.L01Abstraction.exercises.P01CardSuit;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Card Suits:");
        Arrays.stream(CardSuits.values()).forEach(card -> System.out.printf("Ordinal value: %d; Name value: %s%n", card.ordinal(), card));
    }
}
