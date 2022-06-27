package oldlessons;

public class Senior extends Developer {
    public Senior(String name, int stack) {
        super(name, stack, DeveloperType.SENIOR);
    }

    protected String getName() {
        return name;
    }

    protected int getSalary() {
        return 200000;
    }

    protected int getStack() {
        return stack;
    }

}
