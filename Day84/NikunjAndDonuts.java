package Day84;

import java.util.Arrays;

public class NikunjAndDonuts {
    public static void main(String[] args) {
        int[] arr = new int[] {1,5,2,4};
        System.out.println(minSum(arr));
    }
    public static int minSum (int[] arr) {
        Arrays.sort(arr);
        int minSum = 0;
        int j = 0;
        for (int k = arr.length - 1; k > -1; k--) {
            int run = arr[k] * (int) Math.pow(2, j);
            minSum = minSum + run;
            j++;
        }
        return minSum;
    }
}
