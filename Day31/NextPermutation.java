package Day31;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = new int[]{1};
        NextPermutation np = new NextPermutation();
        np.nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void nextPermutation(int[] nums) {
        int index1 = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                index1 = i - 1;
                break;
            }
        }
        if (index1 == -1) {
            int left = 0;
            int right = nums.length - 1;
            while (left < right) {
                int temp2 = nums[left];
                nums[left] = nums[right];
                nums[right] = temp2;
                left++;
                right--;
            }
            return;
        }

        int index2 = -1;
        for (int i = nums.length - 1; i > -1; i--) {
            if (nums[i] > nums[index1]) {
                index2 = i;
                break;
            }
        }

        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;

        int left = index1 + 1;
        int right = nums.length - 1;
        while (left <= right) {
            int temp2 = nums[left];
            nums[left] = nums[right];
            nums[right] = temp2;
            left++;
            right--;
        }
    }
}
