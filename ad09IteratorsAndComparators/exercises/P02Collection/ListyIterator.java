package JavaAdvanced.ad09IteratorsAndComparators.exercises.P02Collection;

import java.util.Iterator;
import java.util.List;

public class ListyIterator implements Iterable<String> {
    private List<String> elements;
    private int currentIndex;

    public ListyIterator() {
        this.currentIndex = 0;
    }

    public void create(String... elements) {
        this.elements = List.of(elements);
    }

    public boolean move() {
        if (hasNext()) {
            this.currentIndex++;
            return true;
        }
        return false;
    }

    public void print() {
        if (!this.elements.isEmpty()) {
            System.out.println(this.elements.get(currentIndex));
        } else {
            System.out.println("Invalid Operation!");
        }
    }

    public boolean hasNext() {
        return currentIndex < this.elements.size() - 1;
    }


    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < elements.size();
            }

            @Override
            public String next() {
                String element = elements.get(index);
                index++;
                return element;
            }
        };
    }
}
