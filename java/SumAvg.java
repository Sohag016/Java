import java.util.Scanner;

public class SumAvg {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the first number:");
    int num1 = scan.nextInt();
    System.out.println("Enter the second number:");
    int num2 = scan.nextInt();
    int sum = num1 + num2;
    double avg = (double) sum / 2;
    System.out.println("The sum of the two numbers is " + sum);
    System.out.println("The average of the two numbers is " + avg);
  }
}
