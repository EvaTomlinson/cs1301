////////////////////////////////////////
// Kahee (Eva) Tomlinson              //
// CSC 1301 MW 9:30 am - 10:45 am     //
// Homework 6                         //
////////////////////////////////////////

import java.util.Scanner;

public class payroll2 {
  final static Scanner user_input = new Scanner(System.in);    
  public static void main(String[] args) {
    String yourName = names();
    Double numberOfHoursWorked = hours();
    Double hourRatePay = hourlyRatePay();
    Double federalTaxRates = federalTaxRate();
    Double grossPay = numberOfHoursWorked * hourRatePay;
    Double taxDeducted = (federalTaxRates/100.) * (grossPay);
    Double netPay = grossPay - taxDeducted;

    System.out.println("Employee's name:        " + yourName);
    System.out.println("Number of hours worked: " + numberOfHoursWorked);
    System.out.println("Hourly rate of pay:     " + hourRatePay);
    System.out.println("Federal tax rate:       " + federalTaxRates);
    System.out.println("Tax deducted:           " + taxDeducted);
    System.out.println("Gross pay:              " + Double.toString(grossPay));
    System.out.println("Net pay:                " + Double.toString(netPay));
    
    user_input.close();
  }

  public static String names() {
    System.out.println("Enter your name: ");
    String employeename = user_input.next();
    return employeename;
  }

  public static Double hours() {
    System.out.println("Number of hours worked: ");
    double numberHoursworked = user_input.nextDouble();
    return numberHoursworked;
  }
  public static Double hourlyRatePay() {
    System.out.println("Hourly rate of pay: ");
    double hourlyRateOfPay = user_input.nextDouble();
    return hourlyRateOfPay;
  }
  public static Double federalTaxRate() {
    System.out.println("Federal tax rate: ");
    double federaltaxrate = user_input.nextDouble();
    return federaltaxrate;
  }
}
