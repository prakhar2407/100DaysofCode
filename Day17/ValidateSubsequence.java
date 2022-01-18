package Day17;

import java.util.*;

public class ValidateSubsequence {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Collections.addAll(array,1,2,3,4);
        ArrayList<Integer> sequence = new ArrayList<>();
        Collections.addAll(sequence,3,2);
        System.out.println(isValidSubsequence(array, sequence));
    }
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int j = 0;
        for (int i = 0; i < array.size() && j < sequence.size(); i++) {
            if (array.get(i) == sequence.get(j)) {
                j++;
            }
        }
        if (j == sequence.size()) {
            return true;
        }
        return false;
    }
}
