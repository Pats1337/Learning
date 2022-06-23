//Создать абстрактный класс животного и наследников типа Собака, Утка и Рыка.
// Для каждого вида сделать переопределяемый метод движения и поле "кличка".
// Написать внятное описание для каждого объекта и в цике вывести в мейне.
public class HomeworkForLesson22 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Dog("Белка");
        animals[1] = new Duck("Черный Плащ");
        animals[2] = new Fish("Немо");
        animals[3] = new Dog("Стрелка");
        for (Animal animal : animals){
            print(animal.toString());
        }
    }

    private static void print(String text) {
        System.out.println(text);
    }
}
