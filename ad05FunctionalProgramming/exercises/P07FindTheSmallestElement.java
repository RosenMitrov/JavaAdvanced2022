package JavaAdvanced.ad05FunctionalProgramming.exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

//created by R.M.
public class P07FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Function<int[], Integer> minElementIndex = numbersInFuncList -> {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int index = 0; index < numbersInFuncList.length; index++) {
                if (numbersInFuncList[index] <= min) {
                    min = numbersInFuncList[index];
                    minIndex = index;
                }
            }
            return minIndex;
        };

        System.out.println(minElementIndex.apply(numbers));

    }
}
/*
7.	Find the Smallest Element
Write a program that is using a custom function (written by you) to find the smallest integer in a sequence of integers.
The input could have more than one space. Your task is to collect the integers from the console,
find the smallest one and print its index (if more than one such elements exist, print the index of the rightmost one).

 */