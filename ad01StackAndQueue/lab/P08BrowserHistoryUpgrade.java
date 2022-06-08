package JavaAdvanced.ad01StackAndQueue.lab;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Scanner;

//created by R.M.
public class P08BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String navigation = scanner.nextLine();
        ArrayDeque<String> queue = new ArrayDeque<>();
        ArrayDeque<String> stack = new ArrayDeque<>();
        String current = "";

        while (!navigation.equals("Home")) {
            if (navigation.equals("back")) {
                if (stack.size() > 1) {
                    current = stack.pop();
                    queue.addFirst(current);
                    System.out.println(stack.peek());
                } else {
                    System.out.println("no previous URLs");
                }
            } else if (navigation.equals("forward")) {
                if (queue.size() > 0) {
                    current = queue.poll();
                    stack.push(current);
                    System.out.println(current);
                } else {
                    System.out.println("no next URLs");
                }
            } else {
                stack.push(navigation);
                queue.clear();
                System.out.println(stack.peek());
            }
            navigation = scanner.nextLine();
        }
    }
}
/*
8.	Browser History Upgrade
Extend "Browser History" with a "forward" instruction,
which visits URLs that were navigated away from by "back".
Each forward instruction visits the next most recent such URL.
If normal navigation happens, all potential forward URLs are removed until a new back instruction is given
if the forward instruction can’t be executed, print
"no next URLs".

 */