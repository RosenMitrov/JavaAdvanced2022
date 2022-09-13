package JavaAdvanced.ad05FunctionalProgramming.lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//created by R.M.
public class P06FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] range = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int low = range[0];
        int up = range[1];
        String condition = scanner.nextLine();

        Stream<String> stringStream = IntStream.rangeClosed(low, up)
                .boxed()
                .filter(getPredicate(condition))
                .map(String::valueOf);

        System.out.println(stringStream.collect(Collectors.joining(" ")));
    }

    private static Predicate<Integer> getPredicate(String condition) {
        if (condition.equals("odd")) {
            return num -> num % 2 != 0;
        } else if (condition.equals("even")) {
            return num -> num % 2 == 0;
        } else {
            throw new IllegalArgumentException("Invalid condition " + condition);
        }
    }
}
/*
6.	Find Evens or Odds
You are given a lower and an upper bound for a range of integer numbers.
Then a command specifies if you need to list all even or odd numbers in the given range.
Use predicates that need to be passed to a method.

 */