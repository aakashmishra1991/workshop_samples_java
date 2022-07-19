package java8.lambdas.ex1;
// Older way ,  lambda is not the only way
//
public class MyFunctionalInterfaceImpl1 implements MyFunctionalInterface {
    @Override
    public void sayHello() {
        System.out.println("Hello, I am the First way of implementation of FIs");
    }

    public static void main(String[] args) {
       MyFunctionalInterface myFunctionalInterfaceImpl1 = new MyFunctionalInterfaceImpl1();
       myFunctionalInterfaceImpl1.sayHello();
    }

}
