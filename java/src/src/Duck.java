public class Duck extends Animal {

    public Duck(String name) {
        super(name);
    }

    @Override
    protected String getType() {
        return "Утка";
    }

    protected String getName(){
        return name;
    }

    protected String getSkills(){
        return "летать";
    }

    public String toString() {
        return getType() + " по кличке " + getName() + ". Умеет " + getSkills();
    }

}