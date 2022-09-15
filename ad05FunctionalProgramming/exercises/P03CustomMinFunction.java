package JavaAdvanced.ad05FunctionalProgramming.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

//created by R.M.
public class P03CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> setOfNumbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Function<List<Integer>, Integer> smallestFunction = numbers -> numbers.stream().mapToInt(value -> value).min().getAsInt();

        int integer = smallestFunction.apply(setOfNumbers);

        System.out.println(integer);

    }
}
/*
3.	Custom Min Function
Write a simple program that reads a set of numbers from the console
and finds the smallest of the numbers using a simple Function<Integer[], Integer>.

 */