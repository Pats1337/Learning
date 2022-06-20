public class HomeworkForLesson13 {
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
}
