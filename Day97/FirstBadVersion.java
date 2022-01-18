//package Day97;
//
//public class FirstBadVersion {
//    public int firstBadVersion(int n) {
//        int left = 1;
//        int right = n;
//        int ans = -1;
//        while (left <= right) {
//            int mid = (left + right) / 2;
//            if (isBadVersion(mid)) {
//                ans = mid;
//                right = mid;
//            }
////            else if (!isBadVersion(mid)) {
//                left = mid + 1;
//            }
//        }
//        return ans;
//    }
//}
