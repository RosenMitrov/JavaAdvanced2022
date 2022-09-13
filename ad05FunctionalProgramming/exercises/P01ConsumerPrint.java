package JavaAdvanced.ad05FunctionalProgramming.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

//created by R.M.
public class P01ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> stringsList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        Consumer<String> printerForNames = System.out::println;

        stringsList.forEach(printerForNames);

    }
}
/*
1.	Consumer Print
Write a program that reads a collection of strings,
separated by one or more whitespaces,
from the console and then prints them onto the console.
Each string should be printed on a new line. Use a Consumer<T>.

 */