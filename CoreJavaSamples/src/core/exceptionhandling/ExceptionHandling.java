package core.exceptionhandling;

import java.util.ArrayList;
import java.util.List;

public class ExceptionHandling {
// []
    public void verifyFinally(String value){
        // try-> finally
        try{
            // Seven steps to do a db connection
            // create  Connection class
            // hiberTemplate.openSession();
            System.out.println("In try before exit");
            Object x = 0;
            x = new Integer(0);
            x = new Float(0.0);
            //
           // System.exit(0);
            System.out.println("In try after exit");
            System.out.println(x);

            String val = new String("test");

            System.out.println(val.equals(value));

//            Boolean u = null;
//            if( u == null){
//             System.out.println(u);
//            }

            //System.exit(0);
            //con.close();
        }catch (Exception e){
            System.out.println("In catch");
            // translate the exception
            //
        } finally {
            System.out.println("In finally");
        }
        // When,  What, Why & How
    }

    public static void main(String[] args) {
        final ExceptionHandling ex = new ExceptionHandling();
        ex.verifyFinally("test");
    }

    public void printString(int... x){
      System.out.println(x[0]);
      int s  = 0;
      switch (s) {
          case 0:
          case 1:
      }

        List<Object> arrayList =  new ArrayList();
        arrayList.add("String");

        //[0][1]
    }
}
