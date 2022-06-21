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

    //Ex.7
    public static void main(String[] args) {
        findThis(new String[]{"hola", "hila", "this", "those", "ulala"});
        findThis(new String[]{"hola", "hila", "this", "this", "ulala"});
        findThis(new String[]{"this", "this", "this", "this", "this"});
        findThis(new String[]{});
    }

    private static void findThis(String[] strings) {
        boolean checkMore = false;
        if (strings.length == 0) {
            System.out.println("Error, array is empty!");
        } else {
            for (int i = 0; i < strings.length; i++) {
                if (strings[i].equals("this")) {
                    if (checkMore) {
                        System.out.print(", " + i);
                    } else {
                        System.out.print(i);
                    }
                    checkMore = true;
                }
            }
            System.out.println();
        }
    }

    //Ex.8
    public static void main(String[] args) {
        print(destroyNegatives(new int[]{1, 2, -10, -15, 11}));
        print(destroyNegatives(new int[]{-1, -1000, -10, -15, 0, 0, 1123}));
    }

    private static void print(int[] destroyNegatives) {
        for (int i = 0; i < destroyNegatives.length; i++) {
            System.out.print(destroyNegatives[i] + " ");
        }
        System.out.println();
    }

    private static int[] destroyNegatives(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                numbers[i] *= -1;
            }
        }
        return numbers;
    }

    //Ex.9
    public static void main(String[] args) {
        print(addingUpElements(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        print(addingUpElements(new int[]{1}));
        print(addingUpElements(new int[]{}));
        print(addingUpElements(new int[]{10, 100, 1000}));
    }

    private static void print(int[] addingUpElements) {
        for (int i = 0; i < addingUpElements.length; i++) {
            System.out.print(addingUpElements[i] + " ");
        }
        System.out.println();
    }

    private static int[] addingUpElements(int[] numbers) {
        int[] newNumbers = new int[numbers.length];
        if (numbers.length == 0) {
            System.out.print("Error, array is empty!");
        } else {
            newNumbers[newNumbers.length - 1] = numbers[numbers.length - 1];
            for (int i = 0; i < numbers.length - 1; i++) {
                newNumbers[i] = numbers[i] + numbers[i + 1];
            }
        }
        return newNumbers;
    }

    //Ex.10
    public static void main(String[] args) {
        print(crossAddition(new int[]{1, 2, 3, 4, 5}));
        print(crossAddition(new int[]{1, 2, 3, 2, 1}));
        print(crossAddition(new int[]{}));
        print(crossAddition(new int[]{1}));
    }

    private static void print(int[] crossAddition) {
        for (int j : crossAddition) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    private static int[] crossAddition(int[] numbers) {
        int[] newNumbers = new int[numbers.length];
        if (numbers.length == 0) {
            System.out.print("Error, array is empty!");
        } else {
            for (int i = 0; i < numbers.length; i++) {
                newNumbers[i] = numbers[i] + numbers[(numbers.length - 1) - i];
            }
        }
        return newNumbers;
    }

     */
    //Ex.11
    public static void main(String[] args) {
        print(arrayDoubling(new int[]{1, 2, 3}));
        print(arrayDoubling(new int[]{1, 2, 3, 4}));
        print(arrayDoubling(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        print(arrayDoubling(new int[]{1, 2}));
        print(arrayDoubling(new int[]{1}));
        print(arrayDoubling(new int[]{}));
    }

    private static void print(int[] arrayDoubling) {
        for (int j : arrayDoubling) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    private static int[] arrayDoubling(int[] numbers) {
        int[] doubleNumbers = new int[numbers.length * 2];
        if (numbers.length == 0){
            System.out.println("Error, array is empty!");
        } else {
            doubleNumbers[0] = numbers[0];
            doubleNumbers[1] = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                doubleNumbers[i * 2] = numbers[i];
                doubleNumbers[(i * 2) + 1] = numbers[i];
            }
        }
            return doubleNumbers;
    }
}

