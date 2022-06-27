package oldlessons;

public class DeveloperFactory {
    public Developer create(String name, int stack) {
        switch (stack) {
            case 2:
            case 3:
                return new Junior(name, stack);
            case 4:
            case 5:
                return new Middle(name, stack);
            case 6:
            case 7:
                return new Senior(name, stack);
            default:
                throw new IllegalArgumentException("Извините, " + name + ", Ваш опыт не подходит для работы в нашей команде");
        }
    }
}
