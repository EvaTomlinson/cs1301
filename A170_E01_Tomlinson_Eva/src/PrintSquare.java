import java.util.*;

public class PrintSquare {
  public static void main(String[] args) {
    Scanner user_input = new Scanner(System.in);
    System.out.println("Please type a number: ");
    int num1 = user_input.nextInt();
    int result = product(num1, num1);
    System.out.println("The square of that number is: " + result);

    user_input.close();
  }
  public static int product(int a, int b) {
    return a * a;
  }
}