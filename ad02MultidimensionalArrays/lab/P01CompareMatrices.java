package JavaAdvanced.ad02MultidimensionalArrays.lab;

import java.util.Arrays;
import java.util.Scanner;

//created by R.M.
public class P01CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimension = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int firstMatrixRows = dimension[0];
        int firstMatrixCols = dimension[1];
        int[][] firstMatrix = fillMatrix(firstMatrixRows, firstMatrixCols, scanner);
        dimension = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int secondMatrixRows = dimension[0];
        int secondMatrixCols = dimension[1];
        boolean isEqual = firstMatrixRows == secondMatrixRows && firstMatrixCols == secondMatrixCols;
        String equalOrNotString = "not equal";
        if (!isEqual) {
            System.out.println(equalOrNotString);
            return;
        } else {
            int[][] secondMatrix = fillMatrix(secondMatrixRows, secondMatrixCols, scanner);
            isEqual = compareMatrices(firstMatrix, secondMatrix);
        }

        if (isEqual) {
            equalOrNotString = "equal";
        }
        System.out.println(equalOrNotString);

    }

    private static boolean compareMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < firstMatrix[row].length; col++) {
                if (firstMatrix[row][col] != secondMatrix[row][col]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int[][] fillMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] rowData = scanner.nextLine().split(" ");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(rowData[col]);
            }
        }
        return matrix;
    }
}

/*
1.	Compare Matrices
Write a program that reads two integer matrices (2D arrays) from the console and compares them element by element.
For better code reusability, you could do the comparison in a method, which returns true if they are equal and false if not.
Each matrix definition on the console will contain a line with a positive integer number R – the number of rows in the matrix
and C – the number of columns – followed by R lines containing the C numbers,
separated by spaces (each line will have an equal amount of numbers.
The matrices will have at most 10 rows and at most 10 columns.
Print "equal" if the matrices match, and "not equal" if they don’t match.

 */
