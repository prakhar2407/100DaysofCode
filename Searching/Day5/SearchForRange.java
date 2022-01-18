package Searching.Day5;

import java.util.Arrays;

public class SearchForRange {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(arr,6)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int firstIndex = Integer.MAX_VALUE;
        int lastIndex = Integer.MIN_VALUE;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] >= target) {
                right = mid - 1;
                if (nums[mid] == target && mid < firstIndex) {
                    firstIndex = mid;
                }
            }
            else {
                left = mid + 1;
            }
        }

        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
                if (nums[mid] == target && mid > lastIndex) {
                    lastIndex = mid;
                }
            }
            else {
                right = mid - 1;
            }
        }

        if (firstIndex == Integer.MAX_VALUE && lastIndex == Integer.MIN_VALUE) {
            return new int[]{-1,-1};
        }
        return new int[]{firstIndex,lastIndex};
    }
}
