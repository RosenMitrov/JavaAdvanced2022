package JavaAdvanced.ad02MultidimensionalArrays.lab;

import java.util.Scanner;

//created by R.M.
public class P07FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] chessboard = new char[8][8];

        for (int row = 0; row < chessboard.length; row++) {
            String[] rowData = scanner.nextLine().split("\\s+");
            for (int col = 0; col < chessboard[row].length; col++) {
                chessboard[row][col] = rowData[col].charAt(0);
            }
        }

        boolean isQueen = false;
        for (int row = 0; row < chessboard.length; row++) {
            for (int col = 0; col < chessboard[row].length; col++) {
                char temp = chessboard[row][col];
                if (temp == 'q') {
                    boolean isValidHorizontal = getHorizontal(row, col, chessboard, 'q');
                    boolean isValidVertical = getVertical(row, col, chessboard, 'q');
                    boolean isValidPrimaryDiagonal = getPrimaryDiagonal(row, col, chessboard, 'q');
                    boolean isValidSecondaryDiagonal = getSecondaryDiagonal(row, col, chessboard, 'q');
                    if (isValidHorizontal && isValidVertical && isValidPrimaryDiagonal && isValidSecondaryDiagonal) {
                        System.out.println(row + " " + col);
                        isQueen = true;
                        break;
                    }
                }

            }
            if (isQueen) {
                break;
            }

        }


    }

    private static boolean getSecondaryDiagonal(int row, int col, char[][] chessboard, char queen) {
        int rowCounter = row;
        for (int c = col + 1; c < 8; c++) {
            //from row to right up
            rowCounter--;
            if (rowCounter < 0) {
                break;
            }
            if (chessboard[rowCounter][c] == queen) {
                return false;
            }
        }
        rowCounter = row;

        for (int c = col - 1; c >= 0; c--) {
            //from row to left down
            rowCounter++;
            if (rowCounter > 7) {
                break;
            }
            if (chessboard[rowCounter][c] == queen) {
                return false;
            }
        }

        return true;
    }


    private static boolean getPrimaryDiagonal(int row, int col, char[][] chessboard, char queen) {
        int rowCounter = row;
        for (int c = col + 1; c < 8; c++) {
            //from row to right down
            rowCounter++;
            if (rowCounter > 7) {
                break;
            }
            char temp = chessboard[rowCounter][c];
            if (chessboard[rowCounter][c] == queen) {
                return false;
            }
        }
        rowCounter = row;
        for (int c = col - 1; c >= 0; c--) {
            //from row to left up
            rowCounter--;
            if (rowCounter < 0) {
                break;
            }
            char temp = chessboard[rowCounter][c];
            if (chessboard[rowCounter][c] == queen) {
                return false;
            }
        }
        return true;
    }

    private static boolean getVertical(int row, int col, char[][] chessboard, char queen) {
        for (int i = 0; i < chessboard.length; i++) {
            if (i != row) {
                if (chessboard[i][col] == queen) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean getHorizontal(int row, int col, char[][] chessboard, char queen) {
        for (int i = 0; i < chessboard[row].length; i++) {
            if (i != col) {
                if (chessboard[row][i] == queen) {
                    return false;
                }
            }
        }
        return true;
    }
}
/*
** Find the Real Queen
Write a program that reads (8 x 8) matrix of characters from the console.
* The matrix represents a chessboard with figures on it.
* The figures can be - queens as char 'q' or any other ASCII symbol.
* There will be more than one queen but only one queen will have a valid position,
* which is not attacked by any other queen and does not attack any other queen.
* In another word, in the way of the valid queen, there are no other queens, but there may be any other ASCII symbol.
* Your task is to read the chessboard and find the position of the valid queen.
* According to chess rules, the queen can attack all the cells in horizontal verticals and both diagonals, which cross the queen position.

 */