package JavaAdvanced.ad08Generics.exercises.P08CustomListSorter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class CustomList<T extends Comparable<T>> {
    private List<T> list;

    public CustomList() {
        this.list = new ArrayList<>();
    }

    public void add(T element) {
        this.list.add(element);
    }

    public T remove(int index) {
        return this.list.remove(index);
    }

    public boolean contains(T element) {
        return this.list.stream().anyMatch(el -> el.compareTo(element) == 0);
    }

    public void swap(int firstIndex, int secondIndex) {
        T temp = this.list.get(firstIndex);
        this.list.set(firstIndex, this.list.get(secondIndex));
        this.list.set(secondIndex, temp);
    }

    public long countGreaterThan(T element) {
        return this.list.stream().filter(el -> el.compareTo(element) > 0).count();
    }

    public T getMax() {
        return this.list.stream().max(Comparable::compareTo).get();
    }

    public T getMin() {
        return this.list.stream().min(Comparable::compareTo).get();
    }

    public void print() {
        Consumer<T> printer = System.out::println;
        this.list.forEach(printer);
    }

    public int size() {
        return this.list.size();
    }

    public T get(int index) {
        return this.list.get(index);
    }

}
