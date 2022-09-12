package JavaAdvanced.ad05FunctionalProgramming.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//created by R.M.
public class P05FilterByAge {

    static class Person {
        private String name;
        private int age;


        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(", ");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            Person person = new Person(name, age);
            people.add(person);
        }


        String condition = scanner.nextLine();
        int ageFilter = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();

        people = filterByAgeCondition(people, gerPredicate(condition, ageFilter));

        Consumer<Person> printer = getPrinter(format);

        people.forEach(printer);
    }

    private static Consumer<Person> getPrinter(String format) {
        if (format.equals("name")) {
            return person -> System.out.println(person.name);
        } else if (format.equals("age")) {
            return person -> System.out.println(person.age);
        } else if (format.equals("name age")) {
            return person -> System.out.println(person.name + " - " + person.age);
        } else {
            throw new IllegalArgumentException("Unknown format " + format);

        }
    }

    private static Predicate<Person> gerPredicate(String condition, int ageFilter) {
        if (condition.equals("younger")) {
            return person -> person.age <= ageFilter;
        } else if (condition.equals("older")) {
            return person -> person.age >= ageFilter;
        } else {
            throw new IllegalArgumentException("Invalid parameters for age predicate " + condition + " " + ageFilter);
        }
    }

    public static List<Person> filterByAgeCondition(List<Person> people, Predicate<Person> predicate) {
        return people.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}
/*
5.	Filter by Age
Write a program that reads an integer N on the first line.
And on next N lines read pairs of "{name}, {age}". Then read three more lines:
•	Condition - "younger" or "older"
•	Age - Integer
•	Format - "name", "age" or "name age"
Depending on the condition, print the pairs in the right format.
Don’t use any built-in functionality. Write your methods.

 */