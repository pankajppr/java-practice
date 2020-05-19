package ExceptionHandlig;

public class TestError {

  public static void main(String[] args) {
    // insert code here
    try {
      new TestError().go();
      // throw new OutOfMemoryError();
    } catch (Error e) {

      e.printStackTrace();
    }
  }

  void go() {
    go();
  }

}
