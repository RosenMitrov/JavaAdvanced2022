package JavaAdvanced.ad03SetAndMap.exercises;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

//created by R.M.
public class P02SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dataOfSizes = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Set<String> firstSet = new LinkedHashSet<>();
        int firstSize = dataOfSizes[0];
        getSet(firstSet, firstSize, scanner);

        Set<String> secondSet = new LinkedHashSet<>();
        int secondSize = dataOfSizes[1];
        getSet(secondSet, secondSize, scanner);

        firstSet.forEach(el -> {
            if (secondSet.contains(el)) {
                System.out.print(el + " ");
            }
        });
    }

    private static void getSet(Set<String> set, int size, Scanner scanner) {
        for (int i = 0; i < size; i++) {
            String currentElement = scanner.nextLine();
            set.add(currentElement);
        }
    }
}
/*
Problem 2.	Sets of Elements
On the first line, you are given the length of two sets N and M.
On the next N + M lines there are N numbers,
that are in the first set and M numbers that are in the second one.
Find all non-repeating element that appears in both of them, and print them in the same order at the console:
Set with length N = 4: {1, 3, 5, 7}
Set with length M = 3: {3, 4, 5}
Set that contains all repeating elements -> {3, 5}

 */
