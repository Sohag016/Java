import java.util.Scanner;

public class OctalToDecimal {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter an octal number:");
    String octal = scan.nextLine();
    int decimal = Integer.parseInt(octal, 8);
    System.out.println("The decimal equivalent of the octal number is: " + decimal);
  }
}
