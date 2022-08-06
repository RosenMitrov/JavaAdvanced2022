package JavaAdvanced.ad02MultidimensionalArrays.exercises;

import java.util.Arrays;
import java.util.Scanner;

//created by R.M.
public class P03DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] squareMatrix = new int[n][n];

        for (int row = 0; row < squareMatrix.length; row++) {
            int[] rowData = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            squareMatrix[row] = rowData;
        }

        int sumPrimaryDiagonal = 0;
        int sumSecondaryDiagonal = 0;

        sumPrimaryDiagonal = getPrimarySum(n, squareMatrix, sumPrimaryDiagonal);
        sumSecondaryDiagonal = getSecondaryDiagonal(n, squareMatrix, sumSecondaryDiagonal);
        System.out.println(Math.abs(sumPrimaryDiagonal - sumSecondaryDiagonal));

    }

    // Problem-solving without nested loops
    private static int getPrimarySum(int n, int[][] squareMatrix, int sumPrimaryDiagonal) {
        for (int i = 0; i < n; i++) {
            sumPrimaryDiagonal += squareMatrix[i][i];
        }
        return sumPrimaryDiagonal;
    }

    private static int getSecondaryDiagonal(int n, int[][] squareMatrix, int sumSecondaryDiagonal) {
        for (int i = 0; i < n; i++) {
            sumSecondaryDiagonal += squareMatrix[i][n - 1 - i];
        }
        return sumSecondaryDiagonal;
    }
//     Problem-solving with nested loops
//    private static int getSecondaryDiagonal(int n, int[][] squareMatrix, int sumSecondaryDiagonal) {
//        for (int row = 0; row < n; row++) {
//            for (int col = 0; col < n; col++) {
//                if (row == squareMatrix.length - 1 - col) {
//                    sumSecondaryDiagonal += squareMatrix[row][col];
//                }
//            }
//        }
//        return sumSecondaryDiagonal;
//    }
//
//    private static int getPrimarySum(int n, int[][] squareMatrix, int sumPrimaryDiagonal) {
//        for (int row = 0; row < n; row++) {
//            for (int col = 0; col < n; col++) {
//                if (row == col) {
//                    sumPrimaryDiagonal += squareMatrix[row][col];
//                }
//            }
//        }
//        return sumPrimaryDiagonal;
//    }
}
/*
3.	Diagonal Difference
Write a program that finds the difference between the sums of the square matrix diagonals (absolute value).

Input
•	The first line holds a number n – the size of matrix.
•	The next n lines hold the values for every row – n numbers separated by a space.

 */