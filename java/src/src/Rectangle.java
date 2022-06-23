public class Rectangle {
    private final int sideA;
    private final int sideB;
    private final int sideC;
    private final int sideD;

    public Rectangle(int sideA, int sideB, int sideC, int sideD) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }

    public Rectangle(Point a, Point b, Point c, Point d) {
        this(a.getDistanceTo(b), b.getDistanceTo(c), c.getDistanceTo(d), a.getDistanceTo(d));
    }

    public static boolean areValidArguments(int sideA, int sideB, int sideC, int sideD) {
        return sideA > 0 &&
                sideB > 0 &&
                sideC > 0 &&
                sideD > 0 &&
                sideA == sideC &&
                sideB == sideD;
    }

    public boolean isSquare(){
        return this.sideA == this.sideB && this.sideA == this.sideC && this.sideA == this.sideD;
    }

    public String getDescription() {
        return isSquare() ? "Это квадрат" : "Это обычый прямоугольник со сторонами " + sideA + " " + sideB + " " + sideC + " " + sideD;
    }
}
