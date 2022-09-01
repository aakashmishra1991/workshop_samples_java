package core.generics;

import java.util.ArrayList;
import java.util.List;

public class Point2Subtyping {
    public static void main(String[] args) {
        // subtyping not possible
        //List<Integer> list = new ArrayList<Number>();

        // subtyping not possible
        //List<Number> list1 = new ArrayList<Integer>();

        // non subtype list
        List<Number> list2 = new ArrayList<Number>();


        Integer somenumber = new Integer(1);
        list2.add(somenumber);

    }
}
