package JavaAdvanced.ad01StackAndQueue.exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

//created by R.M.
public class P06FibonacciWithStack_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Long> stack = new ArrayDeque<>();
        stack.push(0L);
        stack.push(1L);

        while (n > 0) {
            long pop = stack.pop();
            long peek = stack.peek();
            stack.push(pop);
            stack.push(pop + peek);
            n--;
        }
        System.out.println(stack.peek());
    }
}
