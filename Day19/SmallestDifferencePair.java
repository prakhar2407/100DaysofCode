package Day19;

import java.util.Arrays;
import java.util.Map;

public class SmallestDifferencePair {
    public static void main(String[] args) {
        int[] arr1 = {8,9,10,11,12,13,14};
        int[] arr2 = {-8, -7, -6, -5};
        System.out.println(Arrays.toString(smallestDifference(arr1,arr2)));
    }
    public static int[] smallestDifference(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int smallestDifference = Integer.MAX_VALUE;
        int[] result = new int[2];
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        while (true) {
            if (i >= arr1.length || j >= arr2.length) {
                break;
            }
            if (arr1[i] < arr2[j]) {
                if (Math.abs(arr1[i] - arr2[j]) < smallestDifference) {
                    smallestDifference = Math.abs(arr1[i] - arr2[j]);
                    result[0] = arr1[i];
                    result[1] = arr2[j];
                }
                i++;
            }
            else if (arr1[i] > arr2[j]){
                if (Math.abs(arr1[i] - arr2[j]) < smallestDifference) {
                    smallestDifference = Math.abs(arr1[i] - arr2[j]);
                    result[0] = arr1[i];
                    result[1] = arr2[j];
                }
                j++;
            }
            else {
                result[0] = arr1[i];
                result[1] = arr2[j];
                break;
            }
        }
        return result;
    }
}
