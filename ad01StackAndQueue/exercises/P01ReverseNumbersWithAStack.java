package JavaAdvanced.ad01StackAndQueue.exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

//created by R.M.
public class P01ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbersAsString = scanner.nextLine().split(" ");
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (String num : numbersAsString) {
            stack.push(Integer.parseInt(num));
        }

        for (Integer num : stack) {
            System.out.print(num + " ");
        }
    }
}
/*
1.	Reverse Numbers with a Stack
Write a program that reads N integers from the console and reverses them using a stack.
Use the ArrayDeque<Integer> class.
Just put the input numbers in the stack and pop them.
 */
