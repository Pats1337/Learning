public class Senior extends Developer {
    public Senior(String name, String... stack) {
        super(name, stack);
    }

    protected String getName() {
        return name;
    }

    protected int getSalary() {
        return 200000;
    }

    protected String getStack() {
        return String.join(", ", stack);
    }

}
