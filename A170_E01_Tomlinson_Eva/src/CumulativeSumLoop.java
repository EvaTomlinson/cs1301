import java.util.Scanner;

class CumulativeSumLoop {
  public static void main(String[] args){
    sumUserInputs();
  }
  public static void sumUserInputs() {
    Scanner console = new Scanner (System.in);
    int sum = 0;
    for (int i = 1; i <= 4; i++){
      System.out.print("Type a number: ");
      sum += console.nextInt();
    }
    System.out.println("The sum is: " + sum);
    console.close();
  }
}
