public class ScratchPad {
    public static void main(String[] args) {
        // for (int i = 3; i <= 30; i++) {
        //     System.out.println(i + " is prime.");
        //     if (isPrime(i)) {
        //         System.out.println(i + " is prime.");
        //     }
        // }
    }



    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (isDivisor(n, i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDivisor(int dividend, int possibleDivisor) {
        return dividend % possibleDivisor == 0;
    }
}
