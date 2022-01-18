package Day46;

public class ReversePairs {
    public static void main(String[] args) {
//        int num = 2147483647;
//        System.out.println(num);
        int[] arr = new int[] {40,25,19,12,9,6,2};
        System.out.println(new ReversePairs().reversePairs(arr));
    }
    public int reversePairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((float)nums[i] / 2 > nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
