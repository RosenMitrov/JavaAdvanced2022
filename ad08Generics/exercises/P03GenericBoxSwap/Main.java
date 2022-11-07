package JavaAdvanced.ad08Generics.exercises.P03GenericBoxSwap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nLines = Integer.parseInt(scanner.nextLine());

        GenericBoxSwap<String> stringBox = new GenericBoxSwap<>();

        while (nLines-- > 0) {
            String input = scanner.nextLine();
            stringBox.add(input);
        }

        String[] indices = scanner.nextLine().split(" ");
        int firstIndex = Integer.parseInt(indices[0]);
        int secondIndex = Integer.parseInt(indices[1]);
        stringBox.swap(firstIndex, secondIndex);

        System.out.println(stringBox);

    }
}
