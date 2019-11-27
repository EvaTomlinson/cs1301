/////////////////////////////////////////////////////////////////////////////////////////////
// PrintOutMyArray.java                                                                       //
// Name: Kehee (Eva) Tomlinson                                                             //
// Lab time: 9:00 am Tuesday                                                               //
// Program description:                                                                    //
/////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Arrays;
import java.util.Scanner;
public class PrintOutMyArray {
  static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    
    int numberOfItems = getNumberOfItems();
    int[] items =  getTheValueOfAllItems(numberOfItems);
    printValues(items);
    scanner.close();
  }
  
  public static int getNumberOfItems() {
    System.out.println("Enter the number of items: ");
    int numberOfItems = scanner.nextInt();
    scanner.nextLine();
    return numberOfItems;
  }
  
  public static int[] getTheValueOfAllItems(int numberOfItems) {
    System.out.println("Enter the value of all items: ");
    String allItemsString = scanner.nextLine();
    String[] itemsString = allItemsString.split(" ");
    int[] items = new int[numberOfItems];
    for (int i = 0; i < itemsString.length; i++) {
      items[i] = Integer.parseInt(itemsString[i]);
    }
    return items;
  }
  public static void printValues(int[] items) {
  System.out.println("The values are: " + Arrays.toString(items));
  }
}
