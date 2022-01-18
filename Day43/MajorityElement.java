package Day43;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(new MajorityElement().majorityElement(arr));
    }
//    public int majorityElement(int[] nums) {
//        HashMap<Integer, Integer> hlprMap = new HashMap<>();
//        for (int i : nums) {
//            if (hlprMap.containsKey(i)) {
//                int oldValue = hlprMap.get(i);
//                hlprMap.put(i, oldValue + 1);
//            }
//            else {
//                hlprMap.put(i,1);
//            }
//        }
//        int max = Integer.MIN_VALUE;
//        int maxNumber = Integer.MIN_VALUE;
//        for (Map.Entry<Integer, Integer> map: hlprMap.entrySet()) {
//            if (map.getValue() > max) {
//                max = map.getValue();
//                maxNumber = map.getKey();
//            }
//        }
//        return maxNumber;
//    }

    public int majorityElement(int[] nums) {
        int maxNumber = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int currentTotal = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    currentTotal += 1;
                }
            }
            if (currentTotal > max) {
                max = currentTotal;
                maxNumber = nums[i];
            }
        }
        return maxNumber;
    }


}
