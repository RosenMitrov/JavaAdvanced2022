package JavaAdvanced.ad09IteratorsAndComparators.exercises.P04Froggy;

import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer> {
    public List<Integer> numbers;

    public Lake(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }

    public int size() {
        return this.numbers.size();
    }

    private class Frog implements Iterator<Integer> {

        private int index = 0;
        boolean firstRoundFinished = false;

        @Override
        public boolean hasNext() {
            return this.index < numbers.size();
        }

        @Override
        public Integer next() {
            Integer num = numbers.get(index);
            index += 2;
            if (index >= numbers.size() && !firstRoundFinished) {
                firstRoundFinished = true;
                index = 1;
            }
            return num;
        }
    }
}
