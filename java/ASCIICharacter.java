import java.util.Scanner;

public class ASCIICharacter {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter an ASCII value:");
    int asciiValue = scan.nextInt();
    char asciiChar = (char) asciiValue;
    System.out.println("The ASCII character of " + asciiValue + " is " + asciiChar);
  }
}
