package Day97;

import java.util.ArrayList;
import java.util.Arrays;

public class Partitions {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println(new Partitions().solve(arr.length, arr));
    }

    public int solve(int A, int[] B) {
        int sum = 0;
        for (int num : B) {
            sum += num;
        }

        if (sum % 3 != 0) {
            return 0;
        }
        int singSubSeqSum = sum / 3;
        ArrayList<Integer> prefixIndex = new ArrayList<>();
        ArrayList<Integer> suffixIndex = new ArrayList<>();
        int currPrefixSum = 0;
        for (int i = 0; i < B.length; i++) {
            currPrefixSum += B[i];
            if (currPrefixSum == singSubSeqSum) {
                prefixIndex.add(i);
            }
        }

        int currSuffixSum = 0;
        for (int i = B.length - 1; i > -1; i--) {
            currSuffixSum += B[i];
            if (currSuffixSum == singSubSeqSum) {
                suffixIndex.add(i);
            }
        }

        int countAns = 0;
        for (int i = 0; i < prefixIndex.size(); i++) {
            for (int j = 0; j < suffixIndex.size(); j++) {
                int currSum = 0;
                int n = 0;
                for (int k = prefixIndex.get(i) + 1; k < suffixIndex.get(j); k++) {
                    currSum += B[k];
                    n = 1;
                }
                if (currSum == singSubSeqSum && n == 1) {
                    countAns++;
                }
            }
        }
        return countAns;
    }
}
