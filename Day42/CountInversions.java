//package Day42;
//
//public class CountInversions {
//    public static long getInversions(long arr[], int n) {
//        // Write your code here.
//    }
//
//    public static long[] inversions(long[] arr, int left, int right) {
//        if (left == right) {
//            long[] arr3 = new long[1];
//            arr3[0] = arr[left];
//            return arr;
//        }
//        int mid = (left + right) / 2;
//        long[] arr1 = inversions(arr, left, mid);
//        long[] arr2 = inversions(arr,mid + 1, right);
//        int i = 0, j = 0;
//        long[] arr4 = new long[arr1.length + arr2.length];
//
//    }
//}
