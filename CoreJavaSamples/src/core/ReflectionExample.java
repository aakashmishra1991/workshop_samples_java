package core;

import core.teststatic.TestStatic1;
import core.teststatic.TestStatic2;


public class ReflectionExample {

    public static void main(String... args) {

    }

    public void printNumber(Exception exception) {
        TestStatic1.assertTest();
        TestStatic2.assertTest();

        if (exception instanceof NullPointerException) {
            System.out.println("Can you please truy aftersome there is tech issue");

            // java: x/env/jdbc
        }

    }


}
