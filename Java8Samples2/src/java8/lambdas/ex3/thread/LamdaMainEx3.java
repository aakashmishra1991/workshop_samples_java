package java8.lambdas.ex3.thread;

public class LamdaMainEx3 {
    public static void main(String[] args) {
        // Rnnable is a functional interface
        System.out.println("Main thread start");

        Runnable myThread1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("The value of i is = " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread myThreadObj1 = new Thread(myThread1);
        myThreadObj1.setName("MyThread1");
        System.out.println("MyThread1 thread start");
        myThreadObj1.start();

        Runnable myThread2 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("2 x" + i + " = " + i * 2);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread myThreadObj2 = new Thread(myThread1);
        myThreadObj2.setName("MyThread1");
        System.out.println("MyThread1 thread start");
        myThreadObj2.start();


        System.out.println("Main thread end");

    }


}
