package Searching.Day6;

import java.util.PriorityQueue;

public class QuickSelect {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 3, 2};
        System.out.println(kthsmallest(arr,3));
        int[] arr2 = {1};
        System.out.println(kthsmallest(arr2,1));
    }
    public static int kthsmallest(final int[] A, int B) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int element : A) {
            minHeap.add(element);
        }
        int count = 0;
        while (count != (B - 1)) {
            minHeap.remove();
            count++;
        }
        return minHeap.remove();
    }
}
