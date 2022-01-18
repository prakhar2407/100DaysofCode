package Day94.OnlineAssessment;

import java.util.Arrays;
import java.util.HashMap;

public class TwoElementSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new TwoElementSum().twoSum(new int[] {1,2,5}, 7)));
    }
    public int[] twoSum(int[] nums, int target) {
        int ans1 = -1;
        int ans2 = -1;
        HashMap<Integer, Integer> freMap = new HashMap<>();
        freMap.put(nums[0],0);
        for (int i = 1; i < nums.length; i++) {
            if (freMap.containsKey(target - nums[i])) {
                ans1 = freMap.get(target - nums[i]);
                ans2 = i;
                break;
            }
            else {
                freMap.put(nums[i], i);
            }
        }
        return new int[] {ans1, ans2};
     }
}
