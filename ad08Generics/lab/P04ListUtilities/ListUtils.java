package JavaAdvanced.ad08Generics.lab.P04ListUtilities;

import java.util.List;

public class ListUtils {


    public static <T extends Comparable<T>> T getMin(List<T> list) {
        return list.stream().min(T::compareTo).orElseThrow(IllegalArgumentException::new);
    }

    public static <T extends  Comparable<T>> T getMax(List<T> list) {
        return list.stream().max(T::compareTo).orElseThrow(IllegalArgumentException::new);
    }
}
