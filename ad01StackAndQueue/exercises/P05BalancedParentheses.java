package JavaAdvanced.ad01StackAndQueue.exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

//created by R.M.
public class P05BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String brackets = scanner.nextLine();

        ArrayDeque<String> stackBrackets = new ArrayDeque<>();
        boolean isBalanced = true;
        for (int index = 0; index < brackets.length(); index++) {
            char element = brackets.charAt(index);

            if (element == '(' || element == '{' || element == '[') {
                stackBrackets.push(String.valueOf(element));
            } else if (element == ')' || element == '}' || element == ']') {
                if (stackBrackets.isEmpty()) {
                    isBalanced = false;
                    break;
                }
                if (element == ')' && !stackBrackets.pop().equals("(")) {
                    isBalanced = false;
                    break;
                }
                if (element == '}' && !stackBrackets.pop().equals("{")) {
                    isBalanced = false;
                    break;
                }
                if (element == ']' && !stackBrackets.pop().equals("[")) {
                    isBalanced = false;
                    break;
                }
            }
        }
        if (isBalanced && stackBrackets.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
/*
5.	Balanced Parentheses
Given a sequence consisting of parentheses, determine whether the expression is balanced.
A sequence of parentheses is balanced if every open parenthesis can be paired uniquely with a closing parenthesis that occurs after the former.
Also, the interval between them must be balanced.
You will be given three types of parentheses: (, {, and [.
{[()]} - This is a balanced parenthesis.
{[(])} - This is not a balanced parenthesis.
Input
•	Each input consists of a single line, the sequence of parentheses.
•	1 ≤ Length of sequence ≤ 1000.
•	Each character of the sequence will be one of the following: {, }, (, ), [, ].
Output
•	For each test case, print on a new line "YES" if the parentheses are balanced. Otherwise, print "NO".

 */