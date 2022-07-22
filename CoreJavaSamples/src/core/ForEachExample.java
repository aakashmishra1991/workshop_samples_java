package core;

public class ForEachExample {

    void printAllVarArgs(Object... ids){
        for (Object id: ids) {
            System.out.println("id is: "+ id);
        }
        for (int i = 0; i<ids.length ; i++)
        {
            System.out.println("id is: "+ ids[i]);
        }
    }

    public static void main(String[] args) {
        ForEachExample example = new ForEachExample();
        example.printAllVarArgs(1,2,3,4,5,6,7,8,9,10,"11a","a12");
    }

}
