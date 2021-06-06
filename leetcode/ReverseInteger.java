public class ReverseInteger {

  public static void main(String[] args) {
    int x = -2147483648;
    System.out.println(x);
    System.out.println(reverse(x));
  }

  public static int reverse(int x) {
      if (x == 0)
          return x;
      
      boolean positive;
      if (x > 0)
          positive = true;
      else
          positive = false;

      long xLong = (long) x;
      String xStr = String.valueOf(positive ? xLong : -xLong);
      StringBuilder sb = new StringBuilder(xStr);
      String reversed = sb.reverse().toString();
      
      long xLongReversed = positive ? Long.valueOf(reversed) : - Long.valueOf(reversed);
      int result = 0;
      try {
        result = Math.toIntExact(xLongReversed);
      } catch (ArithmeticException e) {
        return 0;
      }
      return result;
  }
}
