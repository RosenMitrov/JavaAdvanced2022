package JavaAdvanced.ad08Generics.lab.P04ListUtilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 2, 3, 4, 5);
        System.out.println("MAX -> " + ListUtils.getMax(numbers));
        System.out.println("MIN -> " + ListUtils.getMin(numbers));

        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "A", "A", "A");
        System.out.println("MAX -> " + ListUtils.getMax(strings));
        System.out.println("MIN -> " + ListUtils.getMin(strings));

    }
}
