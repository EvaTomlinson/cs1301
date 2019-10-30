import java.util.Scanner;
public class Lab9Assignment {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please, enter an integer.");
    int n = scanner.nextInt();
    int result = factorial(n);
    System.out.println("The factorial of " + n + " is " + result);    
    scanner.close();
  }
  public static int factorial(int n) {
    int result = 1;
    for (int i = 1; i <= n; i++) {
      result = result * i;
    }
    return result;
  }
}
