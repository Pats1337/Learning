package Collections;

import java.util.*;

public class ArrayListx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        List<String> big = new ArrayList<>();
        big.add("big");
        big.addAll(list);
        for (String string : big){
            System.out.println(string + " ");
        }
    }
}
