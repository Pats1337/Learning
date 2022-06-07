public class HomeworkForLesson10 {


    public static void main(String[] args) {
        print(true, true);
        print(true, false);
        print(false, true);

    }

    private static void print(boolean isTodayFriday, boolean aLotOfMoney) {
        if (isTodayFriday && aLotOfMoney){
            System.out.println("We go to the bar alone and drink delicious beer!");
        } else if (isTodayFriday) {
            System.out.println("I don't have any money, but I have some good friends. Let's invite him to the bar, because it's Friday night!");
        } else {
            System.out.println("It's not Friday, it's not time to drink, it's time to work!");
        }
    }
}
