public class SomeFuncInJava {

    public static void main(String[] args) {
        print(multiply(sum(3, 4), difference(7, 5)));
        print(multiply(sum(40, 60), difference(300, 270)));
    }

    private static int multiply(int i, int i1) {
        return i * i1;
    }

    private static int difference(int i, int i1) {
        return i - i1;
    }

    private static int sum(int i, int i1) {
        return i + i1;
    }

    private static void print(int i) {
        System.out.println(i);
    }
}
