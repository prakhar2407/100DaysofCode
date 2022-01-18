package Day35;

import java.util.Arrays;
import java.util.List;

public class SmallestDifference {
    public static void main(String[] args) {
        SmallestDifference sd = new SmallestDifference();
        int[] arr1 = {-1, 3, 5, 10, 20, 28};
        int[] arr2 = {15, 17, 26, 134, 135};
        System.out.println(sd.smallestDifference(arr2, arr1));
    }
//    public List<List<Integer>> fourSum(int[] nums, int target) {
//
//    }

    public int smallestDifference(int[] A, int[] B) {
        // write your code here
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        int j = 0;
        int diff = Integer.MAX_VALUE;
        while (i < A.length && j < B.length) {
            int currDiff = Math.abs(A[i] - B[j]);
            if (currDiff < diff) {
                diff = currDiff;
            }
            if (A[i] < B[j]) {
                i++;

            } else if (A[i] > B[j]) {
                j++;

            } else {
                return 0;
            }
        }
        return diff;
    }
}
