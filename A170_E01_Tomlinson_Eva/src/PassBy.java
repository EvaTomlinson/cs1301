import java.util.Arrays;

public class PassBy {
  public static void main(String[] args) {
    int myAge = 30;
    int[] ourAges = { 27, 30 };
    System.out.println("main Start");
    System.out.println("main before myAge: " + myAge);
    System.out.println("main before ourAges: " + Arrays.toString(ourAges));
    byValue(myAge);
    byReference(ourAges);
    System.out.println("main after myAge: " + myAge);
    System.out.println("main after ourAges: " + Arrays.toString(ourAges));
    System.out.println("main End");
  }

  public static void byValue(int age) {
    System.out.println("byValue Start");
    System.out.println("byValue age: " + age);
    age *= 2;
    System.out.println("byValue age: " + age);
    System.out.println("byValue End");
  }

  public static void byReference(int[] ages) {
    System.out.println("byReference Start");
    System.out.println("byReference ages: " + Arrays.toString(ages));
    for (int index = 0; index < ages.length; index++) {
      ages[index] = ages[index] * -1;
    }
    System.out.println("byReference ages: " + Arrays.toString(ages));
    System.out.println("byReference End");
  }
}