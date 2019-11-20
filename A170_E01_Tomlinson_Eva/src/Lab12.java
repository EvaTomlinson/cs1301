import java.util.Scanner;
import java.util.Arrays;

public class Lab12 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int sampleArray[] = { 1, 2, 3, 4, 5, 6 };

    System.out.println("Enter the value(s) to be inserted: ");
    String insertedValues = scanner.nextLine();
    // String insertedValues = "999 1010";

    System.out.println("Enter the position where you want to insert the value: ");
    int insertionIndex = scanner.nextInt();
    // int insertionIndex = 2;

    int numberOfValues = insertedValues.split(" ").length;
    int insertionValue1 = Integer.parseInt(insertedValues.split(" ")[0]);

    int insertionValue2 = 0;
    if (numberOfValues == 2) {
      insertionValue2 = Integer.parseInt(insertedValues.split(" ")[1]);
    }

    // making a longer copy
    int longerCopy[] = Arrays.copyOf(sampleArray, sampleArray.length + numberOfValues);

    // shift elements by 1
    for (int i = longerCopy.length - 1; i >= insertionIndex + numberOfValues; i--) {
      // System.out.println("i: " + i);
      longerCopy[i] = longerCopy[i - numberOfValues];
    }
    System.out.println("longerCopy: " + Arrays.toString(longerCopy));

    // insert value from users
    longerCopy[insertionIndex] = insertionValue1;
    if (numberOfValues == 2) {
      longerCopy[insertionIndex + 1] = insertionValue2;
    }
    System.out.println("longerCopy: " + Arrays.toString(longerCopy));

    scanner.close();
  }
}
