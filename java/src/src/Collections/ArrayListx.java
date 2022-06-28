package Collections;

import java.util.*;

public class ArrayListx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("first");
        list.add("so");
        list.add("new item");
        list.set(0,"second");
        list.sort(new Comparator<>() {
            @Override
            public int compare(String s, String t1) {
                return t1.length() - s.length();
            }
        });
        for (String string : list){
            System.out.println(string);
        }
    }
}
