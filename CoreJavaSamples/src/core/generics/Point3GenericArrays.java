package core.generics;

import java.util.ArrayList;
import java.util.List;

public class Point3GenericArrays {

    public static void main(String[] args) {
        // step 1 example of array
        String[] arrayOfStrings = new String[10];
        // step 2 example of generics
        List<String> ListOfStrings = new ArrayList<>(10);

        // step 3: You cannot create array of generics as the type is erased,
        // and on runtime the compiler will not come to know what is the type of my array, hence not allowed
        //List<String>[] ListOfStringsArray = new List<String>[10];

    }
}
