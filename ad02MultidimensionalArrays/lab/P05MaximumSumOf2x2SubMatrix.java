package JavaAdvanced.ad02MultidimensionalArrays.lab;

import java.util.Arrays;
import java.util.Scanner;

//created by R.M.
public class P05MaximumSumOf2x2SubMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimension = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int rows = dimension[0];
        int cols = dimension[1];
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            int[] rowData = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = rowData[col];
            }
        }
        int sumOfSubMatrix = Integer.MIN_VALUE;
        int indexRow = -1;
        int indexCol = -1;
        for (int row = 0; row < rows - 1; row++) {
            for (int col = 0; col < cols - 1; col++) {
                int currentSum = matrix[row][col] + matrix[row][col + 1]
                        + matrix[row + 1][col] + matrix[row + 1][col + 1];
                if (currentSum > sumOfSubMatrix) {
                    sumOfSubMatrix = currentSum;
                    indexRow = row;
                    indexCol = col;
                }
            }
        }

        for (int row = indexRow; row < indexRow + 1; row++) {
            for (int col = indexCol; col < indexCol + 1; col++) {
                System.out.println(matrix[row][col] + " " + matrix[row][col + 1]);
                System.out.println(matrix[row + 1][col] + " " + matrix[row + 1][col + 1]);
            }
        }
        System.out.println(sumOfSubMatrix);
    }
}
/*
5.	Maximum Sum of 2X2 Submatrix
Write a program that reads a matrix from the console.
Then find the biggest sum of a 2x2 submatrix.
Print the submatrix and its sum.
On the first line, you will get the dimensions of the matrix in the format "{rows, columns}".
On the next lines, you will get the elements for each row separated by a comma.

 */