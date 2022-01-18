//package Day97;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class MergeIntervals {
//    public static void main(String[] args) {
//        int[][] arr = {{1, 3}, {5, 10}, {8, 10}, {2, 6}, {15, 18}};
//        Arrays.sort(arr, (a1, a2) -> a1[0] - a2[0]);
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    public int[][] merge(int[][] intervals) {
//        List<int[]> ans = new ArrayList<>();
//        Arrays.sort(intervals, (a1, a2) -> a1[0] - a2[0]);
//        int[] currArr = new int[2];
//        currArr[0] = intervals[0][0];
//        currArr[1] = intervals[0][1];
//
//        for (int i = 1; i < intervals.length; i++) {
//            if (currArr[1] <= intervals[i][0]) {
//                currArr[0] = Math.min(currArr[0], intervals[i][0]);
//                currArr[1] = Math.max(currArr[1], intervals[i][1]);
//            }
//            else {
//
//            }
//
//        }
//    }
//}
