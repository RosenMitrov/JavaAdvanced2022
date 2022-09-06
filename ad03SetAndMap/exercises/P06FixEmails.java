package JavaAdvanced.ad03SetAndMap.exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

//created by R.M.
public class P06FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        Map<String, String> allNamesAndEmails = new LinkedHashMap<>();

        while (!name.equals("stop")) {
            String email = scanner.nextLine();
            if (email.equals("stop")) {
                break;
            }
            allNamesAndEmails.put(name, email);
            name = scanner.nextLine();
        }

        Map<String ,String > neededNamesAndEmail = new LinkedHashMap<>();
        allNamesAndEmails.forEach((key, value) -> {
            if (!value.endsWith(".us") && !value.endsWith(".uk") && !value.endsWith(".com")) {
                neededNamesAndEmail.put(key,value);
            }
        });

        neededNamesAndEmail.forEach((k, v) -> System.out.printf("%s -> %s%n", k, v));
    }
}
/*
Problem 6.	Fix Emails
You are given a sequence of strings,
each on a new line until you receive the "stop" command.
The first string is a name of a person. On the second line, you receive his email.
Your task is to collect their names and emails
and remove emails whose domain ends with "us", "uk" or "com" (case-insensitive).
Print in the following format:
"{name} – > {email}"

 */