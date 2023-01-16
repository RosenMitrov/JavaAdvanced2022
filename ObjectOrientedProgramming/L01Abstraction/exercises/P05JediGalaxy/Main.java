package ObjectOrientedProgramming.L01Abstraction.exercises.P05JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] galaxyDimensions = getCoordinates(scanner.nextLine());
        int rows = galaxyDimensions[0];
        int cols = galaxyDimensions[1];

        StarsField starsField = new StarsField(rows, cols);
        Galaxy galaxy = new Galaxy(starsField);

        String command = scanner.nextLine();

        long sumOfStarsCollectedByJedi = 0;

        while (!command.equals("Let the Force be with you")) {

            int[] jedi = getCoordinates(command);
            int[] evil = getCoordinates(scanner.nextLine());

            int currentEvilRow = evil[0];
            int currentEvilCol = evil[1];

            galaxy.moveEvil(currentEvilRow, currentEvilCol);

            int currentJediRow = jedi[0];
            int currentJediCol = jedi[1];

            sumOfStarsCollectedByJedi = galaxy.moveJedi(sumOfStarsCollectedByJedi, currentJediRow, currentJediCol);

            command = scanner.nextLine();
        }

        System.out.println(sumOfStarsCollectedByJedi);
    }

    private static int[] getCoordinates(String scanner) {
        return Arrays.stream(scanner.split(" ")).mapToInt(Integer::parseInt).toArray();
    }




}
