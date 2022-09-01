package core.generics;

public class Point5MultipleBounds {
    public static void main(String[] args) {
        final SingleBoundEngine<AbstractEngine> boundedTwoStrokeEngineDiesel = new SingleBoundEngine<>(new DieselTwoStrokeEngine());
        boundedTwoStrokeEngineDiesel.printNameOfEngineInstantiated();


        final SingleBoundEngine<AbstractEngine> boundedTwoStrokeEngine = new SingleBoundEngine<>(new TwoStrokeEngine());
        boundedTwoStrokeEngine.printNameOfEngineInstantiated();
    }

    // multiple bound
    public <T extends Number & Comparable<? super T>> int compareNumbers(T t1, T t2) {
        return t1.compareTo(t2);
    }
}

// single bound
// once i change the type of T extends (meaning change the boundary, the generics will complaint
// the boundary is changed and its no more accepting Engine and subtypes.
//class SingleBoundEngine<T extends TwoStrokeEngine> {
class SingleBoundEngine<T extends AbstractEngine> {
    private T typeOfEngine;

    SingleBoundEngine(T typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public void printNameOfEngineInstantiated() {
        this.typeOfEngine.printNameOfEngine();
    }

}

class MultipleBoundEngine<T extends TwoStrokeEngine & Engine> {
    private T typeOfEngine;

    MultipleBoundEngine(T typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public void printNameOfEngineInstantiated() {
        this.typeOfEngine.printNameOfEngine();
    }

}


interface Engine {
    void printNameOfEngine();
}

abstract class AbstractEngine implements Engine {
    public void printNameOfEngine() {
        System.out.println("Parent Engine");
    }
}

class TwoStrokeEngine extends AbstractEngine {
    public void printNameOfEngine() {
        System.out.println("Two Stroke Engine");
    }
}

class PetrolTwoStrokeEngine extends TwoStrokeEngine {
    public void printNameOfEngine() {
        System.out.println("Petrol Two Stroke Engine");
    }
}

class DieselTwoStrokeEngine extends TwoStrokeEngine {
    public void printNameOfEngine() {
        System.out.println("Diesel Two Stroke Engine");
    }
}

class FourStrokeEngine extends AbstractEngine {
    public void printNameOfEngine() {
        System.out.println("Four Stroke Engine");
    }
}

