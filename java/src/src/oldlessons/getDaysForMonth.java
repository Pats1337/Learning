package oldlessons;

import java.util.Locale;

public class getDaysForMonth {
    public static void main(String[] args) {
        print(getDaysForMonth("January"));
        print(getDaysForMonth("MAY"));
        print(getDaysForMonth("jUlY"));

    }

    private static String getDaysForMonth(String month) {
        String result;
        int days = -1;
        switch (month.toLowerCase()) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                days = 31;
            case "april":
            case "june":
            case "september":
            case "november":
                days = 30;
            case "february":
                days = 28;
            default:
                if (days > 0) {
                    result = month.toLowerCase() + " has " + days + " days.";
                } else {
                    throw new IllegalArgumentException("not recognized month " + month);
                }
        }
        return result;
    }
    public static void print(String result){
        System.out.println(result);
    }
}
