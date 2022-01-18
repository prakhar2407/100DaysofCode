package Day97;

public class TribonacciNumber {
    public static void main(String[] args) {
        System.out.println(tribonacci(25));
    }
    public static int tribonacci(int n) {
        int[] arr = new int[n + 1];
        return tribonacci2(n, arr);
    }
    public static int tribonacci2(int n, int[] arr) {
        if (n == 0) {
            return n;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        if (arr[n] != 0) {
            return arr[n];
        }
        int ans = tribonacci2(n - 1, arr) + tribonacci2(n - 2, arr) + tribonacci2(n - 3, arr);
        arr[n] = ans;
        return ans;
    }
}
