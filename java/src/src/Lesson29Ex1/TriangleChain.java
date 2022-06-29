package Lesson29Ex1;

public abstract class TriangleChain implements Area {
    private TriangleChain next;

    public void setNext(TriangleChain next) {
        this.next = next;
    }

    public double getArea(Triangle triangle) {
        if (satisfyConditions(triangle)){
            System.out.println("Определен тип треугольника: " + getTriangleType());
            return calc(triangle);
        } else if (next!= null){
            return next.getArea(triangle);
        }else {
            throw new IllegalArgumentException("Площадь не была посчитана");
        }
    }
    abstract boolean satisfyConditions (Triangle triangle);
    abstract String getTriangleType();
}
