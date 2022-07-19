package core;

// step 1 :  class must be final
public final class ImmatuableExample {

    // step 2:  fields must be private
    private String name;

    // step3: create a public contructor and assign the value to the variable
    public ImmatuableExample(final String ipName){
        name = ipName;
    }

    // step 4: provide a public getter method
    public String getName() {
        return name;
    }
}

