package core.teststatic;

public class StaticExample {
    static String name = "Ram";
    static void setName(String name1){
        name =  name1;
    }

    public StaticExample() {
        this.address = "mumbai";
    }
    public StaticExample(String address) {
        this.address = address;
    }
    String address = "mumbai";
    String getAddress(){
        return address;
    }

    public static void main(String[] args) {
        // static variables/methods
        System.out.println(StaticExample.name);
        // static method call
        StaticExample.setName("test");
        System.out.println(StaticExample.name);

        // calling instance variables without a reference
        System.out.println( new StaticExample("blore").address);

        // instance/object variables/methods
        StaticExample staticExampleRef = new StaticExample("blore");
        System.out.println( staticExampleRef.address);
        System.out.println( staticExampleRef.getAddress());

    }
}
