package Day18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ThreeNumberSum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        ThreeNumberSum tns = new ThreeNumberSum();
        System.out.println(tns.threeSum(arr));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resultantList = new ArrayList<>();
        HashMap<Integer, Integer> helperMap = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (helperMap.containsKey(-1 * (nums[i] + nums[j]))) {
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    arrayList.add(nums[i]);
                    arrayList.add(nums[j]);
                    arrayList.add(nums[helperMap.get(-1 * (nums[i] + nums[j]))]);
                    resultantList.add(arrayList);
                }
                else {
                    helperMap.put(nums[i],i);
                }
            }
        }
        return resultantList;
    }

}
