package JavaAdvanced.ad03SetAndMap.exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

//created by R.M.
public class P05Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, String> phonebook = new LinkedHashMap<>();
        while (!input.equals("search")) {
            String[] tokens = input.split("-");
            String name = tokens[0];
            String phone = tokens[1];

            phonebook.put(name, phone);
            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("stop")) {
            if (phonebook.containsKey(input)) {
                System.out.println(input + " -> " + phonebook.get(input));
            } else {
                System.out.println("Contact " + input + " does not exist.");
            }
            input = scanner.nextLine();
        }
    }
}
/*
Problem 5.	Phonebook
Write a program that receives some info from the console about people and their phone numbers.
You are free to choose how the data is entered.
Each entry should have just one name and one number (both of them strings).
If you receive a name that already exists in the phonebook, simply update its number.
After filling this simple phonebook, upon receiving the command "search",
your program should be able to perform a search of contact by name and print her details in the format "{name} -> {number}".
In case the contact isn't found, print "Contact {name} does not exist.".

 */