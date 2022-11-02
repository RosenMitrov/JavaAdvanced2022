package JavaAdvanced.ad08Generics.exercises.P02GenericBoxInteger;

import java.util.ArrayList;
import java.util.List;

//created by R.M.
public class GenericBox<T> {
    private List<T> list;

    public GenericBox() {
        this.list = new ArrayList<>();
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
