public class HomeworkForLesson11 {
    /* Ex.1
    public static void main(String[] args) {
        print(checkTriangle(3, 4, 5));
        print(checkTriangle(5, 1, 5));
    }

    private static boolean checkTriangle(int a, int b, int c) {
    return (a > 0 & b > 0 & c > 0) & (a + b > c & a + c > b & b + c > a);
    }

    private static void print(boolean x) {
        if (x){
            System.out.println("A triangle with such sides can exist");
        } else {
            System.out.println("There is no triangle with such sides");
        }
    }
}

    // Ex.2
    public static void main(String[] args) {
        print(checkMin(1, 2, 3, 4));
        print(checkMin(2, -1, 3, 4));
        print(checkMin(2, -1, -3, 4));
        print(checkMin(2, -1, 3, -904));
        print(checkMin(-1, -2, -1, 4));
    }

    private static int checkMin(int a, int b, int c, int d) {
        int x;
        if(a <= b & a <= c & a <= d){
            x = a;
        } else if (b <= a & b <= c & b <= d){
            x = b;
        } else if (c <= a & c <= b & c <= d){
            x = c;
        } else {
            x = d;
        }
        return x;
    }

    private static void print(int x){
        System.out.println("The lowest number received: " + x);
    }
}
*/
    // Ex.3
    public static void main(String[] args) {
        print(checkDay(true, true));
        print(checkDay(true, false));
        print(checkDay(false, true));
        print(checkDay(false, false));
    }

    private static void print(int x) {
        if (x == 1){
            System.out.println("Today is a day off and a holiday, you can sleep as much as you want.");
        } else if (x == 2){
            System.out.println("Today is only a day off, lots to do around the house, so we set the alarm for 11 a.m.");
        } else {
            System.out.println("Work day! Set the alarm for 6:00 a.m.");
        }
    }

    private static int checkDay(boolean weekend, boolean holiday) {
        int x;
        if ((weekend & holiday) || (!weekend & holiday)){
            x = 1; // Today is a day off and a holiday, you can sleep as much as you want.
        } else if (weekend & !holiday){
            x = 2; // Today is only a day off, lots to do around the house, so we set the alarm for 11 a.m.
        } else {
            x = 3; // Work day! Set the alarm for 6:00 a.m.
        }
        return x;
    }
    }