package core.threads;

import java.util.stream.IntStream;

public class MultiCoreExample {

    // You have no control in Java over which CPU or core within a CPU
    // the thread will run. The JVM will schedule processing on different CPUs
    // and cores but this is non-deterministic.
    // You do, however, have the ability to tell the JVM
    // to distribute the data of a parallel algorithm over all the available cores and CPUs.
    // But this only works on parallel-based librairies
    // such as the fork/join (e.g. work stealing executor service)
    // or the Streams library. For example, this spreads the processing over all cores:
    public static void main(String[] args) {
        IntStream.range(1, 100).parallel().forEach(System.out::println);
    }
}

