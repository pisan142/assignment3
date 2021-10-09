
/**
 * Write a description of class UpArrow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main {

  public static void printStar(int number) {}

  public static void printDot(int number) {}

  public static void arrowHead(int size) {}

  public static void arrowTrunk(int size) {}

  public static void arrow(int size) {
    // we can only do odd size arrows
    assert (size % 2 == 1);
    arrowHead(size);
    arrowTrunk(size);
  }

  public static void main(String[] args) {
    arrow(9);
    arrow(15);
    arrow(31);
  }
}
