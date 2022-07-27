package core.immutable;
// immutability
// 1.  The class can not be extended
// 2.  The object can not be modified
// 3.  If the object is to be modified a new object must be created

// step 1 :  class must be final
public final class ImmutableExample {

    // step 2:  fields must be private
    private String name;

    // step3: create a public contructor and assign the value to the variable
    public ImmutableExample(final String ipName){
        name = ipName;
    }

    // step 4: provide a public getter method
    public String getName() {
        return name;
    }
}

