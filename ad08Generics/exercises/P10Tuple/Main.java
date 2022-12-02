package JavaAdvanced.ad08Generics.exercises.P10Tuple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] personalInformation = scanner.nextLine().split("\\s+");
        String firstName = personalInformation[0];
        String lastName = personalInformation[1];
        String address = personalInformation[2];

        Tuple<String, String> nameAndAddress = new Tuple<>(firstName + " " + lastName, address);
        System.out.println(nameAndAddress);

        personalInformation = scanner.nextLine().split("\\s+");
        String name = personalInformation[0];
        int beerLitters = Integer.parseInt(personalInformation[1]);
        Tuple<String, Integer> nameAndLittersOfBeer = new Tuple<>(name, beerLitters);
        System.out.println(nameAndLittersOfBeer);

        personalInformation = scanner.nextLine().split("\\s");
        int integerFormat = Integer.parseInt(personalInformation[0]);
        double doubleFormat = Double.parseDouble(personalInformation[1]);
        Tuple<Integer, Double> integerDoubleTuple = new Tuple<>(integerFormat, doubleFormat);
        System.out.println(integerDoubleTuple);

    }
}
