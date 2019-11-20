import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class quiz3 {

  static HashMap<String, HashSet<Boolean>> results = new HashMap<>();

  public static void recordResult(String key, Boolean value) {
    HashSet<Boolean> result = results.get(key);
    if (result == null) {
      results.put(key, new HashSet<>());
    }
    result = results.get(key);

    result.add(value);
  }

  public static void main(String[] args) {
    // whileLoop();
    // doWhileLoop();
    // forLoop();
    // ifElseMystery(5, 5);
    // ifElseMystery(18, 4);
    // ifElseMystery(3, 6);
    // whileMystery(7, 5);
    // whileMystery(20, 4);
    // whileMystery(40, 10);
    // System.out.println(sum(5));




    Random random = new Random();
    for (int m = 1; m <= 100; m++) {
      for (int n = 1; n <= 10000; n++) {
        stuff(random, m);
      }
    }

    int m = 10;
    for (int n = 1; n <= 1000; n++) {
      stuff(random, m);
    }

    System.out.println(results);
  }
  public static void whileLoop() {
    int  i = 2;
    while (i <= 100) {
      System.out.println(i);
      i += 2;
    }
  }
  public static void doWhileLoop() {
    int i = 2;
    do {
      System.out.println(i);
      i += 2;
    } while (i <= 100);
  }
  public static void forLoop() {
    for (int i = 2; i <= 100; i += 2) {
      System.out.println(i);
    }
  }
  public static void ifElseMystery(int x, int y) {
    if (x == y) {
      x = x + 11;
    } else if (x > 2 * y) {
      x = 0;
    } if (x == 0 || y > x) {
      x = x + 2;
      y = y + 2;
    }
    System.out.println(x + " " + y);
  } 
  public static void whileMystery(int x, int y) {
    while (x > 0 && y > 0) {
      x = x - y;
      y--;
      System.out.print(x + " ");
    } 
    System.out.println(y);
  }
  public static int sum(int n) {
    int sum = 0;
    for (int i = 0; i <= n; i ++) {
      sum += i;
    }
    return sum;
  }
  public static int stuff(Random r, int m) {
    int c = 0;
    int t = 0;
    int d = r.nextInt(m);

    // Point A
    recordResult("A:c>3", c>3);
    recordResult("A:d<=m", d<=m);
    recordResult("A:c==0", c==0);

    while (c <= 3) {
      // Point B
      recordResult("B:c>3", c>3);
      recordResult("B:d<=m", d<=m);
      recordResult("B:c==0", c==0);
      d = r.nextInt(6) + 1;
      if (d <= m) {
        c++;
        // Point C
        recordResult("C:c>3", c>3);
        recordResult("C:d<=m", d<=m);
        recordResult("C:c==0", c==0);
      } else {
        c = 0;
        // Point D
        recordResult("D:c>3", c>3);
        recordResult("D:d<=m", d<=m);
        recordResult("D:c==0", c==0);
      } 
      t++;
    }
    // Point E
    recordResult("E:c>3", c>3);
    recordResult("E:d<=m", d<=m);
    recordResult("E:c==0", c==0);
    return t;
  }
}


