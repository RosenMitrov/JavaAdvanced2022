package JavaAdvanced.ad05FunctionalProgramming.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

//created by R.M.
public class P04AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Consumer<Integer> printer = num -> System.out.print(num + " ");

        UnaryOperator<List<Integer>> addFunction = numbersList -> numbersList.stream().map(n -> n + 1).collect(Collectors.toList());
        UnaryOperator<List<Integer>> multiplyFunction = numbersList -> numbersList.stream().map(n -> n * 2).collect(Collectors.toList());
        UnaryOperator<List<Integer>> subtractFunction = numbersList -> numbersList.stream().map(n -> n - 1).collect(Collectors.toList());


        String input = scanner.nextLine();
        while (!input.equals("end")) {
            switch (input) {
                case "add":
                    numbers = addFunction.apply(numbers);
                    break;
                case "multiply":
                    numbers = multiplyFunction.apply(numbers);
                    break;
                case "subtract":
                    numbers = subtractFunction.apply(numbers);
                    break;
                case "print":
                    numbers.forEach(printer);
                    System.out.println();
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
/*
4.	Applied Arithmetic
On the first line, you are given a list of numbers.
On the next lines you are passed different commands that you need to apply to all numbers in the list:
"add" -> adds 1;
"multiply" -> multiplies by 2;
"subtract" -> subtracts 1;
"print" -> prints all numbers on a new line.
The input will end with an "end" command, after which the result must be printed.

 */
