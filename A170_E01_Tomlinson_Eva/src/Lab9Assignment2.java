import java.util.Scanner;

public class Lab9Assignment2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter an integer.");
    double integerFromUser = scanner.nextInt();
    double sumOfSeries = 0;
    for (double i = 1; i <= integerFromUser; i++) {
      sumOfSeries += 1/i;
      System.out.println(sumOfSeries);
    }
    scanner.close();
  }
}