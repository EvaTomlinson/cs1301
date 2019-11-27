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
    
    int numItems = getNumberOfItems();
    int[] items =  getTheValueOfAllItems(numItems);
    printValues(items);
    scanner.close();
  }
  
  public static int getNumberOfItems() {
    System.out.println("Enter the number of items: ");
    int numItems = scanner.nextInt();
    scanner.nextLine();
    return numItems;
  }
  
  public static int[] getTheValueOfAllItems(int numItems) {
    System.out.println("Enter the value of all items: ");
    String allItemsString = scanner.nextLine();
    String[] itemsString = allItemsString.split(" ");
    int[] items = new int[numItems];
    for (int i = 0; i < itemsString.length; i++) {
      items[i] = Integer.parseInt(itemsString[i]);
    }
    return items;
  }
  public static void printValues(int[] items) {
  System.out.println("The values are: " + Arrays.toString(items));
  }
}
