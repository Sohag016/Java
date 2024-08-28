import java.util.Scanner;

public class DecimalToOctal {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a decimal number:");
    int decimal = scan.nextInt();
    String octal = Integer.toOctalString(decimal);
    System.out.println("The octal equivalent of the decimal number is: " + octal);
  }
}

    

