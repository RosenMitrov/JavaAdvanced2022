package JavaAdvanced.ad03SetAndMap.lab;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

//created by R.M.
public class P03WarNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> firstPlayerDeck = getCards(scanner);
        Set<Integer> secondPlayerDeck = getCards(scanner);

        for (int i = 1; i <= 50; i++) {
            if (firstPlayerDeck.isEmpty()) {
                break;
            }
            if (secondPlayerDeck.isEmpty()) {
                break;
            }
            int cardFirst = firstPlayerDeck.iterator().next();
            firstPlayerDeck.remove(cardFirst);
            int cardSecond = secondPlayerDeck.iterator().next();
            secondPlayerDeck.remove(cardSecond);
            if (cardFirst > cardSecond) {
                firstPlayerDeck.add(cardFirst);
                firstPlayerDeck.add(cardSecond);
            } else if (cardFirst < cardSecond) {
                secondPlayerDeck.add(cardFirst);
                secondPlayerDeck.add(cardSecond);
            }
        }
        if (firstPlayerDeck.size() > secondPlayerDeck.size()) {
            System.out.println("First player win!");
        } else if (firstPlayerDeck.size() < secondPlayerDeck.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw");
        }
    }

    private static Set<Integer> getCards(Scanner scanner) {
        int[] cards = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Set<Integer> temp = new LinkedHashSet<>();
        for (int card : cards) {
            temp.add(card);
        }
        return temp;
    }
}
/*
3.	"Voina" – Number Game
Write a program that:
•	Reads 20 numbers for both players, separated with " " (single space).
o	Every player can hold unique numbers.
Each Round both players get the top number from their deck.
The player with the bigger number gets both numbers and adds them to the bottom of his sequence.
The game ends after 50 rounds or if any player loses all of his numbers.
Input
•	Numbers – Integer
Output
•	Output must be "First player win!", "Second player win!" or "Draw!".

 */