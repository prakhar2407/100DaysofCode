package Day97;

public class BInarySearch {
    public static void main(String[] args) {

    }
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (target == nums[mid]) {
                ans = mid;
                break;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            }
            else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        return ans;
    }
}
