package JavaAdvanced.ad09IteratorsAndComparators.exercises.P06StrategyPattern;

import java.util.Comparator;

public class ComparatorByNameLengthAndFirstLetter implements Comparator<Person> {

    @Override
    public int compare(Person first, Person second) {
        if (first.getName().length() == second.getName().length()) {
            char firstPersonChar = first.getName().toLowerCase().charAt(0);
            char secondPersonChar = second.getName().toLowerCase().charAt(0);
            return Character.compare(firstPersonChar, secondPersonChar);
        }
        return Integer.compare(first.getName().length(), second.getName().length());
    }
}
