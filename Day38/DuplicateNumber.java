package Day38;

import java.util.HashMap;

public class DuplicateNumber {
    public static void main(String[] args) {

    }
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = -1;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                ans =  nums[i];
            }
            else {
                map.put(nums[i],1);
            }
        }
        return ans;
    }
}
