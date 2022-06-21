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

    //Ex.4
    public static void main(String[] args) {
        print(findMinMax(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        print(findMinMax(new int[]{}));
        print(findMinMax(new int[]{-1000, 10, 11, 1000, 121314, 0}));
    }

    private static void print(int diff) {
        System.out.println("Разница максимального и минимального элементов массива: " + diff);
    }

    private static int findMinMax(int[] numbers) {
        int min;
        int max;
        int diff;
        if (numbers.length == 0) {
            System.out.print("Error, array is empty! ");
            diff = 0;
        } else {
            min = numbers[0];
            max = numbers[0];
            for (int number : numbers) {
                if (number <= min) {
                    min = number;
                }
                if (number >= max) {
                    max = number;
                }
            }
            diff = max - min;
        }
        return diff;
    }

     */
    //Ex.6
    public static void main(String[] args) {
        mirrorArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        mirrorArray(new int[]{1});
        mirrorArray(new int[]{});
        mirrorArray(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1});
    }

    private static void mirrorArray(int[] numbers) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}

