package oldlessons;

public class NumbersInJava {
    public static void main(String[] args) {
        /*
        System.out.println(2+2);
        System.out.println("2+2");
        System.out.println(2+"2");
        System.out.println(Integer.valueOf("2")+2);
        System.out.println(String.valueOf(2)+"2");
        */
        showMath(3,5);
        showMath(1000,-15);
    }

    private static void showMath(Integer i, int i1) {
        System.out.println(i + i1);
        System.out.println(i - i1);
        System.out.println(i1 - i);
        System.out.println(i * i1);
        System.out.println(i / i1);
    }
}
