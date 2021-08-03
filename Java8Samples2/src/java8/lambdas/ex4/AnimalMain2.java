package java8.lambdas.ex4;

import java8.lambdas.ex4.Animal;

public class AnimalMain2 {

    public static void main(String[] args) {

        // Way 2  - Java 7 way of implementing F.I.
        final Animal rhino = new Animal() {
            @Override
            public void drink(String drinksWhat) {
                System.out.println("rhino drinks " + drinksWhat);
            }
        };


//        // Way 3: Java 8
//        // 1. no access modifier, no return type declared , no name
//        // 2. eliminate the curly brace if one and only statement in the method
//        // 3. method argument datatype is optional
//        final Animal lion = drinksWhat -> System.out.println("lion drinks " + drinksWhat);

    }
}
