package Day82;

import java.util.ArrayList;
import java.util.List;

public class Permuations {
    public static void main(String[] args) {
        System.out.println(permute(new int[] {1,2}));
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> parentList = new ArrayList<>();
        permutation(nums, 0, nums.length - 1, parentList);
        return parentList;
    }

    public static void permutation(int[] nums, int start, int end, List<List<Integer>> parentArray) {
        if (start == end) {
            List<Integer> lastElement = new ArrayList<>();
            lastElement.add(nums[start]);
            parentArray.add(lastElement);
            return;
         }
        var cn = nums[start];
        permutation(nums, start + 1, end, parentArray);
        for (List<Integer> arrayList : parentArray) {
            for (int i = 0; i < arrayList.size(); i++) {
                arrayList.add(i, cn);
                parentArray.add(arrayList);
            }
        }
    }
}
