package JavaAdvanced.ad05FunctionalProgramming.exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//created by R.M.
public class P05ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());

        Predicate<Integer> isDivisible = num -> num % n != 0;

        numbers = numbers.stream().filter(isDivisible).collect(Collectors.toList());

        Collections.reverse(numbers);
        numbers.forEach(integer -> System.out.print(integer + " "));

    }
}
/*
5.	Reverse and Exclude
Write a program that reverses a collection
and removes elements that are divisible by a given integer n.

 */