//класс Прямоугольник с возможностью породить объект с помощью точек. Приват метод на определение квадрат это или нет и паблик метод для описания объекта
public class HomeworkForLesson20 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(
                new Point(1, 1),
                new Point(1, 4),
                new Point(6, 4),
                new Point(6, 1)
        );
        System.out.println(rectangle.getDescription());
    }
}
