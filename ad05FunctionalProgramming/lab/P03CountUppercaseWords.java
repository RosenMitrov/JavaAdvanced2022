package JavaAdvanced.ad05FunctionalProgramming.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//created by R.M.
public class P03CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Predicate<String> startWithUppercase = word -> Character.isUpperCase(word.charAt(0));

        List<String> allWords = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        List<String> onlyWithUppercase = allWords.stream().filter(startWithUppercase).collect(Collectors.toList());

        System.out.println(onlyWithUppercase.size());

        Consumer<String> print = System.out::println;
        onlyWithUppercase.forEach(print);

    }
}
/*
3.	Count Uppercase Words
Write a program that reads one line of text from the console.
Print the count of words that start with an Uppercase letter,
after that print all these words in the same order,
as you found them in the text.
Use a Predicate<String>.

 */