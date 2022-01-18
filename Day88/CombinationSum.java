package Day88;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candi = {2,3,6,7};
        System.out.println(new CombinationSum().combinationSum(candi, 7));
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> parentArr = new ArrayList<>();
        List<Integer> childArr = new ArrayList<>();
        combi(candidates, 0, target, childArr, parentArr);
        return parentArr;
    }

    public void combi(int[] candidates, int start, int target, List<Integer> childArray, List<List<Integer>> parentArr) {
        if (sum(childArray) > target) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            childArray.add(candidates[i]);
            if (sum(childArray) == target) {
                parentArr.add(childArray);
            }
            combi(candidates, i, target, childArray, parentArr);
            childArray.remove(childArray.size() - 1);
        }
    }

    public static int sum(List<Integer> elements) {
        int sum = 0;
        for (int num : elements) {
            sum = sum + num;
        }
        return sum;
    }
}
