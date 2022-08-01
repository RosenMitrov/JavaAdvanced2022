package JavaAdvanced.ad02MultidimensionalArrays.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//created by R.M.
public class P07CrossFire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimension = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = dimension[0];
        int cols = dimension[1];

        List<List<Integer>> matrix = new ArrayList<>();

        int count = 1;
        for (int row = 0; row < rows; row++) {
            matrix.add(new ArrayList<>());
            for (int col = 0; col < cols; col++) {
                matrix.get(row).add(count);
                count++;
            }
        }
        String input = scanner.nextLine();

        while (!input.equals("Nuke it from orbit")) {
            int[] rowColRadius = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
            int rowInMatrix = rowColRadius[0];
            int colInMatrix = rowColRadius[1];
            int radius = rowColRadius[2];

            for (int row = rowInMatrix - radius; row <= rowInMatrix + radius; row++) {
                if (isInRange(row, colInMatrix, matrix) && row != rowInMatrix) {
                    matrix.get(row).remove(colInMatrix);
                }
            }
            for (int col = colInMatrix + radius; col >= colInMatrix - radius; col--) {
                if (isInRange(rowInMatrix, col, matrix)) {
                    matrix.get(rowInMatrix).remove(col);
                }
            }
            matrix.removeIf(List::isEmpty);
            input = scanner.nextLine();
        }
        printMatrix(matrix);

    }

    private static boolean isInRange(int row, int colInMatrix, List<List<Integer>> matrix) {
        return row >= 0 && row < matrix.size() && colInMatrix >= 0 && colInMatrix < matrix.get(row).size();
    }


    private static void printMatrix(List<List<Integer>> matrix) {
        for (int row = 0; row < matrix.size(); row++) {
            for (int col = 0; col < matrix.get(row).size(); col++) {
                System.out.print(matrix.get(row).get(col) + " ");
            }
            System.out.println();
        }
    }
}
/*
7.	Crossfire
You will receive two integers, which represent the dimensions of a matrix.
Then, you must fill the matrix with increasing integers starting from 1, and continuing on every row, like this:
first row: 1, 2, 3, …, n
second row: n + 1, n + 2, n + 3, …, n + n
third row: 2 * n + 1, 2 * n + 2, …, 2 * n + n
You will also receive several commands in the form of 3 integers separated by a space. Those 3 integers will represent a row in the matrix, a column, and a radius. You must then destroy the cells, which correspond to those arguments cross-like.
Destroying a cell means that, that cell becomes completely nonexistent in the matrix. Destroying cells cross-like means that you form a cross figure with a center point - equal to the cell with coordinates – the given row and column, and lines with length equal to the given radius. See the examples for more info.
The input ends when you receive the command "Nuke it from orbit". When that happens, you must print what has remained from the initial matrix.
Input
•	On the first line, you will receive the dimensions of the matrix. You must then fill the matrix according to those dimensions.
•	On the next several lines, you will begin receiving 3 integers separated by a single space, which represent the row, col, and radius. You must then destroy cells according to those coordinates.
•	When you receive the command "Nuke it from orbit" the input ends.
Output
•	The output is simple. You must print what is left from the matrix.
•	Every row must be printed on a new line and every column of a row - be separated by a space.
Constraints
•	The dimensions of the matrix will be integers in the range [2, 100].
•	The given rows and columns will be valid integers in the range [-231 + 1, 231 - 1].
•	 The radius will be in the range [0, 231 - 1].
•	Allowed time/memory: 250ms/16MB.

 */