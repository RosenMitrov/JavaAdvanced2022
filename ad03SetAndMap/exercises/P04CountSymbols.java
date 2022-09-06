package JavaAdvanced.ad03SetAndMap.exercises;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//created by R.M.
public class P04CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String statement = scanner.nextLine();
        Map<Character, Integer> countCharMap = new TreeMap<>();

        for (int index = 0; index < statement.length(); index++) {
            char currentSymbol = statement.charAt(index);
            countCharMap.putIfAbsent(currentSymbol, 0);
            int oldValue = countCharMap.get(currentSymbol);
            countCharMap.put(currentSymbol, ++oldValue);
        }

        countCharMap.forEach((key, value) -> System.out.printf("%c: %d time/s%n", key, value));
    }
}
/*
Problem 4.	Count Symbols
Write a program that reads some text from the console
and counts the occurrences of each character in it.
Print the results in alphabetical (lexicographical) order.

 */