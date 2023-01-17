package ObjectOrientedProgramming.L01Abstraction.lab.P01RhombusOfStars;

import java.util.Scanner;

//created by R.M

public class RhombusPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        printRhombus(n);
    }

    private static void printRhombus(int n) {
        printFirstPartOfRhombus(n);
        printSecondPartOfRhombus(n);
    }

    private static void printSecondPartOfRhombus(int n) {
        for (int i = n - 1; i >= 1; i--) {
            printSpacesOnARow(n, i);
            printStarsOnARowAndNewLine(i);
        }
    }

    private static void printFirstPartOfRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            printSpacesOnARow(n, i);
            printStarsOnARowAndNewLine(i);
        }
    }

    private static void printStarsOnARowAndNewLine(int i) {
        for (int j = 0; j < i; j++) {
            System.out.print("* ");
        }
        System.out.println("");
    }

    public static void printSpacesOnARow(int n, int i) {
        for (int j = 0; j < n - i; j++) {
            System.out.print(" ");
        }
    }
}
