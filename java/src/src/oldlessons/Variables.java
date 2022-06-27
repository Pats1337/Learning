package oldlessons;

public class Variables {
    public static void main(String[] args) {
        final String characterName = "Maddy";
        String typeOfFood = "Bull steak";
        printMsg(typeOfFood, characterName);
        typeOfFood = "Chicken salad";
        printMsg(typeOfFood, characterName);
        typeOfFood = "Cheese scones";
        printMsg(typeOfFood, characterName);
        typeOfFood = "Pickled mushrooms";
        printMsg(typeOfFood, characterName);
        typeOfFood = "Herring under a fur coat";
        printMsg(typeOfFood, characterName);
        typeOfFood = "Grandma's cake";
        printMsg(typeOfFood, characterName);

    }

    private static void printMsg(String typeOfFood, String characterName) {
        System.out.println(characterName + " ate the " + typeOfFood + " and hi is happy! <3");
    }

}
