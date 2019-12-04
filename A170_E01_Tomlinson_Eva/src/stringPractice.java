import java.util.Scanner;
public class stringPractice {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Enter what you want to say: ");
  String words = scanner.next();
  System.out.println("The input is: " + words);
  String words1 = scanner.nextLine();
  System.out.println("The input is: " + words1);
  System.out.println("The input is: " + words + words1);
  scanner.close();
  }
}