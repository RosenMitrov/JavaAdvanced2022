package JavaAdvanced.ad01StackAndQueue.exercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

//created by R.M.
public class P02BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] data = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int countElements = data[0];
        int countToRemove = data[1];
        int numberToCheck = data[2];

        String[] numbersAsString = scanner.nextLine().split(" ");
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < countElements; i++) {
            stack.push(Integer.parseInt(numbersAsString[i]));
        }

        for (int i = 0; i < countToRemove; i++) {
            stack.pop();
        }
        if (stack.isEmpty()) {
            System.out.println(0);
        } else if (stack.contains(numberToCheck)) {
            System.out.println("true");
        } else {
            System.out.println(stack.stream().min(Integer::compare).get());
        }
    }
}
/*
2.	Basic Stack Operations
You will be given an integer N representing the number of elements to push into the stack,
an integer S representing the number of elements to pop from the stack, and finally an integer X,
an element that you should check whether is present in the stack. If it is, print "true" on the console.
If it’s not, print the smallest element currently present in the stack.
Input
•	On the first line, you will be given N, S, and X separated by a single space.
•	On the next line, you will be given a line of numbers separated by one or more white spaces.
Output
•	On a single line print, either "true" if X is present in the stack, otherwise print the smallest element in the stack.
•	If the stack is empty – print 0.

 */