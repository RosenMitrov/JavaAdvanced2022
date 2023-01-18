package ObjectOrientedProgramming.L01Abstraction.lab.P02PointInRectangle2;

public class Point {
    private int X;
    private int Y;

    public Point(int x, int y) {
        this.X = x;
        this.Y = y;
    }

    public boolean greaterThanAxAndGreaterThanAyOfA(Point A) {
        return X >= A.X && Y >= A.Y;
    }

    public boolean lessThanBxAndGreaterThanByOfB(Point B) {
        return X <= B.X && Y >= B.Y;
    }

    public boolean lessThanCxAndLessThanCyOfC(Point C) {
        return X <= C.X && Y <= C.Y;
    }

    public boolean greaterThanDxAndLessThanDyOfD(Point D) {
        return X >= D.X && Y <= D.Y;
    }
}
