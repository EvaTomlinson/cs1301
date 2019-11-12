
import java.util.Scanner;
public class Lab11{
  public static void main(String[] args) {
    Scanner user_input = new Scanner(System.in);

    System.out.println("Enter your first name and last name:");

    String yourName = user_input.nextLine();

    String formattedName = changeNameFormat(yourName);
    System.out.println("Your name for our system will be " + formattedName + ".");

    user_input.close();
  }
  
  public static String changeNameFormat(String yourName) {
    int spaceIndex = yourName.indexOf(" ");
    String firstName = yourName.substring(0, spaceIndex);
    String lastName = yourName.substring(spaceIndex + 1);
    String formattedName = lastName + ", " + firstName;
    return formattedName;
  }
}