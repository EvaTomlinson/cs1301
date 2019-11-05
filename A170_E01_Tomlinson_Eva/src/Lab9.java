// public class Lab9 {
//   public static void main(String[] args) {
    
//   for (int line = 1; line <= 5; line++) {
//     for (int j = 1; j <= (-1 * line + 5); j++) {
//       System.out.print(".");
//     }
//     System.out.print(line);
//   for (int j = 1; j <= (line - 1); j++) {
//     System.out.print(".");
//   }
//   System.out.println();
//     }
//   }
// }

public class Lab9 {
  public static void main(String[] args) {
    
  for (int line = 1; line <= 5; line++) {
    for (int j = 1; j <= (-1 * line + 5); j++) {
      System.out.print(".");
    }
  for (int j = 1; j <= line; j++) {
    System.out.print(line);
  }
  System.out.println();
    }
}
}