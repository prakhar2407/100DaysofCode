package Day95;

import java.util.Arrays;

public class MinimumLightsToActivate {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0};
        int B = 12;
        System.out.println(new MinimumLightsToActivate().solve(arr, B));
    }
//    public int solve(int[] A, int B) {
//        int count = 0;
//        int i = 0;
//        int n = A.length;
//        while (i < n) {
//            int right = Math.min(i + B - 1, n - 1);
//            int left = Math.max (i - B + 1, 0);
//            boolean bulbFound = false;
//            while (right >= left) {
//                if (A[right] == 1) {
//                    bulbFound = true;
//                    break;
//                }
//                right--;
//            }
//            if (!bulbFound) {
//                return -1;
//            }
//            count++;
//            i = right + B;
//        }
//        return count;
//    }

    public int solve(int[] A, int B) {
        int count = 0;
        for (int i = 0; i < A.length;) {
            int k = (i - B) + 1;
            if (k < 0) {
                k = 0;
            }
            int j = (i + B) - 1;
            if (j >= A.length) {
                j = A.length - 1;
            }
            boolean found = false;
            while (j >= k) {
                if (A[j] == 1) {
                    found = true;
                    count++;
                    i = j + B;
                    break;
                }
                j--;
            }
            if (!found) {
                return -1;
            }
        }
        return count;
    }
}
