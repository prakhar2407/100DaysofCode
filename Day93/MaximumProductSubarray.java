package Day93;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] arr = {-2,4,-5,-3};
        System.out.println(new MaximumProductSubarray().maxProduct(arr));
    }
    public int maxProduct(int[] nums) {
        int[] max = new int[nums.length];
        int[] min = new int[nums.length];
        max[0] = nums[0];
        min[0] = nums[0];
        int maxProduct = max[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (nums[i] > maxProduct) {
                    maxProduct = nums[i];
                }
                max[i] = 1;
                min[i] = 1;
            }
            else {
                max[i] = Math.max(nums[i] * max[i - 1], nums[i]);
                max[i] = Math.max(max[i], nums[i] * min[i - 1]);
                min[i] = Math.min(nums[i] * min[i - 1], nums[i]);
                min[i] = Math.min(min[i], nums[i] * max[i - 1]);
                if (max[i] > maxProduct) {
                    maxProduct = max[i];
                }
            }
        }
        return maxProduct;
    }
}
