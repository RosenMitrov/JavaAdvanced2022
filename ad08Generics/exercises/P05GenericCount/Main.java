package JavaAdvanced.ad08Generics.exercises.P05GenericCount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        GenericBoxCount<String> genericBoxCount = new GenericBoxCount<>();

        while (n-- > 0) {
            String input = scanner.nextLine();
            genericBoxCount.add(input);
        }
        String valueToCompare = scanner.nextLine();

        System.out.println(genericBoxCount.count(valueToCompare));
    }
}
