package Day46;

import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        System.out.println(new FourSum().fourSum(new int[]{2,2,2,2,2}, 8));
    }
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> finalList = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    if (nums[left] + nums[right] + nums[i] + nums[j] < target) {
                        left++;
                    }
                    else if (nums[left] + nums[right] + nums[i] + nums[j] > target) {
                        right--;
                    }
                    else {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        set.add(list);
                        left++;
                        right--;
                    }
                }
            }
        }
        for (List list: set) {
            finalList.add(list);
        }
        return finalList;
    }
}
