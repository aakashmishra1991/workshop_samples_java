package java8.lambdas.ex4;

public class LambdaMainAnimal {
    public static void main(String[] args) {
        // 1.  Traditional way of implementing functional interface
        final Animal dog = new Dog();
        dog.drink("water");
        final Animal cat = new Cat();
        cat.drink("milk");

        // 2. Traditional 2 java way of creating objects for an interface

        final Animal rhino = new Animal() {
            @Override
            public void drink(String drinksWhat) {
                System.out.println("rhino drinks " + drinksWhat);
            }
        };

        // 3. JAVA 8 lamdas
        // 1. no access modifier, no return type declared , no name
        final Animal zebra = (String drinksWhat) -> {
            System.out.println("zebra drinks " + drinksWhat);
        };

        // 1. no access modifier, no return type declared , no name
        // 2. eliminate the curly brace if one and only statement in the method
        final Animal tiger = (String drinksWhat) -> System.out.println("tiger drinks " + drinksWhat);

        // 1. no access modifier, no return type declared , no name
        // 2. eliminate the curly brace if one and only statement in the method
        // 3. method argument datatype is optional
        final Animal lion = drinksWhat -> System.out.println("lion drinks " + drinksWhat);


        ///
        MyThread myThread = new MyThread();
        Thread thread = new Thread("mythread");
        thread.start();

    }

}
