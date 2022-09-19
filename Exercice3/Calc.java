import java.util.Scanner; 

public class Calc { 
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int value = scanner.nextInt();
    int value2 = scanner.nextInt();
    System.out.println("La somme : " + (value + value2));
    System.out.println("La différence : " + (value - value2));
    System.out.println("La multiplication : " + (value * value2));
    System.out.println("Le quotient : " + (value / value2));
    System.out.println("La différence : " + (value % value2));
  }
}