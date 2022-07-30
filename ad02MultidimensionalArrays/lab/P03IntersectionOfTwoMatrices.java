package JavaAdvanced.ad02MultidimensionalArrays.lab;

import java.util.Scanner;

//created by R.M.
public class P03IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] matrixA = fillInMatrix(rows, cols, scanner);
        char[][] matrixB = fillInMatrix(rows, cols, scanner);
        char[][] matrixC = fillThirdMatrix(rows, cols, matrixA, matrixB, '*');

        printMatrix(matrixC);

    }

    private static void printMatrix(char[][] matrixC) {
        for (int row = 0; row < matrixC.length; row++) {
            for (int col = 0; col < matrixC[row].length; col++) {
                System.out.print(matrixC[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static char[][] fillThirdMatrix(int rows, int cols, char[][] matrixA, char[][] matrixB, char pattern) {
        char[][] temp = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (matrixA[row][col] == matrixB[row][col]) {
                    temp[row][col] = matrixA[row][col];
                } else {
                    temp[row][col] = pattern;
                }
            }
        }
        return temp;
    }


    private static char[][] fillInMatrix(int rows, int cols, Scanner scanner) {
        char[][] temp = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] rowData = scanner.nextLine().split(" ");
            for (int col = 0; col < cols; col++) {
                temp[row][col] = rowData[col].charAt(0);
            }
        }
        return temp;
    }
}
/*
3.	Intersection of Two Matrices
Write a program that reads two char matrices (A[][] and B[][]) of the same order M * N
and prints the third matrix C[][] which is filled with the intersecting elements of A and B,
otherwise set the element to '*'. On the first two lines, you receive M and N, then on 2 * M lines N characters – the matrices elements.
The matrix elements may be any ASCII char except '*'.

 */
