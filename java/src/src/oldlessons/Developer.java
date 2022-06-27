package oldlessons;

public abstract class Developer {
    protected final String name;
    protected final int stack;
    protected final DeveloperType type;

    protected Developer(String name, int stack, DeveloperType type) {
        this.name = name;
        this.stack = stack;
        this.type = type;
    }

    protected DeveloperType getType() {
        return type;
    }

    protected String getName() {
        return getClass().getSimpleName();
    }

    protected int getStack() {
        return stack;
    }

    protected abstract int getSalary();

    public String toString() {
        return getType() + " " + getName() + "\n" +
                "Количество технологий: " + getStack() + "\n" +
                "Предлагаемая зарплата: " + getSalary() + "\n";
    }
}
