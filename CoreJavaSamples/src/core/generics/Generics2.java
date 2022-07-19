package core.generics;

import java.util.*;

public class Generics2 {
    public static void main(String[] args) {

        List stdList = new ArrayList();
        stdList.add(1);
        stdList.add("a");

        List stdList2 = new ArrayList<String>();
        stdList2.add(1);
        stdList2.add("a");

        List<String> stdList3 = new ArrayList<String>();
        //stdList3.add(1);
        stdList3.add("a");

        List<String[]> x  = new ArrayList<>();
        String[] test = new String[]{"asjsakjd", "hjashdj"};
        x.add(test);

        x.forEach( y-> System.out.println(y));

        printNumber(Arrays.asList(1,2,3,4));
        printNumber(Arrays.asList(1,2.0,3.1,4.1));

        final Set<String> stringSet =new HashSet<>();
        stringSet.add("xyz");
        // [1xyz, "xyz"]
        stringSet.add("xyz");
        // [1xyz, "xyz"]
     // "Hash" - set [1xyz, ]

        // JAVA =  1 -> xyz -> 1+xyz = 1xyz
    }

    static void printNumber(List<? extends Number> numbers) {
        for (Number number : numbers) {
            System.out.println(number);
        }
    }

}
