////////////////////////////////////////
// Kahee (Eva) Tomlinson              //
// CSC 1301 MW 9:30 am - 10:45 am     //
// Homework 5                         //
////////////////////////////////////////

import java.util.Scanner;

public class ICalledyou {
  public static void main(String[] args) {
    Scanner user_input = new Scanner(System.in);
    System.out.println("Please enter a number: ");
    double number1 = user_input.nextDouble();
    System.out.println("Please enter another number: ");
    double number2 = user_input.nextDouble();
    double result = product(number1, number2);
    System.out.println("The product of " + number1 + " and " + number2 + " is " + result);
    System.out.println("The greater number is " + Math.max(number1, number2));
    user_input.close();
  }

  public static double product(double a, double b) {
    return a * b;
  }
}
