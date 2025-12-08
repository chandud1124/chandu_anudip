package assignment;
public
class FirstPattern {
  public static void main(String[] args) {
    int heightTop = 3;
    int width = 7;

    for (int i = 0; i < heightTop; i++) {
      for (int j = 0; j < width / 2 - i; j++) {
        System.out.print(" ");
      }
      System.out.print("*");

      if (i > 0) {
        for (int j = 0; j < 2 * i - 1; j++) {
          System.out.print(" ");
        }
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = 0; i < width; i++) {
      System.out.print("*");
    }
    System.out.println();

    int hollowHeight = 3;

    for (int i = 0; i < hollowHeight; i++) {
      System.out.print(" ");
      System.out.print("*");

      for (int j = 0; j < width - 4; j++) {
        System.out.print(" ");
      }
      System.out.println("*");
    }
    System.out.print(" ");

    for (int i = 0; i < width - 2; i++) {
      System.out.print("*");
    }
    System.out.println();
  }
}