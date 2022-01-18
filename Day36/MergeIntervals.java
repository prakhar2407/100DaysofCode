//package Day36;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Stack;
//
//public class MergeIntervals {
//    public static void main(String[] args) {
//        int[][] arr = {{22,28},{1,8}};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//    public int[][] merge(int[][] intervals) {
//        Stack<int[]> hlpStk = new Stack<>();
//        for (int i = 0; i < intervals.length; i++) {
//            if (i == 0) {
//                hlpStk.add(intervals[0]);
//                continue;
//            }
//            if (intervals[i][0] >= hlpStk.peek()[0] && intervals[i][1] <= hlpStk.peek()[1]) {
//                hlpStk.add(new int[] {hlpStk.peek()[0], hlpStk.peek()[1]});
//            }
//            else if (intervals[i][0] >= hlpStk.peek()[0] && intervals[i][0] <= hlpStk.peek()[1]) {
//                hlpStk.add(new int[] {hlpStk.peek()[0], intervals[i][1]});
//            }
//            else {
//                hlpStk.add(new int[] {intervals[i][0], intervals[i][1]});
//            }
//        }
//
//    }
//}
