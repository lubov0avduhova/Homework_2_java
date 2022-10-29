public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));

    }

    public static boolean isPowerOfTwo(int n) {
        {
            if (n <= 0) return false;
            else if (n == 1) return true;
            else if (n % 2 != 0) return false;

            return isPowerOfTwo(n / 2);
        }
    }
}