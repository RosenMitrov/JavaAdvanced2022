package JavaAdvanced.ad05FunctionalProgramming.exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

//created by R.M.
public class P06PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int passedInteger = Integer.parseInt(scanner.nextLine());
        String[] names = scanner.nextLine().split("\\s+");

        Predicate<String> lessOrEqualPredicate = name -> name.length() <= passedInteger;
        Consumer<String> printer = System.out::println;

        Arrays.stream(names).filter(lessOrEqualPredicate).forEach(printer);
    }
}
/*
6.	Predicate for Names
Write a predicate.
Its goal is to check a name for its length
and to return true if the length of the name is less or equal to the passed integer.
You will be given an integer that represents the length you have to use. On the second line,
you will be given a string array with some names.
Print the names, passing the condition in the predicate.

 */