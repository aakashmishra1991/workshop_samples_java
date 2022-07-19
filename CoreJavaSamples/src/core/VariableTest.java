import java.io.IOException;


abstract class SuperVariable{

    public void method1(String a) throws NullPointerException {
        throw new NullPointerException();
    }

}

public class VariableTest extends SuperVariable{

    public void method1(String a) throws NullPointerException {
        throw new NullPointerException();
    }

    public static void main(String[] args) {
        VariableTest vt = new VariableTest();
        String x1 = new String();
        vt.method1("somevalue");

        final SingletonExample se = SingletonExample.getInstance();

    }
}
