package Searching.Day7;

public class IndexEqualsValue {
    public static void main(String[] args) {
        int[] arr = {-5,-3,2,3,4,5,9,12};
        System.out.println(solution(arr));
    }
    public static int solution(int[] arr) {
        int result = -1;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] >= mid) {
                right = mid - 1;
                if (arr[mid] == mid) {
                    result = mid;
                }
            }
            else {
                left = mid + 1;
            }
        }
        return result;
    }
}
