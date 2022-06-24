public class Triangle extends Figure {
    public Triangle(double a, double b, double c) {
        super(new double[]{a, b, c});
    }

    protected String getType() {
        return "Треугольник";
    }

    protected double getArea() {
        double p = (sides[0] + sides[1] + sides[2]) / 2;
        return Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]));
    }

    protected double getPerimeter() {
        return super.getPerimeter();
    }

    public String toString(){
        return getType() + " " + "площадь: " + getArea() + ", " + " периметр: " + getPerimeter();
    }
}
