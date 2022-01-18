package Day97;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fib(4));
    }
    public static int fib(int n) {
        int[] arr = new int[n + 1];
        int ans = fib2(n ,arr);
        return ans;
    }

    public static int fib2(int n, int[] arr) {
        if (n == 1 || n == 0) {
            return n;
        }
        if (arr[n] != 0) {
            return arr[n];
        }
        int ans = fib2(n - 1, arr) + fib2(n - 2, arr);
        arr[n] = ans;
        return ans;
    }
}
