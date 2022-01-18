package Day98;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = new int[] {-1,-100,3,99};
        rotate(arr, 2);
    }
//    public static void rotate(int[] nums, int k) {
//        for (int counter = 0; counter < k; counter++) {
//            int j = nums[0];
//            for (int i = nums.length - 1; i > -1; i--) {
//                if ((i + 1) >= nums.length) {
//                    int index = (i + 1) % nums.length;
//                    nums[index] = nums[i];
//                }
//                else {
//                    if (i == 0) {
//                        nums[i + 1] = j;
//                    }
//                    else {
//                        nums[i + 1] = nums[i];
//                    }
//                }
//            }
//        }
//    }
//    public static void rotate(int[] nums, int k) {
//        int[] arr = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            if (i + k >= nums.length) {
//                int index = (i + k) % nums.length;
//                arr[index] = nums[i];
//            }
//            else {
//                arr[i + k] = nums[i];
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            nums[i] = arr[i];
//        }
//        System.out.println(Arrays.toString(nums));
//    }

    public static void rotate(int[] nums, int k) {
        if (k >= nums.length) {
            return;
        }
        reverseArr(nums, 0, nums.length - 1);
        reverseArr(nums, 0, k - 1);
        reverseArr(nums, k, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void reverseArr(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
