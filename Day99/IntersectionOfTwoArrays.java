package Day99;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = new int[] {4,9,5};
        int[] arr2 = new int[] {9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(arr1, arr2)));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (freqMap.containsKey(nums1[i])) {
                int oldValue = freqMap.get(nums1[i]);
                freqMap.put(nums1[i], oldValue + 1);
            }
            else {
                freqMap.put(nums1[i], 1);
            }
        }

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (freqMap.containsKey(nums2[i])) {
                arr.add(nums2[i]);
                int oldValue = freqMap.get(nums2[i]);
                freqMap.put(nums2[i], oldValue - 1);
                if (freqMap.get(nums2[i]) <= 0) {
                    freqMap.remove(nums2[i]);
                }
            }
        }

        int[] ans = new int[arr.size()];
        int i = 0;
        for (int num : arr) {
            ans[i] = num;
            i++;
        }
        return ans;
    }
}
