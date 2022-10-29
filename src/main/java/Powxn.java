public class Powxn {
    public static void main(String[] args) {
        System.out.println(myPow(34.00515, -3));
        System.out.println(myPow(2.00000, -2));
    }

    public static double myPow(double x, int n) {
        if (n == 1) return x;

        else if (n < 0) {
            n = -n;
            x = 1 / x;
        }

        if (n % 2 == 0) return myPow((x * x), n / 2);
        else return x * myPow((x * x), n / 2);

    }

}
