package JavaAdvanced.ad01StackAndQueue.exercises;

import java.util.Scanner;

//created by R.M.
public class P06RecursiveFibonacci {
    private static long[] fibonacciMemory;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        fibonacciMemory = new long[n + 1];
        long result = getFib(n);
        System.out.println(result);

    }

    private static long getFib(int n) {
        if (n <= 2) {
            return n;
        }
        if (fibonacciMemory[n] != 0) {
            return fibonacciMemory[n];
        }
        long nthFibNumber = (getFib(n - 1) + getFib(n - 2));
        fibonacciMemory[n] = nthFibNumber;
        return nthFibNumber;

    }
}
