public class Circle extends Figure {
    public Circle(double a) {
        super(new double[]{a});
    }

    protected String getType() {
        return "Круг";
    }

    protected double getArea() {
        return 3.14 * sides[0] * sides[0];
    }

    protected double getPerimeter() {
        return 2 * 3.14 * sides[0];
    }

    public String toString(){
        return getType() + " " + "площадь: " + getArea() + ", " + " периметр: " + getPerimeter();
    }
}
