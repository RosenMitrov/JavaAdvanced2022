package JavaAdvanced.ad05FunctionalProgramming.exercises;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//created by R.M.
public class P10PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> peopleList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Party!")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            Predicate<String> predicate = getPredicate(tokens);
            switch (command) {
                case "Remove":
                    peopleList.removeIf(predicate);
                    break;
                case "Double":
                    List<String> peopleToDouble = peopleList.stream().filter(predicate).collect(Collectors.toList());
                    peopleList.addAll(peopleToDouble);
                    peopleToDouble.clear();

                    break;
            }

            input = scanner.nextLine();
        }
        if (peopleList.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            Collections.sort(peopleList);
            String result = String.join(", ", peopleList) + " are going to the party!";
            System.out.println(result);
        }

    }

    public static Predicate<String> getPredicate(String[] tokens) {
        Predicate<String> predicate = null;
        String filterName = tokens[1];
        String filterCriteria = tokens[2];

        switch (filterName) {
            case "StartsWith":
                predicate = name -> name.startsWith(filterCriteria);
                break;
            case "EndsWith":
                predicate = name -> name.endsWith(filterCriteria);
                break;
            case "Length":
                predicate = name -> name.length() == Integer.parseInt(filterCriteria);
                break;
        }
        return predicate;
    }
}
/*
10.	Predicate Party!
The Wire’s parents are on a vacation for the holidays and he is planning an epic party at home.
Unfortunately, his organizational skills are next to non-existent so you are given the task to help him with the reservations.
On the first line, you get a list of all the people that are coming.
On the next lines, until you get the "Party!" command, you may be asked to double
or remove all the people that apply to the given criteria.

There are three different options:
•	Everyone that has a name starts with a given string.
•	Everyone that has a name ending with a given string.
•	Everyone has a name with a given length.
When you print the guests that are coming to the party,
you have to print them in ascending order.
If nobody is going, print "Nobody is going to the party!". See the examples below:

 */