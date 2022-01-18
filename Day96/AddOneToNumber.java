package Day96;

import java.util.Arrays;

public class AddOneToNumber {
    public static void main(String[] args) {
        AddOneToNumber aotn = new AddOneToNumber();
        int[] arr = new int[] {9, 9, 9};
        System.out.println(Arrays.toString(aotn.plusOne(arr)));

    }
    public int[] plusOne(int[] A) {
        int carry = 0;
        int numLast = A[A.length - 1] + 1;
        if (numLast > 9) {
            A[A.length - 1] = numLast % 10;
            carry = 1;
        }
        else {
            A[A.length - 1] = numLast;
        }
        for (int i = A.length - 2; i > -1; i--) {
            if (A[i] + carry > 9) {
                A[i] = (A[i] + carry) % 10;
                carry = 1;
            }
            else {
                A[i] = A[i] + carry;
                carry = 0;
            }
        }
        if (carry == 1) {
            int[] ans = new int[A.length + 1];
            for (int i = 0; i < ans.length; i++) {
                if (i == 0) {
                    ans[i] = carry;
                }
                else {
                    ans[i] = A[i - 1];
                }
            }
            int j = 0;
            while (ans[j] == 0) {
                j++;
            }

            if (j > 0) {
                int[] ans2 = new int[ans.length - j];
                for (int i = 0; i < ans2.length; i++) {
                    ans2[i] = ans[j];
                    j++;
                }
                return ans2;
            }
            return ans;
        }
        int j = 0;
        while (A[j] == 0) {
            j++;
        }

        if (j > 0) {
            int[] ans2 = new int[A.length - j];
            for (int i = 0; i < ans2.length; i++) {
                ans2[i] = A[j];
                j++;
            }
            return ans2;
        }
        return A;
    }
}
