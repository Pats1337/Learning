package oldlessons;

public class Rectangle extends Figure {
    public Rectangle(double a, double b) {
        super(new double[]{a, b});
    }
    protected String getType(){
        return "Прямоугольник";
    }
    protected double getArea(){
        return sides[0] * sides[1];
    }
    public double getPerimeter(){
        return 2 * super.getPerimeter();
    }
    public String toString() {
        return getType() + " " + "площадь: " + getArea() + ", " + " периметр: " + getPerimeter();
    }
}
