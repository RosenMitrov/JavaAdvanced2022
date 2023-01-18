package ObjectOrientedProgramming.L01Abstraction.lab.P02PointInRectangle;

public class Point {
    private int X;
    private int Y;

    public Point(int x, int y) {
        this.X = x;
        this.Y = y;
    }

    public boolean greaterOrEqual(Point other) {
        return X >= other.X && Y >= other.Y;
    }

    public boolean lessOrEqual(Point other) {
        return X <= other.X && Y <= other.Y;
    }





}
