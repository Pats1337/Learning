public class HomeworkForLesson14 {
    /*

    //Ex.1
    public static void main(String[] args) {
        checkMultiplicity(100);
    }

    private static void checkMultiplicity(int i) {
        for (int n = 1; n <= i; n++) {
            if (n % 3 == 0) {
                System.out.println(n);
            }
        }
    }


    //Ex.2
    public static void main(String[] args) {
        checkMultiplicity(5, 137);
    }

    private static void checkMultiplicity(int i, int i1) {
        for (int n = 1; n <= i1; n++) {
            if (n % i == 0) {
                System.out.println(n);
            }
        }
    }

     */

    //Ex.3
    public static void main(String[] args) {
        checkFibonacci(-1);
        checkFibonacci(1);
        checkFibonacci(2);
        checkFibonacci(3);
        checkFibonacci(20);
    }

    private static void checkFibonacci(long n) {
        long i0 = 0;
        long i1 = 1;
        long i2;
        if (n <= 0) {
            System.out.println("Error, invalid value!");
        } else if (n == 1) {
            System.out.println(i0);
        } else if (n == 2) {
            System.out.println(i0 + " " + i1);
        } else {
            System.out.print(i0 + " " + i1 + " ");
            for (long i = 3; i <= n; i++) {
                i2 = i0 + i1;
                System.out.print(i2 + " ");
                i0 = i1;
                i1 = i2;
            }
            System.out.println();
        }
    }
}
