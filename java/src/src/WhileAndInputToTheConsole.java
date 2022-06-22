import java.util.Scanner;

public class WhileAndInputToTheConsole {
    //Ex.1
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 5) {
            System.out.print("Введите Ваше имя: ");
            String name = scanner.next();
            if (name.equals("Даниил")) {
                System.out.println("С даниилами не здороваюсь!");
                break;
            }
            System.out.println("Привет, " + name + "!");
            count++;
        }
    }
}
