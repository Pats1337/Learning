public class HomeworkForLesson10 {

/* exercise 1
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
} */
    // exercise 2
    public static void main(String[] args) {
       print(3.20f, 5.75f, 15f);
       print(3.20f, 5.75f, 4f);
       print(3.20f, 5.75f, 5.75f);
       print(3.20f, 5.75f, 1f);
    }

    private static void print(float beerPrice, float wiskeyPrice, float myBudget) {
        if (myBudget >= wiskeyPrice) {
            System.out.println("It's probably a great day for whiskey. Bartender, one whiskey, please!");
        } else if (myBudget >= beerPrice) {
            System.out.println("Eh, not enough whiskey today, so I'll have a beer. Buddy, pour me a mug of Guiness. ");
        } else {
            System.out.println("Unfortunately, we don't have any money left for booze. I'm going home. ");
        }
    }
}