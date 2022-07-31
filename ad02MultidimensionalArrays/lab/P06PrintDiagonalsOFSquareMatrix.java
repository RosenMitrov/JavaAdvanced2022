package JavaAdvanced.ad02MultidimensionalArrays.lab;

import java.util.Scanner;

//created by R.M.
public class P06PrintDiagonalsOFSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        for (int row = 0; row < matrix.length; row++) {
            String[] rowData = scanner.nextLine().split(" ");
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = Integer.parseInt(rowData[col]);
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            int col = row;
            System.out.print(matrix[row][col] + " ");
        }
        System.out.println();
        for (int row = matrix.length - 1; row >= 0; row--) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (col == matrix[row].length - 1 - row) {
                    System.out.print(matrix[row][col] + " ");
                }
            }
        }
    }
}
/*
6.	Print Diagonals of Square Matrix
Write a program that reads a matrix from the console. Then print the diagonals.
The matrix will always be square. On the first line, you read a single integer N the matrix size.
Then on each line N elements. The first diagonal should always start with the element at the first row and col,
the second diagonal should start with the element at the last row and first col.

 */