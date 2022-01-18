package Day97;

import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[] args) {

    }
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> ans = new HashMap<>();
        for (int num : nums) {
            if (ans.containsKey(num)) {
                return true;
            }
            ans.put(num, 1);
        }
        return false;
    }
}
