public class Junior extends Developer {
    public Junior(String name, String... stack) {
        super(name, stack);
    }

    protected String getName() {
        return name;
    }

    protected int getSalary() {
        return 50000;
    }

    protected String getStack() {
        return String.join(", ", stack);
    }
}
