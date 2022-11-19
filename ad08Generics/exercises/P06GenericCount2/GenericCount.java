package JavaAdvanced.ad08Generics.exercises.P06GenericCount2;

import java.util.ArrayList;
import java.util.List;

public class GenericCount<T extends Comparable<T>> {
    private List<T> list;

    public GenericCount() {
        this.list = new ArrayList<>();
    }

    public void add(T value) {
        this.list.add(value);
    }

    public long count(T value) {
        return this.list.stream().filter(v -> v.compareTo(value) > 0).count();
    }


}
