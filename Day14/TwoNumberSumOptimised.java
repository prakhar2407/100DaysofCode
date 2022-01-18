package Day14;

import java.util.Arrays;
import java.util.HashMap;

public class TwoNumberSumOptimised {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
//        int k = 20;
//        String bill = "Prakhar";
//        int n = bill.hashCode();
//        System.out.println(n % 7);
        TwoNumberSumOptimised tnso = new TwoNumberSumOptimised();
        System.out.println(Arrays.toString(tnso.twoSum(arr,9)));
    }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> helperMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!helperMap.containsKey(target - nums[i])) {
                helperMap.put(nums[i],i);
            }
            else {
                return new int[] {i,helperMap.get(target - nums[i])};
            }
        }
        return new int[0];
    }
}
