package Day93;

import java.util.ArrayList;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        System.out.println(new LongestIncreasingSubsequence().lengthOfLIS(new int[] {1,2,3,4,5,1,1,1,2,3,4,5,6}));
    }

    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> hlprArr = new ArrayList<>();
        hlprArr.add(nums[0]);
        int size = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= hlprArr.get(size - 1)) {
                for (int j = 0; j < hlprArr.size(); j++) {
                    if (hlprArr.get(j) >= nums[i]) {
                        hlprArr.set(j, nums[i]);
                        break;
                    }
                }
            }
            else {
                hlprArr.add(nums[i]);
                size++;
            }
        }
        return hlprArr.size();
    }
}
