public class VariableScope {
    public static void main(String[] args) {
    print("Min of Int is: " + Integer.MIN_VALUE);
    print("Max of Int is: " + Integer.MAX_VALUE);
    print("Min of Float is: " + Float.MIN_VALUE);
    print("Max of Float is: " + Float.MAX_VALUE);
    print("Min of Double is: " + Double.MIN_VALUE);
    print("Max of Double is: " + Double.MAX_VALUE);
    }

    private static void print(String s) {
        System.out.println(s);
    }
}
