public class UpcastingVariables {
    public static void main(String[] args) {
        System.out.println(multiply(1_000_000, 2_000_000));
    }

    private static double multiply(int i, int i1) {
        return (double) i * i1;
    }
}
