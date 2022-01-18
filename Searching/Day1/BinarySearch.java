package Searching.Day1;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(binarySearch(arr,1));
        System.out.println(binarySearch(arr,2));
        System.out.println(binarySearch(arr,3));
        System.out.println(binarySearch(arr,4));
        System.out.println(binarySearch(arr,5));
        System.out.println(binarySearch(arr,6));
        System.out.println(binarySearch(arr,7));
        System.out.println(binarySearch(arr,8));
    }
    public static int binarySearch(int[] arr, int element) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] == element) {
                return mid;
            }
            else if (arr[mid] > element) {
                j = mid - 1;
            }
            else {
                i = mid + 1;
            }
        }
        return -1;
    }
}
