////////////////////////////////////////
// Kahee (Eva) Tomlinson              //
// CSC 1301 MW 9:30 am - 10:45 am     //
// Homework 5                         //
////////////////////////////////////////


public class NumberGrid {
  public static void main(String[] args) {
    printGrid(4, 6);
}

  public static void printGrid(int rows, int columns) {
    for (int currentRow = 1; currentRow <= rows; currentRow++) {
      // System.out.println("currentRow: " + currentRow);
      for (int currentColumn = 1; currentColumn <= columns; currentColumn++) {
        // System.out.println("\tcurrentColumn: " + currentColumn);
        int cellValue = (currentColumn - 1) * rows + currentRow;
        System.out.print(cellValue);
        System.out.print(" ");
      }
      System.out.print("\n");
    }
  }
}


  // public static void printGrid(int rows, int columns) {
  //   for (int currentColumn = 1; currentColumn <= columns; currentColumn++) {
  //     System.out.println("\tcurrentColumn: " + currentColumn);
  //     for (int currentRow = 1; currentRow <= rows; currentRow++) {
  //       System.out.println("currentRow: " + currentRow);
  //     }
  //   }
  // }