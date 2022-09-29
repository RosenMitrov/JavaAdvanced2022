package JavaAdvanced.ad06DefiningClasses.exercises.P01opinionPoll;

import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfPeople = Integer.parseInt(scanner.nextLine());

        List<Person> peopleList = new ArrayList<>();

        for (int i = 0; i < countOfPeople; i++) {
            String[] tokensPersonalInfo = scanner.nextLine().split("\\s+");

            String name = tokensPersonalInfo[0];
            int age = Integer.parseInt(tokensPersonalInfo[1]);

            Person person = new Person(name, age);
            peopleList.add(person);
        }

     //   peopleList.sort(Comparator.comparing(Person::getName));

        Comparator<Person> alphabeticallySorted = Comparator.comparing(Person::getName);

        Predicate<Person> moreThan30 = person -> person.getAge() > 30;

        peopleList.stream()
                .filter(moreThan30)
                .sorted(alphabeticallySorted)
                .forEach(System.out::println);
    }
}
