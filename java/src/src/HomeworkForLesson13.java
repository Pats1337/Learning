public class HomeworkForLesson13 {
    /*
    //Ex.1
    public static void main(String[] args) {
        print(findMin(new int[]{1, 2, 3, 4, 5, 6, 7}));
        print(findMin(new int[]{-1, 2, 3, 4, 5, 6, 7}));
        print(findMin(new int[]{-1000, 2, 200, 4, 298124, 6, 301}));
        print(findMin(new int[]{6, 7}));
        print(findMin(new int[]{-100}));
    }

    private static void print(int min) {
        System.out.println("Наименьшее число массива: " + min);
    }

    private static int findMin(int[] ints) {
        int min = ints[0];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < min) {
                min = ints[i];
            }
        }
        return min;
    }

    // Ex.2
    public static void main(String[] args) {
        print(arrayMultiplication(new int[]{2, 2, 2, 2, 2}));
        print(arrayMultiplication(new int[]{-1, 2, 2, 2, 2}));
        print(arrayMultiplication(new int[]{2, 2, 2}));
    }

    private static void print(int arrayMultiplication) {
        System.out.println("Произведение всех элементов массива: " + arrayMultiplication);
    }

    private static int arrayMultiplication(int[] ints) {
        int multi = ints[0];
        for (int i = 1; i < ints.length; i++){
            multi = multi * ints[i];
        }
        return multi;
    }

    //Ex.3
    public static void main(String[] args) {
        print(negativeCounter(new int[]{-1, 10, 15, -2, -3, 1000}));
        print(negativeCounter(new int[]{1, 10, 15, 2, 3, 1000}));
        print(negativeCounter(new int[]{-1}));
    }

    private static void print(int negativeCounter) {
        System.out.println("Количество отрицательных чисел в массиве: " + negativeCounter);
    }

    private static int negativeCounter(int[] ints) {
        int negativeCounter = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < 0) {
                negativeCounter++;
            }
        }
        return negativeCounter;
    }

    //Ex.4
    public static int NUMBER;

    public static void main(String[] args) {
        NUMBER = 13;
        print(findInt(NUMBER, new int[]{10, 11, 12, 13, 13, 13, 1, 13, 13}));
        NUMBER = 2;
        print(findInt(NUMBER, new int[]{10, 11, 12, 13, 13, 13, 1, 13, 13}));
        NUMBER = 11;
        print(findInt(NUMBER, new int[]{10, 11, 12, 13, 13, 13, 1, 13, 13}));
        NUMBER = 1;
        print(findInt(NUMBER, new int[]{10, 11, 12, 1, 1, 13, 1, 13, 13}));
    }

    private static void print(int n) {
        System.out.println("Число " + NUMBER + " встречается в массиве " + n + " раз.");
    }

    private static int findInt(int num, int[] ints) {
        int n = 0;
        for (int i = 0; i < ints.length; i++) {
            if (NUMBER == ints[i]) {
                n++;
            }
        }
        return n;
    }

    //Ex.5
    public static void main(String[] args) {
        print(findEmptyStrings(new String[]{"Text1", "Text2", "Text3", ""}));
        print(findEmptyStrings(new String[]{"", "", ""}));
    }

    private static void print(int emptyStrings) {
        System.out.println("Количество пустых строк в массиве: " + emptyStrings);
    }

    private static int findEmptyStrings(String[] strings) {
        int emptyStrings = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].isEmpty()) {
                emptyStrings++;
            }
        }
        return emptyStrings;
    }

     */
    //Ex.6
    public static void main(String[] args) {
        print(arithmeticProgression(new float[]{1, 2, 3, 4, 5, 6, 7}));
        print(arithmeticProgression(new float[]{2, 4, 6, 8}));
        print(arithmeticProgression(new float[]{0, 3, 6, 9, 12, 15}));
        print(arithmeticProgression(new float[]{1, 2, 3, 49, 5, 6}));
    }

    private static void print(boolean b) {
        if (b) {
            System.out.println("Последовательность элементов массива является арифмитической прогрессией.");
        } else {
            System.out.println("Последовательность элементов массива НЕ является арифмитической прогрессией.");
        }

    }

    private static boolean arithmeticProgression(float[] ints) {
        boolean b;
        float sum1 = ((ints[0] + ints[ints.length - 1]) / 2) * (ints.length);
        float sum2 = 0;
        for (int i = 0; i < ints.length; i++) {
            sum2 += ints[i];
        }
        if (sum1 == sum2) {
            b = true;
        } else {
            b = false;
        }
        return b;
    }
}