//package Day40;
//
//public class DuplicateNumber {
//    public static void main(String[] args) {
//        int[] arr = {2,5,9,6,9,3,8,9,7,1};
//        findDuplicate(arr);
//    }
//    public int findDuplicate(int[] nums) {
//        int tort = nums[0];
//        int hare = nums[0];
//
//        do {
//            tort = nums[tort];
//            hare = nums[nums[hare]];
//        } while (tort != hare);
//        hare = nums[0];
//        while (tort != hare) {
//            tort = nums[tort];
//            hare = nums[hare];
//        }
//        return tort;
//    }
//}
