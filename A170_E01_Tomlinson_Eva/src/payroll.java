////////////////////////////////////////
// Kahee (Eva) Tomlinson              //
// CSC 1301 MW 9:30 am - 10:45 am     //
// Homework 5                         //
////////////////////////////////////////

import java.util.Scanner;

public class payroll {
  public static void main(String[] args) {
    Scanner user_input = new Scanner(System.in);

    String employeename;
    System.out.println("Enter your name: ");
    employeename = user_input.next();
    System.out.println("Number of hours worked: ");
    double numberHoursworked = user_input.nextDouble();
    System.out.println("Hourly rate of pay: ");
    double hourlyRateOfPay = user_input.nextDouble();
    System.out.println("Federal tax rate: ");
    double federaltaxrate = user_input.nextDouble();
    double grosspay = numberHoursworked * hourlyRateOfPay;
    double netPay = grosspay - federaltaxrate;

    System.out.println("Employee's name:        " + employeename);
    System.out.println("Number of hours worked: " + numberHoursworked);
    System.out.println("Hourly rate of pay:     " + hourlyRateOfPay);
    System.out.println("Federal tax rate:       " + federaltaxrate);
    System.out.println("Gross pay:              " + Double.toString(grosspay));
    System.out.println("Net pay:                " + Double.toString(netPay));
    
    user_input.close();
  }
}
