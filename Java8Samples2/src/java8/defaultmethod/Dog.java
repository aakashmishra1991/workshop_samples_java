package java8.defaultmethod;

public interface Dog extends Animal {
    default void breathe(){
        // default to breathe
    }
}
