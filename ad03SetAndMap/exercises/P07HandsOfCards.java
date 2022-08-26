package JavaAdvanced.ad03SetAndMap.exercises;

import java.util.*;

//created by R.M.
public class P07HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Set<String>> players = new LinkedHashMap<>();

        while (!input.equals("JOKER")) {
            String[] data = input.split(": ");
            String name = data[0];
            String[] cards = data[1].split(", ");

            players.putIfAbsent(name, new HashSet<>());
            getCards(players, cards, name);

            input = scanner.nextLine();
        }

        players.forEach((k,v) -> {
            System.out.printf("%s: %d%n", k, getPoints(v));
        });
    }

    private static int getPoints(Set<String> deckOfCards) {
        int result = 0;
        for (String card : deckOfCards) {
            String powerAsString = card.substring(0, card.length() - 1);
            String type = card.substring(card.length() - 1);
            int power = getPower(powerAsString);
            int multiplier = getValueToMultiply(type);
            result += power * multiplier;
        }
        return result;
    }

    private static int getValueToMultiply(String type) {
        switch (type) {
            case "S":
                return 4;
            case "H":
                return 3;
            case "D":
                return 2;
            case "C":
                return 1;
            default:
                return 0;
        }
    }

    private static int getPower(String powerAsString) {
        switch (powerAsString) {
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
            case "A":
                return 14;
            default:
                return Integer.parseInt(powerAsString);

        }
    }

    private static void getCards(Map<String, Set<String>> players, String[] cards, String name) {
        for (String card : cards) {
            players.get(name).add(card);
        }
    }
}
/*
Problem 7.	Hands Of Cards
You are given a sequence of people and for every person what cards he draws from the deck. The input will be separate lines in the format:
"{personName}: {PT, PT, PT,… PT}"
Where P (2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A) is the power of the card and T (S, H, D, C) is the type.
The input ends when a "JOKER" is drawn. The name can contain any ASCII symbol except ":".
The input will always be valid and in the format described, there is no need to check it.
A single person cannot have more than one card with the same power and type, if he draws such a card he discards it.
The people are playing with multiple decks. Each card has a value that is calculated by the power multiplied by the type.
Powers 2 to 10 have the same value and J to A are 11 to 14. Types are mapped to multipliers the following way (S -> 4, H-> 3, D -> 2, C -> 1).
Finally print out the total value each player has in his hand in the format:
"{personName}: {value}"

 */