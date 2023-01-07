package JavaAdvanced.ad09IteratorsAndComparators.exercises.P03StackIterator;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        MyStack myStack = new MyStack();

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String[] tokens = input.split("\\s+|,\\s+");
            String command = tokens[0];


            switch (command) {
                case "Pop":
                    try {
                        myStack.pop();
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "Push":
                    myStack.push(Arrays.copyOfRange(tokens, 1, tokens.length));
                    break;
            }
            input = scanner.nextLine();
        }
        myStack.print();
        myStack.print();
    }
}
