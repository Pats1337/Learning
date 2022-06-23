public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    protected String getType() {
        return "Собака";
    }

    protected String getName(){
        return name;
    }

    protected String getSkills(){
        return "бегать";
    }

    public String toString() {
        return getType() + " по кличке " + getName() + ". Умеет " + getSkills();
    }

}
