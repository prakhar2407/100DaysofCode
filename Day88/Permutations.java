//package Day88;
//
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Permutations {
//    public static void main(String[] args) {
//
//    }
//    public List<List<Integer>> permute(int[] nums) {
//
//    }
//
//    public ArrayList<Integer> permutation(int[] nums, int start, int end, List<List<Integer>> ans) {
//        if (start == end) {
//            ArrayList<Integer> hlprList = new ArrayList<>();
//            hlprList.add(nums[start]);
//            return hlprList;
//        }
//        int currNum = nums[0];
//        ArrayList<Integer> remainingArray = permutation(nums, start + 1, end, ans);
//        for (int i = 0; i <= remainingArray.size(); i++) {
//            ArrayList<Integer> arr = remainingArray;
//            arr.add(currNum, i);
//            ans.add(arr);
//        }
//        return ans;
//    }
//}
