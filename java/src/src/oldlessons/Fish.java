package oldlessons;

public class Fish extends Animal {

    public Fish(String name) {
        super(name);
    }

    @Override
    protected String getType() {
        return "Рыба";
    }

    protected String getName(){
        return name;
    }

    protected String getSkills(){
        return "плавать";
    }

    public String toString() {
        return getType() + " по кличке " + getName() + ". Умеет " + getSkills();
    }

}