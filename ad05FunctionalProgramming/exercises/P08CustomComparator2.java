package JavaAdvanced.ad05FunctionalProgramming.exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Consumer;

//created by R.M.
public class P08CustomComparator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        Comparator<Integer> comparator = (num1, num2) -> {
            if (num1 % 2 == 0 && num2 % 2 != 0) {
                //num1 even, num2 odd
                return -1;
            } else if (num1 % 2 != 0 && num2 % 2 == 0) {
                //num1 odd, num2 even
                return 1;
            } else {
                return num1.compareTo(num2);
            }
        };

        Arrays.sort(numbers, comparator);
        Consumer<Integer> printer = e -> System.out.print(e + " ");
        Arrays.stream(numbers).forEach(printer);
    }
}
/*
Write a custom comparator that sorts all even numbers before all odd ones in ascending order.
Pass it to an Arrays.sort() function and print the result.
 */