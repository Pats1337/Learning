public class Middle extends Developer {
    public Middle(String name, String... stack) {
        super(name, stack);
    }

    protected String getName() {
        return name;
    }

    protected int getSalary() {
        return 150000;
    }

    protected String getStack() {
        return String.join(", ", stack);
    }

}
