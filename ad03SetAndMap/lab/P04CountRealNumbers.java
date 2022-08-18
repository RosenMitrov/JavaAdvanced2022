package JavaAdvanced.ad03SetAndMap.lab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

//created by R.M.
public class P04CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] realNumbers = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> occurrenceOfRealNumbers = new LinkedHashMap<>();
        for (double realNumber : realNumbers) {
            occurrenceOfRealNumbers.putIfAbsent(realNumber, 0);
            int oldCount = occurrenceOfRealNumbers.get(realNumber);
            int newCount = oldCount + 1;
            occurrenceOfRealNumbers.put(realNumber, newCount);
        }
        occurrenceOfRealNumbers.forEach((key, value) -> System.out.printf("%.1f -> %d%n", key, value));
    }

}
/*
II.	Maps
4.	Count Real Numbers
Write a program that counts the occurrence of real numbers.
The input is a single line with real numbers separated by a space.
Print the numbers in the order of appearance.
All numbers must be formatted to one digit after the decimal point.

 */
