package JavaAdvanced.ad03SetAndMap.exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//created by R.M.
public class P03PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCompounds = Integer.parseInt(scanner.nextLine());

        Set<String> chemicalCompoundsSet = new TreeSet<>();

        for (int i = 0; i < countCompounds; i++) {
            String[] arrOfCompounds = scanner.nextLine().split("\\s+");
            fillTheSetWithCompounds(chemicalCompoundsSet, arrOfCompounds);
        }

        chemicalCompoundsSet.forEach(el -> {
            System.out.print(el + " ");
        });
    }

    public static void fillTheSetWithCompounds(Set<String> set, String[] array) {
        set.addAll(Arrays.asList(array));
    }
}
/*
Problem 3.	Periodic Table
You are given an n number of chemical compounds.
You need to keep track of all chemical elements used in the compounds
and at the end print all unique ones in ascending order:

 */