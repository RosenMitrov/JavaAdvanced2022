package JavaAdvanced.ad01StackAndQueue.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

//created by R.M
public class P01BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        String url = "";

        ArrayDeque<String> currentURLs = new ArrayDeque<>();

        while (!command.equals("Home")) {
            boolean hasPreviousURL = true;
            if (command.equals("back")) {
                if (currentURLs.size() <= 1) {
                    System.out.println("no previous URLs");
                    hasPreviousURL = false;
                } else {
                    currentURLs.pop();
                    url = currentURLs.peek();
                }
            } else {
                url = command;
                currentURLs.push(url);
            }
            if (hasPreviousURL) {
                System.out.println(url);
            }
            command = scanner.nextLine();
        }
    }
}

/*
1.	Browser History
Write a program, which takes 2 types of browser instructions:
•	Normal navigation: a URL is set, given by a string;
•	The string "back" sets the current URL to the last set URL
After each instruction, the program should print the current URL.
If the back instruction can’t be executed, print
"no previous URLs". The input ends with the "Home" command and then simply you have to stop the program.

 */