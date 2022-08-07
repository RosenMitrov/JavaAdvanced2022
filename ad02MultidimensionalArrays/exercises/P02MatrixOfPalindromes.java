package JavaAdvanced.ad02MultidimensionalArrays.exercises;

import java.util.Arrays;
import java.util.Scanner;

//created by R.M.
public class P02MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];
        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                char startLetter = 'a';
                matrix[row][col] = String.valueOf((char) (startLetter + row)) + (char)(startLetter + row + col) + (char)(startLetter + row);
            }
        }
        printMatrix(matrix);
    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
/*
2.	Matrix of Palindromes
Write a program to generate the following matrix of palindromes of 3 letters with r rows and c columns like the one in the examples below.
•	Rows define the first and the last letter: row 0 -> ‘a’, row 1 -> ‘b’, row 2 -> ‘c’, …
•	Columns + rows define the middle letter:
o	column 0, row 0 -> ‘a’, column 1, row 0 -> ‘b’, column 2, row 0 -> ‘c’, …
o	column 0, row 1 -> ‘b’, column 1, row 1 -> ‘c’, column 2, row 1 -> ‘d’, …
Input
•	The numbers r and c stay in the first line at the input.
•	 r and c are integers in the range [1…26].
•	 r + c ≤ 27

 */