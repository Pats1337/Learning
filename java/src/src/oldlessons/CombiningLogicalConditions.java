package oldlessons;

public class CombiningLogicalConditions {
    public static void main(String[] args) {
        print(isTriangleRight(3, 4, 5));
        print(isTriangleRight(8, 6, 10));
        print(isTriangleRight(3, 3, 1));
        print(isTriangleRight(-3, 3, 1));
        print(isTriangleRight(3, 3, -1));

    }

    private static boolean isTriangleRight(int a, int b, int c) {
        boolean numbersPositive = a > 0 && b > 0 && c > 0;
        boolean conditionPythagoras = a * a + b * b == c * c ||
                a * a + c * c == b * b ||
                b * b + c * c == a * a;
        return numbersPositive && conditionPythagoras;
    }

    private static void print(boolean x) {
        System.out.println(x);
    }
}
