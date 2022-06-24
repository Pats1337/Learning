public class MainDevelopers {
    public static void main(String[] args) {
        DeveloperFactory factory = new DeveloperFactory();
        print(
                factory.create("Сергей", "Kotlin", "Git", "Android SDK"),
                factory.create("Алексей", "Kotlin", "Git", "Android SDK", "Fragments", "Dagger2"),
                factory.create("Рустам", "Kotlin", "Git", "Android SDK", "Fragments", "Dagger2", "Coroutines", "Android Jetpack")
        );
    }
    private static void print(Developer... developers){
        for (Developer developer: developers){
            print(developer.toString());
        }
    }
     private static void print(String txt){
         System.out.println(txt);
     }
}

