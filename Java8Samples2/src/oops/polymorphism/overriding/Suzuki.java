package oops.polymorphism.overriding;

public class Suzuki extends Company {

    public void setName(String name) throws NullPointerException {
        super.name = name;
    }
}
