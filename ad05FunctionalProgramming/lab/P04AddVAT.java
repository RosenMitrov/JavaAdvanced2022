package JavaAdvanced.ad05FunctionalProgramming.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

//created by R.M.
public class P04AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UnaryOperator<Double> addVat = value -> value * 1.20;

        List<Double> realNumbers = Arrays.stream(scanner.nextLine().split(", ")).map(Double::parseDouble).collect(Collectors.toList());

        System.out.println("Prices with VAT:");

        for (Double realNumber : realNumbers) {
            System.out.printf("%.2f%n", addVat.apply(realNumber));
        }
    }
}

/*
Write a program that reads one line of Double prices separated by ", ".
Print the prices with added VATs for all of them.
Format them to the 2nd digit after the decimal point.
The order of the prices must remain the same.
Use an UnaryOperator<Double>.

 */
