package Day44;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] {3,2,3}));
    }
    public static int majorityElement(int[] nums) {
        int val = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == val) {
                count++;
            }
            else {
                count--;
            }
            if (count == 0) {
                val = nums[i];
                count = 1;
            }
        }
        return val;
    }
}
