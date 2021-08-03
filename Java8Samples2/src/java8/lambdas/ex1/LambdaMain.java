package java8.lambdas.ex1;

public class LambdaMain {

    public static void main(String[] args) {

        // first/traditional way
        MyFunctionalInterface myFunctionalInterface = new MyFunctionalInterfaceImpl1();
        myFunctionalInterface.sayHello();
        // creates multiple

        // anonymous class
        MyFunctionalInterface myFunctionalInterfaceAnonymous = new MyFunctionalInterface() {
            @Override
            public void sayHello() {
                System.out.println("Hello, I am the Second way of implementation of FIs");
            }
        };
        myFunctionalInterfaceAnonymous.sayHello();

        // lambda exp for MyFunctionalInterface
        // now lets use the rules
        // its anonymous so

        MyFunctionalInterface myFunctionalInterface1 = () -> {
            System.out.println("Hello, I am the Third and cool way of implementation of FIs");
        };

        MyFunctionalInterface myFunctionalInterface2 = () ->
                System.out.println("Hello, I am the Third and cool way of implementation of FIs");

    }

}
