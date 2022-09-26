package JavaAdvanced.ad06DefiningClasses.lab.P03BankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<Integer, BankAccount> bankAccountMap = new HashMap<>();

        while (!input.equals("End")) {
            String[] tokens = input.split(" ");
            String command = tokens[0];

            String output = null;
            if (command.equals("Create")) {
                BankAccount bankAccount = new BankAccount();
                int id = bankAccount.getId();
                bankAccountMap.put(id, bankAccount);

                output = "Account ID" + id + " created";
            } else if (command.equals("Deposit")) {

                int id = Integer.parseInt(tokens[1]);
                int amountToDeposit = Integer.parseInt(tokens[2]);


                BankAccount currentBankAccount = bankAccountMap.get(id);
                if (currentBankAccount != null) {
                    currentBankAccount.deposit(amountToDeposit);
                    output = "Deposited " + amountToDeposit + " to ID" + id;
                } else {
                    System.out.println("Account does not exist");
                }

            } else if (command.equals("SetInterest")) {

                double interestToSet = Double.parseDouble(tokens[1]);

                BankAccount.setInterestRate(interestToSet);

            } else if (command.equals("GetInterest")) {
                int id = Integer.parseInt(tokens[1]);
                int years = Integer.parseInt(tokens[2]);
                BankAccount currentAccount = bankAccountMap.get(id);
                if (currentAccount != null) {
                    double interestRate = currentAccount.getInterestRate(years);
                    output = String.format("%.2f", interestRate);
                } else {
                    System.out.println("Account does not exist");
                }
            }
            if (output != null) {
                System.out.println(output);
            }
            input = scanner.nextLine();
        }
    }
}
