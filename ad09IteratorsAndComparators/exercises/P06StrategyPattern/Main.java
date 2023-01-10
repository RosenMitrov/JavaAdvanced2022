package JavaAdvanced.ad09IteratorsAndComparators.exercises.P06StrategyPattern;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Person> nameSet = new TreeSet<>(new ComparatorByNameLengthAndFirstLetter());
        Set<Person> ageSet = new TreeSet<>(new ComparatorByAge());

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] personInfo = scanner.nextLine().split("\\s+");
            String name = personInfo[0];
            int age = Integer.parseInt(personInfo[1]);

            Person person = new Person(name, age);
            nameSet.add(person);
            ageSet.add(person);
        }
        nameSet.forEach(System.out::println);
        ageSet.forEach(System.out::println);
    }
}
