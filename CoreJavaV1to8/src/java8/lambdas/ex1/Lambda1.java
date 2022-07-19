package java8.lambdas.ex1;

public class Lambda1 {

    public void m1() {
        System.out.println("test");
    }

    // () -> {}

    public int sum(int i, int j) {
        return i + j;
    }


    // (int i, int j) -> {return i+j;}
    // (int i, int j) -> return i+j
    // (i,j) -> return i+j

    public int getLength(String string) {
        return string.length();
    }
    // (str) -> str.length

}
