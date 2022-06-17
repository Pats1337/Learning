public class HomeworkForLesson11 {
    /* Ex.1
        public static void main(String[] args) {
            print(checkTriangle(3, 4, 5));
            print(checkTriangle(5, 1, 5));
        }

        private static boolean checkTriangle(int a, int b, int c) {
        return (a > 0 & b > 0 & c > 0) & (a + b > c & a + c > b & b + c > a);
        }

        private static void print(boolean x) {
            if (x){
                System.out.println("A triangle with such sides can exist");
            } else {
                System.out.println("There is no triangle with such sides");
            }
        }
    }

        // Ex.2
        public static void main(String[] args) {
            print(checkMin(1, 2, 3, 4));
            print(checkMin(2, -1, 3, 4));
            print(checkMin(2, -1, -3, 4));
            print(checkMin(2, -1, 3, -904));
            print(checkMin(-1, -2, -1, 4));
        }

        private static int checkMin(int a, int b, int c, int d) {
            int x;
            if(a <= b & a <= c & a <= d){
                x = a;
            } else if (b <= a & b <= c & b <= d){
                x = b;
            } else if (c <= a & c <= b & c <= d){
                x = c;
            } else {
                x = d;
            }
            return x;
        }

        private static void print(int x){
            System.out.println("The lowest number received: " + x);
        }
    }

        // Ex.3
        public static void main(String[] args) {
            print(checkDay(true, true));
            print(checkDay(true, false));
            print(checkDay(false, true));
            print(checkDay(false, false));
        }

        private static void print(int x) {
            if (x == 1){
                System.out.println("Today is a day off and a holiday, you can sleep as much as you want.");
            } else if (x == 2){
                System.out.println("Today is only a day off, lots to do around the house, so we set the alarm for 11 a.m.");
            } else {
                System.out.println("Work day! Set the alarm for 6:00 a.m.");
            }
        }

        private static int checkDay(boolean weekend, boolean holiday) {
            int x;
            if ((weekend & holiday) || (!weekend & holiday)){
                x = 1; // Today is a day off and a holiday, you can sleep as much as you want.
            } else if (weekend & !holiday){
                x = 2; // Today is only a day off, lots to do around the house, so we set the alarm for 11 a.m.
            } else {
                x = 3; // Work day! Set the alarm for 6:00 a.m.
            }
            return x;
        }
        }


        // Ex. 4
        public static void main(String[] args) {
            print(checkTriangle(60, 60, 60));
        }

        private static void print(int x) {
            switch (x) {
                case -1:
                    System.out.println("Error, the passed values cannot form a triangle.");
                    break;
                case 8900:
                    System.out.println("This is an acute-angled triangle");
                    break;
                case 8965:
                    System.out.println("This is an acute-angled isosceles triangle");
                    break;
                case 8960:
                    System.out.println("This is an acute-angled equilateral triangle");
                    break;
                case 9165:
                    System.out.println("This is an obtuse isosceles triangle");
                    break;
                case 9130:
                    System.out.println("This is an obtuse triangle");
                    break;
                case 9065:
                    System.out.println("This is an isosceles right triangle");
                    break;
                case 9030:
                    System.out.println("This is a right triangle");
                    break;
            }
        }


        public static int checkTriangle(int a, int b, int c) {
            int x;
            if ((a <= 0 || b <= 0 || c <= 0) || (a + b + c != 180)) {
                x = -1;// Error, the passed values cannot form a triangle.
            } else if (a < 90 & b < 90 & c < 90) {
                if ((a == b & a != c) || (a == c & a != b) || (b == c & b != a)) {
                    x = 8965; // An isosceles triangle
                } else if (a == b & a == c) {
                    x = 8960; // Equilateral triangle
                } else {
                    x = 8900; // Versatile triangle
                }
            } else if (a > 90 || b > 90 || c > 90) {
                if ((a == b & a != c) || (a == c & a != b) || (b == c & b != a)) {
                    x = 9165; // An isosceles triangle
                } else {
                    x = 9130; // Versatile triangle
                }
            } else {
                if ((a == b & a != c) || (a == c & a != b) || (b == c & b != a)) {
                    x = 9065; // An isosceles triangle
                } else {
                    x = 9030; // Versatile triangle
                }
            }
            return x;
        }
    }

        // Ex. 5
        public static void main(String[] args) {
            print(checkAge(18));
            print(checkAge(11));
            print(checkAge(-1));
            print(checkAge(1000));
            print(checkAge(21));
            print(checkAge(90));

        }

        private static boolean checkAge(int age) {
            boolean x;
            if (age >= 18 & age <= 90){
                x = true;
            }else {
                x = false;
            }
            return x;
        }

        private static void print(boolean x){
            if (x) {
                System.out.println("Access allowed.");
            } else {
                System.out.println("Access denied. You are a bot");
            }
        }

    }

        // Ex.6
        public static void main(String[] args) {
            print(ageVerification(-1));
            print(ageVerification(2));
            print(ageVerification(6));
            print(ageVerification(13));
            print(ageVerification(17));
            print(ageVerification(21));
            print(ageVerification(60));
            print(ageVerification(96));
            print(ageVerification(100));

        }

        private static void print(int x) {
            switch (x){
                case -1:
                    System.out.println("Sorry, incorrect age");
                    break;
                case 1:
                    System.out.println("Going to kindergarten today");
                    break;
                case 2:
                    System.out.println("Going to school today");
                    break;
                case 3:
                    System.out.println("Going to college today");
                    break;
                case 4:
                    System.out.println("Going to university today");
                    break;
                case 5:
                    System.out.println("Going to work today");
                    break;
                case 6:
                    System.out.println("Going to the clinic today");
                    break;
            }
        }

        private static int ageVerification(int age) {
            int x;
            if (age <= 0 || age >= 100){
                x = -1; // check incorrect values
            } else if (age < 6) {
                x = 1; // kindergarten
            } else if (age < 15) {
                x = 2; // school
            } else if (age < 18) {
                x = 3; // college
            } else if (age < 22) {
                x = 4; // university
            } else if (age < 65) {
                x = 5; // job
            } else {
                x = 6; // pension
            }
            return x;
        }
        }

        // Ex. 7
        public static void main(String[] args) {
            print(nameVerification("Александр"));
            print(nameVerification("Антон"));
            print(nameVerification("Денис"));
            print(nameVerification("Семен"));
        }

        private static void print(int x) {
            if (x == 0){
                System.out.println("Sorry, access denied.");
            } else {
                System.out.println("Welcome!");
            }
        }

        private static int nameVerification(String name) {
            int x;
            if (name.equals("Денис") || name.equals("Антон")){
                x = 0;
            } else {
                x = 1;
            }
            return x;
        }
        }

    // Ex. 8
    private static int count;
    public static void main(String[] args) {
        print(callCounter());
        print(callCounter());
        print(callCounter());
        print(callCounter());
        print(callCounter());
        print(callCounter());
    }

    private static void print(int x) {
        if (x == 1) {
            System.out.println("The callCounter method was called " + count + " times");
        } else {
            System.out.println("The callCounter method was called " + count + " times.\nYou are over the limit.");
        }
    }

    private static int callCounter() {
        int x;
        count = count + 1;
        if (count >= 5){
            x = -1;
        } else {
            x = 1;
        }
        return x;
    }
    }


    // Ex.9
    public static void main(String[] args) {
        print(checkCondition(-10));
        print(checkCondition(0));
        print(checkCondition(2));
        print(checkCondition(100));
        print(checkCondition(99));
        print(checkCondition(121));
    }

    private static void print(int x) {
        if (x == -1) {
            System.out.println("Ice");
        } else if (x == 0){
            System.out.println("Water");
        } else {
            System.out.println("Gas");
        }
    }

    private static int checkCondition(int temp) {
        int x;
        if (temp <= 0){
            x = -1;
        } else if (temp < 100){
            x = 0;
        } else {
            x = 1;
        }
        return x;
    }

}


    // Ex.10
    public static void main(String[] args) {
        print(checkLGBT("male", "female"));
        print(checkLGBT("female", "female"));
        print(checkLGBT("male", "male"));
        print(checkLGBT("female", "male"));
    }

    private static void print(boolean checkLGBT) {
        if (checkLGBT){
            System.out.println("Live happily!");
        }else {
            System.out.println("Sorry, same-sex marriage is illegal in our country");
        }
    }

    private static boolean checkLGBT(String x, String y) {
        return !x.equals(y);
    }
    }


    //Ex.11
    public static void main(String[] args) {
        print(stringComparison("equal","equal"));
        print(stringComparison("equal1","equal"));
        print(stringComparison("equal","equal1"));
        print(stringComparison("",""));
    }

    private static void print(boolean stringComparison) {
        System.out.println(stringComparison);
    }

    private static boolean stringComparison(String s, String s1) {
        return (!s.isEmpty() || !s1.isEmpty()) & s.equals(s1);
    }
    }


    //Ex.12
    public static void main(String[] args) {
        print(checkUrl("http://google.com"));
        print(checkUrl("some text"));
        print(checkUrl("http:/google.com"));
    }

    private static void print(boolean checkUrl) {
        if (checkUrl) {
            System.out.println("This is a link");
        } else {
            System.out.println("This string is not a link");
        }
    }

    private static boolean checkUrl(String s) {
        return s.startsWith("http://");
    }
}

     */
    //Ex.13
    public static void main(String[] args) {
        print(avgScore(4f, 5f, 5f, 4f, 4f));
        print(avgScore(5f, 5f, 5f, 5f, 5f));
        print(avgScore(3f, 3f, 5f, 3f, 3f));
        print(avgScore(2f, 2f, 2f, 4f, 4f));
        print(avgScore(-1f, 5f, 5f, 4f, 4f));
        print(avgScore(4f, 5f, 5f, 6f, 4f));
    }

    private static void print(int avgScore) {
        if (avgScore == -1){
            System.out.println("Error! Incorrect grades were entered.");
        } else if (avgScore == 2){
            System.out.println("You are an underachiever.");
        } else if (avgScore == 3){
            System.out.println("You're a C- student.");
        } else if (avgScore == 4){
            System.out.println("You're a B- student.");
        } else {
            System.out.println("You are an honors student.");
        }
    }

    private static int avgScore(float i, float i1, float i2, float i3, float i4) {
        int avgScore;
        float x = (i + i1 + i2 + i3 + i4) / 5;
        if ((i > 5 || i <= 0) || (i1 > 5 || i1 <= 0) || (i2 > 5 || i2 <= 0) || (i3 > 5 || i3 <= 0) || (i4 > 5 || i4 <= 0)){
            avgScore = -1;
        } else if (x < 3){
            avgScore = 2;
        } else if (x < 4){
            avgScore = 3;
        } else if (x < 5){
            avgScore = 4;
        } else {
            avgScore = 5;
        }
        return avgScore;
    }
    }