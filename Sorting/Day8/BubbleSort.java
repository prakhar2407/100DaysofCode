package Sorting.Day8;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5000,4100,2,10000};
        System.out.println(Arrays.toString(sort(arr)));
    }
    public static int[] sort(int[] arr) {
        for (int counter = 1; counter < arr.length; counter++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }
}
