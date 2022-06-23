public abstract class Animal {
    protected final String name;

    protected Animal(String name){
        this.name = name;
    }

    protected String getType() {
        return getClass().getSimpleName();
    }

    protected abstract String getSkills();
}
