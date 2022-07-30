package core.generics;

import java.util.*;

public class XMLToJsonTransformer<T,E> {

    // Request Response

    final Collection<? super Number> myListI = new ArrayList<>();


    public static void main(String[] args) {

        XMLToJsonTransformer<Object, Object> xml = new XMLToJsonTransformer();
        xml.myListI.add(1.0);

        String[] names = new String[5];


        final List<String> namesArrayList = new ArrayList<>(1000);
        namesArrayList.addAll(Arrays.asList("x","y","z"));
        final List<String> namesLinkedList = new LinkedList<String>();
        namesArrayList.forEach(x -> System.out.println(x));
        xml.method1(new ArrayList());
    }
     void method1(List input){

        input.forEach(x-> System.out.println(x));
        input.add(1);
     }

     /*
        [null,hotwater]=red_bucket
        [red_bucket, cold_water]=blue_bucket
        [blue_bucket, water]=green_bucket


       1. insertion
       2. deletion
       3. retrieval
         */

}
