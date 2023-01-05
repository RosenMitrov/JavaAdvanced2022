package JavaAdvanced.ad09IteratorsAndComparators.exercises.P01ListyIterator;

import java.util.List;

public class ListyIterator {
    private List<String> elements;
    private int currentIndex;

    public ListyIterator(String... elements) {
        this.elements = List.of(elements);
    }

    public boolean move() {
        if (hasNext()) {
            this.currentIndex++;
            return true;
        }
        return false;

    }

    public boolean hasNext() {
        return this.currentIndex < this.elements.size() - 1;
    }

    public void print() {
        if (this.elements.isEmpty()) {

            throw new IllegalStateException("Invalid Operation!");
        } else {
            System.out.println(this.elements.get(currentIndex));
        }
    }


}
