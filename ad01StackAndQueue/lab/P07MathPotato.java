package JavaAdvanced.ad01StackAndQueue.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

//created by R.M.
public class P07MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] childrenNames = scanner.nextLine().split(" ");
        int rounds = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> namesQueue = new ArrayDeque<>();
        for (String name : childrenNames) {
            namesQueue.offer(name);
        }
        int count = 1;

        while (namesQueue.size() > 1) {
            getRound(namesQueue, rounds);
            if (isPrime(count)) {
                System.out.println("Prime " + namesQueue.peek());
            } else {
                System.out.println("Removed " + namesQueue.poll());
            }
            count++;
        }
        System.out.println("Last is " + namesQueue.poll());
    }

    private static void getRound(ArrayDeque<String> namesQueue, int rounds) {
        while (rounds > 1 && namesQueue.size() != 0) {
            String currentName = namesQueue.poll();
            namesQueue.offer(currentName);
            rounds--;
        }
    }

    private static boolean isPrime(int count) {
        if (count == 1) {
            return false;
        }
        for (int i = 2; i <= count / 2; i++) {
            int temp = count % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }
}
/*
7.	Math Potato
Rework the previous problem so that a child is removed only on a composite (not prime) cycle (cycles start from 1).
If a cycle is prime, just print the child's name.
As before, print the name of the child that is left last.

 */