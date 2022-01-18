package Day96;

public class MaxSumContigousSubarray {
    public static void main(String[] args) {
        int[] arr = new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(new MaxSumContigousSubarray().maxSubArray(arr));
    }
    public int maxSubArray(final int[] A) {
        int currSum = 0;
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            currSum += A[i];
            if (currSum > sum) {
                sum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return sum;
    }
}
