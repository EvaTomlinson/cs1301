
public class ForLoopPractice {
  public static void main(String[] args) {
  // GpaForLoop();
  // Lab10();
  // Forloop1();
  // Forloop2();
  Forloop3();
  }
    
  public static void GpaForLoop() {
    for (int i = 1; i <= 3; i++) {
      for (int j = 1; j <= 10; j++) {
        // System.out.printf("%4d", (i * j));
        System.out.printf("%-4d", (i * j));
        // System.out.printf("%4f", (i * j));
      }
      System.out.println();   // to end the line
    }    
  	double gpa = 3.253764;
	  System.out.printf("your GPA is %.1f\n", gpa);
    System.out.printf("more precisely: '%8.3f'\n", gpa);
  }

  public static void Lab10() {
    for (int i = 0; i <= 5; i++) {
      //System.out.println(i);
      for (int j = 0; j <= 5; j++) {
        System.out.print("(" + i + "," + j + ") ");
      }
      System.out.println();
      }
    }
  
  public static void Forloop1() {
    for (int i = 1; i <= 4; i++) {
      System.out.print(" ");
      for (int j = 1; j <= 10; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void Forloop2() {
    for (int i = 1; i <= 5; i++) {
      for(int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void Forloop3() {
    for (int row = 1; row <= 5; row++) {
      for (int j = 1; j <= 5-row; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= row; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}


