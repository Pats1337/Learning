public class MainDevelopers {
    public static void main(String[] args) {
        DeveloperFactory factory = new DeveloperFactory();
        Developer developer = factory.create("Сергей", 3);
        showDescription(developer);
        Developer developer1 = factory.create("Алексей", 5);
        showDescription(developer1);
    }

    private static void print(String txt) {
        System.out.println(txt);
    }

    private static void showDescription(Developer developers) {
        switch (developers.getType()) {
            case JUNIOR:
                print("Sorry, " + developers.getName() + ", we dont need " + developers.getType() + " developers.\n");
                break;
            case MIDDLE:
            case SENIOR:
                print(developers.toString());
                break;
            default:
                print("undefined developer level");
        }
    }
}

