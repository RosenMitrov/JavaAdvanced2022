package ObjectOrientedProgramming.L01Abstraction.lab.P02PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] coordinates = getCoordinate(scanner);

        int x1 = coordinates[0];
        int y1 = coordinates[1];
        int x2 = coordinates[2];
        int y2 = coordinates[3];
        Point pointA = new Point(x1, y1);
        Point pointB = new Point(x2, y2);
        Rectangle rectangle = new Rectangle(pointA, pointB);

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
