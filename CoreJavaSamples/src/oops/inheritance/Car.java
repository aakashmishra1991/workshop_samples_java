package oops.inheritance;

public class Car  {
    private String model;
    private Manufacturer manufacturer;
    private Engine engine;

    public void setModel(){
        this.model = "SX4";
    }

    public void setModel(String name){
        this.model = name;
    }

    public void setModel(String name, String modelVersion){
        this.model = name + modelVersion;
    }

}
