public class PointTest {
  public static void main(String[] args) {
    int entier1 = Integer.parseInt(args[0]);
    int entier2 = Integer.parseInt(args[1]);
    System.out.println("x=" + entier1 + ", y=" + entier2);
    var point = new Point(entier1, entier2);
    System.out.println(point);
    System.out.println("dist = " + point.distance(point));
  }
}