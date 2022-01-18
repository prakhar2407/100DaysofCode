package Day73;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] arr = {0,0,0};
        System.out.println(threeSumClosest(arr,1));
    }
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = target;
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int currSum = nums[i] + nums[j] + nums[k];
                int currDiff = Math.abs(currSum - target);
                if (currDiff < diff) {
                    diff = currDiff;
                    closestSum = currSum;
                }
                if (currSum == target) {
                    return currSum;
                }
                else if (currSum < target) {
                    j++;
                }
                else {
                    k--;
                }
            }
        }
        return closestSum;
    }
}
