package JavaAdvanced.ad09IteratorsAndComparators.exercises.P02Collection;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ListyIterator listyIterator = new ListyIterator();
        while (!input.equals("END")) {
            String[] infoParts = input.split("\\s+");
            String command = infoParts[0];
            switch (command) {
                case "Create":
                    listyIterator.create(Arrays.copyOfRange(infoParts, 1, infoParts.length));
                    break;
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                case "Print":
                    listyIterator.print();
                    break;
                case "PrintAll":
                    listyIterator.forEach(el -> System.out.print(el + " "));
                    System.out.println();
                    break;
            }

            input = scanner.nextLine();
        }
    }
}
