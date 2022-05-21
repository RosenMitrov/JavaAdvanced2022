package JavaAdvanced.ad01StackAndQueue.lab;

import java.util.ArrayDeque;
import java.util.Scanner;
//created by R.M.

public class P02SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int index = arr.length - 1; index >= 0; index--) {
            stack.push(arr[index]);
        }
        int result = 0;
        while (stack.size() > 1) {
            int left = Integer.parseInt(stack.pop());
            String operator = stack.pop();
            int right = Integer.parseInt(stack.pop());
            result = getCurrentResult(left, operator, right);
            stack.push(String.valueOf(result));
        }
        System.out.println(result);

    }

    private static int getCurrentResult(int left, String operator, int right) {
        if (operator.equals("+")) {
            return left + right;
        }
        if (operator.equals("-")) {
            return left - right;
        }
        return 0;
    }
}
/*
2.	Simple Calculator
Create a simple calculator that can evaluate simple expressions that will not hold any operator different from addition and subtraction. T
here will not be parentheses or operator precedence.
Solve the problem using a Stack.

 */
