package core.immutable;
// immutability
// 1.  The class can not be extended
// 2.  The object can not be modified
// 3.  If the object is to be modified a new object must be created

public final class ImmutableVehicle {
    private String name;

    public String getName() {
        return name;
    }

    public ImmutableVehicle(String name) {
        this.name = name;
    }
}


