import java.util.*;
public class Chapter5 {
  public static void main(String[] args) {
    printNumbers(5);
    GeneratingRandomNumbers();
    dice();
    dice2();
  }


  public static void printNumbers (int max) {
    for (int i = 1; i <= max; i++) {
      System.out.print(i);
      if (i < max) {
      System.out.print(",");
      }
    }
    System.out.println();
  }


  public static void GeneratingRandomNumbers () {
    Random rand = new Random();
    int n = rand.nextInt(4) + 7; // Min is 7 Max is 10
    //int n = rand.nextInt(7) + 4; Minimum value is 4 Max is 10
    System.out.println(n);
  }


  public static void dice() {
    Random rand = new Random();
    int tries = 0;
    
    int sum = 0;
    while (sum != 7) {
        // roll the dice once
        int roll1 = rand.nextInt(6) + 1;
        int roll2 = rand.nextInt(6) + 1;
        sum = roll1 + roll2;
        System.out.println(roll1 + " + " + roll2 + " = " + sum);
        tries++;
    }
    System.out.println("You won after " + tries + " tries!");
  }
  public static void dice2() {
    Random rand = new Random();
    int tries = 0;
    int sum;
    
    do {
        int roll1 = rand.nextInt(6) + 1;   // one roll
        int roll2 = rand.nextInt(6) + 1;
        sum = roll1 + roll2;
        System.out.println(roll1 + " + " + roll2 + " = " + sum);
        tries++;
    } while (sum != 7);
    System.out.println("You won after " + tries + " tries!");
  }
}