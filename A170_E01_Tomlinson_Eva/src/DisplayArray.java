/////////////////////////////////////////////////////////////////////////////////////////////
// DisplayArray.java                                                                       //
// Name: Kehee (Eva) Tomlinson                                                             //
// Lab time: 9:00 am Tuesday                                                               //
// Program description:                                                                    //
/////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Arrays;
import java.util.Scanner;

public class DisplayArray {

  static Scanner scanner;

  public static void main(String[] args) {
    int NUMBER_OF_INPUTS = 10;
    scanner = new Scanner(System.in);
    int[] arr1 = getUserValues(NUMBER_OF_INPUTS);
    System.out.println("Content of DisplayArray: " + Arrays.toString(arr1));
    int maxValue = getMaximumValue(arr1);
    int maxValueIndex = getMaxValueIndex(arr1);
    System.out.println("The largest value of DisplayArray is " + maxValue);
    System.out.println("It is in slot " + maxValueIndex + " of DisplayArray");
    scanner.close();
  }

  public static int[] getUserValues(int numberOfInputs) {
    int i = 0;
    int[] userValues = new int[numberOfInputs];
    while (i < numberOfInputs) {
      System.out.println("Enter a number between 1 and 100: ");
      int userValue = scanner.nextInt();
      if (userValue < 1 || userValue > 100) {
        System.out.println("Oops! Your value was not between 1 and 100!");
      } else {
        System.out.println("userValue: " + userValue);
        userValues[i] = userValue;
        i++;
      }
    }
    return userValues;
  }

  public static int getMaximumValue(int[] numbers) {
    int maxValue = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] > maxValue) {
        maxValue = numbers[i];
      }
    }
    return maxValue;
  }
  public static int getMaxValueIndex(int[] numbers) {
    int maxValue = numbers[0];
    int maxValueIndex = 0;
    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] > maxValue) {
        maxValue = numbers[i];
        maxValueIndex = i;
      }
    }
    return maxValueIndex;
  }
}
