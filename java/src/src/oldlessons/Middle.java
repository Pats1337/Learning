package oldlessons;

public class Middle extends Developer {
    public Middle(String name, int stack) {
        super(name, stack, DeveloperType.MIDDLE);
    }

    protected String getName() {
        return name;
    }

    protected int getSalary() {
        return 150000;
    }

    protected int getStack() {
        return stack;
    }

}
