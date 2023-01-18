package ObjectOrientedProgramming.L01Abstraction.lab.P02PointInRectangle2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] coordinates = getCoordinate(scanner);

        int x1A = coordinates[0];
        int y1A = coordinates[1];

        int x2B = coordinates[2];
        int y2B = coordinates[3];

        int x3C = coordinates[4];
        int y3C = coordinates[5];

        int x4D = coordinates[6];
        int y4D = coordinates[7];


        Point pointA = new Point(x1A, y1A);

        Point pointB = new Point(x2B, y2B);

        Point pointC = new Point(x3C, y3C);

        Point pointD = new Point(x4D, y4D);

        Rectangle rectangle = new Rectangle(pointA, pointB, pointC, pointD);

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            coordinates = getCoordinate(scanner);
            int x = coordinates[0];
            int y = coordinates[1];
            Point point = new Point(x, y);

            System.out.println(rectangle.contains(point));
        }
    }

    private static int[] getCoordinate(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}
/*
input

1 1 3 1 3 3 1 3
5
2 2
0 0
4 4
2 1
1 3

 */