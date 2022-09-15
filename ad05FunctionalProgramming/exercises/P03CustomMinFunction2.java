package JavaAdvanced.ad05FunctionalProgramming.exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class P03CustomMinFunction2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Function<int[], Integer> smallestNumber = num -> Arrays.stream(num).min().getAsInt();
        System.out.println(smallestNumber.apply(numbers));
    }
}
