public class DeveloperFactory {
    public Developer create(String name, String... stack) {
        switch (stack.length) {
            case 2:
                return new Junior(name, stack[0], stack[1]);
            case 3:
                return new Junior(name, stack[0], stack[1], stack[2]);
            case 4:
                return new Middle(name, stack[0], stack[1], stack[2], stack[3]);
            case 5:
                return new Middle(name, stack[0], stack[1], stack[2], stack[3], stack[4]);
            case 6:
                return new Senior(name, stack[0], stack[1], stack[2], stack[3], stack[4], stack[5]);
            case 7:
                return new Senior(name, stack[0], stack[1], stack[2], stack[3], stack[4], stack[5], stack[6]);
            default:
                throw new IllegalArgumentException("Извините, " + name + ", Ваш опыт не подходит для работы в нашей команде");
        }
    }
}
