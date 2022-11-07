package JavaAdvanced.ad08Generics.exercises.P03GenericBoxSwap;

import java.util.ArrayList;
import java.util.List;

public class GenericBoxSwap<T> {
    private List<T> list;

    public GenericBoxSwap() {
        this.list = new ArrayList<>();
    }

    public void add(T value) {
        this.list.add(value);
    }

    public void swap(int firstIndex, int secondIndex) {
        T temp = this.list.get(firstIndex);
        list.set(firstIndex, list.get(secondIndex));
        list.set(secondIndex, temp);
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
