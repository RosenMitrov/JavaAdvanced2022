package JavaAdvanced.ad09IteratorsAndComparators.exercises.P01ListyIterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ListyIterator listyIterator = null;
        while (!input.equals("END")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "Create":
                    listyIterator = new ListyIterator(Arrays.copyOfRange(tokens, 1, tokens.length));
                    break;
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "Print":
                    try {
                        listyIterator.print();
                    } catch (IllegalStateException e) {
                        System.out.println("Invalid Operation!");
                    }
                    break;
                case "HasNext":
                    if (listyIterator != null) {
                        System.out.println(listyIterator.hasNext());
                    }
                    break;
            }

            input = scanner.nextLine();
        }
    }
}
