package JavaAdvanced.ad01StackAndQueue.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

//created by R.M.
public class P06HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] namesOfChildren = scanner.nextLine().split(" ");
        int countRounds = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> childrenQueue = new ArrayDeque<>();

        for (String name : namesOfChildren) {
            childrenQueue.offer(name);
        }

        while (childrenQueue.size() > 1) {
            getRound(childrenQueue, countRounds);
            String removed = childrenQueue.poll();
            System.out.println("Removed " + removed);
        }
        System.out.println("Last is " + childrenQueue.poll());

    }

    private static void getRound(ArrayDeque<String> childrenQueue, int countRounds) {
        while (countRounds > 1 && childrenQueue.size() != 0) {
            String current = childrenQueue.poll();
            childrenQueue.offer(current);
            countRounds--;
        }
    }
}
/*
6.Hot Potato is a game in which children form a circle and start passing a hot potato.
The counting starts with the first kid. Every nth toss the child left with the potato leaves the game.
When a kid leaves the game, it passes the potato forward.
This continues repeating until there is only one kid left.
Create a program that simulates the game of Hot Potato.
Print every kid that is removed from the circle.
In the end, print the kid that is left last.

 */

