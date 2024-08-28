import java.util.Scanner;

public class therd {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    int num1 = inp.nextInt();
    System.out.println("Enter the second number: ");
    int num2 = inp.nextInt();
    int result = num1 + num2;
    System.out.println("The result of the subtraction is: " + result);
  }
}
