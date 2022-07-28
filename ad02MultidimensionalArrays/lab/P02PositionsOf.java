package JavaAdvanced.ad02MultidimensionalArrays.lab;

import java.util.Arrays;
import java.util.Scanner;
//created by R.M.

public class P02PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimension = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = dimension[0];
        int cols = dimension[1];
        int[][] matrix = fillInMatrix(rows, cols, scanner);

        int searchedNumber = Integer.parseInt(scanner.nextLine());

        boolean isFound = false;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                int currentNum = matrix[row][col];
                if (currentNum == searchedNumber) {
                    System.out.println(row + " " + col);
                    isFound = true;
                }
            }
        }
        if (!isFound) {
            System.out.println("not found");
        }

    }

    private static int[][] fillInMatrix(int rows, int cols, Scanner scanner) {
        int[][] tempMatrix = new int[rows][cols];
        for (int row = 0; row < tempMatrix.length; row++) {
            String[] rowData = scanner.nextLine().split("\\s+");
            for (int col = 0; col < tempMatrix[row].length; col++) {
                tempMatrix[row][col] = Integer.parseInt(rowData[col]);
            }
        }
        return tempMatrix;
    }
}
/*
2.	Positions Of
Write a program that reads a matrix of integers from the console, then a number,
and prints all the positions at which that number appears in the matrix.
The matrix definition on the console will contain a line with two positive integer numbers R and C
– the number of rows and columns in the matrix – followed by R lines,
each containing C numbers (separated by spaces), representing each row of the matrix.
The number you will need to find the positions of will be entered on a single line, after the matrix.
You should print each position on a single line – first print the row, then the column at which the number appears.
If the number does not appear in the matrix, print "not found".

 */