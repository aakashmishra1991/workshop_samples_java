package core;

public class VarargsExample {

    void printAllVarArgs(Object... ids){
        for (Object id: ids) {
            System.out.println("id is: "+ id);
        }
    }

    public static void main(String[] args) {
        VarargsExample example = new VarargsExample();
        example.printAllVarArgs(1,2,3,4,5,6,7,8,9,10,"11a","a12");
    }

}
