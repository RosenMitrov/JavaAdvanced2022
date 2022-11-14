package JavaAdvanced.ad08Generics.exercises.P04GenericSwap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        GenericBoxSwap<Integer> integerBox = new GenericBoxSwap<>();
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            integerBox.add(input);
        }
        String[] indices = scanner.nextLine().split(" ");

        int firstIndex = Integer.parseInt(indices[0]);
        int secondIndex = Integer.parseInt(indices[1]);
        integerBox.swap(firstIndex, secondIndex);

        System.out.println(integerBox);
    }
}
