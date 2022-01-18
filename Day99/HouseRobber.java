package Day99;

public class HouseRobber {
    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(rob(arr));
    }
    public static int rob(int[] nums) {
        int[] helper = new int[nums.length];
        helper[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i > -1; i--) {
            if (i == nums.length - 2) {
                helper[i] = nums[i];
            }
            else {
                helper[i] = nums[i] + helper[i + 2];
            }
        }
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (helper[i] > maxProfit) {
                maxProfit = helper[i];
            }
        }
        return maxProfit;
    }
}
