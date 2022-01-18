//package Day37;
//
//public class MergeSortedArray {
//    public static void main(String[] args) {
//        int[] arr1 = {1,4,7,0,0,0};
//        int[] arr2 = {2,3,9};
//        MergeSortedArray msa = new MergeSortedArray();
//        msa.merge(arr1, arr1.length, arr2, arr2.length);
//    }
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int p1 = nums1.length - 1;
//        int p2 = m - 1;
//        int p3 = n - 1;
//        while (p2 >= 0 && p3 >= 0) {
//            if (nums1[p2] > nums2[p3]) {
//                nums1[p1] = nums1[p2];
//                p2--;
//            }
//            else {
//                nums1[p1] = nums2[p3];
//                p3--;
//            }
//            p1--;
//        }
//
//        if (p2 >= 0) {
//            for (int i = p2; i >= 0; i--) {
//                nums1[p1] = nums1[i];
//                p1--;
//            }
//        }
//        else if (p3 >= 0) {
//            for (int i = p3; i >= 0; i--) {
//                nums1[p1] = nums2[i];
//                p1--;
//            }
//        }
//    }
//
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int p = m + n - 1;
//        int p1 = m - 1;
//        int p2 = n - 1;
//        while (p2 >= 0 && p1 >= 0) {
//            if (nums1[p1] < nums2[p2]) {
//                nums1[p] = nums2[p2];
//                p2--;
//            } else {
//                nums1[p] = nums1[p1];
//                p1--;
//            }
//            p--;
//        }
//        if (p1 >= 0) {
//            for (int i = p1; i >= 0; i--) {
//                nums1[p] = nums1[i];
//                p--;
//            }
//        }
//        if (p2 >= 0) {
//            for (int i = p2; i >= 0; i--) {
//                nums1[p] = nums2[i];
//                p--;
//            }
//        }
//    }
//}
