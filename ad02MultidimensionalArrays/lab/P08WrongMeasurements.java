package JavaAdvanced.ad02MultidimensionalArrays.lab;

import java.util.Arrays;
import java.util.Scanner;

//created by R.M.
public class P08WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[rows][];

        for (int row = 0; row < rows; row++) {
            int[] rowData = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = rowData;
        }
        int[] coordinateOfPattern = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int mistakenValue = matrix[coordinateOfPattern[0]][coordinateOfPattern[1]];
        int[][] matrixNew = new int[matrix.length][matrix[matrix.length - 1].length];
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == mistakenValue) {

                    //up
                    if (row - 1 >= 0) {
                        if (matrix[row - 1][col] != mistakenValue) {
                            sum += matrix[row - 1][col];
                        }
                    }
                    //down
                    if (row + 1 < matrix.length) {
                        if (matrix[row + 1][col] != mistakenValue) {
                            sum += matrix[row + 1][col];
                        }
                    }
                    //left
                    if (col - 1 >= 0) {
                        if (matrix[row][col - 1] != mistakenValue) {
                            sum += matrix[row][col - 1];
                        }
                    }

                    //right
                    if (col + 1 < matrix[row].length) {
                        if (matrix[row][col + 1] != mistakenValue) {
                            sum += matrix[row][col + 1];
                        }
                    }

                }
                if (matrix[row][col] == mistakenValue) {
                    matrixNew[row][col] = sum;
                } else {
                    matrixNew[row][col] = matrix[row][col];
                }
                sum = 0;
            }
        }
        printMatrix(matrixNew);
    }


    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
/*
Wrong Measurements
You will be given the rows of a matrix.
Then the matrix itself. Inside this matrix, there are mistaken values that need to be replaced you will receive the wrong value at the last line.
Those values should be replaced with the sum of the nearest elements in the four directions up, down, left, and right,
but only if they are valid values. In the end, you have to print the fixed measurements.

 */