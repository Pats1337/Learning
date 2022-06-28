package Collections;

import java.util.*;

public class ArrayListx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list.isEmpty());
        list.add("first");
        list.add("second");
        for (String string : list) {
            System.out.println(string);
        }
        list.remove("first");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("i " + i + " item " + list.get(i));
        }
    }
}
