public class Stairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(2));
    }
    public static int climbStairs(int n) {

        if(n < 0) return 0;
        else if(n == 0) return 1;

        return climbStairs(n-1) + climbStairs(n-2);

    }
}
