package Day74;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        System.out.println(subsets(new int[] {1,2,3}));
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsetsList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        subsets2(nums, 0,list, subsetsList);
        return subsetsList;
    }
    public static void subsets2(int[] nums, int i, List<Integer> subset, List<List<Integer>> subsetsArray) {
        if (i == nums.length) {
            subsetsArray.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        subsets2(nums, i + 1, subset, subsetsArray);
        subset.remove(subset.size() - 1);
        subsets2(nums,i + 1,subset,subsetsArray);
    }

}
