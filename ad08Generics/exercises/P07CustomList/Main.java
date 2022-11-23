package JavaAdvanced.ad08Generics.exercises.P07CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        CustomList<String> customList = new CustomList<>();


        while (!input.equals("END")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            switch (command) {
                case "Add":
                    String valueToAdd = tokens[1];
                    customList.add(valueToAdd);
                    break;
                case "Remove":
                    int indexToRemove = Integer.parseInt(tokens[1]);
                    customList.remove(indexToRemove);
                    break;
                case "Contains":
                    String valueToCheck = tokens[1];
                    System.out.println(customList.contains(valueToCheck));
                    break;
                case "Swap":
                    int firstIndexToSwap = Integer.parseInt(tokens[1]);
                    int secondIndexToSwap = Integer.parseInt(tokens[2]);
                    customList.swap(firstIndexToSwap, secondIndexToSwap);
                    break;
                case "Greater":
                    String valueToCheckIsGreater = tokens[1];
                    System.out.println(customList.counterGreaterThan(valueToCheckIsGreater));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Print":
                    customList.print();
                    break;
                default:
                    System.out.println("The command that was given is not entered correctly");
                    break;
            }

            input = scanner.nextLine();
        }


    }
}
