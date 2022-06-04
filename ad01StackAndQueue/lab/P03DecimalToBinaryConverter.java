package JavaAdvanced.ad01StackAndQueue.lab;

import java.util.ArrayDeque;
import java.util.Scanner;
//created by R.M.

public class P03DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> binaryStack = new ArrayDeque<>();

        int decimalNumber = Integer.parseInt(scanner.nextLine());

        while (decimalNumber != 0) {
            int remainder = decimalNumber % 2;
            binaryStack.push(remainder);
            decimalNumber /= 2;
        }
        if (binaryStack.size() == 0) {
            System.out.println(0);
        } else {

            for (Integer integer : binaryStack) {
                System.out.print(integer);
            }
        }
    }
}
/*
3.	Decimal to Binary Converter
Create a simple program that can convert a decimal number to its binary representation. Implement an elegant solution using a Stack.
Print the binary representation back at the terminal


 */
