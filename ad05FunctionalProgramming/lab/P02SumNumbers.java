package JavaAdvanced.ad05FunctionalProgramming.lab;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

//created by R.M.
public class P02SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());

       Function<List<Integer>, String> countFormatter = list -> "Count = " + list.size();
       Function<List<Integer>, String> sumAllNumbers = list -> "Sum = " + list.stream().mapToInt(num -> num).sum();

        System.out.println(countFormatter.apply(numbers));
        System.out.println(sumAllNumbers.apply(numbers));
    }
}
/*
2.	Sum Numbers
Write a program that reads one line of Integers separated by ", ". Print the count of the numbers and their sum.
Use a Function<String, Integer>.

 */