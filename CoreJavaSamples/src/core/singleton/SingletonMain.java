package core.singleton;
import static core.singleton.MyServerConnectionSingleton.getInstance;

public class SingletonMain {
    public static void main(String[] args) {
        MyServerConnectionSingleton myServerConnectionSingleton1
                = getInstance();
        System.out.println(myServerConnectionSingleton1);

        MyServerConnectionSingleton myServerConnectionSingleton2
                = getInstance();

        System.out.println(myServerConnectionSingleton2);




    }
}
