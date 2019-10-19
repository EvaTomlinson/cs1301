import java.util.*;

class CumulativeSumLoop {
  public static void main(String[] args){
    // int sum = 0;
    // for (int i = 1; i <= 1000; i++) {
    //   sum = sum + i;
    // }
    // System.out.println("The sume is: " + sum);
  }
  public static void cumlSum() {
    Scanner console = new Scanner (System.in);
    int sum = 0;
    for (int i = 1; i <= 100; i++){
      System.out.print("Type a number: ");
      sum = sum + console.nextInt();
    }
    System.out.println("The sume is: " + sum);
    console.close();
  }
}