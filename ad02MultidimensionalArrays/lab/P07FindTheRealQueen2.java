package JavaAdvanced.ad02MultidimensionalArrays.lab;

import java.util.Scanner;

//created by R.M.
public class P07FindTheRealQueen2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] matrix = new char[8][8];

        for (int row = 0; row < matrix.length; row++) {
            String[] rowData = scanner.nextLine().split(" ");
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = rowData[col].charAt(0);
            }
        }
        char queen = 'q';
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                char symbol = matrix[row][col];
                if (symbol == queen) {
                    boolean isValidHorizontal = checkHorizontal(matrix, row, col, queen);
                    boolean isValidVertical = checkVertical(matrix, row, col, queen);
                    boolean isValidPrimaryDiagonal = checkPrimaryDiagonal(matrix, row, col, queen);
                    boolean isValidSecondaryDiagonal = checkSecondaryDiagonal(matrix, row, col, queen);
                    if (isValidHorizontal && isValidVertical && isValidPrimaryDiagonal && isValidSecondaryDiagonal) {
                        System.out.println(row + " " + col);
                    }
                }
            }
        }
    }

    private static boolean checkSecondaryDiagonal(char[][] matrix, int row, int col, char queen) {
        int rowCount = row - 1;
        int colCount = col + 1;
        //from queen to right up

        while (rowCount > 0 && colCount < 8) {
            if (matrix[rowCount][colCount] == queen) {
                return false;
            }
            rowCount--;
            colCount++;
        }
        rowCount = row + 1;
        colCount = col - 1;
        while (rowCount < 8 && colCount > 0) {
            if (matrix[rowCount][colCount] == queen) {
                return false;
            }
            rowCount++;
            colCount--;
        }
        return true;
    }

    private static boolean checkPrimaryDiagonal(char[][] matrix, int row, int col, char queen) {
        int rowCount = row - 1;
        int colCount = col - 1;
        //from queen to left up
        while (rowCount > 0 && colCount > 0) {
            if (matrix[rowCount][colCount] == queen) {
                return false;
            }
            rowCount--;
            colCount--;
        }
        rowCount = row + 1;
        colCount = col + 1;
        //from queen to right down
        while (rowCount < 8 && colCount < 8) {
            if (matrix[rowCount][colCount] == queen) {
                return false;
            }
            rowCount++;
            colCount++;
        }
        return true;
    }

    private static boolean checkVertical(char[][] matrix, int row, int col, char queen) {
        int rowCount = row - 1;
        //from queen to up;
        while (rowCount > 0) {
            if (matrix[rowCount][col] == queen) {
                return false;
            }
            rowCount--;
        }
        rowCount = row + 1;
        //from queen to down
        while (rowCount < 8) {
            if (matrix[rowCount][col] == queen) {
                return false;
            }
            rowCount++;
        }
        return true;
    }

    private static boolean checkHorizontal(char[][] matrix, int row, int col, char queen) {
        int colCount = col - 1;
        //from queen to left
        while (colCount > 0) {
            if (matrix[row][colCount] == queen) {
                return false;
            }
            colCount--;
        }
        colCount = col + 1;
        //from queen to right
        while (colCount < 8) {
            if (matrix[row][colCount] == queen) {
                return false;
            }
            colCount++;
        }
        return true;
    }
}
/*
. ** Find the Real Queen
Write a program that reads (8 x 8) matrix of characters from the console.
The matrix represents a chessboard with figures on it.
The figures can be - queens as char 'q' or any other ASCII symbol.
There will be more than one queen but only one queen will have a valid position,
which is not attacked by any other queen and does not attack any other queen.
In another word, in the way of the valid queen, there are no other queens,
but there may be any other ASCII symbol.
Your task is to read the chessboard and find the position of the valid queen.
According to chess rules, the queen can attack all the cells in horizontal verticals and both diagonals, which cross the queen position.

 */