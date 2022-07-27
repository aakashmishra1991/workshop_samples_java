package core.staticfinal;

import java.io.Closeable;
import java.io.IOException;

public class StaticFinalMain {

    public static void main(String[] args) {
        // if a class is abstract the class can not be intantiated (object can not be creates)
        final AbstractHonk abstractHonk = new TruckHonk();

        final AbstractHonk carHonk = new AbstractHonk() {
            @Override
            void honk() {
                System.out.println("This is a car honk");
            }
        };
        final AbstractHonk bikeHonk = new AbstractHonk() {
            @Override
            void honk() {
                System.out.println("This is a bike honk");
            }
        };

        final Closeable closeableAnonymousVar = new Closeable() {
            @Override
            public void close() throws IOException {
                System.out.println("This is a bike honk");
            }
        };

        // final classes can not be inherited
        FinalVehicle vehicle= new FinalVehicle();

    }
}
