package ObjectOrientedProgramming.L01Abstraction.lab.P02PointInRectangle2;

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
    private Point B;
    private Point C;
    private Point D;

    public Rectangle(Point a, Point b, Point c, Point d) {
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d;
    }


    public boolean contains(Point Z) {
        return Z.greaterThanAxAndGreaterThanAyOfA(this.A)
                && Z.lessThanBxAndGreaterThanByOfB(this.B)
                && Z.lessThanCxAndLessThanCyOfC(this.C)
                && Z.greaterThanDxAndLessThanDyOfD(this.D);
    }


}
