package Day83;

import java.util.Scanner;

public class SquareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String str = sc.next();
            sc.nextLine();
            System.out.println(checkStringSquare(str));
        }
    }

    public static String checkStringSquare(String s) {
        if (s.length() <= 1) {
            return "No";
        }
        String answer;
        int mid = s.length() / 2;
        int i = 0;
        int j = mid;
        while (j < s.length()) {
            if (s.charAt(i) == s.charAt(j) && i == j % mid ) {
                answer = "Yes";
            }
            else {
                answer = "No";
                return answer;
            }
            i++;
            j++;
        }
        return "Yes";
    }
}
