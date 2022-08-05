package JavaAdvanced.ad02MultidimensionalArrays.exercises;

import java.util.Scanner;

//created by R.M.
public class P01FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] patternAndDimension = scanner.nextLine().split(", ");
        int dimension = Integer.parseInt(patternAndDimension[0]);
        String pattern = patternAndDimension[1];
        int[][] matrix = new int[dimension][dimension];
        if (pattern.equals("A")) {
            fillWithPatternA(matrix, dimension);
        } else if (pattern.equals("B")) {
            fillWithPatternB(matrix, dimension);
        }

        printMatrix(matrix);
    }

    private static void fillWithPatternB(int[][] matrix, int dimension) {
        int count = 1;
        for (int col = 0; col < dimension; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < dimension; row++) {
                    matrix[row][col] = count;
                    count++;
                }
            } else {
                for (int row = dimension - 1; row >= 0; row--) {
                    matrix[row][col] = count;
                    count++;
                }
            }

        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillWithPatternA(int[][] matrix, int dimension) {
        int count = 1;
        for (int col = 0; col < dimension; col++) {
            for (int row = 0; row < dimension; row++) {
                matrix[row][col] = count;
                count++;
            }
        }
    }
}
/*
1.	Fill the Matrix
Filling a matrix in the regular way (top to bottom and left to right) is boring.
Write two methods that fill a matrix of size N x N in two different patterns.
Both patterns are described below:

 */