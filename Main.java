
/**
 * Write a description of class UpArrow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main {

  /**
   * This method prints out number of *
   * @param number number of stars needed to print out
   */
  public static void printStar(int number) {}

 /**
  * This method prints out number of .
  * @param number number of dot needed to print out
  */
  public static void printDot(int number) {}

  /**
   * This method prints out the head of the arrow. 
   * This is an example of head of arrow with size 7
    ...*...
    ..***..
    .*****.
    *******
   * @param size the width of the arrow
   */
  public static void arrowHead(int size) {}

  /**
   * This method prints out the trunk of the arrow.
   * This is an example of trunk of arrow with size 7
    ...*...
    ...*...
    ...*...
    ...*...
    ...*...
    ...*...
    ...*...
   * @param size the width of the arrow
   */
  public static void arrowTrunk(int size) {}

  /**
   * This method prints out the whole of the arrow like:
   * This is an example of the arrow with size 7
    ...*...
    ..***..
    .*****.
    *******
    ...*...
    ...*...
    ...*...
    ...*...
    ...*...
    ...*...
    ...*...
   * @param size: the width of the arrow
   */
  public static void arrow(int size) {
    // we can only do odd size arrows
    assert (size % 2 == 1);
    arrowHead(size);
    arrowTrunk(size);
  }

  /**
   * This is the main method; you can modify it for testing
   */
  public static void main(String[] args) {
    arrow(9);
    arrow(15);
    arrow(31);
  }
}
