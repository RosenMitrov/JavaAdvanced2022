package JavaAdvanced.ad08Generics.exercises.P06GenericCount2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        GenericCount<Double> doubleGenericBox = new GenericCount<>();

        for (int i = 0; i < n; i++) {
            double input = Double.parseDouble(scanner.nextLine());
            doubleGenericBox.add(input);
        }

        double numberToCheck = Double.parseDouble(scanner.nextLine());
        System.out.println(doubleGenericBox.count(numberToCheck));
    }
}
