package ObjectOrientedProgramming.L01Abstraction.exercises.P03CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        RankPower rankPower = RankPower.valueOf(scanner.nextLine());

        SuitPower suitPower = SuitPower.valueOf(scanner.nextLine());

        Card card = new Card(rankPower, suitPower);

        card.cardInfo();

    }
}
