import java.util.Scanner;

public class WhileAndInputToTheConsole {

    /*

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

    //Ex.2
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 20) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();
            if (number % 5 == 0) {
                System.out.println("Введенное число кратно 5");
            } else {
                System.out.println("Введенное число не делиться на 5 без остатка");
            }
            count++;
        }
    }

    //Ex.3 (Credit bot)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в банк!\nДля предоставления кредита необходимо уточнить некоторые данные.");
        System.out.print("Сумма кредита: ");
        int money = scanner.nextInt();
        System.out.print("Заработная плата в месяц: ");
        int salary = scanner.nextInt();
        System.out.print("Срок кредита: ");
        int time = scanner.nextInt();
        if (money <= 150000 && salary >= 25000 && time <= 12){
            System.out.println("Вам одобрен кредит на сумму " + money + " со сроком кредитования " + time + " месяцев.");
        } else if (money > 150000){
            System.out.println("Извините, запрашиваемая сумма превышает максимальную сумму выдачи.\nВ кредитовании ОТКАЗАНО!");
        } else if (salary < 25000){
            System.out.println("Извините, размер Вашей заработной платы меньше минимальной суммы.\nВ кредитовании ОТКАЗАНО!");
        } else {
            System.out.println("Извините, срок кредитования превышает максимальный лимит.\nВ кредитовании ОТКАЗАНО!");
        }
    }

    //Ex.4 (Job offer bot)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте, я HR компании Яндекс.\nДля получения приглашения на работу необходимо ответить на ряд вопросов.");
        while (true) {
            System.out.print("Подскажите, стаж вашей работы: ");
            int exp = scanner.nextInt();
            System.out.print("Знаете ли Вы Kotlin? ");
            String kotlin = scanner.next();
            System.out.print("Умеете пользоваться Git? ");
            String git = scanner.next();
            if (exp >= 3 && kotlin.equals("Да") && git.equals("Да")) {
                System.out.println("Отлично! Вы нам подходите.\nJob offer received");
            } else {
                System.out.println("Мы Вам перезвоним.\nJob rejected");
            }
            break;
        }
    }

    //Ex.5 (Checking the arithmetic progression)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 2;
        int diff0, diff1;
        System.out.println("Введите числа образующие арифмитическую прогрессию: ");
        int number = scanner.nextInt();
        int number1 = scanner.nextInt();
        diff0 = number1 - number;
        int lastNum = number1;
        while (count < 10) {
            int number2 = scanner.nextInt();
            diff1 = number2 - lastNum;
            if (diff1 != diff0) {
                System.out.println("Введенные числа не являются арифмитической прогрессией!");
                break;
            }
            lastNum = number2;
            count++;
        }
    }

     */
    //Ex.6 (Command Reference)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int exit = 0;
        while (exit != 1) {
            System.out.print("Целые типы переменных\n1. byte\n2. short\n3. char\n4. int\n5. long\n0. Выход\nВыберите необходимый пункт меню: ");
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    System.out.println("Тип byte. Размер: 8 бит. Диапазон: от -128 до 127");
                    break;
                case 2:
                    System.out.println("Тип short. Размер: 16 бит. Диапазон: от -32768 до 32767");
                    break;
                case 3:
                    System.out.println("Тип char. Размер: 16 бит. Диапазон: беззнаковое целое число, представляющее собой символ UTF-16 (буквы и цифры)");
                    break;
                case 4:
                    System.out.println("Тип int. Размер: 32 бит. Диапазон: от -2147483648 до 2147483647");
                    break;
                case 5:
                    System.out.println("Тип long. Размер: 64 бит. Диапазон: от -9223372036854775808L до 9223372036854775807L");
                    break;
                case 0:
                    exit = 1;
                    break;
                default:
                    System.out.println("Такой команды не существует");
            }

        }
    }
}
