package Day15;

import java.util.HashMap;

public class LargestSubArray {
    public static void main(String[] args) {
        int[] arr = {1,-1,3,2,-2,-8,1,7,10,23};
        System.out.println(maxLen(arr, arr.length));
    }
    static int maxLen(int arr[], int n) {
        HashMap<Integer, Integer> helper = new HashMap<>();
        int sum = 0;
        int subArray = 0;
        for (int i = 0; i < arr.length; i++) {
            int currentSubArray = 0;
            sum += arr[i];
            if (sum == 0) {
                currentSubArray = i;
                if (currentSubArray > subArray) {
                    subArray = currentSubArray;
                }
            }
            else if (helper.containsKey(sum)) {
                currentSubArray = i - helper.get(sum);
                if (currentSubArray > subArray) {
                    subArray = currentSubArray;
                }
            }
            else {
                helper.put(sum,i);
            }
        }
        return subArray;
    }
}
