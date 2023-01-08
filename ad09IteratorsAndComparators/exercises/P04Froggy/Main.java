package JavaAdvanced.ad09IteratorsAndComparators.exercises.P04Froggy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] input = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).toArray(Integer[]::new);
        Lake lake = new Lake(Arrays.asList(input));
        String[] strings = new String[lake.size()];
        int index = 0;
        for (Integer integer : lake) {
            strings[index] = String.valueOf(integer);
            index++;
        }

        System.out.println(String.join(", ", strings));
    }
}
