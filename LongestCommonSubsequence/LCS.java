package LongestCommonSubsequence;

public class LCS {
    public static void main(String[] args) {
        System.out.println(longestCommonSubsequence("abbg","agbg"));
    }

    public static int longestCommonSubsequence(String text1, String text2) {
        int[][] arr = new int[text1.length() + 1][text2.length() + 1];
        arr[text1.length()][text2.length()] = 0;
        for (int i = text1.length(); i >= 0; i--) {
            for (int j = text2.length(); j >= 0; j--) {
                if (i == text1.length() || j == text2.length()) {
                    arr[i][j] = 0;
                }
                else if (text1.charAt(i) == text2.charAt(j)) {
                    arr[i][j] = arr[i+1][j+1] + 1;
                }
                else {
                    arr[i][j] = Math.max(arr[i+1][j], arr[i][j+1]);
                }
            }
        }
        return arr[0][0];
    }
}
