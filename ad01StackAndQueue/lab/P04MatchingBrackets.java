package JavaAdvanced.ad01StackAndQueue.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

//created by R.M.
public class P04MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String arithmeticalExpression = scanner.nextLine();
        ArrayDeque<Integer> indexOfOpenBracket = new ArrayDeque<>();

        for (int index = 0; index < arithmeticalExpression.length(); index++) {
            char currentElement = arithmeticalExpression.charAt(index);
            if (currentElement == '(') {
                indexOfOpenBracket.push(index);
            } else if (currentElement == ')') {
                int startIndex = indexOfOpenBracket.pop();
                int endIndex = index + 1;
                String expressionToPrint = arithmeticalExpression.substring(startIndex, endIndex);
                System.out.println(expressionToPrint);
            }
        }
    }
}

/*
4.	Matching Brackets
We are given an arithmetical expression with brackets.
Scan through the string and extract each sub-expression.
Print the result back at the terminal.

 */