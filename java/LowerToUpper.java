import java.util.Scanner;

public class LowerToUpper {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a string in lowercase:");
    String input = scan.nextLine();
    String output = input.toUpperCase();
    System.out.println("The uppercase equivalent of the input string is: " + output);
  }
}
