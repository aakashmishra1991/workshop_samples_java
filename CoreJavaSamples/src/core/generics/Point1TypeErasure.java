package core.generics;

import java.util.ArrayList;
import java.util.List;

public class Point1TypeErasure {
    public static void main(String[] args) {
        // check the compiled class the righ side <> with type string is removed
        List<String> list = new ArrayList<String>();
        list.add("someName");
        System.out.println(list.get(0));
    }

}
