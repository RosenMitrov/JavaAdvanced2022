package JavaAdvanced.ad01StackAndQueue.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

//created by R.M.
public class P05PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        ArrayDeque<String> queuePrinter = new ArrayDeque<>();
        String print = "";
        while (!command.equals("print")) {
            if (command.equals("cancel")) {
                if (queuePrinter.size() >= 1) {
                    String canceledFile = queuePrinter.poll();
                    System.out.println("Canceled " + canceledFile);
                } else {
                    System.out.println("Printer is on standby");
                }
            } else {
                queuePrinter.offer(command);
            }
            command = scanner.nextLine();
        }
        for (String file : queuePrinter) {
            System.out.println(file);
        }
    }
}
/*
5.	Printer Queue
The printer queue is a simple way to control the order of files sent to a printer device.
We know that a single printer can be shared between multiple devices.
So to preserve the order of the files sent, we can use a queue.
Write a program, which takes filenames until the "print" command is received.
Then as output print the filenames in the order of printing.
Some tasks may be canceled if you receive "cancel" you have to remove the first file to be printed.
If there is no current file to be printed, print "Printer is on standby".

 */