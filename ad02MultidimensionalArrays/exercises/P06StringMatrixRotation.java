package JavaAdvanced.ad02MultidimensionalArrays.exercises;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//created by R.M.
public class P06StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String rotation = input;
        String regex = "[A-Z][a-z]+[(](?<degree>[0-9]+)[)]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(rotation);
        int degree = 0;
        if (matcher.find()) {
            degree = Integer.parseInt(matcher.group("degree"));
        }

        input = scanner.nextLine();

        ArrayList<String> words = new ArrayList<>();
        int maxWordLength = Integer.MIN_VALUE;
        while (!input.equals("END")) {
            int currentLength = input.length();
            if (currentLength > maxWordLength) {
                maxWordLength = currentLength;
            }
            words.add(input);
            input = scanner.nextLine();
        }

        int rows = words.size();
        int cols = maxWordLength;
        char[][] matrix = new char[rows][cols];

        fillTheMatrix(words, rows, cols, matrix);
        rotateTheMatrixAndPrint(degree, rows, cols, matrix);
    }

    private static void rotateTheMatrixAndPrint(int degree, int rows, int cols, char[][] matrix) {
        int degreeToRotate = degree % 360;
        switch (degreeToRotate) {
            case 0:
                printMatrix0(matrix);
                break;
            case 90:
                printMatrix90(matrix, rows, cols);
                break;
            case 180:
                printMatrix180(matrix, rows, cols);
                break;
            case 270:
                printMatrix270(matrix, rows, cols);
                break;
        }
    }

    private static void printMatrix270(char[][] matrix, int rows, int cols) {
        for (int col = cols - 1; col >= 0; col--) {
            for (int row = 0; row < rows; row++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static void printMatrix180(char[][] matrix, int rows, int cols) {
        for (int row = rows - 1; row >= 0; row--) {
            for (int col = cols - 1; col >= 0; col--) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static void printMatrix90(char[][] matrix, int rows, int cols) {
        for (int col = 0; col < cols; col++) {
            for (int row = rows - 1; row >= 0; row--) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }


    private static void printMatrix0(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static void fillTheMatrix(ArrayList<String> words, int rows, int cols, char[][] matrix) {
        for (int row = 0; row < rows; row++) {
            char[] rowData = words.get(row).toCharArray();
            for (int col = 0; col < cols; col++) {
                if (col < rowData.length) {
                    matrix[row][col] = rowData[col];
                } else {
                    matrix[row][col] = ' ';
                }
            }
        }
    }
}
/*
6.	 String Matrix Rotation
You are given a sequence of text lines.
Assume these text lines form a matrix of characters (pad the missing positions with spaces to build a rectangular matrix).
Write a program to rotate the matrix by 90, 180, 270, 360,… degrees. Print the result at the console as a sequence of strings after receiving the "END" command.
Input
The input is read from the console:
•	The first line holds the command in the format "Rotate(X)" where X is the degrees of the requested rotation.
•	The next lines contain the lines of the matrix for rotation.
•	The input ends with the command "END".
The input data will always be valid and in the format described. There is no need to check it explicitly.
Output
Print at the console the rotated matrix as a sequence of text lines.
Constraints
•	The rotation degree is a positive integer in the range [0…90000], where degrees are multiple of 90.
•	The number of matrix lines is in the range [1…1 000].
•	The matrix lines are strings of length 1 … 1 000.
•	Allowed working time: 200ms/16MB.

 */
