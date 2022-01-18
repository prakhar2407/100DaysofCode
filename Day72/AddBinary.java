package Day72;

public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("100","110010"));
    }
    public static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        String result = "";
        String carry = "0";
        while (i > -1 && j > -1) {
            if (carry == "1" && a.charAt(i) == '1' && b.charAt(j) == '1') {
                carry = "1";
                result = "1" + result;
            }
            else if (carry == "0" && a.charAt(i) == '1' && b.charAt(j) == '1') {
                carry = "1";
                result = "0" + result;
            }
            else if (carry == "1" && a.charAt(i) == '0' && b.charAt(j) == '0'){
                carry = "0";
                result = "1" + result;
            }
            else if (carry == "0" && a.charAt(i) == '0' && b.charAt(j) == '0') {
                carry = "0";
                result = "0" + result;
            }
            else {
                if (carry == "1") {
                    carry = "1";
                    result = "0" + result;
                }
                else {
                    carry = "0";
                    result = "1" + result;
                }
            }
            i--;
            j--;
        }
        if (i >= 0) {
            while (i > -1) {
                if (carry == "1" && a.charAt(i) == '1') {
                    carry = "1";
                    result = "0" + result;
                }
                else if (carry == "0" && a.charAt(i) == '0') {
                    carry = "0";
                    result = "0" + result;
                }
                else {
                    carry = "0";
                    result = "1" + result;
                }
                i--;
            }
        }
        else if (j >= 0) {
            while (j > -1) {
                if (carry == "1" && b.charAt(j) == '1') {
                    carry = "1";
                    result = "0" + result;
                }
                else if (carry == "0" && b.charAt(j) == '0') {
                    carry = "0";
                    result = "0" + result;
                }
                else {
                    carry = "0";
                    result = "1" + result;
                }
                j--;
            }
        }

        if (carry == "1") {
            result = carry + result;
        }
        return result;
    }
}
