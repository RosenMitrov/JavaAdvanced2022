package JavaAdvanced.ad02MultidimensionalArrays.lab;

import java.util.Arrays;
import java.util.Scanner;

//created by R.M.
public class P04SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimension = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int rows = dimension[0];
        int cols = dimension[1];
        int [][] matrix = new int[rows][cols];
        int sumElements = 0;
        for (int row = 0; row < rows; row++) {
            int[] rowData = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            sumElements += Arrays.stream(rowData).sum();
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = rowData[col];
            }
        }
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        System.out.println(sumElements);
    }
}

/*
4.	Sum Matrix Elements
Write a program that reads a matrix from the console and prints:
•	The count of rows
•	The count of columns
•	The sum of all matrix’s elements
On the first line, you will get the dimensions of the matrix in the format "{rows, columns}".
On the next lines, you will get the elements for each row separated by a comma.

 */
