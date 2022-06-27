package oldlessons;

public class MainFigures {
    public static void main(String[] args) {
        Figure[] figures = new Figure[4];
        FigureFactory factory = new FigureFactory();
        print(
                figures[0] = factory.create(3),
                figures[1] = factory.create(5, 6),
                figures[2] = factory.create(3, 4, 5),
                figures[3] = factory.create(5)
        );
    }

    private static void print(Figure... figures) {
        for (Figure figure : figures) {
            print(figure.toString());
        }
    }

    private static void print (String text){
        System.out.println(text);
    }

}
