package java8.defaultmethod;

public class Pug implements Dog{
    @java.lang.Override
    public void breathe() {

    }

    public static void main(String[] args) {
        Pug pug = new Pug();
        pug.breathe();
    }
}
