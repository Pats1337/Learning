public abstract class Developer {
    protected final String name;
    protected final String[] stack;

    protected Developer(String name, String[] stack) {
        this.name = name;
        this.stack = stack;
    }

    protected String getType() {
        return getClass().getSimpleName();
    }

    protected String getName() {
        return getClass().getSimpleName();
    }

    protected String getStack() {
        return String.join(", ", stack);
    }

    protected abstract int getSalary();

    public String toString() {
        return getType() + " " + getName() + "\n" +
                "Владеет технологиями: " + getStack() + "\n" +
                "Зарплата: " + getSalary() + "\n";
    }
}
