package Day88;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("ab","a"));
    }
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> freqTable = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (freqTable.containsKey(s.charAt(i))) {
                int oldValue = freqTable.get(s.charAt(i));
                freqTable.put(s.charAt(i), oldValue + 1);
            }
            else {
                freqTable.put(s.charAt(i),1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (freqTable.containsKey(t.charAt(i))) {
                int oldValue = freqTable.get(t.charAt(i));
                freqTable.put(t.charAt(i), oldValue - 1);
                if (freqTable.get(t.charAt(i)) == 0) {
                    freqTable.remove(t.charAt(i));
                }
            }
            else {
                return false;
            }
        }
        if (freqTable.size() > 0) {
            return false;
        }
        return true;
    }
}
