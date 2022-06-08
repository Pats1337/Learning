public class HomeworkForLesson11 {
    // Ex.1
    public static void main(String[] args) {
        print(checkTriangle(3, 4, 5));
        print(checkTriangle(-2, 2, 2));
    }

    private static boolean checkTriangle(int a, int b, int c) {
    return (a > 0 & b > 0 & c > 0) & (a + b > c || a + c > b || b + c > a);
    }

    private static void print(boolean x) {
        if (x){
            System.out.println("A triangle with such sides can exist");
        } else {
            System.out.println("There is no triangle with such sides");
        }
    }
}
