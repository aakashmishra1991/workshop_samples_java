public class SingletonExample {

    // Step 1.  make constructor private
    private SingletonExample() {

    }
    // Step 2. prepare a variable that holds the singleton object and is accessible only to the singleton class
    private static SingletonExample singletonExample = null;

    // 3. public getInstance creator
    public static SingletonExample getInstance() {
        if (singletonExample == null) {
            singletonExample = new SingletonExample();
        }
        return singletonExample;
    }

    public static void main(String[] args) {
        SingletonExample singletonExample = SingletonExample.getInstance();
    }
}




























