package logicalquestions;

import java.math.BigInteger;

public class RecursiveSquareOfNumber {

  public static void main(String[] args) {
    // provided a start number square it unless it is calcutable
    square(new BigInteger("2"));
  }

  private static void square(BigInteger a) {
    if (!a.equals(BigInteger.ZERO)) {
      BigInteger b = a.multiply(a);
      System.out.println("square of " + a + "=" + b);
      square(b);
    }
  }
}
