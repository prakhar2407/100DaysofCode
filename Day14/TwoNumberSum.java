package Day14;

import java.util.Arrays;

public class TwoNumberSum {
    public static void main(String[] args) {
        int[] arr1 = {3,2,4};
        int[] arr2 = {3,5,-4,8,11,1,-1,6};
        TwoNumberSum tns = new TwoNumberSum();
        System.out.println(Arrays.toString(twoNumberSum(arr1,10)));
        System.out.println(Arrays.toString(twoNumberSum(arr2,10)));
//        System.out.println(Arrays.toString(tns.twoSum(arr,6)));
    }

    public static int[] twoNumberSum(int[] arr, int targetSum) {
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] > targetSum) {
                j--;
            }
            else if (arr[i] + arr[j] < targetSum) {
                i++;
            }
            else {
                return new int[] {arr[i],arr[j]};
            }
        }
        return new int[0];
    }

    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int firstNum = -1;
        int secondNum = -1;
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] > target) {
                j--;
            }
            else if (nums[i] + nums[j] < target) {
                i++;
            }
            else {

            }
        }
        return new int[0];
    }

//    public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[] {i,j};
//                }
//            }
//        }
//        return new int[0];
//    }
}
