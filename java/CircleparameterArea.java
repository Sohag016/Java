import java.util.Scanner;

public class CircleparameterArea {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the radius of the circle:");
    double radius = scan.nextDouble();
    double perimeter = 2 * Math.PI * radius;
    double area = Math.PI * radius * radius;
    System.out.println("The perimeter of the circle is " + perimeter);
    System.out.println("The area of the circle is " + area);
  }
}
