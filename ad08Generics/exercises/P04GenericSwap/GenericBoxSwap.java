package JavaAdvanced.ad08Generics.exercises.P04GenericSwap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericBoxSwap<T> {
    private List<T> list;

    public GenericBoxSwap() {
        this.list = new ArrayList<>();
    }

    public void swap(int firstIndex, int secondIndex) {
        Collections.swap(this.list, firstIndex, secondIndex);
    }

    public void add(T value) {
        this.list.add(value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T value : this.list) {
            sb.append(String.format("%s: %s%n", value.getClass().getName(), value));
        }
        return sb.toString();
    }
}
