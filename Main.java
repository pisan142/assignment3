/**
 * The purpose of this class is 
 * to output arrows of different sizes.
 *
 * @author Abraham Portugal
 * @version 10/11/21
 */
public class Main {
  /**
   * The main method contains 5 calls each to the arrow
   * method which prints out an arrow of desired size.
   */
  public static void main( String[] args ) {
    arrow(5);
    arrow(7);
    arrow(9);
    arrow(11);
    arrow(15);
  }
  
  /**
   * The arrow method makes to calls, one to the arrowHead
   * method which prints the head of the arrow and the other
   * to the arrowTrunk method which prints the stem/trunk
   * of the arrow.
   */
  public static void arrow( int size ) {
    arrowHead(size);
    arrowTrunk(size);
  }
  
  /**
   * I used an if-else statement in this method because I
   * realized that the intructions to print an odd number
   * and even number arrow had to be different (however
   * the for loops work the same, they just have different
   * conditions). The moost outer loop is so the correct
   * arrow head size is printed, the 3 inner loops are for
   * printing the 3 triangles that form the arrow head.
   */
  public static void arrowHead( int headSize ) {
    if (headSize % 2 == 0) { //prints head for even numbered arrow
      for (int i = 0; i < headSize; i++) {
        for (int j = headSize - i; j > 1; j--) {
          System.out.print(".");
        }
        for (int j = 0; j <= i; j++ ) {
          System.out.print("* ");
        }
        for (int k = headSize - i; k > 1; k--) {
          System.out.print(".");
        }
        System.out.println();
      }
    } else if (headSize % 2 == 1) { //prints head for odd numbered arrow
      for (int i = 0; i < headSize; i = i + 2) {
        for (int j = headSize - i; j > 1; j = j - 2) {
          System.out.print(".");
        }
        for (int j = 0; j <= i; j++ ) {
          System.out.print("*");
        }
        for (int k = headSize - i; k > 1; k = k - 2) {
          System.out.print(".");  
        }
        System.out.println();
      }
    }
  }
  
  /**
   * I wasn't able to figure out a formula for the pattern
   * the dots in the arrow trunk were following so I used
   * 3 different if statments instead. Similar to the 
   * arrowHead method, the outer loop makes sure that the
   * desired arrow trunk length is printed while the inner 
   * 3 print the dots and stars the trunk is composed of.
   */
  public static void arrowTrunk( int trunkSize ) {
    int width = trunkSize / 4;
    if (trunkSize >= 15) {
      for (int a = 0; a < trunkSize; a++) {
        for (int b = 0; b <= width + 2; b++) {
          System.out.print(".");
        }
        for (int c = 0; c < width; c++) {
          System.out.print("*");
        }
        for (int d = 0; d <= width + 2; d++) {
          System.out.print(".");
        }
        System.out.println();
      } 
    }
    if (trunkSize <= 5) {
      for (int a = 0; a < trunkSize; a++) {
        for (int b = 0; b < 2; b++) {
          System.out.print(".");
        }
        for (int c = 0; c < width; c++) {
          System.out.print("*");
        }
        for (int d = 0; d < 2; d++) {
          System.out.print(".");
        }
        System.out.println();
      }
    }
    if (trunkSize > 5 && trunkSize <15) {
      for (int a = 0; a < trunkSize; a++) {
        for (int b = 0; b < 3; b++) {
          System.out.print(".");
        }
        for (int c = 0; c < width; c++) {
          System.out.print("*");
        }
        for (int d = 0; d < 3; d++) {
          System.out.print(".");
        }
        System.out.println();
      }
    }
  }
}
