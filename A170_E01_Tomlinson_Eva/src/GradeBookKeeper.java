/////////////////////////////////////////////////////////////////////////////////////////////
// GradeBookKeeper.java                                                                       //
// Name: Kehee (Eva) Tomlinson                                                             //
// Lab time: 9:00 am Tuesday                                                               //
// Program description:                                                                    //
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
public class GradeBookKeeper {
  static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    int numStudent = getNumberOfStudents();
    int [] gradesForStudents = getStuentsGrades(numStudent);
    double average = getAverage(gradesForStudents, numStudent);
    System.out.printf("The average is %.2f\n", average);
    int minimum = getMinimum(gradesForStudents);
    System.out.println("The minimum is: " + minimum);
    int maximum = getMaximum(gradesForStudents);
    System.out.println("The maximum is: " + maximum);

    scanner.close();
  }
  public static int getNumberOfStudents() {
    System.out.println("Enter how many students are there: ");
    int numStudent = scanner.nextInt();
    scanner.nextLine();
    return numStudent;
  }
  public static int[] getStuentsGrades(int numStudent) {
    int [] grades = new int[numStudent];
    for (int i = 0;  i < numStudent; i++) {
      System.out.println("Enter the grade for student " + (i + 1) + ": ");
      int studentGrade = scanner.nextInt();
      grades[i] = studentGrade;
        }
        return grades;
  }
  public static double getAverage(int[] grades, int numStudent) {
    int sumOfGrades = 0;
    for (int k = 0; k < grades.length; k++) {
      sumOfGrades += grades[k];
    }
    double average = (double) sumOfGrades / (double) numStudent;
    return average;
  }
  public static int getMaximum (int[] grades) {
    int maxNum = grades[0];
    for (int j = 1; j < grades.length; j++) {
      if(grades[j] > maxNum) {
        maxNum += grades[j];
      }
    }
    return maxNum;
  }
  public static int getMinimum (int[] grades) {
    int minNum = grades[0];
    for (int n = 1; n < grades.length; n++) {
      if(grades[n] < minNum) {
        minNum = grades[n];
      }
    }
    return minNum;
  }
}