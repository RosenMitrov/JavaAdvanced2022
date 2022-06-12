package JavaAdvanced.ad01StackAndQueue.exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

//created by R.M.
public class P03MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        while (numberOfCommands > 0) {
            String[] data = scanner.nextLine().split(" ");
            String command = data[0];
            switch (command) {
                case "1":
                    stack.push(Integer.parseInt(data[1]));
                    break;
                case "2":
                    stack.pop();
                    break;
                case "3":
                    System.out.println(stack.stream().mapToInt(e -> e).max().getAsInt());
                    break;
            }
            numberOfCommands--;
        }
    }
}
/*
3.	Maximum Element
You have an empty sequence, and you will be given N commands. Each command is one of the following types:
•	"1 X" - Push the element X into the stack.
•	"2" - Delete the element present at the top of the stack.
•	"3" - Print the maximum element in the stack.
Input
•	The first line of input contains an integer N, where 1 ≤ N ≤ 105.
•	The next N lines contain commands. All commands will be valid and in the format described.
•	The element X will be in the range 1 ≤ X ≤ 109.
•	The type of the command will be in the range 1 ≤ Type ≤ 3.
Output
•	For each command of type "3", print the maximum element in the stack on a new line.

 */