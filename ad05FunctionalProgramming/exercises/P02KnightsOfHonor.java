package JavaAdvanced.ad05FunctionalProgramming.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

//created by R.M.
public class P02KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> namesList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        Consumer<String> appenderAndPrinter = name -> System.out.println("Sir " + name);

        namesList.forEach(appenderAndPrinter);
    }
}
/*
2.	Knights of Honor
Write a program that reads a collection of names as strings from the console
and then appends "Sir" in front of every name
and prints it back onto the console. Use a Consumer<T>.

 */