package JavaAdvanced.ad08Generics.exercises.P07CustomList;

import java.util.ArrayList;
import java.util.List;

public class CustomList<T extends Comparable<T>> {
    private List<T> list;

    public CustomList() {
        this.list = new ArrayList<>();
    }

    public void add(T value) {
        this.list.add(value);
    }

    public T remove(int index) {
        return this.list.remove(index);
    }

    public boolean contains(T value) {
        return this.list.stream().anyMatch(v -> v.compareTo(value) == 0);
    }

    public void swap(int firstIndex, int secondIndex) {
        T temp = this.list.get(firstIndex);
        this.list.set(firstIndex, this.list.get(secondIndex));
        this.list.set(secondIndex, temp);
    }

    public long counterGreaterThan(T value) {
        return this.list.stream().filter(v -> v.compareTo(value) > 0).count();
    }

    public T getMax() {
        return this.list.stream().max(Comparable::compareTo).get();
    }

    public T getMin() {
        return this.list.stream().min(Comparable::compareTo).get();
    }

    public void print(){
        this.list.forEach(System.out::println);
    }
}
