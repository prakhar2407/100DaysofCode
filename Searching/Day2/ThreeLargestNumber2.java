package Searching.Day2;

import java.util.Arrays;

public class ThreeLargestNumber2 {
    public static void main(String[] args) {
        int[] arr = {10,5,9,10,12};
        int[] arr2= {141,1,17,-7,-17,-27,18,541,8};
        int[] arr3 = { 12, 13, 1, 10, 34, 1 };
        System.out.println(Arrays.toString(solution(arr)));
        System.out.println(Arrays.toString(solution(arr2)));
        System.out.println(Arrays.toString(solution(arr3)));
    }

    public static int[] solution(int[] arr) {
        int element1 = Integer.MIN_VALUE;
        int element2 = Integer.MIN_VALUE;
        int element3 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > element1) {
                element3 = element2;
                element2 = element1;
                element1 = arr[i];
            }
            else if (arr[i] > element2) {
                element3 = element2;
                element2 = arr[i];
            }
            else if (arr[i] > element3) {
                element3 = arr[i];
            }
        }
        int[] solnArray = {element3,element2,element1};
        return solnArray;
    }
}
