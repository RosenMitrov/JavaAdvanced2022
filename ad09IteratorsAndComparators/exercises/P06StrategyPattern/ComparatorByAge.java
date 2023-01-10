package JavaAdvanced.ad09IteratorsAndComparators.exercises.P06StrategyPattern;

import java.util.Comparator;

public class ComparatorByAge implements Comparator<Person> {

    @Override
    public int compare(Person first, Person second) {

        return Integer.compare(first.getAge(), second.getAge());
    }
}
