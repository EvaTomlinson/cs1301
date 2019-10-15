import java.util.Scanner;

public class Program2 {
  public static void main(String[] args) {
    Scanner user_input = new Scanner(System.in);

    String studentName;
    System.out.println("Please enter your name: ");
    studentName = user_input.next();
    System.out.println("Please enter your three grades");
    double number1 = user_input.nextDouble();
    double number2 = user_input.nextDouble();
    double number3 = user_input.nextDouble();
    double average = (number1 + number2 + number3) / 3;
    System.out.println("Your name is: " + studentName);
    System.out.println("Your average grade of three subject is: " + average);

    user_input.close();
  }
}