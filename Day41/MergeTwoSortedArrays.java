package Day41;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        MergeTwoSortedArrays mtsa = new MergeTwoSortedArrays();
        long[] arr1 = new long[] {10, 12, 100};
        long[] arr2 = new long[] {0, 200};
        merge(arr1,arr2,arr1.length, arr2.length);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
    public static void merge(long arr1[], long arr2[], int n, int m) {
        int gap = (int) Math.ceil((n + m) / 2);
        int i = 0;
        int j = i + gap;
        while (true) {
            if (i >= n) {
                if (arr2[i - n] > arr2[j - n]) {
                    long temp = arr2[i - n];
                    arr2[i - n] = arr2[j - n];
                    arr2[j - n] = temp;
                }
            }
            else {
                if (j >= n) {
                    if (arr1[i] > arr2[j - n]) {
                        long temp = arr1[i];
                        arr1[i] = arr2[j - n];
                        arr2[j - n] = temp;
                    }
                }
                else {
                    if (arr1[i] > arr1[j]) {
                        long temp = arr1[i];
                        arr1[i] = arr1[j];
                        arr1[j] = temp;
                    }
                }
            }
            i++;
            j++;
            if (j >= m + n && gap == 1) {
                break;
            }
            if (j >= m + n) {
                float newGap = (float) gap / 2;
                gap = (int) Math.ceil(newGap);
                i = 0;
                j = i + gap;
            }
        }
    }
}
