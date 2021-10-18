public class Main {

  public static void arrow(int size) {
    int dots = (size / 2);
    int stars = 1;

    if (size % 2 == 1) {
      arrowHead(size, dots, stars);
      arrowTrunk(size, dots, stars);
    }
  }
 
  public static void arrowHead(int size, int dots, int stars) {
    for (int a = 0; a < (size / 2 + 1); a++) {
      for (int b = 0; b < dots; b++) {
        System.out.print(".");
      }
      for (int j = 0; j < stars; j++) {
        System.out.print("*");
      }
      for (int b = 0; b < dots; b++) {
        System.out.print(".");
      }
      stars = stars + 2;
      dots--;
      System.out.println();
    }
  }
  
  public static void arrowTrunk(int size, int dots, int stars) {
    stars = (size - 1) / 4;
    dots = (size - stars) / 2;
    for (int a = 1; a <= size; a++) {
      for (int b = 0; b < dots; b++) {
        System.out.print(".");
      }
      for (int c = 0; c < stars; c++) {
        System.out.print("*");
      } 
      for (int b = 0; b < dots; b++) {
        System.out.print(".");
      }
      System.out.println();
    }
  }

 
  public static void main(String[] args) {
    arrow(9);
    arrow(15);
    arrow(31);
  }
}
