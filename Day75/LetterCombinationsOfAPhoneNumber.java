package Day75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
//        String ss = "abd";
//        System.out.println(ss.substring(0,1));
    }
    public static List<String> letterCombinations(String digits) {
        if (digits.length() < 0) {
            return new ArrayList<>();
        }
        HashMap<String, String> dialPad = new HashMap<>();
        dialPad.put("2", "abc");
        dialPad.put("3", "def");
        dialPad.put("4", "ghi");
        dialPad.put("5", "jkl");
        dialPad.put("6", "mno");
        dialPad.put("7", "pqrs");
        dialPad.put("8", "tuv");
        dialPad.put("9", "wxyz");
        return letterCombination2(digits, dialPad);
    }

    public static ArrayList<String> letterCombination2(String digits, HashMap<String, String> phoneNumber) {
        if (digits.equals("")) {
            ArrayList<String> dummyArrayList = new ArrayList<>();
            dummyArrayList.add("");
            return dummyArrayList;
        }
        String cc = digits.substring(0,1);
        String res = digits.substring(1);
        ArrayList<String> temp = letterCombination2(res, phoneNumber);
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < phoneNumber.get(cc).length(); i++) {
            char currentChar = phoneNumber.get(cc).charAt(i);
            for (String word : temp) {
                result.add(currentChar + word);
            }
        }
        return result;
    }
}
