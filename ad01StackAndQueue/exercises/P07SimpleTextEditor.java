package JavaAdvanced.ad01StackAndQueue.exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

//created by R.M.
public class P07SimpleTextEditor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder();

        int numOfOperations = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < numOfOperations; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            int commandNum = Integer.parseInt(data[0]);
            switch (commandNum) {
                case 1:
                    text.append(data[1]);
                    stack.push(text.toString());
                    break;
                case 2:
                    int countTodDel = Integer.parseInt(data[1]);
                    text.delete(text.length() - countTodDel, text.length());
                    stack.push(text.toString());
                    break;
                case 3:
                    System.out.println(text.charAt(Integer.parseInt(data[1]) - 1));
                    break;
                case 4:
                    stack.pop();
                    if (!stack.isEmpty()) {
                        text = new StringBuilder(stack.peek());
                    } else {
                        text = new StringBuilder("");
                    }
                    break;
            }
        }
    }
}
/*
7.	*Simple Text Editor
You are given an empty text. Your task is to implement 4 types of commands related to manipulating the text:
•	"1 {string}" - appends [string] to the end of the text.
•	"2 {count}" - erases the last [count] elements from the text.
•	"3 {index}" - returns the element at position [index] from the text.
•	"4" - undoes the last not-undone command of type 1 or 2 and returns the text to the state before that operation.
Input
•	The first line contains N, the number of operations, where 1 ≤ N ≤ 105.
•	Each of the following N lines contains the name of the operation,
followed by the command argument, if any, separated by space in the following format "command argument".
•	The length of the text will not exceed 1000000.
•	All input characters are English letters.
•	It is guaranteed that the sequence of input operations is possible to perform.
Output
•	For each operation of type "3" print a single line with the returned character of that operation

 */