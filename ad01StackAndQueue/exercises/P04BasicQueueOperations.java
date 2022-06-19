package JavaAdvanced.ad01StackAndQueue.exercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

//created by R.M.
public class P04BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] data = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int elementsToEnqueue = data[0];
        int elementsToDequeue = data[1];
        int searchedElement = data[2];

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int[] elements = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < elementsToEnqueue; i++) {
            queue.offer(elements[i]);
        }

        for (int i = 0; i < elementsToDequeue; i++) {
            queue.poll();
        }

        boolean isContains = getIfContains(queue, searchedElement);
        if (isContains) {
            System.out.println(true);
        } else if (queue.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(queue.stream().mapToInt(e -> e).min().getAsInt());
        }
    }

    private static boolean getIfContains(ArrayDeque<Integer> queue, int searchedElement) {
        for (Integer integer : queue) {
            if (integer == searchedElement) {
                return true;
            }
        }
        return false;
    }
}
/*
4.	Basic Queue Operations
You will be given an integer N representing the number of elements to enqueue (add),
an integer S representing the number of elements to dequeue (remove/poll) from the queue,
and finally an integer X, an element that you should check whether is present in the queue.
If it is - prints true on the console,
if it is not - print the smallest element currently present in the queue.
 */
