import java.util.Arrays;

// import java.util.Arrays;

public class arrays {
  public static void main(String[] args) {
    // int a = 7;
    // int b = 10;
    // int temp = a;
    // a = b;
    // b = temp;

    // System.out.println(a + " " + b);

    // int [] c = {11, 42, -5, 27, 0, 89};
    // int [] d = {89, 0, 27, -5, 42, 11};

    // int[] temp = c;
    // c = d;
    // d = temp;

    // System.out.println(Arrays.toString(d));

    int[] numbers = {11, 42, -5, 27, 0, 89};
	  reverse(numbers);

  }
  public static void reverse(int[] numbers) {
    for (int i = 0; i < numbers.length / 2; i++) {
        int temp = numbers[i];
        numbers[i] = numbers[numbers.length - 1 - i];
        numbers[numbers.length - 1 - i] = temp;    
    }
    System.out.println(Arrays.toString(numbers));
}

}