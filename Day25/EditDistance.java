//package Day25;
//
//public class EditDistance {
//    public static void main(String[] args) {
//        EditDistance ed = new EditDistance();
//        System.out.println(ed.minDistanc("ros","horse"));
//    }
//    public int minDistance(String word1, String word2) {
//        if (word1.length() == 0) {
//            return word2.length();
//        }
//        if (word2.length() == 0) {
//            return word1.length();
//        }
//        String ros1 = word1.substring(1);
//        String ros2 = word2.substring(1);
//        if (word1.charAt(0) == word2.charAt(0)) {
//            return minDistance(ros1, ros2);
//        }
//        else {
//            int f1 = 1 + minDistance(word1, ros2);
//            int f2 = 1 + minDistance(ros1, ros2);
//            int f3 = 1 + minDistance(ros1, word2);
//            return Math.min(Math.min(f1,f2), f3);
//        }
//    }
//
//    public int minDistance(String word1, String word2) {
//        int[][] arr = new int[word1.length() + 1][word2.length() + 1];
//        arr[word1.length()][word2.length()] = 0;
//        for (int row = word1.length(); row >= 0; row--) {
//            for (int col = word2.length(); col >= 0; col--) {
//                if (row == word1.length()) {
//                    arr[row][col] = word2.length() - col;
//                }
//                else if (col == word2.length()) {
//                    arr[row][col] = word1.length() - row;
//                }
//                else if (word1.charAt(row) == word2.charAt(col)) {
//                    arr[row][col] = arr[row + 1][col + 1];
//                }
//                else {
//                    arr[row][col] = 1 + Math.min(Math.min(arr[row + 1][col], arr[row][col + 1]), arr[row + 1][col + 1]);
//                }
//            }
//        }
//        return arr[0][0];
//    }
//}
