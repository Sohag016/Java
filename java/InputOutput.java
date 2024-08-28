import java.util.Scanner;

public class InputOutput {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the first number:");
    int num1 = scan.nextInt();
    System.out.println("Enter the second number:");
    int num2 = scan.nextInt();
    System.out.println("The first number is: " + num1);
    System.out.println("The second number is: " + num2);
  }
}