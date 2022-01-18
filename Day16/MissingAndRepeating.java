package Day16;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MissingAndRepeating {
    public static void main(String[] args) {
        int[] arr = {12, 7, 5, 1, 13, 1, 10, 8, 11, 9, 2, 4, 3, 6};
//        int[] arr = {1,3,3};
        MissingAndRepeating mar = new MissingAndRepeating();
        System.out.println(Arrays.toString(mar.findTwoElement(arr, arr.length)));;
    }
    int[] findTwoElement(int arr[], int n) {
        int[] resultantArray = new int[2];
        int[] helperArray = new int[n + 1];
        for (int i = 0; i < arr.length; i++) {
            helperArray[arr[i]] += 1;
        }
        for (int i = 1; i < helperArray.length; i++) {
            if (helperArray[i] == 0) {
                resultantArray[1] = i;
            }
            if (helperArray[i] > 1) {
                resultantArray[0] = i;
            }
        }
        return resultantArray;
    }
}
