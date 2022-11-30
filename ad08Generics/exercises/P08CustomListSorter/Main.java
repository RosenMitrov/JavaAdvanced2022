package JavaAdvanced.ad08Generics.exercises.P08CustomListSorter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        CustomList<String> customList = new CustomList<>();
        while (!input.equals("END")) {
            String[] tokens = input.split(" ");
            String command = tokens[0];
            switch (command) {
                case "Add":
                    String elementToAdd = tokens[1];
                    customList.add(elementToAdd);
                    break;
                case "Remove":
                    int indexToRemove = Integer.parseInt(tokens[1]);
                    customList.remove(indexToRemove);
                    break;
                case "Contains":
                    String elementToCheck = tokens[1];
                    System.out.println(customList.contains(elementToCheck));
                    break;
                case "Swap":
                    int firstIndexToSwap = Integer.parseInt(tokens[1]);
                    int secondIndexToSwap = Integer.parseInt(tokens[2]);
                    customList.swap(firstIndexToSwap, secondIndexToSwap);
                    break;
                case "Greater":
                    String elementToCheckIsGreater = tokens[1];
                    System.out.println(customList.countGreaterThan(elementToCheckIsGreater));
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
                case "Sort":
                Sorter.sort(customList);
                    break;
            }

            input = scanner.nextLine();
        }
    }
}
