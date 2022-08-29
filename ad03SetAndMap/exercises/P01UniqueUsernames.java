package JavaAdvanced.ad03SetAndMap.exercises;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

//created by R.M.
public class P01UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countUsers = Integer.parseInt(scanner.nextLine());

        Set<String> setOfUsers = new LinkedHashSet<>();

        for (int i = 0; i < countUsers; i++) {
            String user = scanner.nextLine();
            setOfUsers.add(user);
        }

        setOfUsers.forEach(System.out::println);

//        for (String user : setOfUsers) {
//            System.out.println(user);
//        }
    }
}
/*
Problem 1.	Unique Usernames
Write a simple program that reads from the console a sequence of usernames
and keeps a collection with only the unique ones.
Print the collection on the console in order of insertion:

 */
