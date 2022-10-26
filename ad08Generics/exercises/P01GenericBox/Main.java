package JavaAdvanced.ad08Generics.exercises.P01GenericBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        GenericBox<String> genericBox = new GenericBox<>();

        while (n-- > 0) {
            String input = scanner.nextLine();
            genericBox.add(input);
        }

        System.out.println(genericBox);

    }
}
/*
Problem 1.	Generic Box
Create a generic class Box that can store any type.
Override the toString() method to print the type and the value of the stored data in the format "{class full name}: {value}".
Use the class that you've created and test it with the class java.lang.String.
On the first line, you will get n - the number of strings to read from the console.
On the next n lines, you will get the actual strings.
For each of them create a box and call its toString() method to print its data on the console.

 */