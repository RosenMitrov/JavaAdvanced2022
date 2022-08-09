package JavaAdvanced.ad02MultidimensionalArrays.exercises;

import java.util.Arrays;
import java.util.Scanner;

//created by R.M.
public class P05MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimension = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = dimension[0];
        int cols = dimension[1];

        String[][] matrix = new String[rows][cols];
        fillTheMatrix(matrix, scanner);

        String command = scanner.nextLine();

        while (!command.equals("END")) {
            String[] data = command.split(" ");
            String string = data[0];
            if (string.equals("swap")) {
                if (data.length == 5) {
                    int row1 = Integer.parseInt(data[1]);
                    int col1 = Integer.parseInt(data[2]);
                    int row2 = Integer.parseInt(data[3]);
                    int col2 = Integer.parseInt(data[4]);
                    if (isValid(row1, col1, row2, col2, matrix)) {
                        swapValues(row1, row2, col1, col2, matrix);
                        printMatrix(matrix);
                    } else {
                        System.out.println("Invalid input!");
                    }
                } else {
                    System.out.println("Invalid input!");
                }
            } else {
                System.out.println("Invalid input!");
            }
            command = scanner.nextLine();
        }

    }

    private static void swapValues(int row1, int row2, int col1, int col2, String[][] matrix) {
        String row1col1Value = matrix[row1][col1];
        String row2col2Value = matrix[row2][col2];
        matrix[row1][col1] = row2col2Value;
        matrix[row2][col2] = row1col1Value;

    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isValid(int row1, int col1, int row2, int col2, String[][] matrix) {
        return 0 <= row1 && row1 < matrix.length && 0 <= row2 && row2 < matrix.length
                && 0 <= col1 && col1 < matrix[0].length && 0 <= col2 && col2 < matrix[0].length;
    }

    private static void fillTheMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            String[] rowData = scanner.nextLine().split(" ");
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = rowData[col];
            }
        }
    }
}
/*
5.	Matrix Shuffling
Write a program, which reads a string matrix from the console and performs certain operations with its elements.
User input is provided in a similar way as in the problems above – first, you read the dimensions and then the data.
Your program should then receive commands in the format: "swap row1 col1 row2c col2" where row1, row2, col1, col2 are coordinates in the matrix.
For a command to be valid, it should start with the "swap" keyword along with four valid coordinates (no more, no less).
You should swap the values at the given coordinates (cell [row1, col1] with cell [row2, col2])
and print the matrix at each step (this you'll be able to check if the operation was performed correctly).
If the command is not valid (doesn't contain the keyword "swap", has fewer or more coordinates entered or the given coordinates do not exist),
print "Invalid input!" and move on to the next command. Your program should finish when the string "END" is entered.

 */