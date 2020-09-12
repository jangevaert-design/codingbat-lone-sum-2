public class LoneSum2 {
  public int loneSum(int a, int b, int c) {
    if (a == b && a == c) {
      return 0;
    } else if (a == b && a != c) {
      return c;
    } else if (a != b && a == c) {
      return b;
    } else if (a != b && b == c) {
      return a;
    } else {
      return a + b + c;
    }
  }
}
