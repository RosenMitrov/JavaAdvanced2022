package JavaAdvanced.ad03SetAndMap.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//created by R.M.
public class P09Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> sorted = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted((n1, n2) -> n2.compareTo(n1))
                .limit(3)
                .collect(Collectors.toList());

        sorted.forEach(num -> {
            System.out.printf("%d ", num);
        });
    }
}
/*
9.	Largest 3 Numbers
Read a list of integers and print the largest 3 of them.
If there are less than 3, print all of them.

 */