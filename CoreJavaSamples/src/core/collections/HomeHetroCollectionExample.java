package core.collections;

import java.util.ArrayList;
import java.util.List;

public class HomeHetroCollectionExample {

    public static void main(String... args) {

        List list = new ArrayList();
        list.add(1);
        list.add("Aakash");

        for (Object obj :
                list) {
            System.out.println(obj);
            if(obj instanceof Integer){
                System.out.println("got an integer, do something with integer = "+obj);
            }

        }

    }


}
