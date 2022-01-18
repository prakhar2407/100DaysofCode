package Searching.Day2;

import java.util.Arrays;
import java.util.PriorityQueue;

public class ThreeLargestNumbers {
    public static void main(String[] args) {
        int[] arr = {10,5,9,10,12};
        int[] arr2= {141,1,17,-7,-17,-27,18,541,8};
        int[] arr3 = { 12, 13, 1, 10, 34, 1 };
        System.out.println(Arrays.toString(threeLargest(arr)));
        System.out.println(Arrays.toString(threeLargest(arr2)));
        System.out.println(Arrays.toString(threeLargest(arr3)));
    }

    public static int[] threeLargest(int[] arr) {
        int[] solnArray = new int[3];
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            maxHeap.add(-arr[i]);
        }
        for (int i = 0; i < 3; i++) {
            solnArray[i] = -maxHeap.remove();
        }
        int i = 0;
        int j = solnArray.length - 1;
        while (i != j) {
            int temp = solnArray[i];
            solnArray[i] = solnArray[j];
            solnArray[j] = temp;
            i++;
            j--;
        }
        return solnArray;
    }
}
