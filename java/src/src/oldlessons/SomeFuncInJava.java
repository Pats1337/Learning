package oldlessons;

public class SomeFuncInJava {
    /* Classwork
    public static void main(String[] args) {
        int sum1 = sum(3, 4);
        int difference1 = difference(7, 5);
        int multiplication1 = multiply(sum1, difference1);
        print(multiplication1);
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
    */
    //Homework

    public static void main(String[] args) {
        String string1 = "- Hi, I'm Alex Terentev!\n";
        String string2 = "  Nice to meet you.";
        String string3 = sumString(string1, string2);
        print(string3);

    }

    private static void print(String s) {
        System.out.println(s);
    }

    private static String sumString(String s1, String s2) {
        return s1 + s2;
    }
}
