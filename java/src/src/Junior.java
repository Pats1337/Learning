public class Junior extends Developer {
    public Junior(String name, int stack) {
        super(name, stack, DeveloperType.JUNIOR);
    }

    protected String getName() {
        return name;
    }

    protected int getSalary() {
        return 50000;
    }

    protected int getStack() {
        return stack;
    }


}
