package Searching.Day3;

import java.util.Arrays;

public class SearchInSortedMatrix2 {
    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(Arrays.toString(search(arr,100)));
        System.out.println(Arrays.toString(search(arr,11)));
        System.out.println(Arrays.toString(search(arr,34)));
        System.out.println(Arrays.toString(search(arr,16)));
        System.out.println(Arrays.toString(search(arr,0)));
    }

    public static int[] search(int[][] matrix, int target) {
        int i = 0;
        int j = matrix.length - 1;
        while (i < matrix.length && j > -1) {
            if (matrix[i][j] == target) {
                return new int[]{i,j};
            }
            else {
                if (matrix[i][j] > target) {
                    j--;
                }
                else if (matrix[i][j] < target) {
                    i++;
                }
            }
        }
        return new int[]{-1,-1};
    }
}
