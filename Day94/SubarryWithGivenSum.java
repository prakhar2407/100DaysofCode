package Day94;

import java.util.ArrayList;
import java.util.HashMap;

public class SubarryWithGivenSum {
    public static void main(String[] args) {
        SubarryWithGivenSum s = new SubarryWithGivenSum();
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
        System.out.println(subarraySum(arr, arr.length, 15));
    }
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            freqMap.put(arr[i], i);
        }
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == s) {
                ArrayList<Integer> arr2 = new ArrayList<>();
                arr2.add(1);
                arr2.add(i + 1);
                return arr2;
            }
            if (freqMap.containsKey(arr[i] - s)) {
                ArrayList<Integer> arr2 = new ArrayList<>();
                arr2.add(freqMap.get(arr[i] - s) + 2);
                arr2.add(i + 1);
                return arr2;
            }
        }
        ArrayList<Integer> arr3 = new ArrayList<>();
        arr3.add(-1);
        return arr3;
    }
}
