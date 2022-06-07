public class Terms {
    public static void main(String[] args) {
        print(1, 0);
        print(0, 0);
        print(0, 1);
        print(1, 1);
        print(2, 3);
        print(100, 2);
    }

    private static void print(int i, float i1) {
        if (i != 0 & i1 != 0) {
            System.out.println(i / i1);
        }
    }
}
