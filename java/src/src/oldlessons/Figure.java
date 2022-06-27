package oldlessons;

public abstract class Figure {
    private final String type;
    protected final double[] sides;

    protected Figure(double[] sides) {
        this.type = getType();
        this.sides = sides;
    }

    protected String getType() {
        return getClass().getSimpleName();
    }

    protected abstract double getArea();

    protected double getPerimeter() {
        double perimeter = 0;
        for (double side : sides) {
            perimeter += side;
        }
        return perimeter;
    }

    public String toString() {
        return getType() + " - area: " +
                getArea() + ", perimeter: " +
                getPerimeter();
    }
}
