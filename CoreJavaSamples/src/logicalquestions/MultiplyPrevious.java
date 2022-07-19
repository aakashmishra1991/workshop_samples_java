package logicalquestions;

public class MultiplyPrevious {

  public static void main(String[] args) {
    //
    answer(1, 2);
   // answer2(1,2);
  }

  private static void answer(int a, int b) {
    if(a==1){
      System.out.print(1);
    }
    if (b <= 100) {
      System.out.print(","+b);
      answer(b, b*a);
    }
  }

  private static void answer2(int a, int b) {
    int result = a * b;
    if (a == 1 && b == 2) {
      System.out.print("1,2");
    }
    if (result < 100) {
      System.out.print("," + result);
      answer2(b, result);
    } else {
      return;
    }
  }
}
