package Lesson29Ex1;

public class EquiliteralTriangleChain extends TriangleChain{

    @Override
    boolean satisfyConditions(Triangle triangle) {
        return triangle.getSide1() == triangle.getSide2() &&
                triangle.getSide2() == triangle.getSide3() &&
                triangle.getSide3() == triangle.getSide1();
    }

    @Override
    public double calc(Triangle triangle) {
        return (triangle.getSide1()*triangle.getSide1()*Math.sqrt(3))/4;
    }

    @Override
    String getTriangleType() {
        return "Равносторонний треугольник";
    }
}
