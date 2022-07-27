package core.singleton;
// Singleton
// - Only one object in its entire lifetime
// - immutable  -  every time a new object

public class MyServerConnectionSingleton {
    // Step 1.  make constructor private
    private MyServerConnectionSingleton() {
    }

    // Step 2. prepare a variable that holds the singleton object and is accessible only to the singleton class
    private static MyServerConnectionSingleton myServerConnectionSingleton = null;

    // 3. public getInstance creator
    public static MyServerConnectionSingleton getInstance() {
        if (myServerConnectionSingleton == null) {
            myServerConnectionSingleton = new MyServerConnectionSingleton();
        }
        return myServerConnectionSingleton;
    }

    // Suppose if I have other variable to be used
    private String connectionName;

    public String getConnectionName() {
        return connectionName;
    }

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }
}