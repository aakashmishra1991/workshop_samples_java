package java8.lambdas.ex4;

public class ThreadLiveEx {

    public static void main(String[] args) {
        //
        Runnable myThread1 = () -> System.out.println(Thread.currentThread().getName());

        Runnable myThread2 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + "3 x  " + i + "=" + i * 3);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread thread1 = new Thread(myThread1, "Sequence thread");
        thread1.start();
        Thread thread2 = new Thread(myThread2, "Table of 3 thread");
        thread2.start();
        // Executor framework
        // Fork join - > Java 7
        System.out.println("main thread ends here");
    }


}
