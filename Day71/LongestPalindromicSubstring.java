package Day71;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("cbbd"));
    }
    public static String longestPalindrome(String s) {
        int[][] matrixArr = new int[s.length()][s.length()];
        String result = s.substring(0,1);
        for (int k = 0; k < s.length(); k++) {
            for (int i = 0, j = k; i < s.length() && j < s.length(); i++, j++) {
                if (i == j) {
                    matrixArr[i][j] = 1;
                }
                else if (s.charAt(i) == s.charAt(j) && matrixArr[i+1][j-1] == 1) {
                    matrixArr[i][j] = 1;
                    if (s.substring(i, j + 1).length() > result.length()) {
                        result = s.substring(i, j + 1);
                    }
                }
                else if (s.charAt(i) == s.charAt(j) && i == j - 1) {
                    matrixArr[i][j] = 1;
                    if (s.substring(i, j + 1).length() > result.length()) {
                        result = s.substring(i, j + 1);
                    }
                }
                else {
                    matrixArr[i][j] = 0;
                }
            }
        }
        return result;
    }
}
