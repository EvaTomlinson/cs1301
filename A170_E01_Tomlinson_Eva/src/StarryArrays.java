/////////////////////////////////////////////////////////////////////////////////////////////
// StarryArrays.java                                                                       //
// Name: Kehee (Eva) Tomlinson                                                             //
// Lab time: 9:00 am Tuesday                                                               //
// Program description:                                                                    //
/////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
public class StarryArrays {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int numItems = getNumberOfItems();
    int[] userItems =  getTheValueOfAllItems(numItems);
    printContentsOfTheArray(numItems, userItems);

    scanner.close();

  }
  public static int getNumberOfItems() {
    System.out.println("Enter the number of items: ");
    int numItems = scanner.nextInt();
    scanner.nextLine();
    return numItems;
  }
  
  public static int[] getTheValueOfAllItems(int numItems) {
    System.out.println("Enter the value of all items(separated by space): ");
    String allItemsString = scanner.nextLine();
    String[] itemsString = allItemsString.split(" ");
    int[] items = new int[numItems];
    for (int i = 0; i < itemsString.length; i++) {
      items[i] = Integer.parseInt(itemsString[i]);
    }
    return items;
  }
  public static void printContentsOfTheArray(int numItems, int[] userItems) {
    for (int index = 0; index < numItems; index++) {
      String line = "";
      line += index;
      line += ": ";
      for (int i = 0; i < userItems[index]; i++) {
        line += "*";
      }
      line += "(" + userItems[index] + ")";
      System.out.println(line);
    }
  }
}