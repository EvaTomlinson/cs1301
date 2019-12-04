import java.util.Scanner;
public class Lab13 {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int numOfSalesPeople = getNumberPeople();
    final int SALESPEOPLE = numOfSalesPeople;  	
    int[] sales = new int[SALESPEOPLE];  	

    getSales(sales);
    int sum = getSum(sales);
    double average = getAverage(sales, numOfSalesPeople);
    System.out.println("Total sales: " + sum);
    System.out.println("The average is: " + average);
    int max = getMaximum(sales);
    int min = getMinimum(sales);
    System.out.println("Sales person " + getMaximumIndex(sales)  + " had the hightes sale with $" + max);
    System.out.println("Sales person " + getMinimumIndex(sales)  + " had the lowest sale with $" + min);

    scan.close();
  }
  public static void getSales (int[] sales) {
    for (int i = 0; i < sales.length; i++) { 
      System.out.print("Enter sales for salesperson " + (i + 1) + ": ");  	 	
      sales[i] = scan.nextInt(); 
    } 
    System.out.println("Salesperson   Sales");  	
    System.out.println("--------------------"); 
  }
  public static int getSum (int [] sales) { 
    int sum = 0;
    for (int i = 0; i < sales.length; i++) { 
      sum += sales[i];
    }
    return sum;
  }
  public static double getAverage(int [] sales, int numOfSalesPeople) {
    int sum = 0;
    for (int i = 0; i < sales.length; i++) { 
      System.out.println("     " + (i + 1) + "         " + sales[i]);
      sum += sales[i];
    }
    double average = (double) sum / (double) numOfSalesPeople;
    return average;
  }
  public static int getNumberPeople() {
    System.out.println("Enter the number of sales people: ");
    int numOfSalesPeople = scan.nextInt();
    scan.nextLine();
    return numOfSalesPeople;
  }
  public static int getMaximumIndex (int [] sales) {
    int max = sales[0];
    int maxIndex = 0;
    for (int i = 1; i < sales.length; i++) {
      if(sales[i] > max) {
        max = sales[i];
        maxIndex = i + 1;
      }
    }
    return maxIndex;
  }
  public static int getMaximum (int [] sales) {
    int max = sales[0];
    for (int i = 1; i < sales.length; i++) {
      if(sales[i] > max) {
        max = sales[i];
      }
    }
    return max;
  }
  public static int getMinimum (int [] sales) {
    int min = sales[0];
    for (int k = 1; k < sales.length; k++) {
      if(sales[k] < min) {
        min = sales[k];
      }
    }
    return min;
  }
  public static int getMinimumIndex (int [] sales) {
    int min = sales[0];
    int minIndex = 0;
    for (int k = 1; k < sales.length; k++) {
      if(sales[k] < min) {
        minIndex = k + 1;
      }
    }
    return minIndex;
  }
}