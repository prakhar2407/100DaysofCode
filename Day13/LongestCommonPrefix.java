package Day13;

import java.util.ArrayList;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"abab","aba",""};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length <= 1) {
            return "";
        }
        else if (strs.length > 1) {
            for (int i = 0; i < strs.length; i++) {
                if (strs[i] == "") {
                    return "";
                }
            }
        }
        String result = "";
        int charIndex = 0;
        int size = strs[0].length() < strs[1].length() ? strs[0].length() : strs[1].length();
        while (charIndex < size && strs[0].charAt(charIndex) == strs[1].charAt(charIndex)) {
            result += strs[0].charAt(charIndex);
            charIndex++;
        }
        if (result.equals("")) {
            return "";
        }

        for (int j = 2; j < strs.length; j++) {
            if ((result == "" && strs[j] != "") || (result != "" && strs[j] == "")) {
                return "";
            }
            int charIndex2 = 0;
            int size2 = result.length() < strs[j].length() ? result.length() : strs[j].length();
            while (charIndex2 < size2 && result.charAt(charIndex2) == strs[j].charAt(charIndex2)) {
                charIndex2++;
            }
            result = result.substring(0,charIndex2);
        }
        return result;
    }
}
