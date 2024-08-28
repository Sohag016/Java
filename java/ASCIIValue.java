import java.util.Scanner;

public class ASCIIValue {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter an ASCII character:");
    char asciiChar = scan.next().charAt(0);
    int asciiValue = (int) asciiChar;
    System.out.println("The ASCII value of " + asciiChar + " is " + asciiValue);
  }
}
