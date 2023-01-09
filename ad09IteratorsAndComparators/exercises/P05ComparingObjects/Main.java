package JavaAdvanced.ad09IteratorsAndComparators.exercises.P05ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> peopleList = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String[] tokens = input.split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            String town = tokens[2];

            Person person = new Person(name, age, town);
            peopleList.add(person);


            input = scanner.nextLine();
        }
        int comparePersonIndex = Integer.parseInt(scanner.nextLine());
        Person personToCompare = peopleList.get(comparePersonIndex - 1);
        int totalSize = peopleList.size();
        int countEqualPeople = 0;
        int countNotEqualPeople = 0;

        for (Person person : peopleList) {
            if (person.compareTo(personToCompare) == 0) {
                countEqualPeople++;
            } else {
                countNotEqualPeople++;
            }
        }

        if (countEqualPeople == 1) {
            System.out.println("No matches");
        } else {
            System.out.println(countEqualPeople + " " + countNotEqualPeople + " " + totalSize);
        }

    }
}
