package Da68;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }
    public static int climbStairs(int n) {
        int[] arr = new int[n + 1];
        return climbStairs2(n,arr);
    }

    public static int climbStairs2(int n, int[] arr) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (arr[n] != 0) {
            return arr[n];
        }
        arr[n] = climbStairs2(n - 1, arr) + climbStairs2(n - 2, arr);
        return arr[n];
    }
}
