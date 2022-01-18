package Day70;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {9,9,9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
    public static int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;
        }
        int carry = 0;
        for (int i = digits.length - 1; i > -1; i--) {
            if (i == digits.length - 1) {
                int num = digits[i] + 1;
                int finalNum = num % 10;
                carry = num / 10;
                digits[i] = finalNum;
            }
            else {
                int num = digits[i] + carry;
                int finalNum = num % 10;
                carry = num / 10;
                digits[i] = finalNum;
            }
        }
        if (carry != 0) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = carry;
            for (int i = 1; i < newDigits.length; i++) {
                newDigits[i] = digits[i - 1];
                return newDigits;
            }
        }
        return digits;
    }
}
