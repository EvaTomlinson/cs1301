import java.util.Scanner;

public class RefVal
{
  public static void main(String[] args) {
    // byVal();
    // byRef();
    // valReassign();
    refReassign();
  }

  public static void byVal() {
    double myDucks = 3.0;
    double yourDucks = 3.0;

    System.out.println(myDucks == yourDucks);
  }

  public static void byRef() {
    Double myDucks = 3.0;
    Double yourDucks = 3.0;

    System.out.println(myDucks == yourDucks);
    System.out.println(myDucks.equals(yourDucks));
  }

  public static void valReassign() {
    double a = 1.1;
    double b = a;
    b = 2.2;

    System.out.println("val a: " + a);
    System.out.println("val b: " + b);
  }

  public static void refReassign() {
    Scanner console = new Scanner(System.in);
    System.out.print("What is your name? ");
    String name = console.next();
    if (name == "Barney") {
        System.out.println("I love you, you love me,");
        System.out.println("We're a happy family!");
    }
    System.out.println(name == "Barney");
    System.out.println(name.hashCode());
    System.out.println("Barney".hashCode());
    System.out.println("Barney".hashCode());
    console.close();

  }
}
