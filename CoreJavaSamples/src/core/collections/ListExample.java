package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class ListExample {
        public static void main(String[] args) {

            // coding for an interface
            // Array - not dynamic ... ;ist = dynace
            // Array+List = ArrayList = Array is dynamic now
            // create a new array
            // add all the records from oldArr to new Arr
            final List<String>  arrayList = new ArrayList<>();

            // Linked/List : 2 element ->  link between
            final List<String>  linkedList = new LinkedList<>();
            linkedList.add("x");
            linkedList.add("y");
            linkedList.add("z");
            // [ref, value] memoryref
            // [s1,s2,s3]

            // x <-(x123) y <-(y123) z
           //[head=x123, x , tail=y123] = "x" [x123]
            //[head=y123, y , tail=null] = "y" [y123]


        }
}
