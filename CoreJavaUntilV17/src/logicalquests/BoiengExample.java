package logicalquests;
// There is a boeing 767 plane how many golf ball can you fit in a boeing 767.

import java.io.IOException;
import java.util.Collection;
import java.util.concurrent.Semaphore;

// This is boieng class  ---> "Object 1 === boeing 767"
public class BoiengExample {
    public static void main(String[] args) {
        final Aeroplane boeing767 = new Aeroplane();
        // Maths formulas
        //1. Boeing is type of a cylinder
        Double volumeOfBoeing767 = boeing767.volume(50.0, 200.0);
        System.out.println("Volume of Boeing 767 is" + volumeOfBoeing767);

        // 2. Calculated the SA of a golfball in meters
        final Sphere golfball = new Sphere();
        Double surfaceAreaOfGolfBall = golfball.surfaceArea(0.005);
        System.out.println("surfaceAreaOfGolfBall" + surfaceAreaOfGolfBall);

        // 3.  total number of golfballs in boeing 767 will be
        Double countOfBalls = volumeOfBoeing767 / surfaceAreaOfGolfBall;
        Integer countOfBallsInt = countOfBalls.intValue();
        System.out.println("total number of golfballs in boeing 767 will approximately be= " + countOfBallsInt);


    }
}

class Aeroplane implements Cylinder, Cone {
    private Collection<Seat> seats = null;

    public Double volume(Double radius, Double height) {
        return Cylinder.super.volume(radius, height) + 2 * Cone.super.volume(radius, height);
    }
}

class Seat {
    Double size() throws Exception {
        return 0.5;
    }
}

class Sphere implements Shape {

    private Boolean isFull = null;


    public Double area(Double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public Double surfaceArea(Double radius) {
        return 4 * area(radius);
    }
}

interface Cone extends Shape {
    default Double volume(Double radius, Double height) {
        // pi R^2 h
        return Math.PI * Math.pow(radius, 2) * (height / 3);
    }
}

interface Cylinder extends Shape {
    default Double volume(Double radius, Double height) {
        //
        // pi R^2 h
        return Math.PI * Math.pow(radius, 2) * height;
    }
}

interface Shape {
    // this is a default implementation
    default Double area() {
        return 0.0;
    }
}

class GolfBall {

}