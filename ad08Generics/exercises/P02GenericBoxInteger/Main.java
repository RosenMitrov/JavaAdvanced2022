package JavaAdvanced.ad08Generics.exercises.P02GenericBoxInteger;

import java.util.Scanner;

//created by R.M.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nLines = Integer.parseInt(scanner.nextLine());
        GenericBox<Integer> integerGenericBox = new GenericBox<>();
        for (int i = 0; i < nLines; i++) {
            int integer = Integer.parseInt(scanner.nextLine());
            integerGenericBox.add(integer);
        }
        System.out.println(integerGenericBox);
    }
}
