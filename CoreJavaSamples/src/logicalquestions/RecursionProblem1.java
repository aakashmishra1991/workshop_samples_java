package logicalquestions;

// iterate and print 1-> 100
// Problem Statement (ps1): iterate and print 1-> 100
// ps2: iterate and print 1-> 100 without using any loops (while, dowhile, for)
//ps3: iterate and print 1-> 100 without using numbers
public class RecursionProblem1 {

    // Problem Statement (ps1): iterate and print 1-> 100
    public void ps1Solution() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    // ps2: iterate and print 1-> 100 without using any loops (while, dowhile, for)
    public void ps2Solution() {
        System.out.println("Solution for PS 2");
       printNos(100);
    }
    void printNos(int n) {
        if (n > 0) {
            printNos(n - 1);
            System.out.println(n);
        }
        return;
    }


    //ps3: iterate and print 1-> 100 without using numbers
    public void ps3Solution() {
        System.out.println("Solution for PS 3");
        int a = 'A' / 'A';
        //String b=".........."
        for (int i = a; i <= 'd'; i += a) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        RecursionProblem1 recursionProblem1 = new RecursionProblem1();
        recursionProblem1.ps1Solution();
        recursionProblem1.ps2Solution();
        recursionProblem1.ps3Solution();
    }

}
