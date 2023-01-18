package ObjectOrientedProgramming.L01Abstraction.lab.P02PointInRectangle;

public class Rectangle {
    /*  Y *     D                      C
      Y2  *      *********************
          *      *                   *
          *      *                   *
          *      *     x3,y3         *
          *      *                   *
      Y1  *      *********************
          *     A                      B
        0 * * * * * * * * * * * * * * * * * * * *  X
        *        X1                  X2
     */

    private Point A;
    private Point C;

    public Rectangle(Point a, Point b) {
        this.A = a;
        this.C = b;
    }

    public boolean contains(Point X) {
        return X.greaterOrEqual(A) && X.lessOrEqual(C);
    }


}
