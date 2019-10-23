////////////////////////////////////////
// Kahee (Eva) Tomlinson              //
// CSC 1301 MW 9:30 am - 10:45 am     //
// Homework 6                         //
////////////////////////////////////////
import java.util.Scanner;

public class GradeReport{
  final static int INVALID_GRADE = -1;
  final static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    while (true) {
      int grade = getGradeFromUser();
      if (grade != INVALID_GRADE) {
        System.out.println(convertGradeToReport(grade));
      }
      boolean userWantsToCountinue = checkIfUserWantsToContinue();
      if (!userWantsToCountinue) {
        break;
      }
    }
    scanner.close();
  }

  public static boolean checkIfUserWantsToContinue() {
    System.out.println("Do you want to continue? (yes/no)");
    String continuationResponse = scanner.next();

    return continuationResponse.equalsIgnoreCase("yes");

    // if (!continuationResponse.equalsIgnoreCase("yes")) {
    //   return false;
    // } else {
    //   return true;
    // }
  }

  public static int getGradeFromUser() {
    int grade = 0;
    int attempts = 1;
    while (attempts <= 3) {
      System.out.println("Please enter a grade:");
      grade = scanner.nextInt();
      attempts++; 
      if (grade < 50 || grade > 100) {
        System.out.println("Please enter an interger between 50 and 100.");
        grade = INVALID_GRADE;
      } else {
        break;
      }
    }
    return grade;
  }

  public static String convertGradeToReport(int grade) {
    if (grade == 100) {
      return "Perfect Score!";
    } else if (grade >= 90) {
      return "Well above average! Excellent!";
    } else if (grade >= 80) {
      return "Above average! Nice job!";
    } else if (grade >= 70) {
      return "Average.";
    } else if (grade >= 60) {
      return "Below average. See instructor.";
    } else {
      return "Not passing.";
    }
  }
}
