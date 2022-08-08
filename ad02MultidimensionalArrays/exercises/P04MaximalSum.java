package JavaAdvanced.ad02MultidimensionalArrays.exercises;

import java.util.Arrays;
import java.util.Scanner;

//created by R.M.
public class P04MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimension = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = dimension[0];
        int cols = dimension[1];
        int[][] rectangularMatrix = new int[rows][cols];
        fillInMatrix(rectangularMatrix, scanner);
        int biggestSum = getMaxSum(rectangularMatrix);
        int[] bestRowAndCol = getRowAndCol(rectangularMatrix);
        int bestRow = bestRowAndCol[0];
        int bestCol = bestRowAndCol[1];

        System.out.println("Sum = " + biggestSum);
        System.out.printf("%d %d %d%n" +
                        "%d %d %d%n" +
                        "%d %d %d%n",
                rectangularMatrix[bestRow][bestCol], rectangularMatrix[bestRow][bestCol + 1], rectangularMatrix[bestRow][bestCol + 2]
                , rectangularMatrix[bestRow + 1][bestCol], rectangularMatrix[bestRow + 1][bestCol + 1], rectangularMatrix[bestRow + 1][bestCol + 2]
                , rectangularMatrix[bestRow + 2][bestCol], rectangularMatrix[bestRow + 2][bestCol + 1], rectangularMatrix[bestRow + 2][bestCol + 2]);


    }

    private static int[] getRowAndCol(int[][] rectangularMatrix) {
        int[] tempArr = new int[2];
        int maxSum = Integer.MIN_VALUE;
        for (int row = 0; row < rectangularMatrix.length - 2; row++) {
            for (int col = 0; col < rectangularMatrix[row].length - 2; col++) {
                int currentSum = rectangularMatrix[row][col] + rectangularMatrix[row][col + 1] + rectangularMatrix[row][col + 2]
                        + rectangularMatrix[row + 1][col] + rectangularMatrix[row + 1][col + 1] + rectangularMatrix[row + 1][col + 2]
                        + rectangularMatrix[row + 2][col] + rectangularMatrix[row + 2][col + 1] + rectangularMatrix[row + 2][col + 2];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    tempArr[0] = row;
                    tempArr[1] = col;
                }
            }
        }
        return tempArr;
    }

    private static int getMaxSum(int[][] rectangularMatrix) {
        int maxSum = Integer.MIN_VALUE;
        for (int row = 0; row < rectangularMatrix.length - 2; row++) {
            for (int col = 0; col < rectangularMatrix[row].length - 2; col++) {
                int currentSum = rectangularMatrix[row][col] + rectangularMatrix[row][col + 1] + rectangularMatrix[row][col + 2]
                        + rectangularMatrix[row + 1][col] + rectangularMatrix[row + 1][col + 1] + rectangularMatrix[row + 1][col + 2]
                        + rectangularMatrix[row + 2][col] + rectangularMatrix[row + 2][col + 1] + rectangularMatrix[row + 2][col + 2];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    private static void fillInMatrix(int[][] rectangularMatrix, Scanner scanner) {
        for (int row = 0; row < rectangularMatrix.length; row++) {
            int[] rowData = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            rectangularMatrix[row] = rowData;
        }
    }
}
/*
4.	Maximal Sum
Write a program that reads a rectangular integer matrix of size N x M and finds in it the square 3 x 3 that has a maximal sum of its elements.
Input
•	On the first line, you will receive the rows N and columns M.
•	On the next N lines, you will receive each row with its elements.
Print the elements of the 3 x 3 square as a matrix, along with their sum. See the format of the output below.

 */