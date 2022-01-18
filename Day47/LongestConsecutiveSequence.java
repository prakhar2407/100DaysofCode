package Day47;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        System.out.println(new LongestConsecutiveSequence().longestConsecutive(new int[] {9,1,4,7,3,-1,0,5,8,-1,6}));
    }
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int longestCount = 0;
        for (int num : nums) {
            int maxCount = Integer.MIN_VALUE;
            if (!set.contains(num - 1)) {
                int currentCount = 1;
                while (set.contains(num + 1)) {
                    currentCount++;
                    num = num + 1;
                }
                maxCount = Math.max(currentCount, maxCount);
                longestCount = Math.max(maxCount, longestCount);
            }
        }
        return longestCount;
    }
}
