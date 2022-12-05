package JavaAdvanced.ad08Generics.exercises.P11Threeuple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] info = scanner.nextLine().split(" ");
        String firstName = info[0];
        String lastName = info[1];
        String address = info[2];
        String town = info[3];
        Threeuple<String, String, String> nameAddressTownTuple = new Threeuple<>(firstName + " " + lastName, address, town);
        System.out.println(nameAddressTownTuple);

        info = scanner.nextLine().split(" ");
        String name = info[0];
        int lettersOfBee = Integer.parseInt(info[1]);
        String drunkOrNot = info[2];

        Threeuple<String, Integer, String> nameLittersAndStatus = new Threeuple<>(name, lettersOfBee, drunkOrNot);
        nameLittersAndStatus.setThirdItem(drunkOrNot);
        System.out.println(nameLittersAndStatus);

        info = scanner.nextLine().split(" ");
        name = info[0];
        double accountBalance = Double.parseDouble(info[1]);
        String bankName = info[2];

        Threeuple<String, Double, String> nameBalanceBank = new Threeuple<>(name, accountBalance, bankName);
        System.out.println(nameBalanceBank);

    }
}
