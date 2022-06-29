package Lesson29Ex1;

public class BaseTriangleChain extends TriangleChain {
    @Override
    boolean satisfyConditions(Triangle triangle) {
        return triangle.getSide1() > 0 &&
                triangle.getSide2() > 0 &&
                triangle.getSide3() > 0 &&
                triangle.getSide1() + triangle.getSide2() > triangle.getSide3() &&
                triangle.getSide2() + triangle.getSide3() > triangle.getSide1() &&
                triangle.getSide1() + triangle.getSide3() > triangle.getSide2();
    }

    @Override
    String getTriangleType() {
        return "Разносторонний треугольник";
    }

    @Override
    public double calc(Triangle triangle) {
        int p = (triangle.getSide1() + triangle.getSide2() + triangle.getSide3()) / 2;
        return Math.sqrt(p * (p - triangle.getSide1()) * (p - triangle.getSide2()) * (p - triangle.getSide3()));
    }
}
