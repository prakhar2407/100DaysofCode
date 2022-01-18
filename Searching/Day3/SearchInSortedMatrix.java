package Searching.Day3;

import java.util.Arrays;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        SearchInSortedMatrix sinm = new SearchInSortedMatrix();
        System.out.println(Arrays.toString(searchMatrix(arr,100)));
        System.out.println(Arrays.toString(searchMatrix(arr,11)));
        System.out.println(Arrays.toString(searchMatrix(arr,34)));
        System.out.println(Arrays.toString(searchMatrix(arr,16)));
        System.out.println(Arrays.toString(searchMatrix(arr,0)));
    }
    public static int[] searchMatrix(int[][] matrix, int target) {
        int[] solnArray = new int[2];
        for (int row = 0; row < matrix.length; row++) {
            int left = 0;
            int right = matrix[row].length - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (matrix[row][mid] == target) {
                    return new int[]{row,mid};
                }
                else if (matrix[row][mid] > target) {
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
        }
        return new int[]{-1,-1};
    }
}
