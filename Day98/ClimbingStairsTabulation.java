package Day98;

public class ClimbingStairsTabulation {
    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }

    public static int climbStairs(int n) {
        int[] arr = new int[n + 1];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                arr[i] = 1;
            } else if (i == 1) {
                arr[i] = arr[i - 1];
            } else {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }
        return arr[arr.length - 1];
    }
}
