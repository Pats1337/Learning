public class HomeworkForLesson19 {
    // Класс прямоугольника, который получает 4 стороны, проверяет их валидность и дополнительно определяет является ли он квадратом
    public static void main(String[] args) {
        boolean valid = Rectangle.areValidArguments(2,3,2,2);
        if (valid) {
            Rectangle rectangle = new Rectangle(2,3,2,2);
            System.out.println(rectangle.isSquare());
        } else{
            System.out.println("Стороны не могут образовать прямоугольник");
        }
    }
}
